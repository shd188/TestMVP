package com.aimer.shd.testmvp.model;

import android.util.SparseArray;

import com.aimer.shd.testmvp.bean.UserBean;

/**
 * Created by shd on 2015/7/9.
 */
public class UserModel implements IUserModel {

    private int mId;
    private String mName;
    private String mSex;
    private SparseArray<UserBean> mUserArray = new SparseArray<>();

    @Override
    public void setName(String name) {
        mName = name;
    }

    @Override
    public void setId(int id) {
        mId = id;
    }

    @Override
    public void setSex(String sex) {
        mSex = sex;
        UserBean userBean = new UserBean(mName, mSex);
        mUserArray.append(mId, userBean);
    }


    @Override
    public UserBean load(int id) {
        mId=id;
        UserBean userBean=mUserArray.get(mId,new UserBean("Not Found","Not Found"));
        return userBean;
    }
}
