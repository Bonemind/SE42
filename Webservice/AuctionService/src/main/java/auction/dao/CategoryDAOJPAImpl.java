package auction.dao;

import auction.domain.Category;
import auction.domain.Item;
import auction.domain.User;
import java.util.List;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CategoryDAOJPAImpl implements CategoryDAO {
    EntityManager categories;
    
    public CategoryDAOJPAImpl(EntityManager em) {
        categories = em;
    }

    @Override
    public int count() {
        return (Integer) categories.createNativeQuery("SELECT count(*) FROM Category c")
                .getSingleResult();  
    }

    @Override
    public void create(Category category) {
        // if (find(item.getId()) != null) {
        //     throw new EntityExistsException();
        // }
        categories.persist(category);
    }

    @Override
    public void edit(Category category) {
        // if (find(item.getId()) == null) {
        //     throw new IllegalArgumentException();
        // }
        categories.merge(category);
    }


    @Override
    public List<Category> findAll() {
        return categories.createQuery("SELECT i FROM Item i").getResultList();
    }

    @Override
    public void remove(Category category) {
        categories.remove(category.getDiscription());
    }

    @Override
    public Category find(String description) {
        return categories.find(Category.class, description);
    }

    @Override
    public List<Category> findByDescription(String description) {
        return categories.createQuery("SELECT c FROM Category c WHERE c.description = ':description'").setParameter("description", description).getResultList();
    }
}
