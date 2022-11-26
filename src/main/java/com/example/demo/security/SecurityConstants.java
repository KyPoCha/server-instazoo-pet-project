package com.example.demo.security;

public class SecurityConstants {
    public static final String SING_UP_URLS = "/api/auth/**"; //** означает любой урл

    public static final String SECRET = "poliskyr";

    public static final String TOKEN_PREFIX = "Bearer ";

    public static final String HEADER_STRING = "Authorization";

    public static final String CONTENT_TYPE = "application/json";

    public static final long EXPIRATION_TIME = 600_000;  // log out time expiration, automatic log out, 10 min

}
