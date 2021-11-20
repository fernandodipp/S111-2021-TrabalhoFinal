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

public class Aps_Register extends AppCompatActivity {

    EditText editTextNomeFruta, editTextPreco;
    Button buttonSalvar;
    Spinner spinnerMesColheita;
    List<String> listaFrutas;
    ArrayAdapter<String> adaptador;
    private List<String> mesColheita = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aps__register);

        editTextNomeFruta = (EditText) findViewById(R.id.editTextNomeJogo);
        editTextPreco = (EditText) findViewById(R.id.editTextPreco);
        spinnerMesColheita = (Spinner) findViewById(R.id.spinnerCategoriaJogo);

        mesColheita.add("01-Janeiro");
        mesColheita.add("02-Fevereiro");
        mesColheita.add("03-Março");
        mesColheita.add("04-Abril");
        mesColheita.add("05-Maio");
        mesColheita.add("06-Junho");
        mesColheita.add("07-Julho");
        mesColheita.add("08-Agosto");
        mesColheita.add("09-Setembro");
        mesColheita.add("10-Outubro");
        mesColheita.add("11-Novembro");
        mesColheita.add("12-Dezembro");


        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,mesColheita);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner spinner = findViewById(R.id.spinnerCategoriaJogo);
        spinner.setAdapter(adapter);

        buttonSalvar = (Button) findViewById(R.id.buttonSalvar);

        listaFrutas = new ArrayList<String>();
        adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaFrutas);

    }

    public void listarCadastro(View v) {
        String nomeFruta = editTextNomeFruta.getText().toString();
        Float precoFruta = Float.parseFloat(editTextPreco.getText().toString());

        if(nomeFruta.equals("") || precoFruta.equals("")) {
            Toast.makeText(this, "Preencha todos os campos para cadastrar!", Toast.LENGTH_SHORT).show();
        }else{
            listaFrutas.add("Nome da Fruta: " + nomeFruta + " \n" + "Preço da fruta: R$ " + String.format("%.2f", precoFruta) + "\n"
                    + "Mês da colheita: " + spinnerMesColheita.getSelectedItem().toString());
            Intent intent = new Intent(this, listaCadastroFrutas.class);
            intent.putStringArrayListExtra("LISTA_FRUTAS", (ArrayList<String>) listaFrutas);
            startActivity(intent);
        }
    }

}