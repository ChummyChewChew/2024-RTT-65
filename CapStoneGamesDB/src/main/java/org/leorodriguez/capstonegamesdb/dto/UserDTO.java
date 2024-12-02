package org.leorodriguez.capstonegamesdb.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import org.leorodriguez.capstonegamesdb.model.Review;

import java.util.Set;
@Getter
@Setter
public class UserDTO {
    private long id;

    @NotEmpty(message = "A username is required!")
    private String username;

    @NotEmpty(message = "A email is required!")
    @Email(message = "Email must be valid!")
    private String email;

    @NotEmpty(message = "A password is required!")
    private String password;

    private Set<Review> reviews;

}
