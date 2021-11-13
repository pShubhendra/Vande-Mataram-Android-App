package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Departments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departments);

        TextView chemistry = (TextView) findViewById(R.id.textView12);
        chemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chem = new Intent(getApplicationContext(), Chemistry.class);
                startActivity(chem);
            }
        });
        TextView cs = (TextView) findViewById(R.id.textView13);
        cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(getApplicationContext(), CSandIT.class);
                startActivity(c);
            }
        });
        TextView life = (TextView) findViewById(R.id.textView14);
        life.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lifesci = new Intent(getApplicationContext(), Lifescience.class);
                startActivity(lifesci);
            }
        });
        TextView arts = (TextView) findViewById(R.id.textView16);
        arts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent art = new Intent(getApplicationContext(), Arts.class);
                startActivity(art);
            }
        });
        TextView com = (TextView) findViewById(R.id.textView15);
        com.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent comm = new Intent(getApplicationContext(), Commerce.class);
                startActivity(comm);
            }
        });


    }
}


