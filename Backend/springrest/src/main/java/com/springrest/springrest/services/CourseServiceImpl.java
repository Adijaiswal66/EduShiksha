package com.springrest.springrest.services;

import com.springrest.springrest.dao.CourseRespository;
import com.springrest.springrest.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseRespository courseRespository;

    public CourseServiceImpl() {

    }

    @Override
    public List<Course> getCourse() {
    return this.courseRespository.findAll();
    }


    @Override
    public Course getCourseById(long courseId) {
    return this.courseRespository.getReferenceById(courseId);
    }

    public Course addCourse(Course course){
        this.courseRespository.save(course);
        return course;
    }

    @Override
    public Course updateCourse(long courseId,Course course) {
        this.courseRespository.save(course);
        return course;
    }

    @Override
    public String deleteCourse(long courseId) {
        this.courseRespository.deleteById(courseId);
            return "Selected item has been deleted";
    }

}
