package com.GISproject.test_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.IDNA;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private int Counter = 5;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name = (EditText) findViewById(R.id.etname);
        Password = (EditText) findViewById(R.id.etpassword);
        Info = (TextView) findViewById(R.id.tvinfo);
        Login = (Button) findViewById(R.id.btnlogin);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });

    }
    private void validate (String userName, String userPassword){
        if ((userName.equals("GIS" ) )&& (userPassword.equals("Maseno") )){
            Intent intent = new Intent (MainActivity.this, SecondActivity.class);
            startActivity(intent);

        }else{
            Counter --;
            Info.setText("No. of attempts remaining: " + String.valueOf(Counter));
            if (Counter == 0){
                Login.setEnabled(false);
            }

        }
    }

}