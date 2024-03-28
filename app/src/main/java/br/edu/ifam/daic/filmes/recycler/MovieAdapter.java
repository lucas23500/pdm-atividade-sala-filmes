package br.edu.ifam.daic.filmes.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.edu.ifam.daic.filmes.R;
import br.edu.ifam.daic.filmes.entity.Movie;

public class MovieAdapter extends RecyclerView.Adapter<MovieViewHolder> {

    public List<Movie> movieList;
    public MovieAdapter(List<Movie> movieList) {
        this.movieList = movieList;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movie, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        Movie movie = movieList.get(position);
        holder.getTextViewMovie().setText(movie.getTitulo() + " - " +
                Integer.toString(movie.getAno()));
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }
}
