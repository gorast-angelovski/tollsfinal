package com.patarini.project.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Entity
@Table(name = "shop_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String email;

    private String password;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<Route> routes;


    public User() {
    }

    public User(String username, String email, String password, List<Route> routes) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.routes = routes;
    }

}