package com.example.gameverse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class MainController {
    @GetMapping("/")
    public String template() {
        return "domain/main/main";
    }
}
