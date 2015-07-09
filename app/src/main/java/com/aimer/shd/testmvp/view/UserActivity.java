package com.aimer.shd.testmvp.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.aimer.shd.testmvp.R;
import com.aimer.shd.testmvp.presenter.UserPresenter;

public class UserActivity extends Activity implements IUserView, View.OnClickListener {


    private EditText id_edit, name_edit, sex_edit;
    private Button submit, load;
    private UserPresenter mUserPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id_edit = (EditText) findViewById(R.id.edit_id);
        name_edit = (EditText) findViewById(R.id.edit_name);
        sex_edit = (EditText) findViewById(R.id.edit_sex);
        submit = (Button) findViewById(R.id.submit);
        load = (Button) findViewById(R.id.load);
        submit.setOnClickListener(this);
        load.setOnClickListener(this);

        mUserPresenter = new UserPresenter(this);
    }

    @Override
    public int getId() {
        return Integer.valueOf(id_edit.getText().toString());
    }

    @Override
    public void setName(String name) {
        name_edit.setText(name);
    }

    @Override
    public void setSex(String sex) {
        sex_edit.setText(sex);
    }

    @Override
    public String getName() {
        return name_edit.getText().toString();
    }

    @Override
    public String getSex() {
        return sex_edit.getText().toString();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.submit:
                mUserPresenter.saveUser(getId(), getName(), getSex());
                break;
            case R.id.load:
                mUserPresenter.loadUser(getId());
                break;
        }
    }
}
