package org.leorodriguez.capstonegamesdb.controller;

import org.leorodriguez.capstonegamesdb.model.Game;
import org.leorodriguez.capstonegamesdb.model.Genre;
import org.leorodriguez.capstonegamesdb.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/games")
public class GameController {
    @Autowired
    private GameService gameService;

    //
    @GetMapping("/{id}")
    public Game getGameById(@PathVariable long id) {
        return gameService.findById(id);
    }
    @GetMapping("/by-genres")
    public List<Game> getGamesByGenre(@RequestParam Set<Genre> genres) {
        return gameService.findGameByGenres(genres);
    }
    @GetMapping("/all-games")
    public List<Game> getAllGames() {
        return gameService.findAllGames();
    }

    @GetMapping("/by-genre-and-score")
    public List<Game> getGamesByGenreAndScore(@RequestParam Set<Genre> genres,
                                              @RequestParam double minimumScore) {
        return gameService.findGamesByGenreAndMinimumScore(genres, minimumScore);
    }
}

