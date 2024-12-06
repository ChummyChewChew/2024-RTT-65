package org.leorodriguez.capstonegamesdb.impl;

import jakarta.transaction.Transactional;
import org.leorodriguez.capstonegamesdb.dto.ReviewDTO;
import org.leorodriguez.capstonegamesdb.dto.UserDTO;
import org.leorodriguez.capstonegamesdb.model.Game;
import org.leorodriguez.capstonegamesdb.model.Review;
import org.leorodriguez.capstonegamesdb.model.User;
import org.leorodriguez.capstonegamesdb.repository.GameRepository;
import org.leorodriguez.capstonegamesdb.repository.ReviewRepository;
import org.leorodriguez.capstonegamesdb.repository.UserRepository;
import org.leorodriguez.capstonegamesdb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;


@Service
public class UserServiceImplementation implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User saveUser(UserDTO userDTO) {
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        user.setPassword(passwordEncoder.encode(userDTO.getPassword()));

        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);

    }
    @Transactional
    @Override
    public void submitReview(Long userId, ReviewDTO reviewDTO) {
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        Game game = gameRepository.findById(reviewDTO.getGameId()).orElseThrow(() -> new RuntimeException("Game not found"));

        Review review = new Review();
        review.setUser(user);
        review.setGame(game);
        review.setScore(reviewDTO.getScore());
        review.setShortSummary(reviewDTO.getShortSummery());

        reviewRepository.save(review);
        //change
        if (game.getReviews() == null) {
            game.setReviews(new HashSet<>());
        }//change end
        /* */
        game.getReviews().add(review);//change
        gameRepository.save(game);//change

    }

    @Override
    public void updateReview(Long userId, ReviewDTO reviewDTO) {
        Review review = reviewRepository.findById(reviewDTO.getId()).orElseThrow(() -> new
                RuntimeException("Review not found"));
        //verify it belongs to user
        if (review.getUser().getId() != userId) {
            throw new RuntimeException("User not authorized to update review");
        } else {
            review.setScore(reviewDTO.getScore());
            review.setShortSummary(reviewDTO.getShortSummery());

            reviewRepository.save(review);
        }
    }

    @Override
    public void deleteReview(Long userId, Long reviewId) {
        Review review = reviewRepository.findById(reviewId).orElseThrow(() -> new RuntimeException("Review not found"));
        if (review.getUser().getId() != userId) {
            throw new RuntimeException("User not authorized to delete review");
        }
        reviewRepository.deleteById(reviewId);

    }

    @Override
    public boolean usernameorEmailExists(String username, String email) {
        return userRepository.existsByUsernameOrEmail(username, email);
    }

    public User findByEmail(String email){
        return userRepository.findByEmail(email);
    }

}
