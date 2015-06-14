package tests;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import webservice.*;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class AuctionTest {

    AuctionService auctionService = new AuctionService();
    RegistrationService registrationService = new RegistrationService();

    Auction auction;
    Registration registration;

    @Before
    public void setUp() throws Exception {
        auction = auctionService.getAuctionPort();
        registration = registrationService.getRegistrationPort();
    }

    @Test
    public void getItem() {

        String email = "xx2@nl";
        String omsch = "omsch3";

        User seller1 = registration.registerUser(email);
        Category cat = new Category();
        cat.setDescription("cat1");
        Item item1 = auction.offerItem(seller1, cat, omsch);
        Item item2 = auction.getItem(item1.getId());
        assertEquals(omsch, item2.getDescription());
        assertEquals(email, item2.getSeller().getEmail());
    }

    @Test
    public void findItemByDescription() {
        String email3 = "xx3@nl";
        String omsch = "omsch";
        String email4 = "xx4@nl";
        String omsch2 = "omsch2";

        User seller3 = registration.registerUser(email3);
        User seller4 = registration.registerUser(email4);
        Category cat = new Category();
        cat.setDescription("cat3");
        Item item1 = auction.offerItem(seller3, cat, omsch);
        Item item2 = auction.offerItem(seller4, cat, omsch);

        List<Item> res = auction.findItemByDescription(omsch2);
        assertEquals(0, res.size());

        res = auction.findItemByDescription(omsch);
        assertEquals(2, res.size());

    }

    @Test
    public void newBid() {
        String email = "ss2@nl";
        String emailb = "bb@nl";
        String emailb2 = "bb2@nl";
        String omsch = "omsch_bb";

        User seller = registration.registerUser(email);
        User buyer = registration.registerUser(emailb);
        User buyer2 = registration.registerUser(emailb2);
        // eerste bod
        Category cat = new Category();
        cat.setDescription("cat9");
        Item item1 = auction.offerItem(seller, cat, omsch);
        Money m1 = new Money();
        m1.setCents(10);
        m1.setCurrency("eur");
        Bid new1 = auction.newBid(item1, buyer, m1);
        assertEquals(emailb, new1.getBuyer().getEmail());

        // lager bod
        Money m2 = new Money();
        m2.setCents(9);
        m2.setCurrency("eur");
        Bid new2 = auction.newBid(item1, buyer2, m2);
        assertNull(new2);

        // hoger bod
        Money m3 = new Money();
        m3.setCents(11);
        m3.setCurrency("eur");
        Bid new3 = auction.newBid(item1, buyer2, m3);
        assertEquals(emailb2, new3.getBuyer().getEmail());
    }
}
