package com.ait.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ait.binding.Course;

public interface CourseRepository  extends JpaRepository<Course, Serializable>{

}
