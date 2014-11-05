package cn.springmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.springmvc.dao.AdminMapper;
import cn.springmvc.model.AdminTable;
import cn.springmvc.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminMapper adminMapper;

	@Override
	public AdminTable getUserPassword(String name) {
		return adminMapper.getUserPassword(name);
	}

}
