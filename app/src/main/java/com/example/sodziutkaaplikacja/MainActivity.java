package com.example.sodziutkaaplikacja;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button gototheshopping;
    Button fantasy;
    Button specialocassion;
    Button exit;
    TextView hello;


    public void OpenSecondPage()
    {
        Intent intent =new Intent(this,DrawingInShop.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
