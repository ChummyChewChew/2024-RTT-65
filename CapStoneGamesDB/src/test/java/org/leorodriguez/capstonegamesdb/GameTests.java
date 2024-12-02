package org.leorodriguez.capstonegamesdb;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leorodriguez.capstonegamesdb.dto.ReviewDTO;
import org.leorodriguez.capstonegamesdb.dto.UserDTO;
import org.leorodriguez.capstonegamesdb.model.Game;
import org.leorodriguez.capstonegamesdb.model.Genre;
import org.leorodriguez.capstonegamesdb.model.User;
import org.leorodriguez.capstonegamesdb.repository.GameRepository;
import org.leorodriguez.capstonegamesdb.repository.GenreRepository;
import org.leorodriguez.capstonegamesdb.service.GameService;
import org.leorodriguez.capstonegamesdb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootTest
@Transactional
public class GameTests {
    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private GenreRepository genreRepository;

    @Autowired
    private GameService gameService;

    @Autowired
    private UserService userService;


    @Test
    public void testSaveGame() {
        Genre genre = new Genre();
        genre.setGenreName("Adventure");
        genreRepository.save(genre);

        Set<Genre> genres = new HashSet<>();
        genres.add(genre);

        Game game = new Game();
        game.setTitle("Test game title");
        game.setDescription("Test Description");
        game.setReleaseDate(2022);
        game.setGenres(genres);


        gameRepository.save(game);

        assertEquals("Test game title", game.getTitle());
        assertEquals("Test Description", game.getDescription());
        assertEquals(2022, game.getReleaseDate());
        assertEquals(genres, game.getGenres());
    }
    @Test
    public void expectedFailSaveGame() {
        Game game = new Game();
        game.setTitle("Test game title");
        game.setDescription("Test Description");
        game.setReleaseDate(2022);

        Exception exception =assertThrows(IllegalArgumentException.class,()->{
            gameService.saveGameWithGenre(game);
        });
        String expectedMessage = "No genres given";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    public void testFindGameById(){
        Genre genre = new Genre();
        genre.setGenreName("Adventure");
        genreRepository.save(genre);

        Set<Genre> genres = new HashSet<>();
        genres.add(genre);

        Game game = new Game();
        game.setTitle("Test game title");
        game.setDescription("Test Description");
        game.setReleaseDate(2022);
        game.setGenres(genres);

        gameService.saveGameWithGenre(game);

        Game searchedGameById = gameService.findById(game.getId());
        assertEquals("Test game title", game.getTitle());
        assertEquals("Test Description", game.getDescription());
        assertEquals(2022, game.getReleaseDate());
        assertEquals(0,game.getAverageScore());
        assertEquals(genres, game.getGenres());


    }
    @Test
    public void testFindGameByTitle(){
        Genre genre = new Genre();
        genre.setGenreName("Adventure");
        genreRepository.save(genre);

        Genre genre2 = new Genre();
        genre2.setGenreName("Horror");
        genreRepository.save(genre2);

        Set<Genre> genres = new HashSet<>();
        genres.add(genre);
        genres.add(genre2);

        Game game = new Game();
        game.setTitle("Test game title");
        game.setDescription("Test Description");
        game.setReleaseDate(2022);
        game.setGenres(genres);
        game.getAverageScore();
        gameService.saveGameWithGenre(game);

        Game searchedGameByTitle = gameService.findByTitle("Test game title");

        assertEquals("Test game title", game.getTitle());
        assertEquals("Test Description", game.getDescription());
        assertEquals(2022, game.getReleaseDate());
        assertEquals(0, game.getAverageScore());
        assertEquals(genres, game.getGenres());


    }
    @Test
    public void testFindGameByGenre(){
        Genre genre = new Genre();
        genre.setGenreName("Adventure");
        genreRepository.save(genre);

        Genre genre2 = new Genre();
        genre2.setGenreName("Horror");
        genreRepository.save(genre2);

        Genre genre3 = new Genre();
        genre3.setGenreName("Fantasy");
        genreRepository.save(genre3);

        Set<Genre> genres = new HashSet<>();
        genres.add(genre);
        genres.add(genre2);

        Set<Genre> genres2 = new HashSet<>();
        genres.add(genre3);

        Game game = new Game();
        game.setTitle("Test game title");
        game.setDescription("Test Description");
        game.setReleaseDate(2022);
        game.setGenres(genres);
        gameService.saveGameWithGenre(game);

        Game game2 = new Game();
        game2.setTitle("Test game title two");
        game2.setDescription("Test Description two");
        game2.setReleaseDate(2022);
        game2.setGenres(genres);
        gameService.saveGameWithGenre(game2);

        Game game3 = new Game();
        game3.setTitle("Test game title three");
        game3.setDescription("Test Description three");
        game3.setReleaseDate(2022);
        game3.setGenres(genres2);
        gameService.saveGameWithGenre(game3);

        List<Game> games = gameService.findGameByGenres(genres);

        assertEquals(2, games.size());
        assertEquals("Test game title", games.get(0).getTitle());
        assertEquals("Test Description", games.get(0).getDescription());
        assertEquals(2022, games.get(0).getReleaseDate());
        assertEquals("Test game title two", games.get(1).getTitle());
        assertEquals("Test Description two", games.get(1).getDescription());
        assertEquals(2022, games.get(1).getReleaseDate());
    }

    @Test
    public void testFindAllGames(){
        Genre genre = new Genre();
        genre.setGenreName("Adventure");
        genreRepository.save(genre);

        Set<Genre> genres = new HashSet<>();
        genres.add(genre);

        Game game = new Game();
        game.setTitle("Test game title");
        game.setDescription("Test Description");
        game.setReleaseDate(2022);
        game.setGenres(genres);
        gameService.saveGameWithGenre(game);

        Game game2 = new Game();
        game2.setTitle("Test game title 2");
        game2.setDescription("Test Description 2");
        game2.setReleaseDate(2022);
        game2.setGenres(genres);
        gameService.saveGameWithGenre(game2);

        Game game3 = new Game();
        game3.setTitle("Test game title 3");
        game3.setDescription("Test Description 3");
        game3.setReleaseDate(2022);
        game3.setGenres(genres);
        gameService.saveGameWithGenre(game3);

        Game game4 = new Game();
        game4.setTitle("Test game title 4");
        game4.setDescription("Test Description 5");
        game4.setReleaseDate(2022);
        game4.setGenres(genres);
        gameService.saveGameWithGenre(game4);

        List<Game> games = gameService.findAllGames();
        assertEquals(4, games.size());



    }
    @Test
    public void testFindGamesByGenresAndMinimumScore(){
        // Setup user, genres, and games
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername("Leorodriguez");
        userDTO.setPassword("password");
        userDTO.setEmail("test@test.com");

        User savedUser = userService.saveUser(userDTO);

        UserDTO userDTO2 = new UserDTO();
        userDTO2.setUsername("Leorodriguez2");
        userDTO2.setPassword("password");
        userDTO2.setEmail("test@test2.com");

        User savedUser2 = userService.saveUser(userDTO2);

        Genre adventure = new Genre();
        adventure.setGenreName("Adventure");
        genreRepository.save(adventure);

        Genre horror = new Genre();
        horror.setGenreName("Horror");
        genreRepository.save(horror);

        Set<Genre> genres = new HashSet<>();
        genres.add(adventure);
        genres.add(horror);

        Game game = new Game();
        game.setTitle("Test game title");
        game.setDescription("Test Description");
        game.setReleaseDate(2022);
        game.setGenres(genres);
        gameService.saveGameWithGenre(game);

        Game game2 = new Game();
        game2.setTitle("Test game title two");
        game2.setDescription("Test Description two");
        game2.setReleaseDate(2022);
        game2.setGenres(genres);
        gameService.saveGameWithGenre(game2);

        Game game3 = new Game();
        game3.setTitle("Test game title three");
        game3.setDescription("Test Description three");
        game3.setReleaseDate(2022);
        game3.setGenres(genres);
        gameService.saveGameWithGenre(game3);

        // Submit reviews
        ReviewDTO reviewDTO = new ReviewDTO();
        reviewDTO.setGameId(game.getId());
        reviewDTO.setScore(9);
        reviewDTO.setShortSummary("Great game");

        ReviewDTO reviewDTO2 = new ReviewDTO();
        reviewDTO2.setGameId(game2.getId());
        reviewDTO2.setScore(7);
        reviewDTO2.setShortSummary("Great game");

        ReviewDTO reviewDTO3 = new ReviewDTO();
        reviewDTO3.setGameId(game3.getId());
        reviewDTO3.setScore(6);
        reviewDTO3.setShortSummary("Great game");

        ReviewDTO reviewDTO4 = new ReviewDTO();
        reviewDTO4.setGameId(game3.getId());
        reviewDTO4.setScore(1);
        reviewDTO4.setShortSummary("Terrible game");

        userService.submitReview(savedUser.getId(), reviewDTO);
        userService.submitReview(savedUser.getId(), reviewDTO2);
        userService.submitReview(savedUser.getId(), reviewDTO3);
        userService.submitReview(savedUser2.getId(), reviewDTO4);


        System.out.println(game.getAverageScore()); // Should be 9
        System.out.println(game2.getAverageScore()); // Should be 7
        System.out.println(game3.getAverageScore()); // Should be 3.5

        List<Game> foundGames = gameService.findGamesByGenreAndMinimumScore(genres, 8);

        assertEquals(1, foundGames.size());
    }




}
