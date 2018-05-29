package com.curso.appexample01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Segunda extends AppCompatActivity {

    TextView NombreApellidos, Nombre, Apellido, Email, Contrasenia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        recibirDatos();

    }

    public void recibirDatos(){
        Bundle extras = this.getIntent().getExtras();
        String nombre = extras.getString("nombre");
        String apellido = extras.getString("apellido");
        String email = extras.getString("email");
        String contrasenia = extras.getString("contrasenia");

        //Declaramos los objetos
        NombreApellidos = findViewById(R.id.NombreApellido);
        Nombre = findViewById(R.id.Nombre);
        Apellido = findViewById(R.id.Apellido);
        Email = findViewById(R.id.Email);
        Contrasenia = findViewById(R.id.Contrasenia);


        NombreApellidos.setText("Hola "+nombre+"!");
        Nombre.setText("Nombre: "+nombre);
        Apellido.setText("Apellidos: "+apellido);
        Email.setText("Email: "+email);
        Contrasenia.setText("Contraseña: "+contrasenia);
    }
}
