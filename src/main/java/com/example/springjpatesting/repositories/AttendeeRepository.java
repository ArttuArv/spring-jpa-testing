package com.example.springjpatesting.repositories;

import com.example.springjpatesting.models.Attendee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendeeRepository extends JpaRepository<Attendee, Long> {
}
