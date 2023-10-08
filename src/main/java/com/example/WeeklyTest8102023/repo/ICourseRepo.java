package com.example.WeeklyTest8102023.repo;

import com.example.WeeklyTest8102023.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepo extends JpaRepository<Course,String> {

}
