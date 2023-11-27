package com.eventter.controller;

import com.eventter.model.MapData;
import com.eventter.model.referenceapi.RequestByAxis;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@Validated
public class MapController {

    @GetMapping("/map-data/x-axis/{xAxis}/y-axis/{yAxis}")
    public ResponseEntity<List<MapData>> onlineCodeGet(@Valid RequestByAxis requestByAxis){

        List<MapData> mapData = new ArrayList<>();
        mapData.add(new MapData());
        return toResponse(mapData);
    }

    private <T> ResponseEntity<T> toResponse(T response){
        return response !=(null) ? new ResponseEntity<T>(response, HttpStatus.OK) : new ResponseEntity<T>(HttpStatus.NO_CONTENT);
    }
}
