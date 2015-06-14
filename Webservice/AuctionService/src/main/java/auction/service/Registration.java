package auction.service;

import auction.domain.User;

import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * Created by Michon on 14-6-2015.
 */
@WebService
public class Registration {
    EntityManager em;
    RegistrationMgr registrationMgr;

    public Registration() {
        em = Persistence.createEntityManagerFactory("db").createEntityManager();
        registrationMgr = new RegistrationMgr(em);
    }

    public User registerUser(String email) {
        em.getTransaction().begin();
        User ret = registrationMgr.registerUser(email);
        em.getTransaction().commit();
        return ret;
    }

    public User getUser(String email) {
        em.getTransaction().begin();
        User ret = registrationMgr.getUser(email);
        em.getTransaction().commit();
        return ret;
    }
}
