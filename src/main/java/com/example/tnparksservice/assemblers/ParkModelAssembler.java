package com.example.tnparksservice.assemblers;

import com.example.tnparksservice.controllers.ParkController;
import com.example.tnparksservice.entities.Park;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class ParkModelAssembler implements RepresentationModelAssembler<Park, EntityModel<Park>> {
    @Override
    public EntityModel<Park> toModel(Park entity) {
        return EntityModel.of(entity,
                linkTo(methodOn(ParkController.class).one(entity.getId())).withSelfRel(),
                linkTo(methodOn(ParkController.class).all()).withRel("parks")
        );
    }
}
