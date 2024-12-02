package org.leorodriguez.capstonegamesdb.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import org.leorodriguez.capstonegamesdb.model.Genre;

import java.util.Set;

@Getter
@Setter
public class GameDTO {
    private long id;

    @NotEmpty(message = "Must enter a title!")
    private String title;

    @NotEmpty(message = "Must enter a description")
    private String description;

    @NotEmpty(message = "Must enter a release year!")
    private int releaseDate;

    @NotEmpty(message = "Must have genres!")
    private Set<Genre> genreSet;

    private double averageScore;
}
