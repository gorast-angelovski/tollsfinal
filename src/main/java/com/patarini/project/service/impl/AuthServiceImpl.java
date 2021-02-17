package com.patarini.project.service.impl;

import com.patarini.project.model.Paytoll;
import com.patarini.project.model.Role;
import com.patarini.project.model.User;
import com.patarini.project.model.exceptions.InvalidArgumentsException;
import com.patarini.project.model.exceptions.InvalidUserCredentialsException;
import com.patarini.project.model.exceptions.PasswordsDoNotMatchException;
import com.patarini.project.repository.jpa.UserRepository;
import com.patarini.project.service.AuthService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;

    public AuthServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User login(String username, String password) {
        if(username==null||username.isEmpty()||password==null||password.isEmpty()){
            throw new InvalidArgumentsException();
        }
        return userRepository.findByUsernameAndPassword(username,
                password).orElseThrow(InvalidUserCredentialsException::new);
    }

    @Override
    public User register(String username, String email, String password, String repeatPassword, Role role) {
        if (username == null || username.isEmpty() || password == null || password.isEmpty()) {
            throw new InvalidArgumentsException();
        }
        if (!password.equals(repeatPassword)) {
            throw new PasswordsDoNotMatchException();
        }
        User user = new User(username, email, password, role);
        return userRepository.save(user);
    }
}