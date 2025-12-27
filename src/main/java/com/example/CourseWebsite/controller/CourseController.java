package com.example.CourseWebsite.controller;

import com.example.CourseWebsite.model.Course;
import com.example.CourseWebsite.service.CourseService;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    CourseService courseService;

    @GetMapping("/allCourses")
//    public List<Course> getAllCourses(){
//        return courseService.getAllCourses();
//    }
    public ResponseEntity<List<Course>> getAllCourses(){
        return new ResponseEntity<>(courseService.getAllCourses(), HttpStatus.OK);
    }

    @GetMapping("/{courseId}")
    public ResponseEntity<Course> getBycourseId(@PathVariable Integer courseId){
        return new ResponseEntity<>(courseService.getCourseBycourseId(courseId), HttpStatus.FOUND);
    }


    @PostMapping("/")
    public ResponseEntity<?> saveCourse(@Valid @RequestBody Course newCourse) {
        return new ResponseEntity<>(courseService.saveCourse(newCourse),HttpStatus.CREATED);
//        return new ResponseEntity.ok(courseService.saveCourse(newCourse).get(), HttpStatus.CREATED);

    }
}
