package com.gaesenak.web.controller;

import com.gaesenak.web.domain.TestUser;
import com.gaesenak.web.service.TestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TestUserController {
    @Autowired
    TestUserService testUserService;

    @RequestMapping("/")
    private String getUserList() throws Exception {
        List<TestUser>users = testUserService.getUserList();

        for (TestUser user : users) {
            System.out.println(user.toString());
        }
        return "index";
    }
}
