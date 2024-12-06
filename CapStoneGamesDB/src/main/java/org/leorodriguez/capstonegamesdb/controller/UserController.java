package org.leorodriguez.capstonegamesdb.controller;

import jakarta.validation.Valid;
import org.leorodriguez.capstonegamesdb.dto.UserDTO;
import org.leorodriguez.capstonegamesdb.model.User;
import org.leorodriguez.capstonegamesdb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login/register")
    public String loginRegister(Model model) {
        model.addAttribute("user", new UserDTO());
        return "login-register";
    }
    @PostMapping("/register/save")
    public String registration(@Valid @ModelAttribute("user")  UserDTO user, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()) {
            model.addAttribute("user", user);
            return "login-register";
        }
        if(userService.usernameorEmailExists(user.getUsername(), user.getEmail())){
            model.addAttribute("error", "Username or Email already exists");
            return "login-register";
        }
        userService.saveUser(user);

        return "/home";
//http://localhost:8080/users/login/register
    }



}
