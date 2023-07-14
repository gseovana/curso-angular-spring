package com.geovana.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geovana.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{
    
}
