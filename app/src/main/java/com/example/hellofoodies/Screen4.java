package com.example.hellofoodies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class Screen4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);

        final EditText m_number = (EditText) findViewById(R.id.ed2);

        final EditText password = (EditText) findViewById(R.id.password);

        Button proceed_button = (Button) findViewById(R.id.proceed_button);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.KITKAT) {
            proceed_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String mobile_num = m_number.getText().toString();
                    String pass = password.getText().toString();

                    String number="9999999999";
                    String passcode="0123456789";

                    if(mobile_num.equals(number) && pass.equals(passcode))
                    {
                        Toast.makeText(getApplicationContext(), R.string.booking_successful, Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(), R.string.incorrect_password, Toast.LENGTH_LONG).show();
                    }
                }
            });
        }
    }
}
