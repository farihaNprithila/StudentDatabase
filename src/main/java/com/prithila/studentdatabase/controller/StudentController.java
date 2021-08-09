package com.prithila.studentdatabase.controller;

import com.prithila.studentdatabase.model.Student;
import com.prithila.studentdatabase.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Prithila
 * @since 8/9/2021
 */

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/addstudent")
    public String addStudent(Model model) {
        model.addAttribute("student", new Student());
        return "/studentForm";
    }

    @PostMapping("/addstudent")
    public String addStudent(@RequestParam("task") String task, @Valid @ModelAttribute("addStudent") Student student, BindingResult result) {

        if (result.hasErrors()) {
            return "error";
        }

        if (task.equals("add")) {
            studentService.save(student);
        } else if (task.equals("update")) {
            studentService.update(student);
        }

        return "redirect:/showstudent";
    }

    @GetMapping("/studentlist")
    public String showStudent(Model model) {
        List<Student> students = studentService.findAllStudent();
        model.addAttribute("students", students);

        return "showList";
    }

    @GetMapping("/editstudent/{id}")
    public String editStudent(@PathVariable("id") String id, Model model) {
        model.addAttribute("student", studentService.findStudent(id));
        return "forward:/addstudent";
    }

    @GetMapping("/deletestudent/{id}")
    public String deleteStudent(@PathVariable("id") String id) {
        studentService.delete(id);
        return "redirect:/showcourse";
    }
}
