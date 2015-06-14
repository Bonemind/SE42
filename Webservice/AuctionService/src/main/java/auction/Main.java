package auction;

import auction.service.Auction;
import auction.service.Registration;

import javax.xml.ws.Endpoint;

/**
 * Created by Michon on 14-6-2015.
 */
public class Main {

    private static final String url = "http://localhost:8080";

    public static void main(String[] args) {
        Endpoint.publish(url + "/Registration", new Registration());
        Endpoint.publish(url + "/Auction", new Auction());
        System.out.println("Done");
    }
}
