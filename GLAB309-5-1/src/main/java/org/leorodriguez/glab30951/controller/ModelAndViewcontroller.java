package org.leorodriguez.glab30951.controller;

import org.leorodriguez.glab30951.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class ModelAndViewcontroller {
    @GetMapping("/showViewPage")// Maps HTTP GET requests to /showViewPage to this method
    public String passParametersWithModel(Model model) {
        model.addAttribute("message", "Perscholas");// Adds a message attribute to the model
        model.addAttribute("welcomeMessage", "welcome");// Adds a welcomeMessage attribute to the model
        int i = 10;
        model.addAttribute("number", i);//Adds number attribute to model

        List<String> list = Arrays.asList("one", "two");
        model.addAttribute("listData", list);// Adds the listData attribute to the model
        return "viewPage";
    }

    @GetMapping("/goToViewPage")// Maps HTTP GET requests to /goToViewPage to this method
    public ModelAndView passParametersWithModelAndView() {
        String st = "Welcome to the Page";
        ModelAndView modelAndView = new ModelAndView("viewPage_2");
        modelAndView.addObject("message", st);
        modelAndView.addObject("info", "Employee information.");
        return modelAndView;
    }

    @GetMapping("/goToUserViewPage")
    public ModelAndView UserModelAndView() {
        List<User> listUsers = new ArrayList<User>();
        listUsers.add(new User(1,"Haseeb","haseeb@abc.com,"));// Adds a User object to the list
        listUsers.add(new User(2,"Shahparan","Shahparan@abc.com,"));
        listUsers.add(new User(3,"James","James@abc.com,"));
        listUsers.add(new User(4,"Joseph","Joseph@abc.com,"));

        ModelAndView modelAndView = new ModelAndView("userdata");// Creates a new ModelAndView object
        // with the view name "userdata"
        modelAndView.addObject("userlist", listUsers);// Adds a userlist attribute to the ModelAndView
        return modelAndView;
    }



}

