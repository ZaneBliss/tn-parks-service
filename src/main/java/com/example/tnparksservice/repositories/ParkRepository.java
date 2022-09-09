package com.example.tnparksservice.repositories;

import com.example.tnparksservice.entities.Park;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkRepository extends JpaRepository<Park, Long> {
}