package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniu.mapper.UserMapper;
import com.woniu.pojo.User;
import com.woniu.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper userMapper;
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userMapper.selectByExample(null);
	}

}
