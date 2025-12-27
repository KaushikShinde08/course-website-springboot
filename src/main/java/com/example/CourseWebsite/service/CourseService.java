package com.example.CourseWebsite.service;

import com.example.CourseWebsite.model.Course;
import com.example.CourseWebsite.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    
    @Autowired
    CourseRepo courseRepo;
    
    public List<Course> getAllCourses(){
        return courseRepo.findAll();
    }

    public Course getCourseBycourseId(Integer courseId) {
        return courseRepo.getCourseByCourseId(courseId);
    }

    public Course saveCourse(Course newCourse) {
        return courseRepo.save(newCourse);

    }
}
