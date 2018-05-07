package com.apple.hackathon2018;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


// The Java class will be hosted at the URI path "/helloworld"
@Controller
public class GetCashbackBasedOfStore {
    // The Java method will process HTTP GET requests
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @RequestMapping(value="getCBInfo",
            method= RequestMethod.GET,
            produces= MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public CashBack getClichedMessage() {
        // Return some cliched textual content
        CashBack cashBack = new CashBack();
        cashBack.addCard(1,1.5);
        cashBack.addCard(2,1);
        cashBack.addCard(3,1.2);
        cashBack.addCard(4,0.5);


        return cashBack;
    }



}
