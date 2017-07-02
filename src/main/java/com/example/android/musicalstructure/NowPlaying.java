package com.example.android.musicalstructure;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NowPlaying extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);
        mediaPlayer = MediaPlayer.create(this, R.raw.no_me_sueltes);
        Button playButton = (Button) findViewById(R.id.playButton);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start(); {
                    Toast.makeText(NowPlaying.this, "Daniel Santacruz - No me sueltes", Toast.LENGTH_LONG).show();
                };
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Toast.makeText(NowPlaying.this, "Thanks for listening", Toast.LENGTH_SHORT).show();
                    }
                });
            }

        });
        Button pauseButton = (Button) findViewById(R.id.pauseButton);
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();
            }
        });
        Button playList = (Button) findViewById(R.id.playListButton);
        playList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(NowPlaying.this, Playlist.class);
                    startActivity(intent);
                }
        });
        Button songDetails = (Button) findViewById(R.id.songDetailsButton);
        songDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NowPlaying.this, SongDetails.class);
                startActivity(intent);
            }
        });
    }
}



