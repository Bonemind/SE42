package test.java.auction.service;

import auctionmanager.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;


public class AuctionMgrTest {

    /*
    private AuctionMgr auction;
    private RegistrationMgr registration;
    private SellerMgr sellerMgr;
    EntityManager em = Persistence.createEntityManagerFactory("db").createEntityManager();
    */
    private Auction auction;
    private Registration registration;
    AuctionService auctionService = new AuctionService();
    RegistrationService registrationService = new RegistrationService();

    @Before
    public void setUp() {
        auction = auctionService.getAuctionPort();
        registration = registrationService.getRegistrationPort();
    }
    /*

    @Before
    public void setUp() throws Exception {
        System.out.print("before auc");
        registration = new RegistrationMgr(em);
        auction = new AuctionMgr(em);
        sellerMgr = new SellerMgr(em);
        util.DatabaseCleaner dc = new util.DatabaseCleaner(Persistence.createEntityManagerFactory("db").createEntityManager());
        dc.clean();
    }
    */

    @Test
    public void getItem() {
        String email = "xx2@nl";
        String omsch = "omsch";

        User seller1 = registration.registerUser(email);
        System.out.println(seller1.getEmail());
        assertNotNull(seller1);
        Category category = new Category();
        Item item1 = auction.offerItem(seller1, category, omsch);
        System.out.println("Item retrieved:" + item1);
        assertNotNull(item1);
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
        Item item1 = auction.offerItem(seller3, cat, omsch);
        Item item2 = auction.offerItem(seller4, cat, omsch);

        List<Item> res = auction.findItemByDescription(omsch2);
        assertEquals(0, res.size());

        res = auction.findItemByDescription(omsch);
        assertEquals(2, res.size());

    }

    /*
    @Test
    public void newBid() {
        em.getTransaction().begin();
        String email = "ss2@nl";
        String emailb = "bb@nl";
        String emailb2 = "bb2@nl";
        String omsch = "omsch_bb";

        User seller = registration.registerUser(email);
        User buyer = registration.registerUser(emailb);
        User buyer2 = registration.registerUser(emailb2);
        // eerste bod
        Category cat = new Category("cat9");
        CategoryDAOJPAImpl categories = new CategoryDAOJPAImpl();
        categories.create(cat);
        Item item1 = sellerMgr.offerItem(seller, cat, omsch);
        Bid new1 = auction.newBid(item1, buyer, new Money(10, "eur"));
        assertEquals(emailb, new1.getBuyer().getEmail());

        // lager bod
        Bid new2 = auction.newBid(item1, buyer2, new Money(9, "eur"));
        assertNull(new2);

        // hoger bod
        Bid new3 = auction.newBid(item1, buyer2, new Money(11, "eur"));
        assertEquals(emailb2, new3.getBuyer().getEmail());
        em.getTransaction().commit();
    }
    */
}
