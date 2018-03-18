package com.musicapp071997.music;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class paymentActivity extends AppCompatActivity {
    TextView song, play, artist, album;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        song = (TextView) findViewById(R.id.song);
        play = (TextView) findViewById(R.id.play);
        album = (TextView) findViewById(R.id.album);
        artist = (TextView) findViewById(R.id.artist);

        song.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playist = new Intent(paymentActivity.this, songActivity.class);
                startActivity(playist);
            }
        });

        play.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent artist = new Intent(paymentActivity.this, playlistActivity.class);
                startActivity(artist);
            }
        });


        artist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent genres = new Intent(paymentActivity.this, artistActivity.class);
                startActivity(genres);
            }
        });
        album.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent genres = new Intent(paymentActivity.this, albumActivity.class);
                startActivity(genres);
            }
        });
    }
}
