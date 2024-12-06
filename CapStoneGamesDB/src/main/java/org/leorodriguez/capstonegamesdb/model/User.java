package org.leorodriguez.capstonegamesdb.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long id;

    @NonNull
    @Column(nullable = false, unique = true, length = 50)
    private String username;

    @NonNull
    @Email
    @Column(nullable = false, unique = true)
    private String email;

    @NonNull
    @Column(nullable = false, length =255)
    private String password;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private Set<Review> reviews;
}