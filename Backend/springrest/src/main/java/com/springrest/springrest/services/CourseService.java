package com.springrest.springrest.services;


import com.springrest.springrest.entity.Course;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CourseService {

    public List<Course> getCourse();

    public Course getCourseById(long courseId);

    public Course addCourse(Course course);

    public Course updateCourse(long courseId,Course course);

    public String deleteCourse(long courseId);


}
