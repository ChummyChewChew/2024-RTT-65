package org.leorodriguez.capstonegamesdb.service;

import org.leorodriguez.capstonegamesdb.dto.ReviewDTO;
import org.leorodriguez.capstonegamesdb.dto.UserDTO;
import org.leorodriguez.capstonegamesdb.model.User;

public interface UserService {
    User saveUser(UserDTO userDTO);
    void deleteUser(Long userId);
    void submitReview(Long userId, ReviewDTO reviewDTO);
    void updateReview(Long userId, ReviewDTO reviewDTO);

    void deleteReview(Long userId, Long reviewId);
    boolean usernameorEmailExists(String username, String email);
}
