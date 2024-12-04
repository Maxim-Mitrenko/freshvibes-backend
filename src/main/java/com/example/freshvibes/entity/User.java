package com.example.freshvibes.entity;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Encoders;
import io.jsonwebtoken.security.Keys;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@ToString
@Configuration
public class User {

    @Id
    @Getter
    public String email;
    public String password;
    @Getter
    public String phone;
    @Getter
    private String authToken;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    public String createAuthToken() {
        String token = Encoders.BASE64.encode(Keys.secretKeyFor(SignatureAlgorithm.HS512).getEncoded());
        this.authToken = token;
        return token;
    }

    public String getPassword() {
        return passwordEncoder().encode(password);
    }
}
