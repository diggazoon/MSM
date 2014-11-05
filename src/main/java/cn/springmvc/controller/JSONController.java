package cn.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.springmvc.model.Shop;

@Controller
@RequestMapping("/")
public class JSONController {
	
	@RequestMapping(value="json", method = RequestMethod.GET)
	public @ResponseBody Shop getShopInJSON(@RequestParam String name) {
 
		Shop shop = new Shop();
		shop.setName(name);
		shop.setStaffName(new String[]{"mkyong1", "mkyong2"});
 
		return shop;
 
	}
}
