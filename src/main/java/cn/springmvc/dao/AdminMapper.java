package cn.springmvc.dao;

import cn.springmvc.model.AdminTable;

public interface AdminMapper {
	public AdminTable getUserPassword(String name);
}
