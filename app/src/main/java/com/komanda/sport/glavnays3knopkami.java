package com.komanda.sport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;
public class glavnays3knopkami extends AppCompatActivity {
    TextView pod, kolvopod, kachpod, kolvokachpod, sredpod, kolvosredpod, obichpod, kolvoobichpod, kal, kolvokal;
    TextView currentDateTime;
    Calendar dateAndTime=Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glavnays3knopkami);
        pod = findViewById(R.id.pod);
        kolvopod = findViewById(R.id.kolvopod);
        kachpod = findViewById(R.id.kachpod);
        kolvokachpod = findViewById(R.id.kolvokachpod);
        sredpod = findViewById(R.id.sredpod);
        kolvosredpod = findViewById(R.id.kolvosredpod);
        obichpod = findViewById(R.id.obichpod);
        kolvoobichpod = findViewById(R.id.kolvoobichpod);
        kal = findViewById(R.id.kal);
        kolvokal = findViewById(R.id.kolvokal);
        currentDateTime = findViewById(R.id.currentDateTime);
    }
    public void setDate(View v) {
        new DatePickerDialog(glavnays3knopkami.this, d,
                dateAndTime.get(Calendar.YEAR),
                dateAndTime.get(Calendar.MONTH),
                dateAndTime.get(Calendar.DAY_OF_MONTH))
                .show();
    }
    private void setInitialDateTime() {

        currentDateTime.setText(DateUtils.formatDateTime(this,
                dateAndTime.getTimeInMillis(),
                DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_SHOW_YEAR
                        | DateUtils.FORMAT_SHOW_TIME));
    }
    DatePickerDialog.OnDateSetListener d= (view, year, monthOfYear, dayOfMonth) -> {
        dateAndTime.set(Calendar.YEAR, year);
        dateAndTime.set(Calendar.MONTH, monthOfYear);
        dateAndTime.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        setInitialDateTime();
    };
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




