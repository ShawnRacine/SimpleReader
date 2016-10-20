package com.racine.service;

import com.racine.beans.UserInfo;
import com.racine.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sunrx on 2016/9/27.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public UserInfo getUser(int id) {
        return userMapper.queryUser(id);
    }
}
