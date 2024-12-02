package org.leorodriguez.capstonegamesdb.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewDTO {
    private long id;

    private long gameId;

    @NotEmpty(message = "Score must not be empty!")
    private double score;

    private String shortSummary;

    public String getShortSummery() {
        return shortSummary;
    }
}
