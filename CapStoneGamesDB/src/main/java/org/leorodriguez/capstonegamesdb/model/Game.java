package org.leorodriguez.capstonegamesdb.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.DoubleStream;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long id;
    @NonNull
    @Column(nullable = false, length = 100)
    private String title;
    @NonNull
    @Column(nullable = false, length = 200)
    private String description;
    @NonNull
    @Column(nullable = false, length = 15)
    private int releaseDate;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "Game_Genre",
            joinColumns = @JoinColumn(name ="game_id"),
            inverseJoinColumns =@JoinColumn(name = "genre_id")
    )
    private Set<Genre> genres;
    //Chane
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    //change
    @JsonManagedReference

    private Set<Review> reviews = new HashSet<>();


    public double getAverageScore() {
        if(reviews.isEmpty()) return 0;
        double sum = 0;
        int count = 0;
        for(Review review : reviews) {
        sum += review.getScore();
        count++;} return sum / count;
    }




}
