package com.example.senai_pdm_2021_exemplo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class listaCadastroFrutas extends AppCompatActivity {
    ArrayAdapter<String> adaptador;
    List<String> lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cadastro_frutas);
        lista = new ArrayList<String>();

        ListView listaFrutas = findViewById(R.id.listaJogos);

        Intent intent=getIntent();
        ArrayList<String> listarFrutas = intent.getStringArrayListExtra("LISTA_FRUTAS");
        adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listarFrutas);
        adaptador.notifyDataSetChanged();
        listaFrutas.setAdapter(adaptador);
    }
}