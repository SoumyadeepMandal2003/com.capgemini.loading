package com.example.BookAdvancedAPI.config;

import javax.crypto.SecretKey;
import java.util.Date;

public class JwtUtil {
    private final String SECRET_KEY = "";
    private final int JWT_EXPIRATION = 900000;
    private final int REFRESH_EXPIRATION = 604800000;


    //creates signing key
    private SecretKey getSecretKey() {
        byte[] keyBytes = Decodea.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(keyBytes);
    }

    // creates access tokens
    public String generateToken(String email) {
        return generateToken(email, JWT_EXPIRATION);
    }

    public String generateRefreshToken(String email) {
        return generateToken(email, JWT_REFRESH_EXPIRATION);
    }

    // Creates JWT token with email and expiration
    private String generateToken(String email, int expiration) {
        return Jwts.builder()
                .setSubject(email)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis()+expiration))
                .signWith(getSigningKey(), SignatureAlgorithm.HS256)
                .compact();
    }

    // Check if token expired
    public Boolean isTokenExpired(String token) {
        return extractExpiration(token).before(new Date());
    }

    // Validate Token
    public Boolean validateToken(String token, String email) {
        final String tokenEmail = extractEmail(token);
        return (tokenEmail.equals(email) && !isTokenExpired(token));
    }

    // Gets
}
