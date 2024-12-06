package org.leorodriguez.capstonegamesdb.impl;

import jakarta.transaction.Transactional;
import org.leorodriguez.capstonegamesdb.model.Game;
import org.leorodriguez.capstonegamesdb.model.Genre;
import org.leorodriguez.capstonegamesdb.repository.GameRepository;
import org.leorodriguez.capstonegamesdb.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class GameServiceImplementation implements GameService {
    @Autowired
    private GameRepository gameRepository;

    @Transactional
    @Override
    public Game saveGameWithGenre(Game game){
        if(game.getGenres() == null){
            throw new IllegalArgumentException("No genres given");
        }
        return gameRepository.save(game);
    }

    @Override
    public Game findByTitle(String title) {
        return gameRepository.findByTitle(title);
    }

    @Override
    public Game findById(long id) {
        return gameRepository.findById(id).orElse(null);
    }

    @Override
    public List<Game> findGameByGenres(Set<Genre> genres) {
        return gameRepository.findGamesByGenres(genres);
    }

    @Override
    public List<Game> findAllGames() {return gameRepository.findAll();}

    @Override
    public List<Game> findGamesByGenreAndMinimumScore(Set<Genre> genres, double minScore) {
        List<Game> allGames= gameRepository.findGamesByGenres(genres);
        List<Game> filteredGames = new ArrayList<>();

        for(Game game: allGames){
            if(game.getAverageScore() >= minScore){
                filteredGames.add(game);
            }
        }
        return filteredGames;
    }



}
