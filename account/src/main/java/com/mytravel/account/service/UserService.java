package com.mytravel.account.service;

import com.mytravel.account.domain.User;
import com.mytravel.account.persistence.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by qilei on 2014/8/29.
 */
@Service
public class UserService {

    @Resource
    UserMapper userMapper;

    public List<User> getAll() {
        return userMapper.getAll();
    }
}
