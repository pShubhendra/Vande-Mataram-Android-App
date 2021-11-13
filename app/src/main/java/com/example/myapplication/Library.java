package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Library extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        Button library = findViewById(R.id.downloadbtn);
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String page = "http://www.vandemataramcollege.com/app/webroot/files/About_LIbrary.pdf";
                Uri web = Uri.parse(page);
                Intent gotoweb = new Intent(Intent.ACTION_VIEW,web);
                if(gotoweb.resolveActivity(getPackageManager()) != null) {
                    startActivity(gotoweb);
                }
            }
        });

    }
}
