package auction.dao;

import auction.domain.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class UserDAOJPAImpl implements UserDAO {
    EntityManager users;

    public UserDAOJPAImpl(EntityManager em) {
        this.users = em;
        
    }

    @Override
    public int count() {
        return (Integer) users.createNativeQuery("SELECT count(1) FROM TableA")
                .getSingleResult();  
    }

    @Override
    public void create(User user) {
         if (findByEmail(user.getEmail()) != null) {
            throw new EntityExistsException();
        }
        users.persist(user);
    }

    @Override
    public void edit(User user) {
        if (findByEmail(user.getEmail()) == null) {
            throw new IllegalArgumentException();
        }
        users.merge(user);
    }


    @Override
    public List<User> findAll() {
        return users.createQuery("SELECT u FROM User u").getResultList();
    }

    @Override
    public User findByEmail(String email) {
        return users.find(User.class, email);
    }

    @Override
    public void remove(User user) {
        users.remove(user.getEmail());
    }
}
