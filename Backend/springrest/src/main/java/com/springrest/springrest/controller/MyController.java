package com.springrest.springrest.controller;

import com.springrest.springrest.entity.Course;
import com.springrest.springrest.services.CourseService;
import com.springrest.springrest.services.CourseServiceImpl;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class MyController {

    @Autowired
    private CourseService courseService;

     //Get all the courses
    @GetMapping(value = "/courses")
    public List<Course> getCourses(){
        return this.courseService.getCourse();
    }
    @GetMapping(value = "courses/{courseId}")
    public Course getCourseById(@PathVariable String courseId){

        return this.courseService.getCourseById(Long.parseLong(courseId));

    }
    @PostMapping(value = "/courses")
    public Course addCourse(@RequestBody Course course){
        return this.courseService.addCourse(course);
    }

    @PutMapping(value = "/courses/{courseId}")
    public Course updateCourse(@PathVariable String courseId,@RequestBody Course course){
        return this.courseService.updateCourse(Long.parseLong(courseId),course);
    }

    @DeleteMapping(value = "/courses/{courseId}")
    public String deleteCourse(@PathVariable String courseId){
        return this.courseService.deleteCourse(Long.parseLong(courseId));
    }

}
