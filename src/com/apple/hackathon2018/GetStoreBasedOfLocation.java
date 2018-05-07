package com.apple.hackathon2018;
import com.oracle.javafx.jmx.json.JSONDocument;
import com.sun.corba.se.spi.presentation.rmi.StubAdapter;
import jdk.nashorn.internal.parser.JSONParser;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.util.ArrayList;
import java.util.Random;


@Path("/getStoreBasedOfLocation")
public class GetStoreBasedOfLocation {

    ArrayList<String> stores = new ArrayList<>();

    @GET
    @Produces("application/json")
    public String getStoreName (){

        String storeName="";

        populateDummyData();

        storeName = getRandomStoreName();
        storeName = storeName.equals("")?"Others":storeName;

        return storeName;
    }

    public void populateDummyData(){
        stores.add("AppleStore");
        stores.add("BestBuy");
        stores.add("Target");
        stores.add("GasStation");
        stores.add("Others");
    }

    public String getRandomStoreName(){

        Random r = new Random();
        int value = r.nextInt(4);

        return stores.get(value);

    }
}
