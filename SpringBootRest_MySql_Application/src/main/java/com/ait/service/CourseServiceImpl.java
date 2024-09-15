package com.ait.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ait.binding.Course;
import com.ait.repo.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {
	
	// Field Dependencies Injuction
	@Autowired
	private CourseRepository courseRepo;

	
	// upsert Operation ( insert + update based on PK)
	@Override
	public String upsert(Course course) {
		courseRepo.save(course);
		return "Sucess";
	}
	
	// Find Record By ID
	@Override
	public Course getById(Integer cid) {
		Optional<Course> findbyId = courseRepo.findById(cid);
		if (findbyId.isPresent()) {
			return findbyId.get();
		}
		return null;
	}
	
	// Find All Record In DB
	@Override
	public List<Course> getAllCourses() {
		return courseRepo.findAll();

	}
	
	// Delete Record by ID
	@Override
	public String deleteById(Integer cid) {
		if (courseRepo.existsById(cid)) {
			courseRepo.deleteById(cid);
			return "Deleted SucessFull";
		} else {
			return "No Record Found ";
		}

	}

}
