package com.mainapp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mainapp.entities.StudentRecord;


@Repository
public interface StudentRecordRepository extends JpaRepository<StudentRecord, Integer> {
	//find by name and department
	public List<StudentRecord> findByNameAndDepartment(String name, String department);
	public List<StudentRecord> findByCountry(String Country);
}
