package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.models.Whisperer;
import com.example.demo.models.Yeller;

@Controller
@RequestMapping({ "/", "/HelloWorld" })
public class HelloWorldController {

	private String title;

	public HelloWorldController() {
		title = "Hello Java and Spring!";
	}

	@GetMapping("")
	public String index() {
		return "helloworld/index";
	}

	@GetMapping("message")
	public ModelAndView message(@RequestParam(required = false, defaultValue = "«silence»") String message) {
		ModelAndView mv = new ModelAndView("helloworld/message");
		Yeller shout = new Yeller();
		String result = shout.createAYell(message);
		mv.addObject("title", title);
		mv.addObject("message", result);
		return mv;
	}

	@GetMapping("whisper")
	public ModelAndView whisper(@RequestParam(required = false, defaultValue = "«shhhhh»") String whisper) {
		ModelAndView mv = new ModelAndView("helloworld/whisper");
		Whisperer quiet = new Whisperer();
		String result = quiet.createAWhisper(whisper);
		mv.addObject("title", title);
		mv.addObject("message", result);
		return mv;

	}

}
