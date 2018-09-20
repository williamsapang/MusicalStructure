package com.example.samsophias.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MusicStore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_store);

        Button nowIsPlayingTopMenuButton = (Button) findViewById(R.id.button_menu_now_is_playing);
        Button albumsTopMenuButton = (Button) findViewById(R.id.button_albums_top_menu);
        Button artistsTopMenuButton = (Button) findViewById(R.id.button_artist_top_menu);
        Button settingsTopMenuButton = (Button) findViewById(R.id.button_settings_top_menu);

        nowIsPlayingTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent NowIsPlayingIntent = new Intent(MusicStore.this,NowIsPlaying.class);
                startActivity(NowIsPlayingIntent);
            }
        });
        albumsTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AlbumsIntent = new Intent(MusicStore.this,Albums.class);
                startActivity(AlbumsIntent);
            }
        });
        artistsTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ArtistIntent = new Intent(MusicStore.this,ArtistsActivity.class);
                startActivity(ArtistIntent);
            }
        });
        settingsTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SettingsIntent = new Intent(MusicStore.this,Settings.class);
                startActivity(SettingsIntent);
            }
        });
    }
}
