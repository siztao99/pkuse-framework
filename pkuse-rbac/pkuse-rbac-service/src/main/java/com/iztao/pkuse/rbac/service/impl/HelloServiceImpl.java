package com.iztao.pkuse.rbac.service.impl;

import com.iztao.pkuse.rbac.service.IHelloService;

public class HelloServiceImpl  implements IHelloService {
    @Override
    public void sayHello(String userName) {
        System.out.printf("Hello!" +userName);
    }
}
