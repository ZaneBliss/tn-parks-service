package com.example.tnparksservice.repositories;

import com.example.tnparksservice.entities.RangerStation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RangerStationRepository extends JpaRepository<RangerStation, Long> {
}