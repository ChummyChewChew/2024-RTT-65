package org.leorodriguez.capstonegamesdb.service;

import org.leorodriguez.capstonegamesdb.model.Review;
import org.leorodriguez.capstonegamesdb.model.User;
import org.leorodriguez.capstonegamesdb.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    public Review findById(long id) {
        return reviewRepository.findReviewById(id);
    }

    public List<Review> findReviewsByUser(User user) {
        return reviewRepository.findByUser(user);

    }
    public void save(Review review) {
        reviewRepository.save(review);
    }
    public void delete(long id) {
        reviewRepository.deleteById(id);
    }
    public void deleteReviewByUser(User user) {
        List<Review> reviews = reviewRepository.findByUser(user);
        reviewRepository.deleteAll(reviews);
    }


}
