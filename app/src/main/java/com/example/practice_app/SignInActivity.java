package com.example.practice_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SignInActivity extends AppCompatActivity {

    Button buton;
    EditText emailText, passText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        buton = (Button) findViewById(R.id.buttonLogin);
        emailText = (EditText) findViewById(R.id.TextEmailAddress);
        passText = (EditText) findViewById(R.id.TextPassword);
        textView = (TextView) findViewById(R.id.logotextView);

        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}