package com.github.vv.security.service;

import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;


public interface TokenAuthenticationService {

    Authentication authenticate(HttpServletRequest request);
}
