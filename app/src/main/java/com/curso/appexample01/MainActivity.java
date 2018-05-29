package com.curso.appexample01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnRegistrar;
    EditText Nombre, Apellidos, Email, Contrasenia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Asignamos un elemento
        btnRegistrar = findViewById(R.id.btnRegistrar);
        Nombre = findViewById(R.id.Nombre);
        Apellidos = findViewById(R.id.Apellidos);
        Email = findViewById(R.id.Email);
        Contrasenia = findViewById(R.id.Contrasenia);



        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EnviarDatos();
            }
        });
    }

    private void EnviarDatos(){
        //Almacenamos el texto en una variable
        String nombre = Nombre.getText().toString();
        String apellido = Apellidos.getText().toString();
        String email = Email.getText().toString();
        String contrasenia = Contrasenia.getText().toString();
        Intent intent = new Intent(MainActivity.this, Segunda.class);
        intent.putExtra("nombre",nombre);
        intent.putExtra("apellido",apellido);
        intent.putExtra("email",email);
        intent.putExtra("contrasenia", contrasenia);
        startActivity(intent);
    }
}
