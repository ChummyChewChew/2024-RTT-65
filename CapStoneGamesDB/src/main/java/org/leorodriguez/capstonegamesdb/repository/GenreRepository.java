package org.leorodriguez.capstonegamesdb.repository;

import org.leorodriguez.capstonegamesdb.model.Genre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository  extends CrudRepository<Genre, Long> {
    Genre findByGenreName(String genreName);
}
