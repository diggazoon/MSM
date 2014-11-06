package cn.springmvc.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.springmvc.model.UserTable;
import cn.springmvc.service.UserService;
import cn.springmvc.service.UserTableService;



public class UserTest {

private UserService userService;
private UserTableService userTableService;
	
	@Before
	public void before(){                                                                    
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
				,"classpath:conf/spring-mybatis.xml"});
		//userService = (UserService) context.getBean("userServiceImpl");
		
		userTableService = (UserTableService) context.getBean("userTableServiceImpl");
	}
	
	@Test
	public void addUser(){
		UserTable user = new UserTable();
		user.setUserName("digga");
		user.setPassword("123456");
		System.out.println(userTableService.addUser(user));
	}
}
