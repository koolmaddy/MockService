package com.apple.hackathon2018;
import com.oracle.javafx.jmx.json.JSONDocument;
import jdk.nashorn.internal.parser.JSONParser;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

// The Java class will be hosted at the URI path "/helloworld"
@Path("/getCBInfo")
public class GetCashbackBasedOfStore {
    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("application/json")
    public String getClichedMessage() {
        // Return some cliched textual content
        String message = "{\n" +
                "    \"cashbackInfo\": [\n" +
                "        {\n" +
                "            \"value\": 1.5,\n" +
                "            \"walletCardId\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"value\": 1.2,\n" +
                "            \"walletCardId\": 3\n" +
                "        },\n" +
                "        {\n" +
                "            \"value\": 1,\n" +
                "            \"walletCardId\": 2\n" +
                "        },\n" +
                "        {\n" +
                "            \"value\": 0.5,\n" +
                "            \"walletCardId\": 4\n" +
                "        }\n" +
                "    ]\n" +
                "}\n";

        return message;
    }
}
