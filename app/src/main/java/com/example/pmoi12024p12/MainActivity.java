package com.example.pmoi12024p12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nombre,apellido,telefono;
    Button btn_procesar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText) findViewById(R.id.nombre);
        apellido = (EditText) findViewById(R.id.apellido);
        telefono = (EditText) findViewById(R.id.telefono);
        btn_procesar = (Button) findViewById(R.id.btn_procesar);

        btn_procesar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), nombre.getText().toString(), Toast.LENGTH_LONG ).show();
            }
        });





    }
}