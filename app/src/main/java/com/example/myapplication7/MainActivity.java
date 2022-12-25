package com.example.myapplication7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText email;
    EditText password;
    String admin = "admin";
    Button button;
    TextView hello;
    TextView entrance;
    TextView password2;
    TextView he;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        button = findViewById(R.id.button);
        hello = findViewById(R.id.hello);
        entrance = findViewById(R.id.entrance);
        password2 = findViewById(R.id.password2);
        he = findViewById(R.id.he);

        click();

    }


    private TextWatcher watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String inputEmail = email.getText().toString();
            String inputPassword = password.getText().toString();
            button.setActivated(!inputEmail.isEmpty() || !inputPassword.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };

    private void click() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emaill = email.getText().toString().trim();
                String passwordd = password.getText().toString().trim();

                if (!emaill.equals(admin) || !passwordd.equals(admin)) {
                    if (!emaill.equals(admin)) {
                        email.setError("Неправельный логин");
                    } else if (!passwordd.equals(admin)) {
                        password.setError("Неправельный пароль");
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Вы успешно зарегестрироввались", Toast.LENGTH_LONG).show();
                    email.setVisibility(View.INVISIBLE);
                    password.setVisibility(View.INVISIBLE);
                    entrance.setVisibility(View.INVISIBLE);
                    password2.setVisibility(View.INVISIBLE);
                    he.setVisibility(View.INVISIBLE);
                    email.setVisibility(View.INVISIBLE);
                    button.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
};



