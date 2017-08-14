
package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calculate")
public class CalculatorController {

	@GetMapping("")
	public String onlyShowTheForm() {
		return "calculate/calculation-form-holder";
	}

	@PostMapping("")
	public String returnTheValue(String action, double left, double right, Model model) {
		
		Double result=null;
		
		if (action.equals("sum")) {
			result = left + right;
			model.addAttribute("result", result);
			return "/calculate/summary";
			
		} else if 
			(action.equals("difference")) {
			result = left - right;
			model.addAttribute("result", result);
			return "calculate/difference";
			
		} else if 
			(action.equals("product")) {
			result = left * right;
			model.addAttribute("result", result);
			return "calculate/product";
			
		} else if 
			(action.equals("quotient")) {
			result = left / right;
			model.addAttribute("result", result);
			return "calculate/quotient";
			
		} else if
			(action.equals("modulo")) {
			result = left % right;
			model.addAttribute("result", result);
			return "calculate/modulo";
			
		} else if 
			(action.equals("exponent")) {
			result = Math.pow(left, right);
			model.addAttribute("answer", result);
			return "calculate/exponent";
			
			
		} else
		
		
		return "/calculate/calculation-form-holder";

	}
	//	@PostMapping("/calculate/exponent")
	//	public String pow(String action, double left, double right, Model model){
		//	if(action.equals("exponent")) {
		//	String result= pow(action, left, right, model);
			//	model.addAttribute("result", result);

	//private double pow(String action, double left, double right, Model model) {
		// TODO Auto-generated method stub
		//return 0;
	}
	
		
		//	}
		//return pow(action, right, right, model);
		//	return "calculate/exponent";
	

	

