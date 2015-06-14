package auction.service;

import auction.dao.CategoryDAO;
import auction.dao.CategoryDAOJPAImpl;
import auction.domain.Bid;
import auction.domain.Category;
import auction.domain.Item;
import auction.domain.User;
import nl.fontys.util.Money;

import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by Michon on 14-6-2015.
 */
@WebService
public class Auction {
    EntityManager em;
    AuctionMgr auctionMgr;
    SellerMgr sellerMgr;
    RegistrationMgr registrationMgr;

    public Auction() {
        em = Persistence.createEntityManagerFactory("db").createEntityManager();
        auctionMgr = new AuctionMgr(em);
        sellerMgr = new SellerMgr(em);
        registrationMgr = new RegistrationMgr(em);
    }

    public Item getItem(Long id) {
        em.getTransaction().begin();
        Item ret = auctionMgr.getItem(id);
        em.getTransaction().commit();
        return ret;
    }

    public List<Item> findItemByDescription(String description) {
        em.getTransaction().begin();
        List<Item> ret = auctionMgr.findItemByDescription(description);
        em.getTransaction().commit();
        return ret;
    }

    public Bid newBid(Item item, User buyer, Money amount) {
        em.getTransaction().begin();
        item = auctionMgr.getItem(item.getId());
        buyer = registrationMgr.getUser(buyer.getEmail());
        Bid ret = auctionMgr.newBid(item, buyer, amount);
        em.getTransaction().commit();
        return ret;
    }

    public Item offerItem(User seller, Category cat, String description) {
        em.getTransaction().begin();
        seller = registrationMgr.getUser(seller.getEmail());
        CategoryDAO categoryDAO = new CategoryDAOJPAImpl(em);
        if (categoryDAO.find(cat.getDiscription()) == null) {
            categoryDAO.create(cat);
        }
        cat = categoryDAO.find(cat.getDiscription());
        Item ret = sellerMgr.offerItem(seller, cat, description);
        em.getTransaction().commit();
        return ret;
    }

    public boolean revokeItem(Item item) {
        em.getTransaction().begin();
        item = auctionMgr.getItem(item.getId());
        boolean ret = sellerMgr.revokeItem(item);
        em.getTransaction().commit();
        return ret;
    }
}
