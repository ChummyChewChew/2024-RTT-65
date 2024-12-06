package org.leorodriguez.capstonegamesdb.service;

import org.leorodriguez.capstonegamesdb.model.Game;
import org.leorodriguez.capstonegamesdb.model.Genre;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;


public interface GameService {
    Game saveGameWithGenre(Game game);
    Game findByTitle(String title);
    Game findById(long id);
    //Custom query
    List<Game> findGameByGenres(Set<Genre> genres);
    @Query("SELECT g FROM Game g JOIN FETCH g.genres")
    List<Game> findAllGames();
    List<Game> findGamesByGenreAndMinimumScore(Set<Genre> genres, double minScore);
    
}
