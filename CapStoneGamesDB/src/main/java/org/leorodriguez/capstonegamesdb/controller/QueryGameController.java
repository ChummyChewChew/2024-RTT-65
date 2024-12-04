package org.leorodriguez.capstonegamesdb.controller;

import org.leorodriguez.capstonegamesdb.model.Game;
import org.leorodriguez.capstonegamesdb.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QueryGameController {
    @Autowired
    private GameService gameService;

    @GetMapping("/query-game")
    public String showQueryGameForm(){
        return "query-game";
    }
    @GetMapping("query-game")
    public String queryGame(@RequestParam("title")String title, Model model){
        Game game = gameService.findByTitle(title);
        if(game == null){
            model.addAttribute("errorMessage", "No such game");
            return "query-game";
        }
        model.addAttribute("game", game);
        return "query-game";
    }
}
