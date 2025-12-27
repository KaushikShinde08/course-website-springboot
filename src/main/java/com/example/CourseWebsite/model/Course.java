package com.example.CourseWebsite.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "courses")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer courseId;
    @NotBlank(message = "Course name cannot be blank")
    @Column(nullable = false)
    String courseName;

    @NotBlank(message = "description cannot be blank")
    @Size(min = 20, max = 1000, message = "Description cannot be less than 20 and more than 1000")

    @Column(nullable = false)
    String courseDescription;

    String tags;

    @Min(1)
    @Max(1000)
    Integer duration;

    @PastOrPresent
    @Column(nullable = false)
    LocalDate listOn;

    @Min(0)
    @Max(200000)
    @Column(nullable = false)
    Double price;


}
