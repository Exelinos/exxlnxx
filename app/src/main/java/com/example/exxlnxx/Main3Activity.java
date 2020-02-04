package com.example.exxlnxx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
TextView tvlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         tvlogin=findViewById(R.id.tvlogin);
        setContentView(R.layout.activity_main3);

    }
}
