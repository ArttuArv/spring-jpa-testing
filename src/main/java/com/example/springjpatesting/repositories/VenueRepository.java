package com.example.springjpatesting.repositories;

import com.example.springjpatesting.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VenueRepository extends JpaRepository<Session, Long> {

    // Tää List<String> on vähä perseestä oleva ratkaisu
    @Query("SELECT v.venueCity, v.venueName FROM Session v")
    List<String> findAllVenues();
}
