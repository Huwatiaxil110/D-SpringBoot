package com.foresight.mybatis.mapper;

import com.foresight.mybatis.bean.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName cn.saytime.mapper.UesrMapper
 * @Description d
 */
@Repository
public interface UserMapper {

    User getUserById(Integer id);

    public List<User> getUserList();

    public int add(User user);

    public int update(@Param("id") Integer id, @Param("user") User user);

    public int delete(Integer id);


}
