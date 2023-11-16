package com.tekup.crud_thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaffController {

    @GetMapping("/")
    public String getAllStaffs(Model model){
        return "list_staff";
    }

}
