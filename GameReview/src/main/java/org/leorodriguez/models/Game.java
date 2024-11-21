package org.leorodriguez.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Game")
public class Game {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(nullable = false)
private int id;
@NonNull
@Column(nullable = false, length = 100)
    private String title;
@NonNull
@Column(nullable = false, length = 200)
    private String description;
@NonNull
@Column(nullable = false, length = 15)
    private int releaseDate;

@ManyToMany
    @JoinTable(
            name = "Game_Genre",
            joinColumns = @JoinColumn(name ="game_id"),
            inverseJoinColumns =@JoinColumn(name = "genre_id")
    )
private Set<Genre> genres;

@OneToMany(mappedBy = "game")
private Set<Review> reviews;
}
