package org.leorodriguez.glab30951.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("home")
public class MyController {
    @RequestMapping({"/login"})  // Maps HTTP requests to /home/login
    // (as well as /home/) to this method // either type '/' or index
    public String showLogin() {
        return "inboxpage";
    }//All the below methods lead to the same page. This is like overloading, having multiple entry points to the same page

    @RequestMapping("/")
    public String simpleMethod() {
        //mapped to hostname:port/home/
        return "inboxpage";
    }

    @RequestMapping("/index")
    public String showIndex() {
        //mapped to hostname:port/home/index/
        return "inboxpage";
    }
}