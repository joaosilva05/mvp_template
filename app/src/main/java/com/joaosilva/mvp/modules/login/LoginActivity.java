package com.joaosilva.mvp.modules.login;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Toast;

import com.joaosilva.mvp.App;
import com.joaosilva.mvp.R;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity implements LoginContract.View {

    @BindView(R.id.username)
    EditText username;

    @BindView(R.id.password)
    EditText password;

    @Inject
    LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {

        ButterKnife.bind(this);
        DaggerLoginComponent.builder()
                .networkComponent(((App) getApplicationContext()).getNetworkComponent())
                .loginModule(new LoginModule(this))
                .build().inject(this);

    }

    @OnClick(R.id.btn_login)void onLoginClick(){
        String _username = username.getText().toString();
        String _password = password.getText().toString();

        presenter.doLogin(_username, _password);
    }

    @Override
    public void showError(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginSuccess() {
        Toast.makeText(this, "WOOT", Toast.LENGTH_SHORT).show();
    }
}
