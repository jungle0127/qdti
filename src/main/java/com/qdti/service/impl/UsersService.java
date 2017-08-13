package com.qdti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qdti.dao.domain.UsersMapper;
import com.qdti.dao.model.Users;
import com.qdti.service.IUsersService;

@Service("userService")
public class UsersService implements IUsersService {
	@Autowired
	private UsersMapper usersMapper;
	@Override
	public List<Users> getAllUsers() {
		return this.usersMapper.selectAll();
	}

}
