package com.eventter.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

@Validated
public class MapData {
    @JsonProperty("xAxis")
    private Double xAxis = null;

    @JsonProperty("yAxis")
    private Double yAxis = null;

    @JsonProperty("creationTime")
    private String creationTime = null;

    @JsonProperty("createdBy")
    private String createdBy = null;


    //Getters and Setters
    public Double getxAxis() {
        return xAxis;
    }

    public void setxAxis(Double xAxis) {
        this.xAxis = xAxis;
    }

    public Double getyAxis() {
        return yAxis;
    }

    public void setyAxis(Double yAxis) {
        this.yAxis = yAxis;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public String toString() {
        return "MapData{" +
                "xAxis=" + xAxis +
                ", yAxis=" + yAxis +
                ", creationTime='" + creationTime + '\'' +
                ", createdBy='" + createdBy + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MapData mapData = (MapData) o;
        return Objects.equals(xAxis, mapData.xAxis) && Objects.equals(yAxis, mapData.yAxis) && Objects.equals(creationTime, mapData.creationTime) && Objects.equals(createdBy, mapData.createdBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xAxis, yAxis, creationTime, createdBy);
    }
}
