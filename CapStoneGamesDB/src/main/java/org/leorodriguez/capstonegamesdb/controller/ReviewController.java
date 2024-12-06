package org.leorodriguez.capstonegamesdb.controller;

import org.leorodriguez.capstonegamesdb.model.Review;
import org.leorodriguez.capstonegamesdb.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewController {
    @Autowired
    private ReviewService reviewService;


    @PostMapping("/update-review")
    public String updateReview(@RequestParam("reviewId")int reviewId,
                               @RequestParam("score")int score,
                               @RequestParam("summary")String summary,
                               Model model) {
        Review review = reviewService.findById(reviewId);
        if (review == null) {
            model.addAttribute("error", "Review not found");
            return "update-delete-review";
        }
        review.setScore(score);
        review.setShortSummary(summary);
        reviewService.save(review);
        return "redirect:/home";
    }
    @PostMapping("/delete-review")
    public String deleteReview(@RequestParam("reviewId")int reviewId, Model model) {
        Review review = reviewService.findById(reviewId);
        if (review == null) {
            model.addAttribute("error", "Review not found");
            return "update-delete-review";
        }
        reviewService.delete(reviewId);
        return "redirect:/home";
    }
}
