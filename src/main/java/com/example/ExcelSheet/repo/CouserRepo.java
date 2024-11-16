package com.example.ExcelSheet.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ExcelSheet.model.Course;

public interface CouserRepo  extends JpaRepository<Course, Integer>{

}
