package com.musicapp071997.music;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class albumActivity extends AppCompatActivity {
    TextView play, artist, payment, song;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        play = (TextView) findViewById(R.id.play);
        artist = (TextView) findViewById(R.id.artist);
        song = (TextView) findViewById(R.id.song);
        payment = (TextView) findViewById(R.id.payment);

        play.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent playist = new Intent(albumActivity.this, playlistActivity.class);
                startActivity(playist);
            }
        });

        artist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent artist = new Intent(albumActivity.this, artistActivity.class);
                startActivity(artist);
            }
        });


        song.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent song = new Intent(albumActivity.this, songActivity.class);
                startActivity(song);
            }
        });

        payment.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent payments = new Intent(albumActivity.this, paymentActivity.class);
                startActivity(payments);
            }
        });

    }


}
