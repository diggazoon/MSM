package cn.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import cn.springmvc.model.User;

@Controller
@RequestMapping("/")
public class FormAnnotationControl {

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
		ModelAndView mav = new ModelAndView(new RedirectView("manage.do"));
		if (!"admin".equals(user.getUsername())) {
			mav = new ModelAndView("error");
		}
		return mav;
	}
	
	

	@RequestMapping("manage")
	public String manage() {
		return "list";
	}
}
