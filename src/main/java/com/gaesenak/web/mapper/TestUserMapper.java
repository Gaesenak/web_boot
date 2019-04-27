package com.gaesenak.web.mapper;

import com.gaesenak.web.domain.TestUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TestUserMapper {
    List<TestUser> getUserList() throws Exception;
}
