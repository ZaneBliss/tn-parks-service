package com.example.tnparksservice.exceptions;

public class ParkNotFoundException extends RuntimeException {
    public ParkNotFoundException(Long id) {
        super("Could not find park " + id);
    }
}
