package com.example.usrgam.aplicacion07;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class SpinnerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        val arregloUsuarios: ArrayAdapter<usuario> = arrayOf(
            new usuario("Danny", "Eguez",
                    "Azul"),
                    new usuario("Juan", "Velasquez",
                            "Negro"),
                    new usuario("David", "Diaz",
                            "Rojo")
        )
    }
}
