package cn.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

	@RequestMapping("index")
	public String index(){
		System.out.println(111);
		return "index";
		
		//防止重复提交数据，可以使用重定向视图：
		//return "redirect:/index"
	}
	
}
