package com.example.springjpatesting.controllers;

import com.example.springjpatesting.models.Attendee;
import com.example.springjpatesting.repositories.AttendeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/attendees")
public class AttendeeController {

    @Autowired
    private AttendeeRepository attendeeRepository;

    @GetMapping
    public List<Attendee> list() {
        return attendeeRepository.findAll();
    }
}
