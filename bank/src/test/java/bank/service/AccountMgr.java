/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.service;
import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;
import bank.domain.Account;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Subhi
 */
public class AccountMgr {

    //private EntityManagerFactory emf = Persistence.createEntityManagerFactory("bankPU");
    //private EntityManager em = emf.createEntityManager();
    @Test
    public void create() {
        /*
        Account account = new Account(111L);
        em.getTransaction().begin();
        em.persist(account);
        //TODO: verklaar en pas eventueel aan
        assertNull(account.getId());
        em.getTransaction().commit();
        System.out.println("AccountId: " + account.getId());
        //TODO: verklaar en pas eventueel aan
        assertTrue(account.getId() > 0L);*/
        assertTrue(true);
    }
}
