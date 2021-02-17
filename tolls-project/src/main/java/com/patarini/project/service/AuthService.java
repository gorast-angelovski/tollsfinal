package com.patarini.project.service;

import com.patarini.project.model.Role;
import com.patarini.project.model.User;

import java.util.Date;

public interface AuthService {

    User login(String username, String password);

    User register(String username, String email, String password, String repeatPassword, Role role);

}
