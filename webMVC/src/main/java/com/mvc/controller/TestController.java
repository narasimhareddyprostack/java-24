package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
		@GetMapping("/index")
		public ModelAndView getPage() {
			System.out.println("Test Case 123");
			return new ModelAndView("index");
		}
}
