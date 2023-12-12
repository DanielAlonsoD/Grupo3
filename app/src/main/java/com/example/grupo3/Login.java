package com.example.grupo3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.appbar.MaterialToolbar;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        MaterialToolbar encabezado = findViewById(R.id.encabezadoInicioSesión);
        setSupportActionBar(encabezado);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        EditText textoCorreo = findViewById(R.id.editTextCorreoLogin);
        EditText textoContrasena = findViewById(R.id.editTextContrasenaLogin);

        encabezado.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}