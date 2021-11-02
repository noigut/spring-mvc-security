package com.peaksoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
    @GetMapping("/")
    public String getInfoForEmployees() {
        return "view_for_employees";
    }

    @GetMapping("/hr_info")
    public String getInfoForHr() {
        return "view_for_hr";
    }

    @GetMapping("/managers_info")
    public String getInfoForManagers() {
        return "view_for_managers";
    }
}
