package me.leewonjun.springbootdeveloper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserViewController {
    @GetMapping("/login")
    public String longin() {
        return "oauthLogin";
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup";
    }
}
