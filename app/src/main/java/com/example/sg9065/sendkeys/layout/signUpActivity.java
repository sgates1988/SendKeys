package com.example.sg9065.sendkeys.layout;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.sg9065.sendkeys.R;

public class signUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Toolbar toolbar = (Toolbar) findViewById(R.id.SignupHeader);
        setSupportActionBar(toolbar);

        Button button = (Button) findViewById(R.id.signUpNextBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(signUpActivity.this, signUpForm.class);
                startActivity(i);
            }
        });
    }
    }

