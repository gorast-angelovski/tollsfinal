package com.patarini.project.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pointA;

    private String pointB;

    @ManyToOne
    private User user;

    public Route() {
    }

    public Route(String pointA, String pointB, User user) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.user = user;
    }
}
