package com.iztao.pkuse.rbac.service.impl;

import com.iztao.pkuse.api.rbac.system.model.User;
import com.iztao.pkuse.api.rbac.system.service.UserService;
import com.iztao.pkuse.rbac.dao.mapper.UserMapper;
import groovy.util.logging.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iztao.pkuse.base.common.service.impl.BaseServiceImpl;

@Service("userService")
@Slf4j
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
	@Autowired
	private UserMapper userMapper;


	@Override
	public User selectByKey(String id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public int insert(User muser, String[] roleId) {
		return userMapper.insert(muser);
	}

	@Override
	public int update(User muser, String[] roleId) {
		return userMapper.updateByPrimaryKey(muser);
	}

	@Override
	public int delete(String[] id) {
		return userMapper.deleteByPrimaryKey(id);
	}
}
