package com.example.cisco.miprimeraaplicacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    EditText txtNombre, txtEmail, txtTelefono;
    RadioButton rbMasculino,rbFemenino;
    Button btnGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_activity_main);

        txtNombre = (EditText) findViewById(R.id.txtNombre);
        txtEmail = (EditText) findViewById(R.id.txtEmail);
        txtTelefono = (EditText) findViewById(R.id.txtTelefono);
        rbMasculino = (RadioButton) findViewById(R.id.rbMasculino);
        rbFemenino = (RadioButton) findViewById(R.id.rbFemenino);
        btnGuardar = (Button) findViewById(R.id.btnGuardar);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });


    }
}
