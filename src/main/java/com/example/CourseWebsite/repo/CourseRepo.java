package com.example.CourseWebsite.repo;

import com.example.CourseWebsite.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {


    Course getCourseByCourseId(Integer courseId);
}
