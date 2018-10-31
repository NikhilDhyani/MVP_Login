package com.devdnik.coder.mvp_login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.devdnik.coder.mvp_login.Presenter.Presenter;
import com.devdnik.coder.mvp_login.Presenter.PresenterInterface;
import com.devdnik.coder.mvp_login.View.LoginInterface;

public class MainActivity extends AppCompatActivity implements LoginInterface {

    EditText email, passwd;
    Button btn;

    Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        email = findViewById(R.id.TV_Email);
        passwd = findViewById(R.id.TV_Passwd);
        btn = findViewById(R.id.btn);

        presenter = new Presenter(this);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("FirstX","Within_Presenter");

                presenter.onLogin(email.getText().toString(), passwd.getText().toString());

                Log.d("SecondX","Within_Presenter");

            }
        });

    }


    @Override
    public void onLoginResult(String message) {

        Log.d("FiveX","Within_Real_Presenter");

        Toast.makeText(this, message, Toast.LENGTH_LONG).show();

        Log.d("SixX","Within_Real_Presenter");

    }
}
