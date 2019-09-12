package com.sakha.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MathsController {
	

	@PostMapping("/add")
	
	public ModelAndView add(@RequestParam("t1") int a, @RequestParam("t2")  int b){
		int sum=a+b;
		ModelAndView mv=new ModelAndView();
		mv.addObject("a",a);
		mv.addObject("a",b);
		mv.addObject("op","+");
		mv.addObject("sum",sum);
		mv.setViewName("Result");
		return mv;
		//m.addAttribute("sum",sum);
		//return "Result.jsp";
	}

	@PostMapping("/multiply")
	
	public ModelAndView multiply(@RequestParam("t1") int a, @RequestParam("t2")  int b){
		int res=a*b;
		ModelAndView mv=new ModelAndView();
		mv.addObject("sum",res);
		mv.setViewName("Result");
		return mv;
	
	
	}
	

}
