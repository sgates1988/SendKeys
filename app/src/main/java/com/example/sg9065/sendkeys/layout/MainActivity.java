package com.example.sg9065.sendkeys.layout;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.sg9065.sendkeys.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.signUpLink);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View v) {
        Intent i = new Intent(MainActivity.this, signUpActivity.class);
        startActivity(i);
        }
    });


    }
}
