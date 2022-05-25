package com.mainapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mainapp.entities.StudentRecord;
import com.mainapp.repositories.StudentRecordRepository;


@Service
public class StudentRecordServiceImpl implements StudentRecordService {
	
	@Autowired
	private StudentRecordRepository studentRecordRepository;

	@Override
	public List<StudentRecord> getAllStudents() {
		List<StudentRecord> studentRecords=studentRecordRepository.findAll();
		return studentRecords;
	}

	@Override
	public StudentRecord getStudentById(int id) {
		StudentRecord studentRecord = studentRecordRepository.findById(id).get();
		return studentRecord;
	}

	@Override
	public void saveStudent(StudentRecord student) {
		studentRecordRepository.save(student);
		
	}

	@Override
	public void deleteStudentById(int id) {
		studentRecordRepository.deleteById(id);
		
	}

}
