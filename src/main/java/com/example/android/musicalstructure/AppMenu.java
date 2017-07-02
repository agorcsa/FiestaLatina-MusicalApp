package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AppMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_menu);
        Button playList = (Button) findViewById(R.id.playlistMenu);
        Button nowPlaying = (Button) findViewById(R.id.nowPlayingMenu);
        Button songDetails = (Button) findViewById(R.id.songDetailsMenu);
        Button buyMusic = (Button) findViewById(R.id.buyMusicMenu);
        playList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AppMenu.this, Playlist.class);
                startActivity(intent);
            }
        });
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AppMenu.this, NowPlaying.class);
                startActivity(intent);
            }
        });
        songDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AppMenu.this, SongDetails.class);
                startActivity(intent);
            }
        });
        buyMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AppMenu.this, BuyMusicOnline.class);
                startActivity(intent);
            }
        });
    }
}
