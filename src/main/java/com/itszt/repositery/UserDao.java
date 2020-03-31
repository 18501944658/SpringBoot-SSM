package com.itszt.repositery;

import com.itszt.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;


@Repository
public interface UserDao extends BaseMapper<User> {

    List<User> selectAll();

    @Insert("insert user(name,age,time) values(#{name},#{age},#{time})")
    void insertUser(User user);
}
