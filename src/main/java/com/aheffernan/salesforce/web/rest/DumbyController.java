package com.aheffernan.salesforce.web.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Resource to return information about the currently running Spring profiles.
 */
@RestController
@RequestMapping("/api")
public class DumbyController {


    @GetMapping("/dumby")
    public ResponseEntity<?> dumbyEndpoint() {
        return new ResponseEntity(HttpStatus.OK);
    }
}
