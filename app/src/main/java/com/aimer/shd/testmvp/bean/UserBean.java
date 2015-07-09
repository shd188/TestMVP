package com.aimer.shd.testmvp.bean;

/**
 * Created by shd on 2015/7/9.
 */
public class UserBean {

    private String mName;
    private int mId;
    private String mSex;


    public UserBean(String name, String sex) {
        mName = name;
        mSex = sex;
    }

    public String getName() {
        return mName;
    }


    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getSex() {
        return mSex;
    }


}