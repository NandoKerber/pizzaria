package com.example.apppizzaria;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ImageView Combos;
    private ImageView Lanches;
    private ImageView Bebidas;
    private ImageView Pizzas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);







        Combos = findViewById(R.id.idCombos);
        Lanches = findViewById(R.id.idLanches);
        Bebidas = findViewById(R.id.idBebidas);
        Pizzas = findViewById(R.id.idPizzas);

        Combos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Combos.class));

            }
        });

        Lanches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Lanches.class));
            }
        });
        Bebidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Bebidas.class));
            }
        });



        Pizzas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Pizzas.class));
            }
        });
    }
}



