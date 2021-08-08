package com.prithila.studentdatabase.controller;

import com.prithila.studentdatabase.model.Course;
import com.prithila.studentdatabase.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Prithila
 * @since 6/26/2021
 */

@Controller
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/addcourse")
    public String addCourse(Model model) {
        model.addAttribute("addCourse", new Course());
        return "courseForm";
    }

    @PostMapping("/addcourse")
    public String addCourse(@RequestParam("task") String task, @Valid @ModelAttribute("addCourse") Course course, BindingResult result) {

        if (result.hasErrors()) {
            return "error";
        }

        if (task.equals("add")) {
            courseService.save(course);
        } else if (task.equals("update")) {
            courseService.update(course);
        }

        return "redirect:/showcourse";
    }

    @GetMapping("/showcourse")
    public String showCourses(Model model) {
        List<Course> getCourses = courseService.findAllCourses();
        model.addAttribute("courses", getCourses);

        return "showList";
    }

    @GetMapping("/editcourse/{id}")
    public String updateCourse(@PathVariable("id") String id, Model model) {
        Course course = courseService.findCourse(id);
        model.addAttribute("course", course);

        return "forward:/addcourse";
    }

    @GetMapping("/deletecourse/{id}")
    public String deleteCourse(@PathVariable("id") String id) {
        courseService.delete(id);
        return "redirect:/showcourse";
    }
}
