package com.example.android.trabalhofinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class CursosActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cursos_activity);

    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent;
        switch (id) {
            case R.id.excel:
                intent = (new Intent(this, ExcelActivity.class));
                break;
            case R.id.autocad:
                intent = (new Intent(this, AutocadActivity.class));
                break;
            case R.id.vba:
                intent = (new Intent(this, AutocadActivity.class));
                break;
            case R.id.infobasica:
                intent = (new Intent(this, AutocadActivity.class));
                break;
            case R.id.project:
                intent = (new Intent(this, AutocadActivity.class));
                break;
            case R.id.photoshop:
                intent = (new Intent(this, AutocadActivity.class));
                break;
            case R.id.java:
                intent = (new Intent(this, AutocadActivity.class));
                break;
            case R.id.manutencao:
                intent = (new Intent(this, AutocadActivity.class));
                break;
            case R.id.redes:
                intent = (new Intent(this, AutocadActivity.class));
                break;
            default:
                intent = null;


        }
        if (intent != null) {
            startActivity(intent);
        }
    }
}

