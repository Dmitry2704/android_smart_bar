package com.komanda.sport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.net.URL;

public class MainActivity3 extends AppCompatActivity {

    TextView textvreg;
    EditText email, name, surname, password, password2;
    Button prodolzhit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textvreg = findViewById(R.id.textvreg);
        email = findViewById(R.id.email);
        name = findViewById(R.id.name);
        surname = findViewById(R.id.surname);
        password = findViewById(R.id.password);
        password2 = findViewById(R.id.password2);
        prodolzhit = findViewById(R.id.prodolzhit);



    }

    public void regprodolzhenie(View v){
        Intent intent = new Intent(this, regprodolzhenie.class);
        startActivity(intent);

    }
}