package com.example.tnparksservice.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "park")
public class Park {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(unique = true)
    private String latitude;

    @Column(unique = true)
    private String longitude;

    protected Park() {}

    public Park(String name) {
        this.name = name;
    }
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLatitude() {
        return this.latitude;
    }

    public String getLongitude() {
        return this.longitude;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name);
    }

    @Override
    public String toString() {
        return "Park(" + "id=" + this.id + ", " + "name=" + this.name + ")";
    }
}