package org.leorodriguez.capstonegamesdb.repository;

import org.leorodriguez.capstonegamesdb.model.Game;
import org.leorodriguez.capstonegamesdb.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.*;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public interface GameRepository  extends JpaRepository<Game, Long> {

    Game findByTitle(String title);

    @Query("SELECT g FROM Game g JOIN g.genres gr WHERE gr IN :genres")
    List<Game> findGamesByGenres(@Param("genres") Set<Genre> genres);

    Optional<Game> findById(Long id);
}
