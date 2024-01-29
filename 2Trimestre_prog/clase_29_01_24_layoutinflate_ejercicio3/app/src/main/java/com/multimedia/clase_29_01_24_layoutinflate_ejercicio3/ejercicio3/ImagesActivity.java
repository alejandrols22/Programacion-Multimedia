package com.multimedia.clase_29_01_24_layoutinflate_ejercicio3.ejercicio3;




import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

import com.multimedia.clase_29_01_24_layoutinflate_ejercicio3.R;


public class ImagesActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // Inflar el diseño XML de la actividad de imágenes
        View rootView = LayoutInflater.from(this).inflate(R.layout.activity_images, null);
        setContentView(rootView);


        // Obtener referencias a los botones de imágenes
        Button btnImage1 = findViewById(R.id.btnImage1);
        Button btnImage2 = findViewById(R.id.btnImage2);
        Button btnImage3 = findViewById(R.id.btnImage3);


        // Configurar clics de los botones para ir a la actividad del contenedor
        btnImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Iniciar la actividad del contenedor con un mensaje específico
                startContainerActivity("Has seleccionado Imagen 1");
            }
        });


        btnImage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Iniciar la actividad del contenedor con un mensaje específico
                startContainerActivity("Has seleccionado Imagen 2");
            }
        });


        btnImage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Iniciar la actividad del contenedor con un mensaje específico
                startContainerActivity("Has seleccionado Imagen 3");
            }
        });
    }


    private void startContainerActivity(String message) {
        Intent intent = new Intent(ImagesActivity.this, ContainerActivity.class);
        intent.putExtra("message", message);
        startActivity(intent);
    }
}
