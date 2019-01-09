package com.app.HomeController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.Employee;
import com.app.service.Service1;

@Controller
public class HomeController {
	@Autowired
	Service1 serobj;

	@RequestMapping("/")
	public String log() {
		System.out.println("hiii new repo");
		return "login";
	}

	@RequestMapping("reg")
	public String reg() {

		return "reg";
	}

	@RequestMapping("regisation")
	public String regisation1(@ModelAttribute Employee employee, Model mode) {
		int x = serobj.registation(employee);
		if (x > 0) {
			mode.addAttribute("msg",
					"DADA IS ADDED SUCCESSFULLY IN DADA BASE........!!");
		}
		return "login";
	}

	@RequestMapping("log")
	public ModelAndView login1(@ModelAttribute Employee employee) {
		System.out.println("CONTROLLER:=" + employee.getUname() + "  "
				+ employee.getPass());
		List<Employee> elist = serobj.login(employee);
		//model.addAttribute("msg","DADA IS ADDED SUCCESSFULLY IN DADA BASE........!!");
		//model.addAttribute("data", elist);
		//return "success";
		return new ModelAndView("success","data",elist);
	}
	@RequestMapping("delete{eid}")
	public String del(@PathVariable("eid") int eid, Model model) {
		System.out.println(eid);
		List<Employee> elist = serobj.delete(eid);
		model.addAttribute("data", elist);
		return "success";
	}
	@RequestMapping("edit{eid}")
	public String edit(@PathVariable("eid") int eid, Model model) {
		Employee employee = serobj.edit(eid);
		model.addAttribute("data",employee);
		
		return "edit";
	}
	@RequestMapping("update")
	public String update( @ModelAttribute Employee employee,Model model){
		
	List<Employee> elist=serobj.update1(employee);
	model.addAttribute("data",elist);
	
		return "success";
	}
	

}
