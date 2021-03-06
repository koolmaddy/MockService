package com.apple.hackathon2018;
import com.oracle.javafx.jmx.json.JSONDocument;
import com.sun.corba.se.spi.presentation.rmi.StubAdapter;
import jdk.nashorn.internal.parser.JSONParser;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/getCBInfo")
public class GetCashbackBasedOfStore {
    // The Java method will process HTTP GET requests
    @QueryParam("storeName") String storeName;
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("application/json")

    public String getCBInformation() {

        String message="{\"Please pass a store name\"}";

        if (storeName == null)
            return message;

        /*
            ChaseFreedom - 0
            BestBuy - 1
            BankOfAmerica - 2
            AppleStoreCard - 3

         */

        switch (storeName){
            case "AppleStore" :
                message = "{\n" +
                    "    \"cashbackInfo\": [\n" +
                    "        {\n" +
                    "            \"value\": 3.0,\n" +
                    "            \"walletCardId\": 3\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"value\": 1.5,\n" +
                    "            \"walletCardId\": 0\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"value\": 1.0,\n" +
                    "            \"walletCardId\": 2\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"value\": 1.0,\n" +
                    "            \"walletCardId\": 1\n" +
                    "        }\n" +
                    "    ]\n" +
                    "}\n";

                break;

            case "BestBuy" :
                message = "{\n" +
                    "    \"cashbackInfo\": [\n" +
                    "        {\n" +
                    "            \"value\": 2.0,\n" +
                    "            \"walletCardId\": 1\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"value\": 1.5,\n" +
                    "            \"walletCardId\": 0\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"value\": 0.5,\n" +
                    "            \"walletCardId\": 3\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"value\": 0.5,\n" +
                    "            \"walletCardId\": 2\n" +
                    "        }\n" +
                    "    ]\n" +
                    "}\n";

                break;

            case "Target" :
                message = "{\n" +
                        "    \"cashbackInfo\": [\n" +
                        "        {\n" +
                        "            \"value\": 3.0,\n" +
                        "            \"walletCardId\": 3\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"value\": 1.5,\n" +
                        "            \"walletCardId\": 2\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"value\": 1.0,\n" +
                        "            \"walletCardId\": 0\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"value\": 1.0,\n" +
                        "            \"walletCardId\": 1\n" +
                        "        }\n" +
                        "    ]\n" +
                        "}\n";

                break;

            case "GasStation" :
                message = "{\n" +
                        "    \"cashbackInfo\": [\n" +
                        "        {\n" +
                        "            \"value\": 2.0,\n" +
                        "            \"walletCardId\": 2\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"value\": 1.5,\n" +
                        "            \"walletCardId\": 0\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"value\": 1.2,\n" +
                        "            \"walletCardId\": 1\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"value\": 1.0,\n" +
                        "            \"walletCardId\": 3\n" +
                        "        }\n" +
                        "    ]\n" +
                        "}\n";

                break;

            case "Others" :
                message = "{\n" +
                        "    \"cashbackInfo\": [\n" +
                        "        {\n" +
                        "            \"value\": 1.5,\n" +
                        "            \"walletCardId\": 0\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"value\": 1.0,\n" +
                        "            \"walletCardId\": 2\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"value\": 1.0,\n" +
                        "            \"walletCardId\": 1\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"value\": 1.0,\n" +
                        "            \"walletCardId\": 3\n" +
                        "        }\n" +
                        "    ]\n" +
                        "}\n";

                break;
            default :
                message="{\"Not A Valid Store\"}";
                break;
        }

        return message;
    }
}
