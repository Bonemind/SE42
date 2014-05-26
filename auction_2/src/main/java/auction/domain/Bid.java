package auction.domain;

import nl.fontys.util.FontysTime;
import nl.fontys.util.Money;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.CascadeType;

@Entity
public class Bid {

    /**
     * The id of this item
     */
    @Id
    private Long id;

    @Column
    private FontysTime time;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private User buyer;

    @Column
    private Money amount;
    
    public Bid() {
    }

    public Bid(User buyer, Money amount) {
        //TODO
    }

    public FontysTime getTime() {
        return time;
    }

    public User getBuyer() {
        return buyer;
    }

    public Money getAmount() {
        return amount;
    }
}
