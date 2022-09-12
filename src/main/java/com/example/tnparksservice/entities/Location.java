package com.example.tnparksservice.entities;

import javax.persistence.*;

@Entity
@Table(name = "location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column
    private String phoneNumber;

    @Column(unique = true)
    private String gpsCoordinates;

    @Column
    private String address;

    @ManyToOne
    @JoinColumn(name = "park_id")
    private Park park;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "city_id")
    private City city;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getGpsCoordinates() {
        return gpsCoordinates;
    }

    public Park getPark() {
        return park;
    }

    public City getCity() {
        return city;
    }

}