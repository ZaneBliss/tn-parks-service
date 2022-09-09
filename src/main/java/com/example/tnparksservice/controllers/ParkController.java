package com.example.tnparksservice.controllers;

import com.example.tnparksservice.entities.Park;
import com.example.tnparksservice.repositories.ParkRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ParkController {
    private final ParkRepository repository;

    public ParkController(ParkRepository parkRepository) {
        this.repository = parkRepository;
    }

    @GetMapping("/parks")
    List<Park> all() {
        return repository.findAll();
    }
}

