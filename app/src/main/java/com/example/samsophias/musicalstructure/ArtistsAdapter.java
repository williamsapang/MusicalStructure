package com.example.samsophias.musicalstructure;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ArtistsAdapter extends RecyclerView.Adapter<ArtistsAdapter.myviewHolder> {

    private List<Artist> artistList;

    public ArtistsAdapter(List<Artist> artistList) {
        this.artistList = artistList;
    }

    @NonNull
    @Override
    public myviewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = (View) LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.artist_item, viewGroup, false);
        return new myviewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewHolder myviewHolder, int i) {
        String name = artistList.get(i).getName();
        String songTitle = artistList.get(i).getSong();
        myviewHolder.artisNametxt.setText(name);
        myviewHolder.songtxt.setText(songTitle);
    }

    @Override
    public int getItemCount() {
        return artistList.size();
    }

    public class myviewHolder extends RecyclerView.ViewHolder {
        private TextView artisNametxt;
        private TextView songtxt;
        public myviewHolder(@NonNull View itemView) {

            super(itemView);
            artisNametxt = itemView.findViewById(R.id.artist_name);
            songtxt = itemView.findViewById(R.id.song);
        }
    }
}
