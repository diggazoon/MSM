package cn.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.springmvc.common.EncodingTool;
import cn.springmvc.model.Book;

@Controller
@RequestMapping("/")
public class JSONController {
	
	@RequestMapping(value="json", produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
	public @ResponseBody Book getShopInJSON(@RequestParam String name) {
 
		Book shop = new Book();
		shop.setName(EncodingTool.encodeStr(name));
		shop.setStaffName(new String[]{shop.getName(), "holleymetering"});
 
		return shop;
 
	}
}
