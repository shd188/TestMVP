package com.aimer.shd.testmvp.presenter;

import com.aimer.shd.testmvp.bean.UserBean;
import com.aimer.shd.testmvp.model.IUserModel;
import com.aimer.shd.testmvp.model.UserModel;
import com.aimer.shd.testmvp.view.IUserView;

/**
 * Created by shd on 2015/7/9.
 */
public class UserPresenter {
    private IUserModel mUserModel;
    private IUserView mUserView;

    public UserPresenter(IUserView iUserView) {
        mUserView = iUserView;
        mUserModel=new UserModel();
    }

    public void saveUser(int id,String name,String sex){
        mUserModel.setId(id);
        mUserModel.setName(name);
        mUserModel.setSex(sex);
    }

    public void loadUser(int id){
        UserBean userBean=mUserModel.load(id);
        mUserView.setName(userBean.getName());
        mUserView.setSex(userBean.getSex());
    }
}
