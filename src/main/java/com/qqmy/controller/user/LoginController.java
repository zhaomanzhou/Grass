package com.qqmy.controller.user;


import com.qqmy.dao.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    private UserDao ud;

    @PostMapping("/user/login")
    public String login(String username, String password)
    {
        String password1 = ud.getPassword(username);
        if(password1.equals(password))
            return "dashboard";
        else
            return "redirect:/";
    }


}
