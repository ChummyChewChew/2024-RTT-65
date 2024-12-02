package org.leorodriguez.capstonegamesdb;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leorodriguez.capstonegamesdb.dto.ReviewDTO;
import org.leorodriguez.capstonegamesdb.dto.UserDTO;
import org.leorodriguez.capstonegamesdb.model.Game;
import org.leorodriguez.capstonegamesdb.model.Genre;
import org.leorodriguez.capstonegamesdb.model.Review;
import org.leorodriguez.capstonegamesdb.model.User;
import org.leorodriguez.capstonegamesdb.repository.GameRepository;
import org.leorodriguez.capstonegamesdb.repository.GenreRepository;
import org.leorodriguez.capstonegamesdb.repository.ReviewRepository;
import org.leorodriguez.capstonegamesdb.repository.UserRepository;
import org.leorodriguez.capstonegamesdb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
public class UserTests {
    @Autowired
    private  UserRepository userRepository;

    @Autowired
    private UserService userService;
    @Autowired
    private GameRepository gameRepository;
    @Autowired
    private ReviewRepository reviewRepository;
    @Autowired
    private GenreRepository genreRepository;

    @BeforeEach
    public void setUp() {
        userRepository.deleteAll();
        gameRepository.deleteAll();
        reviewRepository.deleteAll();
    }

    @Test
    public void testSaveUser() {
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername("Leorodriguez");
        userDTO.setPassword("password");
        userDTO.setEmail("test@test.com");

        User savedUser = userService.saveUser(userDTO);


        assertEquals("Leorodriguez", savedUser.getUsername());
        assertEquals("test@test.com", savedUser.getEmail());
        assertNotEquals("password", savedUser.getPassword());

    }
    @Test
    public void deleteUser() {
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername("DELETE ME");
        userDTO.setPassword("ISHOULDNTEXIST");
        userDTO.setEmail("test@delteme.com");

        User savedUser = userService.saveUser(userDTO);


        userService.deleteUser(savedUser.getId());

        User deletedUser =userRepository.findById(savedUser.getId()).orElse(null);
        assertNull(deletedUser,"User should not exist");

    }
    @Test
    public void testSubmitReview(){
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername("Leorodriguez");
        userDTO.setPassword("password");
        userDTO.setEmail("test@test.com");

        User savedUser = userService.saveUser(userDTO);

        Genre genre = new Genre();
        genre.setGenreName("Adventure");
        genreRepository.save(genre);
        Set<Genre> genres = new HashSet<>();
        genres.add(genre);


        Game game = new Game();
        game.setTitle("Test game");
        game.setDescription("Test game");
        game.setReleaseDate(1999);
        game.setGenres(genres);
        Game savedGame = gameRepository.save(game);



        ReviewDTO reviewDTO = new ReviewDTO();
        reviewDTO.setGameId(savedGame.getId());
        reviewDTO.setScore(10);
        reviewDTO.setShortSummary("Great game!");


        userService.submitReview(savedUser.getId(), reviewDTO);

        List<Review> reviews = reviewRepository.findAll(); // Retrieve all reviews
        Review savedReview = null;

        for (Review review : reviews) {
            if (review.getUser().getId() == savedUser.getId()
                    && review.getGame().getId() == savedGame.getId()) {
                savedReview = review;
                break; //finding the review
            }
        }

// If no match is found, savedReview will remain null


        assertNotNull(savedReview);
        assertEquals("Great game!", savedReview.getShortSummary());
        assertEquals(10, savedReview.getScore());

    }
    @Test
    public void testUpdateReview(){
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername("Leorodriguez");
        userDTO.setPassword("password");
        userDTO.setEmail("test@test.com");
        User user = userService.saveUser(userDTO);

        Genre genre = new Genre();
        genre.setGenreName("Adventure");
        genreRepository.save(genre);
        Set<Genre> genres = new HashSet<>();
        genres.add(genre);

        Game game = new Game();
        game.setTitle("Test game");
        game.setDescription("Test game");
        game.setReleaseDate(1999);
        game.setGenres(genres);
        Game savedGame = gameRepository.save(game);

        ReviewDTO reviewDTO = new ReviewDTO();
        reviewDTO.setGameId(savedGame.getId());
        reviewDTO.setScore(10);
        reviewDTO.setShortSummary("Great game!");
        userService.submitReview(user.getId(), reviewDTO);

        Review savedReview = null;
        List<Review> allReviews = reviewRepository.findAll();

        for (Review review : allReviews) {
            if(review.getUser().getId() == user.getId() && review.getGame().getId() == savedGame.getId()){
                savedReview = review;
                break;
            }
        }

        assert savedReview != null;
        reviewDTO.setId(savedReview.getId());
        reviewDTO.setScore(9);
        reviewDTO.setShortSummary("A almost perfect game!");
        userService.updateReview(user.getId(), reviewDTO);

        //verify the change happened
        Review updatedReview = reviewRepository.findById(savedReview.getId()).orElse(null);
        assert updatedReview != null;
        assertEquals("A almost perfect game!", updatedReview.getShortSummary());
        assertEquals(9, updatedReview.getScore());
    }
    @Test
    public void testDeleteReview(){
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername("Leorodriguez");
        userDTO.setPassword("password");
        userDTO.setEmail("test@test.com");
        User savedUser = userService.saveUser(userDTO);

        Game game = new Game();
        game.setTitle("Test game");
        game.setDescription("Test game");
        game.setReleaseDate(1999);
        Game savedGame = gameRepository.save(game);

        ReviewDTO reviewDTO = new ReviewDTO();
        reviewDTO.setGameId(savedGame.getId());
        reviewDTO.setScore(10);
        reviewDTO.setShortSummary("Great game!");
        userService.submitReview(savedUser.getId(), reviewDTO);

        Review savedReview = null;
        List<Review> allReviews = reviewRepository.findAll();
        for (Review review : allReviews) {
            if (review.getUser().getId() == savedUser.getId() && review.getGame().getId() == savedGame.getId()){
                savedReview = review;
                break;
            }
        }

        assert savedReview != null;
        userService.deleteReview(savedUser.getId(), savedReview.getId());
        Review deletedReview = reviewRepository.findById(savedReview.getId()).orElse(null);
        assertNull(deletedReview);
    }




}
