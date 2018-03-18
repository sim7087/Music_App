package com.musicapp071997.music;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

//import static com.musicapp071997.music.R.id.genre;

public class playlistActivity extends AppCompatActivity {
    TextView song, artist, payment, album;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        song = (TextView) findViewById(R.id.song);
        artist = (TextView) findViewById(R.id.artist);
        album = (TextView) findViewById(R.id.album);
        payment = (TextView) findViewById(R.id.payment);

        song.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent playist = new Intent(playlistActivity.this, songActivity.class);
                startActivity(playist);
            }
        });

        artist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent artist = new Intent(playlistActivity.this, artistActivity.class);
                startActivity(artist);
            }
        });


        payment.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent payments = new Intent(playlistActivity.this, paymentActivity.class);
                startActivity(payments);
            }
        });
        album.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent albums = new Intent(playlistActivity.this, albumActivity.class);
                startActivity(albums);
            }
        });
    }
}
