
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _NewBid_QNAME = new QName("http://service.auction/", "newBid");
    private final static QName _Item_QNAME = new QName("http://service.auction/", "item");
    private final static QName _RevokeItem_QNAME = new QName("http://service.auction/", "revokeItem");
    private final static QName _FindItemByDescriptionResponse_QNAME = new QName("http://service.auction/", "findItemByDescriptionResponse");
    private final static QName _RevokeItemResponse_QNAME = new QName("http://service.auction/", "revokeItemResponse");
    private final static QName _OfferItem_QNAME = new QName("http://service.auction/", "offerItem");
    private final static QName _NewBidResponse_QNAME = new QName("http://service.auction/", "newBidResponse");
    private final static QName _GetItem_QNAME = new QName("http://service.auction/", "getItem");
    private final static QName _GetItemResponse_QNAME = new QName("http://service.auction/", "getItemResponse");
    private final static QName _Money_QNAME = new QName("http://service.auction/", "money");
    private final static QName _FindItemByDescription_QNAME = new QName("http://service.auction/", "findItemByDescription");
    private final static QName _OfferItemResponse_QNAME = new QName("http://service.auction/", "offerItemResponse");
    private final static QName _Bid_QNAME = new QName("http://service.auction/", "bid");
    private final static QName _Category_QNAME = new QName("http://service.auction/", "category");
    private final static QName _User_QNAME = new QName("http://service.auction/", "user");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindItemByDescriptionResponse }
     * 
     */
    public FindItemByDescriptionResponse createFindItemByDescriptionResponse() {
        return new FindItemByDescriptionResponse();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link RevokeItem }
     * 
     */
    public RevokeItem createRevokeItem() {
        return new RevokeItem();
    }

    /**
     * Create an instance of {@link NewBid }
     * 
     */
    public NewBid createNewBid() {
        return new NewBid();
    }

    /**
     * Create an instance of {@link GetItem }
     * 
     */
    public GetItem createGetItem() {
        return new GetItem();
    }

    /**
     * Create an instance of {@link NewBidResponse }
     * 
     */
    public NewBidResponse createNewBidResponse() {
        return new NewBidResponse();
    }

    /**
     * Create an instance of {@link RevokeItemResponse }
     * 
     */
    public RevokeItemResponse createRevokeItemResponse() {
        return new RevokeItemResponse();
    }

    /**
     * Create an instance of {@link OfferItem }
     * 
     */
    public OfferItem createOfferItem() {
        return new OfferItem();
    }

    /**
     * Create an instance of {@link FindItemByDescription }
     * 
     */
    public FindItemByDescription createFindItemByDescription() {
        return new FindItemByDescription();
    }

    /**
     * Create an instance of {@link OfferItemResponse }
     * 
     */
    public OfferItemResponse createOfferItemResponse() {
        return new OfferItemResponse();
    }

    /**
     * Create an instance of {@link GetItemResponse }
     * 
     */
    public GetItemResponse createGetItemResponse() {
        return new GetItemResponse();
    }

    /**
     * Create an instance of {@link Money }
     * 
     */
    public Money createMoney() {
        return new Money();
    }

    /**
     * Create an instance of {@link Bid }
     * 
     */
    public Bid createBid() {
        return new Bid();
    }

    /**
     * Create an instance of {@link Category }
     * 
     */
    public Category createCategory() {
        return new Category();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link FontysTime }
     * 
     */
    public FontysTime createFontysTime() {
        return new FontysTime();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewBid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.auction/", name = "newBid")
    public JAXBElement<NewBid> createNewBid(NewBid value) {
        return new JAXBElement<NewBid>(_NewBid_QNAME, NewBid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Item }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.auction/", name = "item")
    public JAXBElement<Item> createItem(Item value) {
        return new JAXBElement<Item>(_Item_QNAME, Item.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevokeItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.auction/", name = "revokeItem")
    public JAXBElement<RevokeItem> createRevokeItem(RevokeItem value) {
        return new JAXBElement<RevokeItem>(_RevokeItem_QNAME, RevokeItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindItemByDescriptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.auction/", name = "findItemByDescriptionResponse")
    public JAXBElement<FindItemByDescriptionResponse> createFindItemByDescriptionResponse(FindItemByDescriptionResponse value) {
        return new JAXBElement<FindItemByDescriptionResponse>(_FindItemByDescriptionResponse_QNAME, FindItemByDescriptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevokeItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.auction/", name = "revokeItemResponse")
    public JAXBElement<RevokeItemResponse> createRevokeItemResponse(RevokeItemResponse value) {
        return new JAXBElement<RevokeItemResponse>(_RevokeItemResponse_QNAME, RevokeItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfferItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.auction/", name = "offerItem")
    public JAXBElement<OfferItem> createOfferItem(OfferItem value) {
        return new JAXBElement<OfferItem>(_OfferItem_QNAME, OfferItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewBidResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.auction/", name = "newBidResponse")
    public JAXBElement<NewBidResponse> createNewBidResponse(NewBidResponse value) {
        return new JAXBElement<NewBidResponse>(_NewBidResponse_QNAME, NewBidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.auction/", name = "getItem")
    public JAXBElement<GetItem> createGetItem(GetItem value) {
        return new JAXBElement<GetItem>(_GetItem_QNAME, GetItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.auction/", name = "getItemResponse")
    public JAXBElement<GetItemResponse> createGetItemResponse(GetItemResponse value) {
        return new JAXBElement<GetItemResponse>(_GetItemResponse_QNAME, GetItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Money }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.auction/", name = "money")
    public JAXBElement<Money> createMoney(Money value) {
        return new JAXBElement<Money>(_Money_QNAME, Money.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindItemByDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.auction/", name = "findItemByDescription")
    public JAXBElement<FindItemByDescription> createFindItemByDescription(FindItemByDescription value) {
        return new JAXBElement<FindItemByDescription>(_FindItemByDescription_QNAME, FindItemByDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfferItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.auction/", name = "offerItemResponse")
    public JAXBElement<OfferItemResponse> createOfferItemResponse(OfferItemResponse value) {
        return new JAXBElement<OfferItemResponse>(_OfferItemResponse_QNAME, OfferItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.auction/", name = "bid")
    public JAXBElement<Bid> createBid(Bid value) {
        return new JAXBElement<Bid>(_Bid_QNAME, Bid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Category }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.auction/", name = "category")
    public JAXBElement<Category> createCategory(Category value) {
        return new JAXBElement<Category>(_Category_QNAME, Category.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.auction/", name = "user")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<User>(_User_QNAME, User.class, null, value);
    }

}
