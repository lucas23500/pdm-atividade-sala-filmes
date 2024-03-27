package br.edu.ifam.daic.filmes;

import static java.lang.Integer.parseInt;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MovieDetailsActivity extends AppCompatActivity {

    private TextView textViewTitulo;
    private TextView textViewGenero;
    private TextView textViewSinopse;
    private TextView textViewAno;
    private TextView textViewDuracao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textViewTitulo = findViewById(R.id.titulo_filme);
        textViewGenero = findViewById(R.id.genero_filme);
        textViewDuracao = findViewById(R.id.duracao_filme);
        textViewSinopse = findViewById(R.id.sinopse_filme);
        textViewAno = findViewById(R.id.ano_filme);




    }


    public void sendMovieOnCLick(View view){

    }
}