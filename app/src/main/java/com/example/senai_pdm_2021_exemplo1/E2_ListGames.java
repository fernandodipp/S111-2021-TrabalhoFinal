package com.example.senai_pdm_2021_exemplo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class E2_ListGames extends AppCompatActivity {

    ArrayAdapter<String> adaptador;
    List<String> lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e2__list_games);
        lista = new ArrayList<String>();

        ListView listaJogos = findViewById(R.id.listaJogos);

        Intent intent=getIntent();
        ArrayList<String> listarJogos = intent.getStringArrayListExtra("LISTA_JOGOS");
        adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listarJogos);
        adaptador.notifyDataSetChanged();
        listaJogos.setAdapter(adaptador);
    }
}