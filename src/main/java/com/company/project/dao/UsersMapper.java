package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.Users;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface UsersMapper extends Mapper<Users> {

    @Select("SELECT * FROM users WHERE uid = #{uid}")
    @Results({
            @Result(property = "userSex", column = "user_sex"),
            @Result(property = "userName", column = "user_name")
    })
    Users getOne(Long uid);
}