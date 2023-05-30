package com.example.springjpatesting.controllers;

import com.example.springjpatesting.models.Session;
import com.example.springjpatesting.repositories.VenueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/venues")
public class VenueController {

    @Autowired
    private VenueRepository venueRepository;

    @GetMapping
    public List<String> getAllVenues() {
        return venueRepository.findAllVenues();
    }
}
