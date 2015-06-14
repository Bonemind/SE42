package auction.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.*;

/**
 * Contains a user entity
 * @author Subhi
 */
@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class User{
    /**
     * The email address of the user
     */
    @Id
    private String email;

    @XmlTransient
    @OneToMany(mappedBy = "seller", cascade = CascadeType.PERSIST)
    private Set<Item> offeredItems = new TreeSet<>();

    @XmlTransient
    @OneToMany(mappedBy = "buyer", cascade = CascadeType.PERSIST)
    private List<Bid> bids = new ArrayList<>();
    
    /**
     * No arg persistence constructor
     */
    public User() {}

    /**
     * Constructs a user using the passed email address
     * @param email 
     */
    public User(String email) {
        this.email = email;

    }

    /**
     * Returns the email address of this user
     * @return The email address
     */
    public String getEmail() {
        return email;
    }
    
    public Iterator<Item> getOfferedItems() {
        return offeredItems.iterator();
    }
    
    public int numberOfOfferdItems() {
        return offeredItems.size();
    }
    
    void addItem(Item i) {
        offeredItems.add(i);
        i.setSeller(this);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }

    public boolean equals(User o) {
        return this.getEmail().equals(o.getEmail());
    }
}
