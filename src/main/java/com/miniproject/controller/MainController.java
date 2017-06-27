package com.miniproject.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import com.miniproject.model.User;

@Controller
public class MainController {

    @RequestMapping(value={"/", "/dashboard"})
    public String homePage() {
        return "dashboard";
    }

    @RequestMapping("/user-list")
    public String userListPage() {
        return "user-list";
    }

    @RequestMapping("/role-list")
    public String roleListPage() {
        return "role-list";
    }

    @RequestMapping("/about")
    public String roleAboutPage() {
        return "about";
    }

    @RequestMapping("/user-cu")
    public String userCUPage(ModelMap model) {
        model.addAttribute("USER", new User());
        return "user-cu";
    }

    @RequestMapping("/user-c")
    @ResponseBody
    public User userC(@ModelAttribute User user) {
        return user;
    }

}

