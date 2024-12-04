package org.leorodriguez.capstonegamesdb.controller;

import org.leorodriguez.capstonegamesdb.dto.ReviewDTO;
import org.leorodriguez.capstonegamesdb.impl.GameServiceImplementation;
import org.leorodriguez.capstonegamesdb.impl.UserServiceImplementation;
import org.leorodriguez.capstonegamesdb.model.Game;
import org.leorodriguez.capstonegamesdb.model.User;
import org.leorodriguez.capstonegamesdb.service.GameService;
import org.leorodriguez.capstonegamesdb.service.ReviewService;
import org.leorodriguez.capstonegamesdb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;

@Controller
public class SubmitReviewController {
    @Autowired
    private ReviewService reviewService;

    @Autowired
    private UserService userService;

    @Autowired
    private GameService gameService;

    @Autowired
    private UserServiceImplementation userServiceImplementation;

    @Autowired
    private GameServiceImplementation gameServiceImplementation;

    @GetMapping("/submit-review")
    public String submitReviewForm(Model model) {
        model.addAttribute("reviewDTO", new ReviewDTO());
        return "submit-review";
    }
    @PostMapping("/submit-review")
    public String submitReview(Principal principal, ReviewDTO reviewDTO, Model model) {
        String email = principal.getName();
        User user = userServiceImplementation.findByEmail(email);

        Game game = gameService.findByTitle(reviewDTO.getGameTitle());
        if (game == null) {
            model.addAttribute("errorMessage", "Game not found");
            return "submit-review";
        }
        reviewDTO.setGameId(game.getId());
        userService.submitReview(user.getId(), reviewDTO);
        return "redirect:/home";
    }

}
