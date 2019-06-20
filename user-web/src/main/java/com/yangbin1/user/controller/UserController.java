package com.yangbin1.user.controller;

import com.yangbin1.user.service.FileService;
import com.yangbin1.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    //@Reference(version = "1.0.0", url = "dubbo://127.0.0.1:12345",check = false)
    @Autowired
    private UserService userService;

    @Autowired
    private FileService fileService;

    @RequestMapping("/sayHello")
    public String sayHello() {
        return userService.sayHello();
    }

    @RequestMapping("/upload")
    public void upload(@RequestParam(value = "msg") String msg) {
        fileService.upload(msg);
    }
}
