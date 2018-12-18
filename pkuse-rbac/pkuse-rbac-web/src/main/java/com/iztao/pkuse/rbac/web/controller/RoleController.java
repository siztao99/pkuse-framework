package com.iztao.pkuse.rbac.web.controller;


import java.util.List;


import com.iztao.pkuse.api.rbac.system.model.domain.UserDO;
import com.iztao.pkuse.api.rbac.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iztao.pkuse.base.common.controller.BaseController;


@Controller
@RequestMapping("/system/user")
public class RoleController  extends BaseController{
	@Autowired
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@RequestMapping("/list")
	@ResponseBody
	public List<UserDO> list()
	{
		return null;
	}
}
