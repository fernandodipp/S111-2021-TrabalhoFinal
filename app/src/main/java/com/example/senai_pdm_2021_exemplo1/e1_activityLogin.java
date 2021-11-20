package com.example.senai_pdm_2021_exemplo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class e1_activityLogin extends AppCompatActivity {
    EditText editTextUser, editTextPassword;
    Button buttonValidar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e1_login);

        editTextUser = (EditText) findViewById(R.id.editTextUser);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        buttonValidar = (Button) findViewById(R.id.buttonValidar);
    }

    public void btnValidar(View view) {
        String user = editTextUser.getText().toString();
        String passWord = editTextPassword.getText().toString();

        if(user.equals("admin") && passWord.equals("123")){
            Bundle sacolaParametro = new Bundle();
            sacolaParametro.putString("TEXTO_USER", user);
            sacolaParametro.putString("TEXTO_PASSWORD", passWord);

            Intent intent = new Intent(this, e1_activityLogged.class);
            intent.putExtras(sacolaParametro);
            startActivity(intent);


        }else{
            Toast.makeText(this, "Usuário ou senha incorretos", Toast.LENGTH_SHORT).show();
        }
    }
}