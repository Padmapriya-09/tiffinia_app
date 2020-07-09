package com.example.hellofoodies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Screen4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);

        /*Button proceed_button = (Button) findViewById(R.id.button1);
        proceed_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                URL url = null;
                try {
                    url = new URL(" https://mekvahan.com/api/android_intern_task");
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                HttpURLConnection con = null;
                try {
                    con = (HttpURLConnection) url.openConnection();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    con.setRequestMethod("GET");
                } catch (ProtocolException e) {
                    e.printStackTrace();
                }

                Map<String, String> parameters = new HashMap<>();
                parameters.put("param1", "val");

                con.setDoOutput(true);
                DataOutputStream out = null;
                try {
                    out = new DataOutputStream(con.getOutputStream());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                out.writeBytes(ParameterStringBuilder.getParamsString(parameters));
                out.flush();
                out.close();
            }
        });*/
    }
}
