package com.prithila.studentdatabase.controller;

import com.prithila.studentdatabase.model.Department;
import com.prithila.studentdatabase.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Prithila
 * @since 8/8/2021
 */

@Controller
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping("/adddepartment")
    public String addDepartment(Model model) {
        model.addAttribute("addDepartment", new Department());
        return "departmentForm";
    }

    @PostMapping("/adddepartment")
    public String addDepartment(@RequestParam("task") String task, @Valid @ModelAttribute("addDepartment") Department department, BindingResult result) {
        if (result.hasErrors()) {
            return "error";
        }
        if (task.equals("add")) {
            departmentService.save(department);
        } else if (task.equals("update")) {
            departmentService.update(department);
        }
        return "redirect:/showdepartment";
    }

    @GetMapping("/showdepartment")
    public String showDepartment(Model model) {
        List<Department> departmentList = departmentService.findAllDepartments();
        model.addAttribute("departments", departmentList);

        return "showList";
    }

    @GetMapping("/editdepartment/{id}")
    public String editCourse(@PathVariable("id") String id, Model model) {
        model.addAttribute("department", departmentService.findDepartment(id));
        return "forward:/adddepartment";
    }

    @GetMapping("/deletedepartment/{id}")
    public String deleteDepartment(@PathVariable("id") String id) {
        departmentService.delete(id);
        return "redirect:/showdepartment";
    }
}
