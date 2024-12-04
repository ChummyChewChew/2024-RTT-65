package org.leorodriguez.capstonegamesdb.controller;

import org.leorodriguez.capstonegamesdb.model.Game;
import org.leorodriguez.capstonegamesdb.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ListAllGamesController {
    @Autowired
    private GameService gameService;

    @GetMapping("/list-all-games")
    public String listAllGames(Model model) {
        List<Game> games = gameService.findAllGames();
        model.addAttribute("games", games);
        return "list-all-games";
    }

}
