package org.leorodriguez.capstonegamesdb.repository;

import org.leorodriguez.capstonegamesdb.model.Review;
import org.leorodriguez.capstonegamesdb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    Review findReviewById(long id);
    List<Review> findByUser(User user);

}
