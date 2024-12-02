package org.leorodriguez.glab30951.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
/*
A rest controller combines controller and responseBody. It's used in restful web services that
return json or xml responses.
Returns the actual data and not a view name
Used in rest api and returns data directly to clients
 */
public class DemoController {
    @GetMapping("/get-info")//Maps HTTP GET requests to the /get-info endpoint to this method
    public String getStringMessage() {// Declares the method getStringMessage that returns a String
        return "Hi ! You will be able to monitor the health of the application !!" ;
    }
}

