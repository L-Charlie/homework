package com.example.homework7_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loadjson(View view) {
        new Thread() {
            @Override
            public void run() {
                try {
                    URL Url = new URL("https://www.wanandroid.com/article/list/0/json");
                    HttpURLConnection con = (HttpURLConnection) Url.openConnection();
                    con.setRequestMethod("GET");
                    con.setReadTimeout(8000);
                    int code = con.getResponseCode();
                    if (code == 200) {
                        InputStream inputStream = con.getInputStream();
                        String s = ToString(inputStream);
                        anal(s);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
    private void anal(String s) throws JSONException {
        JSONObject object = new JSONObject(s);
        System.out.println(s);
        String title = object.getString("title");
        String shareUser = object.getString("shareUser");
        String link = object.getString("link");
        final String[] strings = {title, shareUser, link};
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                for (String s :
                        strings) {
                    TextView textView = new TextView(getApplicationContext());
                    textView.setTextColor(Color.BLUE);
                    textView.setText(s);
                }
            }
        });
    }

    private String ToString(InputStream in) throws IOException {
        ByteArrayOutputStream resource = new ByteArrayOutputStream();
        byte[] bytes = new byte[1024];
        int len = -1;
        while ((len = in.read(bytes)) != -1) {
            resource.write(bytes, 0, len);
        }
        in.close();
        String s = new String(resource.toByteArray());
        return s;
    }
}