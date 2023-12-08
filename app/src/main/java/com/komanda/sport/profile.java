package com.komanda.sport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class profile extends AppCompatActivity {
    EditText name,surname,rost,ves;
    TextView myrost, myves,sm,kg;
    Button purposes, profile, exercises, devices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        name = findViewById(R.id.name);
        surname = findViewById(R.id.surname);
        rost = findViewById(R.id.rost);
        ves = findViewById(R.id.ves);
        myrost = findViewById(R.id.myrost);
        myves = findViewById(R.id.myves);
        sm = findViewById(R.id.sm);
        kg = findViewById(R.id.kg);
        purposes = findViewById(R.id.purposes);
        profile = findViewById(R.id.profile);
        exercises = findViewById(R.id.exercises);
        devices = findViewById(R.id.devices);

    }
    public void Qr(View v){
        Intent QR = new Intent(this, QRandUstroistvo.class);
        startActivity(QR);

    }
    public void UPR(View v){
        Intent upr = new Intent(this, glavnays3knopkami.class);
        startActivity(upr);

    }

    public void profile(View v){
        Intent profile = new Intent(this, profile.class);
        startActivity(profile);

    }
}