package com.gaesenak.web.service;

import com.gaesenak.web.domain.TestUser;
import com.gaesenak.web.mapper.TestUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestUserService {

    @Autowired
    TestUserMapper testUserMapper;

    public List<TestUser> getUserList() throws Exception {
        return testUserMapper.getUserList();
    }
}
