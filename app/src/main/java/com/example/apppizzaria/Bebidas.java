package com.example.apppizzaria;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



    public class Bebidas extends AppCompatActivity {

        private TextView nome;
        private TextView tipo;
        SQLiteDatabase dbbebidas;


        @SuppressLint("WrongViewCast")
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_bebidas);

try {


            nome = (TextView) findViewById(R.id.IDbebida);
            tipo = (TextView) findViewById(R.id.IDtipo);


            dbbebidas = openOrCreateDatabase("bebidas", MODE_PRIVATE, null);
            dbbebidas.execSQL("CREATE TABLE IF NOT EXISTS bebida(nome VARCHAR(30), tipo VARCHAR(30))");
            dbbebidas.execSQL("INSERT INTO bebida(nome, tipo) VALUES ('Coca-cola', 'refrigerante')");

            Cursor ponteiro = dbbebidas.rawQuery("SELECT * FROM bebida", null);
            int indicenome = ponteiro.getColumnIndex("nome");
            int indicetipo = ponteiro.getColumnIndex("tipo");

            ponteiro.moveToFirst();

            while (ponteiro != null) {
                String nomes = ponteiro.getString(indicenome);
                String tipos = ponteiro.getString(indicetipo);
                nome.setText(""+nomes);
                tipo.setText(""+tipos);
                ponteiro.moveToNext();
            }

}catch (Exception a){

    a.printStackTrace();

}
        }
    }
