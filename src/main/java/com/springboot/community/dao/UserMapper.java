package com.springboot.community.dao;

import com.springboot.community.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author zhouwenxiao
 * @create 2021-01-01 0:47
 */
@Repository
@Mapper
public interface UserMapper {
    User selectById (int id);

    User selectByName(String username);

    User selectByEmail(String email);

    int insertUser (User user);

    int updateStatus(int id, int status);

    int updateHeader(int id, String headerUrl);

    int updatePassword(int id, String password);

}
