package com.aimer.shd.testmvp.model;

import com.aimer.shd.testmvp.bean.UserBean;

/**
 * Created by shd on 2015/7/9.
 */
public interface IUserModel {

    void setName(String name);

    void setId(int id);

    void setSex(String sex);

    UserBean load(int id);
}
