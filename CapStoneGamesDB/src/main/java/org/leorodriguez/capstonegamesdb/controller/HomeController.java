package org.leorodriguez.capstonegamesdb.controller;

import org.leorodriguez.capstonegamesdb.model.User;
import org.leorodriguez.capstonegamesdb.repository.UserRepository;
import org.leorodriguez.capstonegamesdb.service.ReviewService;
import org.leorodriguez.capstonegamesdb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;
import org.leorodriguez.capstonegamesdb.impl.UserServiceImplementation;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @Autowired
    private ReviewService reviewService;







    @GetMapping("/home")
    public String home(Principal principal, Model model) {
        if (principal == null) {
            return "redirect:/login-register";  // Redirect to login if the user is not authenticated
        }

        String email = principal.getName();
        User user = userService.findByEmail(email);

        model.addAttribute("user", user);
        model.addAttribute("reviews", reviewService.findReviewsByUser(user));
        return "home";
    }

}
