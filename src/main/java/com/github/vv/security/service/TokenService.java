package com.github.vv.security.service;


public interface TokenService {

    String getToken(String username, String password);
}
