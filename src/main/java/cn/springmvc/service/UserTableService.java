package cn.springmvc.service;

import cn.springmvc.model.UserTable;

public interface UserTableService {
	public UserTable getUser(UserTable user);
	public int addUser(UserTable user);
	public int updateUser(UserTable user);
}
