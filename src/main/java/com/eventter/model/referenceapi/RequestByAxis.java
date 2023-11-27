package com.eventter.model.referenceapi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Pattern;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RequestByAxis {

    @Pattern(regexp = "^[-+]?[0-9]*\\.?[0-9]+$", message = "Invalid x-axis format")
    private String xAxis;

    @Pattern(regexp = "^[-+]?[0-9]*\\.?[0-9]+$", message = "Invalid y-axis format")
    private String yAxis;
}

