package com.kislap.booking.controller;
import com.kislap.booking.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthController {


    @PostMapping("users/register")
    public void register(User user) {
    }

    public User login(@RequestParam String email,
                      @RequestParam String password) {
                
    }


}
