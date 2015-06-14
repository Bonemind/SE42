package auction.domain;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Category {

    @Id
    private String description;

    @XmlTransient
    @OneToMany(mappedBy = "category", cascade = CascadeType.PERSIST)
    private List<Item> items = new ArrayList<>();

    public Category() {
        description = "undefined";
    }

    public Category(String description) {
        this.description = description;
    }

    public String getDiscription() {
        return description;
    }
}
