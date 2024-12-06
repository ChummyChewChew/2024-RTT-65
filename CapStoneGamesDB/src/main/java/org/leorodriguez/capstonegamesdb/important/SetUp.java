/**package org.leorodriguez.capstonegamesdb.important;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.leorodriguez.capstonegamesdb.model.*;
import org.leorodriguez.capstonegamesdb.repository.*;

import java.util.Set;

@Configuration
public class SetUp {

    @Bean
    CommandLineRunner loadData(UserRepository userRepo, GameRepository gameRepo, GenreRepository genreRepo, ReviewRepository reviewRepo) {
        return args -> {
            User user1 = new User(0, "user1", "user1@example.com", "password1", null);
            User user2 = new User(0, "user2", "user2@example.com", "password2", null);
            userRepo.save(user1);
            userRepo.save(user2);

            Genre genre1 = new Genre(0, "Action", null);
            Genre genre2 = new Genre(0, "RPG", null);
            genreRepo.save(genre1);
            genreRepo.save(genre2);

            Game game1 = new Game(0, "Game 1", "Exciting action game", 2022, Set.of(genre1), null);
            Game game2 = new Game(0, "Game 2", "Epic RPG adventure", 2023, Set.of(genre2), null);
            gameRepo.save(game1);
            gameRepo.save(game2);

            Review review1 = new Review(0, 8.5, "Great gameplay and graphics", user1, game1);
            Review review2 = new Review(0, 9.0, "Fantastic story", user2, game2);
            reviewRepo.save(review1);
            reviewRepo.save(review2);
        };
    }
**/