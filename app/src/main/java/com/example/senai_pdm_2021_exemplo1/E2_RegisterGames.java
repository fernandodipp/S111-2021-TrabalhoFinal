package com.example.senai_pdm_2021_exemplo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class E2_RegisterGames extends AppCompatActivity {

    EditText editTextNomeJogo;
    Spinner spinnerCategoriaJogo;
    Button buttonSalvar;
    List<String> listaJogos;
    ArrayAdapter<String> adaptador;
    private List<String> categoriaJogo = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e2__register_games);

        editTextNomeJogo = (EditText) findViewById(R.id.editTextNomeJogo);
        spinnerCategoriaJogo = (Spinner) findViewById(R.id.spinnerCategoriaJogo);

        categoriaJogo.add("Aventura");
        categoriaJogo.add("Corrida");
        categoriaJogo.add("RPG");


        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,categoriaJogo);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner spinner = findViewById(R.id.spinnerCategoriaJogo);
        spinner.setAdapter(adapter);

        buttonSalvar = (Button) findViewById(R.id.buttonSalvar);

        listaJogos = new ArrayList<String>();
        adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaJogos);

    }

    public void listarCadastroJogos(View v) {
        String nomeJogo = editTextNomeJogo.getText().toString();

        if(nomeJogo.equals("")) {
            Toast.makeText(this, "Preencha todos os campos para cadastrar!", Toast.LENGTH_SHORT).show();
        }else{
            listaJogos.add("Nome do Jogo: " + nomeJogo + " \n" + "Categoria do jogo: " + spinnerCategoriaJogo.getSelectedItem().toString());
            Intent intent = new Intent(this, E2_ListGames.class);
            intent.putStringArrayListExtra("LISTA_JOGOS", (ArrayList<String>) listaJogos );
            startActivity(intent);
        }
    }
}