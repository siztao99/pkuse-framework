package com.iztao.pkuse.api.rbac.system.service;

import com.iztao.pkuse.base.common.service.BaseService;
import com.iztao.pkuse.api.rbac.system.model.User;

public interface UserService extends BaseService<User>{
	
	User selectByKey(String id);
	
    int insert(User muser, String[] roleId);
    
    int update(User muser, String[] roleId);
    
    int delete(String[] id);

}
