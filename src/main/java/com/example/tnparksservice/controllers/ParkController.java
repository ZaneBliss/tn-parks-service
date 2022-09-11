package com.example.tnparksservice.controllers;

import com.example.tnparksservice.assembler.ParkModelAssembler;
import com.example.tnparksservice.entities.Park;
import com.example.tnparksservice.exceptions.ParkNotFoundException;
import com.example.tnparksservice.repositories.ParkRepository;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;


@RestController
public class ParkController {
    private final ParkRepository repository;
    private final ParkModelAssembler assembler;

    public ParkController(ParkRepository parkRepository, ParkModelAssembler assembler) {
        this.repository = parkRepository;
        this.assembler = assembler;
    }

    @GetMapping("/parks")
    public CollectionModel<EntityModel<Park>> all() {
        List<EntityModel<Park>> parks = repository.findAll().stream()
                .map(assembler::toModel).collect(Collectors.toList());

        return CollectionModel.of(parks,
                    linkTo(methodOn(ParkController.class).all())
                            .withSelfRel()
                );
    }

    @GetMapping("/parks/{id}")
    public EntityModel<Park> one(@PathVariable Long id) {
        Park park = repository.findById(id).orElseThrow(() -> new ParkNotFoundException(id));

        return assembler.toModel(park);
    };
}

