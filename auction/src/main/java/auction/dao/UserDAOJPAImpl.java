package auction.dao;

import auction.domain.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class UserDAOJPAImpl implements UserDAO {

    @PersistenceContext
    EntityManager users;

    public UserDAOJPAImpl() {
        //users = new HashMap<String, User>();
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
        users.persist(user);
    }


    @Override
    public List<User> findAll() {
        return users.createQuery("SELECT * FROM USERS").getResultList();
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
