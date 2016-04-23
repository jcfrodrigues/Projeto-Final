package com.example.android.trabalhofinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class InicioActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telainicial_main);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent;
        switch (id) {
            case R.id.voce:
                intent = (new Intent(this, VoceActivity.class));
                break;
            case R.id.contatos:
                intent = (new Intent(this, ContatosActivity.class));
                break;
            case R.id.cursos:
                intent = (new Intent(this, CursosActivity.class));
                break;
            case R.id.noticia:
                intent = (new Intent(this, NoticiasActivity.class));
                break;

            default:
                intent = null;


        }
        if (intent != null) {
            startActivity(intent);
        }
    }


}
