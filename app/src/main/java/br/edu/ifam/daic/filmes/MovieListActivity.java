package br.edu.ifam.daic.filmes;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifam.daic.filmes.entity.Movie;
import br.edu.ifam.daic.filmes.recycler.MovieAdapter;

public class MovieListActivity extends AppCompatActivity {


    private RecyclerView recyclerView;

    private MovieAdapter movieAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_list);

        recyclerView = findViewById(R.id.recyclerViewMovieList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Movie> movieList = new ArrayList<>();
        //
        movieList.add(new Movie("Shrek", 1999));
        movieList.add(new Movie("Matrix", 2000));

        movieAdapter = new MovieAdapter(movieList);
        recyclerView.setAdapter(movieAdapter);
    }
}