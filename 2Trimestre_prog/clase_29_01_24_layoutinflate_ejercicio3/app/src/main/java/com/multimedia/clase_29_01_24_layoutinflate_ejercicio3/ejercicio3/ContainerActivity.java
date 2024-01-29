package com.multimedia.clase_29_01_24_layoutinflate_ejercicio3.ejercicio3;



import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.multimedia.clase_29_01_24_layoutinflate_ejercicio3.R;

public class ContainerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View rootView = LayoutInflater.from(this).inflate(R.layout.activity_container, null);
        setContentView(rootView);

        ImageView imageView = findViewById(R.id.imageViewContainer);

        // Obtener el identificador de la imagen de la actividad anterior
        int imageId = getIntent().getIntExtra("imageId", 0);

        // Configurar la imagen en el ImageView
        if(imageId != 0) {
            imageView.setImageResource(imageId);
        }
    }
}
