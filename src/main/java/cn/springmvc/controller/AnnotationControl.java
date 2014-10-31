package cn.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/")
public class AnnotationControl {

	@RequestMapping("{name}")
	public String getName(@PathVariable String name,Model model)
	{
		model.addAttribute("message","Name:" + name);
		return "anno";
	}
	
	@RequestMapping("age")
	public ModelAndView getAge(@RequestParam int age)
	{
		ModelAndView mav = new ModelAndView("anno");
		mav.addObject("message","Age:" + age);
		return mav;
	}
}
