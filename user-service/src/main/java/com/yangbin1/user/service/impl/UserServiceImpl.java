package com.yangbin1.user.service.impl;

import com.yangbin1.user.service.UserService;
import org.springframework.stereotype.Service;

//@Service(version = "1.0.0")
@Service
public class UserServiceImpl implements UserService {

    public String sayHello() {
        return "hello";
    }

}
