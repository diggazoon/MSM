package cn.springmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.springmvc.dao.UserMapper;
import cn.springmvc.model.UserTable;
import cn.springmvc.service.UserTableService;

@Service
public class UserTableServiceImpl implements UserTableService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public UserTable getUser(UserTable user) {
		// TODO Auto-generated method stub
		return userMapper.getUser(user);
	}

	@Override
	public int addUser(UserTable user) {
		// TODO Auto-generated method stub
		return userMapper.addUser(user);
	}

	@Override
	public int updateUser(UserTable user) {
		// TODO Auto-generated method stub
		return userMapper.updateUser(user);
	}

}
