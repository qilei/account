package com.mytravel.account.domain;

import java.io.Serializable;

/**
 * Created by qilei on 2014/8/29.
 */
public class User implements Serializable {
    private Integer userId;
    private String userName;
    private Integer isOK;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getIsOK() {
        return isOK;
    }

    public void setIsOK(Integer isOK) {
        this.isOK = isOK;
    }
}
