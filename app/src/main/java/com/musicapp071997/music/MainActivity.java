package com.musicapp071997.music;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView play = (TextView) findViewById(R.id.play);
        TextView artist = (TextView) findViewById(R.id.artist);
        TextView album = (TextView) findViewById(R.id.album);
        TextView song = (TextView) findViewById(R.id.song);
        TextView payment = (TextView) findViewById(R.id.payment);

        play.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent playist = new Intent(MainActivity.this, playlistActivity.class);
                startActivity(playist);
            }
        });

        artist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent artist = new Intent(MainActivity.this, artistActivity.class);
                startActivity(artist);
            }
        });

        album.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent albu = new Intent(MainActivity.this, albumActivity.class);
                startActivity(albu);
            }
        });

        song.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent song = new Intent(MainActivity.this, songActivity.class);
                startActivity(song);
            }
        });

        payment.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent payments = new Intent(MainActivity.this, paymentActivity.class);
                startActivity(payments);
            }
        });

    }

}
