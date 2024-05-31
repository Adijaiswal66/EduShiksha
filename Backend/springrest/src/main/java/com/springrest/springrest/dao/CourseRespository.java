package com.springrest.springrest.dao;

import com.springrest.springrest.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CourseRespository extends JpaRepository<Course,Long> {

}
