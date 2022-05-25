package com.mainapp.controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mainapp.services.StudentRecordService;

import com.mainapp.entities.StudentRecord;

@Controller
@RequestMapping("/studentrecords")
public class StudentRecordController {
	
	@Autowired
	private StudentRecordService studentRecordServiceImpl;
	
	@RequestMapping("/list")
	public String getAllStudentRecords(Model model) {
		model.addAttribute("list", studentRecordServiceImpl.getAllStudents());
		return "list-students";
	}
	
	
	@RequestMapping("/add")
	public String getAddForm(Model model) {
		StudentRecord studentRecord = new StudentRecord();
		model.addAttribute("student", studentRecord);
		return "addupdate-student-form";
	}
	
	@RequestMapping("/update")
	public String getUpdateForm(@RequestParam(name = "id") int id, Model model) {
		StudentRecord studentRecord = studentRecordServiceImpl.getStudentById(id);
		model.addAttribute("student", studentRecord);
		return "addupdate-student-form";
	}
	
	@RequestMapping("/save")
	public String saveStudentForm(@RequestParam(name = "name") String name, @RequestParam(name = "department") 
	String department, @RequestParam(name = "country") String country, @RequestParam(name="id") int id, Model model) {
		
		if(id==0) {
			StudentRecord student = new StudentRecord(name,department,country);
			studentRecordServiceImpl.saveStudent(student);
		}else{
			StudentRecord student = studentRecordServiceImpl.getStudentById(id);
			student.setName(name);
			student.setDepartment(department);
			student.setCountry(country);
			studentRecordServiceImpl.saveStudent(student);
		}
		
		return "redirect:list";
	}
	
	
	@RequestMapping("/delete")
	public String deleteStudentById(@RequestParam(name="id") int id) {
		
		studentRecordServiceImpl.deleteStudentById(id);
		
		return "redirect:list";
	}
	
	
	@RequestMapping(value = "/403")
	public ModelAndView accesssDenied(Principal user) {

		ModelAndView model = new ModelAndView();

		if (user != null) {
			model.addObject("msg", "Hi " + user.getName() + ", you do not have permission to access this page!");
		} else {
			model.addObject("msg", "You do not have permission to access this page!");
		}

		model.setViewName("403");
		return model;
	}
	
}
