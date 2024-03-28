package br.edu.ifam.daic.filmes.recycler;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import br.edu.ifam.daic.filmes.R;

public class MovieViewHolder extends RecyclerView.ViewHolder {


    private TextView textViewMovie;

    public MovieViewHolder(@NonNull View itemView) {
        super(itemView);
        textViewMovie = itemView.findViewById(R.id.textViewMovie);
    }

    public TextView getTextViewMovie(){
        return textViewMovie;
    }
}
