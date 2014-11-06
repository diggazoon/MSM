package cn.springmvc.dao;

import cn.springmvc.model.UserTable;

public interface UserMapper {
	public UserTable getUser(UserTable user);
	public int addUser(UserTable user);
	public int updateUser(UserTable user);
}
