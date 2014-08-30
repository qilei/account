package com.mytravel.account.persistence;

import com.mytravel.account.domain.User;

import java.util.List;

/**
 * Created by qilei on 2014/8/29.
 */
public interface UserMapper {
    List<User> getAll();
}
