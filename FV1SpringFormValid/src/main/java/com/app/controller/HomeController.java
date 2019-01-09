package com.app.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.app.model.Student;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String openlogin() {

		return "login";
	}
	@RequestMapping("log")
	public ModelAndView openreg() {

		return new ModelAndView("register","student", new Student());
	}
	@RequestMapping("reg")
	public ModelAndView scpage(@Valid Student student,BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {

			return new ModelAndView("register");
		} else {

			return new ModelAndView("success");
		}

	}

}
