package org.leorodriguez.glab30951.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.leorodriguez.glab30951.model.*;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("u")// Specifies that the "u" attribute should be stored in the session
public class Session_Controller {
    /*
     * Add user in model attribute
     */
    @ModelAttribute("u")
    public User setUpUserForm() {// Declares the method setUpUserForm that returns a new User object
        return new User();
    }

    @GetMapping("/dologin")
    public String doLogin(@ModelAttribute("u") User u, Model model) {
        model.addAttribute("FormVar", u);
        return "UserForm";
    }

    /* Get user from session attribute   */
    @PostMapping("/Getuser")// Maps HTTP GET requests to /dologin to this method
    public String userInfo(@ModelAttribute("u") User user, Model model) {
        System.out.println("Email: " + user.getEmail());
        System.out.println("First Name: " + user.getName());
        System.out.println("Id: " + user.getId());
        model.addAttribute("stu",user);
        return "showData";
    }
}