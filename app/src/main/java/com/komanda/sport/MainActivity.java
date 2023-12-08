package com.komanda.sport;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    TextView nazvanie;
    TextView welcome;
    Button vhod;
    Button registracia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        welcome = findViewById(R.id.welcome);
        nazvanie = findViewById(R.id.nazvanie);
        vhod = findViewById(R.id.vhod);
        registracia = findViewById(R.id.registracia);



    }
    public void Vhod(View v){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

    }
    public void Registracia(View v){
        Intent intent1 = new Intent(this, MainActivity3.class);
        startActivity(intent1);

    }
}