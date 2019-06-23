
package com.example.sodziutkaaplikacja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;
import android.widget.TextView;


public class DrawingInShop extends AppCompatActivity {


    Button drawgrafics;
    Button exit;
    Button back;
    Button generategrafics;
    TextView drawgraf;
    TextView discounts;

    public void OpenFirstPage()
    {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void OpenThirdPage()
    {

        Intent intent = new Intent(this, ListOfGrafics.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_grafics);


        final Button generategrafics=(Button) findViewById(R.id.generategrafics);
        final Button drawgrafics =(Button) findViewById(R.id.drawgrafics);
        final Button exit =(Button) findViewById(R.id.exit);
        final Button back=(Button) findViewById(R.id.back);
        final TextView discounts =(TextView) findViewById(R.id.discounts);
        final TextView drawgraf =(TextView) findViewById(R.id.drawgraf);

        exit.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                finish();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                OpenFirstPage();
            }
        });

        generategrafics.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                OpenThirdPage();
            }
        }
        );




    }
}



