package com.iztao.pkuse.rbac.manager;

import com.iztao.pkuse.rbac.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserManager {
    @Autowired
    private UserRepository  userRepository;
}
