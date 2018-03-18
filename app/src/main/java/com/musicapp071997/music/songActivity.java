package com.musicapp071997.music;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class songActivity extends AppCompatActivity {
    TextView play, artist, payment, album;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        play = (TextView) findViewById(R.id.play);
        artist = (TextView) findViewById(R.id.artist);
        album = (TextView) findViewById(R.id.album);
        payment = (TextView) findViewById(R.id.payment);

        play.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent playist = new Intent(songActivity.this, playlistActivity.class);
                startActivity(playist);
            }
        });

        artist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent artist = new Intent(songActivity.this, artistActivity.class);
                startActivity(artist);
            }
        });


        payment.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent payments = new Intent(songActivity.this, paymentActivity.class);
                startActivity(payments);
            }
        });
        album.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent albums = new Intent(songActivity.this, albumActivity.class);
                startActivity(albums);
            }
        });

    }
}
