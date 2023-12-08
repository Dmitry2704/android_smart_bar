package com.komanda.sport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class regprodolzhenie extends AppCompatActivity {
    TextView text2reg, textrost, textves;
    EditText rost, ves;
    Button zareg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regprodolzhenie);
        text2reg = findViewById(R.id.text2vreg);
        textrost = findViewById(R.id.textrost);
        textves = findViewById(R.id.textves);
        rost = findViewById(R.id.rost);
        ves = findViewById(R.id.ves);
        zareg = findViewById(R.id.zareg);

    }
    public void voiti(View v){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

    }
}