package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button aboutus = findViewById(R.id.aboutbtn);
        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent About = new Intent(getApplicationContext(), com.example.myapplication.Aboutus.class);
                startActivity(About);

            }
        });
        Button lib = (Button) findViewById(R.id.librarybtn);
        lib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent library = new Intent(getApplicationContext(), Library.class);
                startActivity(library);
            }
        });

        Button gallery = (Button) findViewById(R.id.gallerybtn);
        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent galbtn = new Intent(getApplicationContext(), Gallery.class);
                startActivity(galbtn);

            }
        });

        Button notices = (Button) findViewById(R.id.noticesbtn);
        notices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Not = new Intent(getApplicationContext(), Notices.class);
                startActivity(Not);
            }
        });

        Button department = (Button) findViewById(R.id.departbtn);
        department.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent depart = new Intent(getApplicationContext(), Departments.class);
                startActivity(depart);
            }
        });

        Button contact = (Button) findViewById(R.id.contactbtn);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contactus = new Intent(getApplicationContext(), Contactus.class);
                startActivity(contactus);
            }
        });

        TextView developers = (TextView) findViewById(R.id.textView35);
        developers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dev = new Intent(getApplicationContext(), Developers.class);
                startActivity(dev);
            }
        });

        Button register = (Button) findViewById(R.id.reget);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reg = new Intent(getApplicationContext(), Register.class);
                startActivity(reg);
            }


        });

    }
}
