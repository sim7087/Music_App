package com.musicapp071997.music;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class artistActivity extends AppCompatActivity {
    TextView song, play, payment, album;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        song = (TextView) findViewById(R.id.song);
        play = (TextView) findViewById(R.id.play);
        album = (TextView) findViewById(R.id.album);
        payment = (TextView) findViewById(R.id.payment);

        song.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent playist = new Intent(artistActivity.this, songActivity.class);
                startActivity(playist);
            }
        });

        play.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent artist = new Intent(artistActivity.this, playlistActivity.class);
                startActivity(artist);
            }
        });


        payment.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent payments = new Intent(artistActivity.this, paymentActivity.class);
                startActivity(payments);
            }
        });
        album.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent albums = new Intent(artistActivity.this, albumActivity.class);
                startActivity(albums);
            }
        });
    }
}
