package com.tekup.crud_thymeleaf.controller;

import com.tekup.crud_thymeleaf.entity.Staff;
import com.tekup.crud_thymeleaf.service.StaffService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class StaffController {
    private final StaffService staffService;

    @GetMapping("/")
    public String getAllStaffs(Model model) {
        List<Staff> staffList = staffService.getAllStaffs();
        if (!staffList.isEmpty()) {
            model.addAttribute("staffs", staffList);
        }
        return "list_staff";
    }

    @GetMapping("/staff")
    public String addStaff(Model model) {
        model.addAttribute("staff", new Staff());
        return "add_edit_staff";
    }

    @PostMapping("/staff/save")
    public String saveStaff(Staff staff) {
        staffService.addOrUpdateStaff(staff);
        return "redirect:/";
    }

    @GetMapping("/staff/update/{id}")
    public String updateStaff(Model model, @PathVariable Long id) {
        Staff staff = staffService.staffById(id);
        model.addAttribute("staff", staff);
        return "add_edit_staff";
    }
    @GetMapping("/staff/delete/{id}")
    public String deleteStaff(@PathVariable Long id) {
        staffService.deleteStaff(id);
        return "redirect:/";
    }

}
