package com.example.samsophias.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Albums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        Button nowIsPlayingTopMenuButton = (Button) findViewById(R.id.button_menu_now_is_playing);
        Button settingsTopMenuButton = (Button) findViewById(R.id.button_settings_top_menu);
        Button artistsTopMenuButton = (Button) findViewById(R.id.button_artist_top_menu);
        Button musicStoreMenuButton = (Button) findViewById(R.id.button_musicStore_top_menu);

        nowIsPlayingTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent NowIsPlayingIntent = new Intent(Albums.this,NowIsPlaying.class);
                startActivity(NowIsPlayingIntent);
            }
        });
        settingsTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SettingsIntent = new Intent(Albums.this,Settings.class);
                startActivity(SettingsIntent);
            }
        });
        artistsTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ArtistIntent = new Intent(Albums.this,ArtistsActivity.class);
                startActivity(ArtistIntent);
            }
        });
        musicStoreMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MusicStoreIntent = new Intent(Albums.this,MusicStore.class);
                startActivity(MusicStoreIntent);
            }
        });
    }
}
