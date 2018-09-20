package com.example.samsophias.musicalstructure;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Library extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        LinearLayout now_is_playing = (LinearLayout) findViewById(R.id.nowIsPlaying);
        LinearLayout albums = (LinearLayout) findViewById(R.id.albums);
        LinearLayout artists = (LinearLayout) findViewById(R.id.artists);
        LinearLayout music_store = (LinearLayout) findViewById(R.id.musicStore);
        LinearLayout settings = (LinearLayout) findViewById(R.id.settings);

        now_is_playing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowIsPlayingIntent = new Intent(Library.this, NowIsPlaying.class);
                startActivity(nowIsPlayingIntent);
            }
        });

        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumsIntent = new Intent(Library.this,Albums.class);
                startActivity(albumsIntent);
            }
        });
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistsIntent = new Intent(Library.this,ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });
        music_store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent musicStoreIntent = new Intent(Library.this,MusicStore.class);
                startActivity(musicStoreIntent);
            }
        });
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settingsIntent = new Intent(Library.this,Settings.class);
                startActivity(settingsIntent);
            }
        });



    }
}
