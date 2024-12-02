package org.leorodriguez.glab30951.controller;

import org.leorodriguez.glab30951.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//Response body and Request body are used to bind HTPP request and responses with spring 4.0 and beyond
//and response body comes with @RestController
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
// for commented out code @RestController
@Controller
public class UserController {
    /*This method demonstrates the use @ModelAttribute annotation at the method level.
     * This method creates a list and returns a list of countries
     * @return list of countries
     */
    @ModelAttribute("countries")// Binds a method return value to a model attribute named "countries"
    public List < String > getUserCountries() {
        List < String > countries = new ArrayList< >();
        countries.add("UK");
        countries.add("USA");
        countries.add("Japan");
        return countries;
    }

    /* This method is the variation of the above method. It will accept a model and save values in this model. These saved values will be available on the frontend to the custom  */
    @ModelAttribute
    public void getUsers (Model model)
    {
        User u1 = new User(1,"haseeb","haseeb@gmail.com");
        User u2 = new User(2,"Josph","Josph@gmail.com");
        User u3 = new User(3,"Ameer","Ameer@gmail.com");
        List < User> myuser = new ArrayList < > ();
        myuser.add(u1);
        myuser.add(u2);
        myuser.add(u3);
        model.addAttribute("myuserAttribute", myuser);
    }
}

    /*@PostMapping("/users")
    /*
    RequestBody binds the HTTP request to the domain object (user)
    that means user is bound to the request and it will convert the request to be a user object
     *//*

    public void printData(@RequestBody User user) {
        System.out.println("Printing the user data:"+user);
        */
