package org.leorodriguez.capstonegamesdb.controller;

import org.leorodriguez.capstonegamesdb.model.User;
import org.leorodriguez.capstonegamesdb.service.ReviewService;
import org.leorodriguez.capstonegamesdb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;

@Controller
public class DeleteController {
    @Autowired
    private UserService userService;

    @Autowired
    private ReviewService reviewService;

    // Show the delete account form
    @GetMapping("/delete-account")
    public String showDeleteAccountForm() {
        return "delete-account";
    }

    // Handle the form submission
    @PostMapping("/delete-account")
    public String deleteAccount(Principal principal, Model model) {
        String email = principal.getName();
        User user = userService.findByEmail(email);

        if (user == null) {
            model.addAttribute("errorMessage", "User not found");
            return "delete-account";
        } else {
            reviewService.deleteReviewByUser(user);
            userService.deleteUser(user.getId());
        }
        return "redirect:/login-register";
    }
}