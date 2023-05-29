package com.example.springjpatesting.repositories;

import com.example.springjpatesting.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
