package com.example.android.trabalhofinal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class ExcelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.excel_activity);
    }

    public void email(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Informações sobre Excel Avançado");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }
}
