package org.leorodriguez.capstonegamesdb.model;

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
@Table(name = "Genre")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id;
    @NonNull
    @Column(nullable = false, unique = true, length = 255)
    private String genreName;

    @ManyToMany(mappedBy = "genres", fetch = FetchType.EAGER)
    private Set<Game> games;

}
