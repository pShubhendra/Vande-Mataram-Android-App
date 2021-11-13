package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    EditText nameet, classet, rollet, aadharet;
    Button subbtn;

    String strName = "", strClass = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText nameet = (EditText) findViewById(R.id.nameet);
        final EditText classet = (EditText) findViewById(R.id.classet);
        EditText rollet = (EditText) findViewById(R.id.rollet);
        EditText aadharet = (EditText) findViewById(R.id.aadharet);
        Button subbtn = (Button) findViewById(R.id.subbtn);
        subbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strName = nameet.getText().toString();
                strClass = classet.getText().toString();

                sendEmail();


            }
        });



    }
    protected void sendEmail() {
        Log.i("Send email", "");
        String[] TO = {"shubhendrap000@gmail.com"};
        String[] CC = {""};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);

        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Registration Data");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Name: - " + strName + " \n Class: - " + strClass);

        try {
            startActivity(Intent.createChooser(emailIntent, "Send mail..."));
            finish();
            //Log.in("Finished sending email", "");
        } catch(android.content.ActivityNotFoundException ex) {
            Toast.makeText(Register.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }

    }




}
