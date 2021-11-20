package com.example.senai_pdm_2021_exemplo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class e1_activityLogged extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e1_logged);

        TextView campoUser = findViewById(R.id.textViewUserView);
        TextView campoPassword = findViewById(R.id.textViewPassWordView);

        campoUser.setText((String) getIntent().getSerializableExtra("TEXTO_USER"));
        campoPassword.setText((String) getIntent().getSerializableExtra("TEXTO_PASSWORD"));
    }
}