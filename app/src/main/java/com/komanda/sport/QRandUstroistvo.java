package com.komanda.sport;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class QRandUstroistvo extends AppCompatActivity {
    Button scan_btn, profile, upr, ustroistvo;
    TextView textView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrand_ustroistvo);
        scan_btn = findViewById(R.id.scanner);
        textView = findViewById(R.id.text);
        profile = findViewById(R.id.profile);
        upr = findViewById(R.id.upr);
        ustroistvo = findViewById(R.id.ustroistvo);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        scan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IntentIntegrator intentIntegrator = new IntentIntegrator(QRandUstroistvo.this);
                intentIntegrator.setOrientationLocked(false);
                intentIntegrator.setPrompt("Отсканируйте QR-код");
                intentIntegrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE);
                intentIntegrator.initiateScan();

            }
        });

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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        IntentResult intentResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if (intentResult != null) {
            String contents = intentResult.getContents();
            if (contents != null) {
                textView.setText(intentResult.getContents());
                if (contents.startsWith("http://") || contents.startsWith("https://")) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(contents));
                    startActivity(browserIntent);
                }
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

}
