package org.leorodriguez.capstonegamesdb.repository;

import org.leorodriguez.capstonegamesdb.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    Review findReviewById(long id);

}
