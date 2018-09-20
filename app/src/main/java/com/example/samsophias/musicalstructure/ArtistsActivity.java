package com.example.samsophias.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);


        Button nowIsPlayingTopMenuButton = (Button) findViewById(R.id.button_menu_now_is_playing);
        Button albumsTopMenuButton = (Button) findViewById(R.id.button_albums_top_menu);
        Button settingsTopMenuButton = (Button) findViewById(R.id.button_settings_top_menu);
        Button musicStoreTopMenuButton = (Button) findViewById(R.id.button_musicStore_top_menu);
        RecyclerView RecyclerViewArtists = (RecyclerView) findViewById(R.id.listViewArtist);

        nowIsPlayingTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent NowIsPlayingIntent = new Intent(ArtistsActivity.this,NowIsPlaying.class);
                startActivity(NowIsPlayingIntent);
            }
        });
        albumsTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AlbumsIntent = new Intent(ArtistsActivity.this,Albums.class);
                startActivity(AlbumsIntent);
            }
        });
        settingsTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SettingsIntent = new Intent(ArtistsActivity.this,Settings.class);
                startActivity(SettingsIntent);
            }
        });
        musicStoreTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MusicStoreIntent = new Intent(ArtistsActivity.this,MusicStore.class);
                startActivity(MusicStoreIntent);
            }
        });


        List<Artist> artistList = new ArrayList<>();


        for(int i=0; i<Song.artist.length; i++)
        {
            Artist artist1 = new Artist(Song.artist[i],Song.song[i]);
            artistList.add(artist1);
        }

        RecyclerView.LayoutManager l = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        RecyclerViewArtists.setLayoutManager(l);
        ArtistsAdapter artistsAdapter = new ArtistsAdapter(artistList);
        RecyclerViewArtists.setAdapter(artistsAdapter);
    }
}
