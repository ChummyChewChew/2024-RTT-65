package org.leorodriguez.capstonegamesdb.repository;

import org.leorodriguez.capstonegamesdb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User findByEmail(String email);

    boolean existsByUsernameOrEmail(String username, String email);

}
