package com.sakha.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sakha.web.Model.Employee;

@Controller
public class EmployeeController {
	
		
		
		@PostMapping ("/emp") 
		public String  showEmployee (@ModelAttribute Employee emp,Model m)
		{
			
			m.addAttribute("emp", emp);
			return "empdetails";
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


