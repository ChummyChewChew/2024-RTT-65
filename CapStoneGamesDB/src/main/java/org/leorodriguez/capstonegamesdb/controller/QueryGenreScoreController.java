package org.leorodriguez.capstonegamesdb.controller;

import org.leorodriguez.capstonegamesdb.model.Game;
import org.leorodriguez.capstonegamesdb.model.Genre;
import org.leorodriguez.capstonegamesdb.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Controller
public class QueryGenreScoreController {
    @Autowired
    private GameService gameService;

    @GetMapping("/query-genre-score")
    public String showQueryGenreScoreForm(){
        return "query-genre-score";
    }
    @GetMapping("/query-genre-score")
    public String  queryByGenreAndScore(@RequestParam("genres")String genres,
                                        @RequestParam("minScore") double minScore,
                                        Model model){
        String[] genreArray = genres.split(",");
        Set<Genre> genreSet = new HashSet<>();
        for (String genreName : genreArray){
            Genre genre = new Genre();
            genre.setGenreName(genreName.trim());
            genreSet.add(genre);
        }
        List<Game> games = gameService.findGamesByGenreAndMinimumScore(genreSet, minScore);
        if (games.isEmpty()){
            model.addAttribute("error", "No games found");
        } else {
            model.addAttribute("games", games);
        } return "query-genre-score";
    }
}
