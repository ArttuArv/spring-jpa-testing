package com.example.springjpatesting.repositories;

import com.example.springjpatesting.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
