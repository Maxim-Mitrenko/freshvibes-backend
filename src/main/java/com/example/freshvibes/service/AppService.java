package com.example.freshvibes.service;

import com.example.freshvibes.model.LoginRequest;
import com.example.freshvibes.model.LoginResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

public class AppService {

    public LoginResponse login(LoginRequest request) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getLogin(), request.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        UserDetails userPrincipal = (UserDetails) authentication.getPrincipal();
        var user = userRepository.findByEmail(userPrincipal.getUsername());
        var token = user.createAuthToken();
        userRepository.save(user);
        return new LoginResponse(token);
    }
}
