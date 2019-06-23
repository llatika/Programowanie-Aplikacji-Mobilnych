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


        final Button gototheshopping =(Button) findViewById(R.id.gototheshopping);
        final Button fantasy =(Button) findViewById(R.id.fantasy);
        final Button specialocassion =(Button) findViewById(R.id.specialocassion);
        final Button exit =(Button) findViewById(R.id.exit);
        final TextView hello =(TextView) findViewById(R.id.hello);

        gototheshopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenSecondPage();
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });


    }
}
