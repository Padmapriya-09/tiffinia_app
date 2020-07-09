package com.example.hellofoodies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        Button btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Screen2.this, Screen3.class);
                Screen2.this.startActivity(myIntent);
            }
        });
        Button btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Screen2.this, Screen3.class);
                Screen2.this.startActivity(myIntent);
            }
        });
    }


    /*btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent myIntent = new Intent(Screen2.this, Screen3.class);
            Screen2.this.startActivity(myIntent);
        }
    });*/


}
