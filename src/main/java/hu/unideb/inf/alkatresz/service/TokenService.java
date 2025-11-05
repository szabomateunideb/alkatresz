package hu.unideb.inf.alkatresz.service;

import org.springframework.security.core.userdetails.UserDetails;

public interface TokenService {

    String generateToken(UserDetails user);
    String extractUsername(String token);
    Boolean validateToken(String token, UserDetails user);
}
