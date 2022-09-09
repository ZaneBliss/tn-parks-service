package com.example.tnparksservice.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "park")
public class Park {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    protected Park() {}

    public Park(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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