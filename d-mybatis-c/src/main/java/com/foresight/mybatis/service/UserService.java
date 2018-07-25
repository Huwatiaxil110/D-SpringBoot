package com.foresight.mybatis.service;


import com.foresight.mybatis.bean.User;

import java.util.List;

/**
 * @ClassName com.foresight.mybatis.service.UserService
 * @Description description
 */
public interface UserService {

    User getUserById(Integer id);

    public List<User> getUserList();

    public int add(User user);

    public int update(Integer id, User user);

    public int delete(Integer id);

}

