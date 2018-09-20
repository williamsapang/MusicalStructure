package com.example.samsophias.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class NowIsPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_is_playing);


        ImageButton playButton = (ImageButton) findViewById(R.id.playsong_button);
        ImageButton previousSongButton = (ImageButton) findViewById(R.id.previous_button);
        ImageButton nextSongButton = (ImageButton) findViewById(R.id.next_button);

        Button settingsTopMenuButton = (Button) findViewById(R.id.button_settings_top_menu);
        Button albumsTopMenuButton = (Button) findViewById(R.id.button_albums_top_menu);
        Button artistsTopMenuButton = (Button) findViewById(R.id.button_artist_top_menu);
        Button musicStoreTopMenuButton = (Button) findViewById(R.id.button_musicStore_top_menu);


        settingsTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SettingsIntent = new Intent(NowIsPlaying.this,Settings.class);
                startActivity(SettingsIntent);
            }
        });
        albumsTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AlbumsIntent = new Intent(NowIsPlaying.this,Albums.class);
                startActivity(AlbumsIntent);
            }
        });
        artistsTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ArtistIntent = new Intent(NowIsPlaying.this,ArtistsActivity.class);
                startActivity(ArtistIntent);
            }
        });
        musicStoreTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MusicStoreIntent = new Intent(NowIsPlaying.this,MusicStore.class);
                startActivity(MusicStoreIntent);
            }
        });
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Song is Playing", Toast.LENGTH_SHORT).show();
            }
        });
        previousSongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Switched to previous song", Toast.LENGTH_SHORT).show();
            }
        });
        nextSongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Switced to next song", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
