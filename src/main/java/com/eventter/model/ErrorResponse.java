package com.eventter.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
public class ErrorResponse {

    @JsonProperty("status")
    private int status;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("message")
    private String message = "Exception Found";
}
