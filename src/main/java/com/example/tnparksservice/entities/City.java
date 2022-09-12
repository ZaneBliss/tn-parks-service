package com.example.tnparksservice.entities;

import javax.persistence.*;

@Entity
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false, unique = true)
    private String title;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}