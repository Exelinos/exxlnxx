package com.example.exxlnxx;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText txtangkapertama;
    EditText txtangkakedua;
    Integer angka1, angka2;
    Button btntambah;
    Button btnkurang;
    Button btnkali;
    Button btnbagi;
    String iangka1, iangka2;
    TextView tvhasil;

    @SuppressLint("WrongViewCast")
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtangkapertama = findViewById(R.id.txtangkapertama);
        txtangkakedua = findViewById(R.id.txtangkakedua);
        btntambah = findViewById(R.id.btntambah);
        btnkurang = findViewById(R.id.btnkurang);
        btnkali = findViewById(R.id.btnkali);
        btnbagi = findViewById(R.id.btnbagi);
        tvhasil = findViewById(R.id.tvhasil);
        btntambah.setOnClickListener(this);
        btnkali.setOnClickListener(this);
        btnkurang.setOnClickListener(this);
        btnbagi.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btntambah:
                iangka1 = txtangkapertama.getText().toString();
                iangka2 = txtangkakedua.getText().toString();
                angka1 = Integer.parseInt(iangka1);
                angka2 = Integer.parseInt(iangka2);
                tvhasil.setText("Hasil nya adalah " + (angka1 + angka2));
                break;
            case R.id.btnkurang:
                iangka1 = txtangkapertama.getText().toString();
                iangka2 = txtangkakedua.getText().toString();
                angka1 = Integer.parseInt(iangka1);
                angka2 = Integer.parseInt(iangka2);
                tvhasil.setText("Hasil nya adalah " + (angka1 - angka2));
                break;
            case R.id.btnkali:
                iangka1 = txtangkapertama.getText().toString();
                iangka2 = txtangkakedua.getText().toString();
                angka1 = Integer.parseInt(iangka1);
                angka2 = Integer.parseInt(iangka2);
                tvhasil.setText("Hasil nya adalah " + (angka1 * angka2));
                break;
            case R.id.btnbagi:
                iangka1 = txtangkapertama.getText().toString();
                iangka2 = txtangkakedua.getText().toString();
                angka1 = Integer.parseInt(iangka1);
                angka2 = Integer.parseInt(iangka2);
                tvhasil.setText("Hasil nya adalah " + (angka1 / angka2));
                break;
        }
    }
}