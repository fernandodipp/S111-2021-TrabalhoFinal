package com.example.senai_pdm_2021_exemplo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ex2Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex2);

        Spinner spinnerEstCivil = findViewById(R.id.spinnerEstCivil);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.spinnerEstCivil, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerEstCivil.setAdapter(adapter);
        spinnerEstCivil.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void enviar(View view) {
        TextView textViewNomeShow = findViewById(R.id.textViewNomeShow);
        TextView textViewIdadeShow = findViewById(R.id.textViewIdadeShow);
        EditText editTextNome = findViewById(R.id.editTextNome);
        EditText editTextIdade = findViewById(R.id.editTextIdade);
        Spinner spinnerTextEstCivil = (Spinner) findViewById(R.id.spinnerEstCivil);

        String textoNome = editTextNome.getText().toString(); // retorna o texto digitado
        String textoIdade = editTextIdade.getText().toString(); // retorna o texto digitado
        String textoSpinnerEstCivil = spinnerTextEstCivil.getSelectedItem().toString();
        textViewNomeShow.setText(textoNome);
        textViewIdadeShow.setText(textoIdade);
        spinnerTextEstCivil.setOnItemSelectedListener(this);
    }
}