package com.example.senai_pdm_2021_exemplo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        String textoDigitado = (String) getIntent().getSerializableExtra("TEXTO_DIGITADO");
        EditText campoNome = findViewById(R.id.editTextNome);
        if(textoDigitado.equals("")){
            campoNome.setText("Não digitou nada!");
        }else {
            campoNome.setText(textoDigitado);
        }


    }

    public void alterarNome(View view) {
        TextView textViewNome = findViewById(R.id.textViewNome);
        EditText editTextNome = findViewById(R.id.editTextNome);

        String textoDigitado = editTextNome.getText().toString(); // retorna o texto digitado
        textViewNome.setText(textoDigitado);
    }
}