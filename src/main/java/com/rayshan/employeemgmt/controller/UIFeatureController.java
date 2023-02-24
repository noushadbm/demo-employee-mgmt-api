package com.rayshan.employeemgmt.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ui/")
public class UIFeatureController {
    Logger logger = LoggerFactory.getLogger(UIFeatureController.class);

    @GetMapping("/userRoles")
    public List<String> getUserRoles() {
        logger.info("Getting user roles");
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        List<String> roles = new ArrayList<>();
        if(auth != null && auth.isAuthenticated()) {
            roles.add(auth.getAuthorities().stream().findFirst().get().getAuthority());
        }
        return roles;
    }
}
