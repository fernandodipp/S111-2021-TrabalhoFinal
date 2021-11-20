package com.example.senai_pdm_2021_exemplo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abre_segunda_activity(View view) {
        EditText campoNome = findViewById(R.id.editTextCampoNome);
        String textoDigitado = campoNome.getText().toString();

        Bundle sacolaParametro = new Bundle();
        sacolaParametro.putString("TEXTO_DIGITADO", textoDigitado);

        Intent intent = new Intent(this, SegundaActivity.class);
        intent.putExtras(sacolaParametro);
        startActivity(intent);
    }
}