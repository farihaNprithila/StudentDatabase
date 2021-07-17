package com.prithila.studentdatabase.controller;

import com.prithila.studentdatabase.model.Course;
import com.prithila.studentdatabase.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
        return "course/courseForm";
    }

    @PostMapping("/addcourse")
    public String addCourse(@Valid @ModelAttribute("addCourse") Course course, BindingResult result) {

        if (result.hasErrors()) {
            return "error";
        }
        courseService.save(course);
        return "redirect:showcourse";
    }

    @GetMapping("/showcourse")
    public String showCourses(Model model) {
        List<Course> getCourses = courseService.findAllCourses();

        model.addAttribute("courses", getCourses);
        return "course/courseList";
    }
}
