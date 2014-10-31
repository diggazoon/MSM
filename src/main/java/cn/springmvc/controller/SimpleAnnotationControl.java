package cn.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/")
public class SimpleAnnotationControl {
	
	
	//@RequestMapping(value = "/anno.do", method = RequestMethod.GET)
	@RequestMapping("anno")
	public ModelAndView show()
	{
		ModelAndView mav = new ModelAndView("anno");
		mav.addObject("message","welcome annotation demo");
		return mav;
	}

}
