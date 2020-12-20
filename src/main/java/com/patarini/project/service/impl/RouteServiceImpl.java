package com.patarini.project.service.impl;

import com.patarini.project.model.Route;
import com.patarini.project.model.User;
import com.patarini.project.model.exceptions.RouteNotFoundException;
import com.patarini.project.model.exceptions.UserNotFoundException;
import com.patarini.project.repository.jpa.RouteRepository;
import com.patarini.project.repository.jpa.UserRepository;
import com.patarini.project.service.RouteService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RouteServiceImpl implements RouteService {
    private final RouteRepository routeRepository;
    private final UserRepository userRepository;

    public RouteServiceImpl(RouteRepository routeRepository, UserRepository userRepository) {
        this.routeRepository = routeRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<Route> listAll() {
        return routeRepository.findAll();
    }

    @Override
    public Optional<Route> findById(Long id) {
        if(!this.routeRepository.findById(id).isPresent()){
            throw new RouteNotFoundException(id);
        }
        return this.routeRepository.findById(id);
    }

    @Override
    public Optional<Route> save(String pointA, String pointB, Long userID) {
        User user = this.userRepository.findById(userID)
                .orElseThrow(()->new UserNotFoundException(userID));
        return Optional.of(this.routeRepository.save(new Route(pointA, pointB, user)));

    }

    @Override
    public void deleteById(Long id) {
        this.routeRepository.deleteById(id);
    }
}
