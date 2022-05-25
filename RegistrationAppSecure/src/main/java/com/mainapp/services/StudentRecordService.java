package com.mainapp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mainapp.entities.StudentRecord;

@Service
public interface StudentRecordService {
	//List all the customers
	public List<StudentRecord> getAllStudents();
		
		
	//Search by Id
	public StudentRecord getStudentById(int id);
	
	
	//Save or Update
	public void saveStudent(StudentRecord student);
	
	
	//Delete
	public void deleteStudentById(int id);
		
}
