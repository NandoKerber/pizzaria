package com.example.apppizzaria;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;



public class Pizzas extends AppCompatActivity {

    SQLiteDatabase pizzaria;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizzas);
        pizzaria.execSQL("CREATE TABLE  tipopizza ( id INTEGER PRIMARY KEY, nome VARCHAR(30), preco VARCHAR(30))");
        pizzaria.execSQL("INSERT INTO tipopizza values (1, 'Marguerita','35,00')");
        pizzaria.execSQL("INSERT INTO tipopizza values (2, 'Strogonoff','55,00')");
        pizzaria.execSQL("INSERT INTO tipopizza values (3, 'Calabresa','25,00')");




    }
}
