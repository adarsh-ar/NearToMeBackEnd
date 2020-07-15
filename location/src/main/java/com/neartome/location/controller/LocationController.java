package com.neartome.location.controller;

import com.neartome.location.model.entity.State;
import com.neartome.location.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
public class LocationController {
    @Autowired
    LocationService locationService;
    @GetMapping(path = "/states",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAllStates(){
        List<State> state=locationService.getAllStates();
        if(state.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok().body(state);
    }
}
