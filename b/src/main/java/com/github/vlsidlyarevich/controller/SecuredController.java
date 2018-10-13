package com.github.vlsidlyarevich.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/hello")
public class SecuredController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> sayHello() {
        return new ResponseEntity<>("Secured hello!", HttpStatus.OK);
    }
    
    @RequestMapping(value ="/test",method = RequestMethod.GET)
    @PreAuthorize ("hasRole('ADMIN')")
    public ResponseEntity<?> sayTest() {
        return new ResponseEntity<>("Secured Test!", HttpStatus.OK);
    }
}
