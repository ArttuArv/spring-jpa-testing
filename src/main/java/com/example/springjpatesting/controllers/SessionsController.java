package com.example.springjpatesting.controllers;

import com.example.springjpatesting.models.Session;
import com.example.springjpatesting.models.Speaker;
import com.example.springjpatesting.repositories.SessionRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/sessions")
public class SessionsController {

    @Autowired
    private SessionRepository sessionRepository;

    @GetMapping
    public List<Session> list() {
        return sessionRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Session get(@PathVariable Long id) {
        return sessionRepository.getReferenceById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Session create(@RequestBody final Session session) {
        System.out.println("SESSION: " + session);

        for (Speaker speaker : session.getSpeakers()) {
            speaker.getAddress().setSpeaker(speaker);
        }

        return sessionRepository.saveAndFlush(session);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        // Also need to check for children records before deleting.
        sessionRepository.deleteById(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Session update(@PathVariable Long id, @RequestBody Session session) {
        // Because this is a PUT, we expect all attributes to be passed in. A PATCH would only need what
        // TODO: Add validation that all attributes are passed inm otherwise return a 400 bad payload
        Session existingSession = sessionRepository.getReferenceById(id);
        System.out.println("\n\n" + existingSession + "\n\n");
        BeanUtils.copyProperties(session, existingSession, "id");

        return sessionRepository.saveAndFlush(existingSession);

    }
}
