
package webservice;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Auction", targetNamespace = "http://service.auction/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Auction {


    /**
     * 
     * @param arg0
     * @return
     *     returns webservice.Item
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getItem", targetNamespace = "http://service.auction/", className = "webservice.GetItem")
    @ResponseWrapper(localName = "getItemResponse", targetNamespace = "http://service.auction/", className = "webservice.GetItemResponse")
    @Action(input = "http://service.auction/Auction/getItemRequest", output = "http://service.auction/Auction/getItemResponse")
    public Item getItem(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns webservice.Bid
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "newBid", targetNamespace = "http://service.auction/", className = "webservice.NewBid")
    @ResponseWrapper(localName = "newBidResponse", targetNamespace = "http://service.auction/", className = "webservice.NewBidResponse")
    @Action(input = "http://service.auction/Auction/newBidRequest", output = "http://service.auction/Auction/newBidResponse")
    public Bid newBid(
        @WebParam(name = "arg0", targetNamespace = "")
        Item arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        User arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        Money arg2);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "revokeItem", targetNamespace = "http://service.auction/", className = "webservice.RevokeItem")
    @ResponseWrapper(localName = "revokeItemResponse", targetNamespace = "http://service.auction/", className = "webservice.RevokeItemResponse")
    @Action(input = "http://service.auction/Auction/revokeItemRequest", output = "http://service.auction/Auction/revokeItemResponse")
    public boolean revokeItem(
        @WebParam(name = "arg0", targetNamespace = "")
        Item arg0);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns webservice.Item
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "offerItem", targetNamespace = "http://service.auction/", className = "webservice.OfferItem")
    @ResponseWrapper(localName = "offerItemResponse", targetNamespace = "http://service.auction/", className = "webservice.OfferItemResponse")
    @Action(input = "http://service.auction/Auction/offerItemRequest", output = "http://service.auction/Auction/offerItemResponse")
    public Item offerItem(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Category arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<webservice.Item>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findItemByDescription", targetNamespace = "http://service.auction/", className = "webservice.FindItemByDescription")
    @ResponseWrapper(localName = "findItemByDescriptionResponse", targetNamespace = "http://service.auction/", className = "webservice.FindItemByDescriptionResponse")
    @Action(input = "http://service.auction/Auction/findItemByDescriptionRequest", output = "http://service.auction/Auction/findItemByDescriptionResponse")
    public List<Item> findItemByDescription(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}