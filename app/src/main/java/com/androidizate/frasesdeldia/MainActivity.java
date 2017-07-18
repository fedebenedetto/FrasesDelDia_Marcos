package com.androidizate.frasesdeldia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnObtenerFrase;
    EditText tvFrase;
    List<String> loListaDeFrases = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnObtenerFrase = (Button) findViewById(R.id.btn_obtener_frase);
        tvFrase = (EditText) findViewById(R.id.tv_frase);
        cargarFrases();
        btnObtenerFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvFrase.setText(loListaDeFrases.get(seleccionAlAzar()));
            }
        });
    }

    private void cargarFrases() {
        loListaDeFrases.add("Va a ser un buen dia");
        loListaDeFrases.add("Ojo por ojo");
        loListaDeFrases.add("A quien mal anda");
        loListaDeFrases.add("Vamos a tomar algo");
        loListaDeFrases.add("Frase incompleta");
        loListaDeFrases.add("Va a ser un buen dia 6");
        loListaDeFrases.add("Va a ser un buen dia 7");
        loListaDeFrases.add("Va a ser un buen dia 8");
        loListaDeFrases.add("Va a ser un buen dia 9");
        loListaDeFrases.add("Va a ser un buen dia 10");

    }

    private int seleccionAlAzar() {
        Random rand = new Random();
        return rand.nextInt(10);
    }
}
