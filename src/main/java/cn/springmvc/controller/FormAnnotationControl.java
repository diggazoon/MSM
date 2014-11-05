package cn.springmvc.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import cn.springmvc.model.AdminTable;
import cn.springmvc.model.User;
import cn.springmvc.service.AdminService;

@Controller
@RequestMapping("/")
public class FormAnnotationControl {
	
	private static final Logger logger = Logger.getLogger("DEBUG");
	
	@Autowired
	private AdminService adminService;

	@ModelAttribute("user")
	public User initBook() {
		User user = new User();
		user.setUsername("Input User name");
		return user;
	}

	@RequestMapping("reg")
	public String addUI() {
		return "reg";
	}

	@RequestMapping("save")
	public String add(@ModelAttribute User user, Model model) {
		model.addAttribute(user);
		return "userInfo";
	}

	@RequestMapping("login")
	public ModelAndView login(@ModelAttribute User user) {
		
		logger.error("name = "+user.getUsername());
		
		AdminTable admin = adminService.getUserPassword(user.getUsername());
		
		ModelAndView mav = new ModelAndView(new RedirectView("manage.do"));
		
		/*
		if (!"admin".equals(user.getUsername())) {
			mav = new ModelAndView("error");
		}
		*/
		
		if (admin!=null&&(user.getPassword().equals(admin.getPassword())))
		{
			return mav;
		}
		return new ModelAndView("error");
		
	}
	
	

	@RequestMapping("manage")
	public String manage() {
		return "list";
	}
}
