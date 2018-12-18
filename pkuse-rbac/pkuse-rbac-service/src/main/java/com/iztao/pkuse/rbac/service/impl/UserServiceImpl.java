package com.iztao.pkuse.rbac.service.impl;

import com.iztao.pkuse.api.rbac.system.model.domain.UserDO;
import com.iztao.pkuse.api.rbac.system.service.UserService;
import groovy.util.logging.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iztao.pkuse.base.common.service.impl.BaseServiceImpl;

@Service("userService")
@Slf4j
@Transactional
public class UserServiceImpl extends BaseServiceImpl<UserDO> implements UserService {

}
