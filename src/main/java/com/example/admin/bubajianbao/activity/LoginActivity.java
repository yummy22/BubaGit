package com.example.admin.bubajianbao.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.admin.bubajianbao.R;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

/**
 * Created by admin on 2016/11/24.
 */

public class LoginActivity extends Activity {
    @InjectView(R.id.ed_name)
    EditText edName;
    @InjectView(R.id.ed_password)
    EditText edPassword;
    @InjectView(R.id.btn_login)
    Button btnLogin;
    @InjectView(R.id.tv_register)
    TextView tvRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.inject(this);
    }

    @OnClick({R.id.btn_login, R.id.tv_register})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_login:
                break;
            case R.id.tv_register:
                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
                break;
        }
    }
}
