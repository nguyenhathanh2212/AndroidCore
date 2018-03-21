package com.example.tdk.bai4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void swap_layout(View view) {
        Button btn = findViewById(R.id.bottom);
        String str = (String) btn.getText();
        System.out.println(str);
    }
}
