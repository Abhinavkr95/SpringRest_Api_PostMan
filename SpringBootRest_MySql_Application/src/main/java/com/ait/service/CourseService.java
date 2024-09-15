package com.ait.service;

import java.util.List;

import com.ait.binding.Course;

public interface CourseService {
	// Save+Update
	public String upsert(Course course);

	// find record by id
	public Course getById(Integer cid);

	// All the existing Courses in DB
	public List<Course> getAllCourses();

	// Deleting the Course by Id
	public String deleteById(Integer cid);

}
