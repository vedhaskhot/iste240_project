// Author: Mohammed Saneeh - 421005948
package com.elitedrive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/cars")
    public String cars() {
        return "forward:/cars.html";
    }

    @GetMapping("/")
    public String home() {
        return "forward:/index.html";
    }
}