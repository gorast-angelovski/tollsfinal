package com.patarini.project.service;

import com.patarini.project.model.Route;

import java.util.List;
import java.util.Optional;

public interface RouteService {
    List<Route> listAll();
    Optional<Route> findById(Long id);
    Optional<Route> save(String pointA, String pointB, Long userID);
    void deleteById(Long id);

}
