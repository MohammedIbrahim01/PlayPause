package com.example.android.playpause;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView playPauseImageView;
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMediaPlayer = MediaPlayer.create(this, R.raw.audio);

        playPauseImageView = (ImageView) findViewById(R.id.play_pause_imageview);
        playPauseImageView.setImageResource(R.drawable.ic_play);

        playPauseImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!mMediaPlayer.isPlaying()){
                    play();
                    playPauseImageView.setImageResource(R.drawable.ic_pause);
                }
                else {
                    pause();
                    playPauseImageView.setImageResource(R.drawable.ic_play);
                }
            }
        });

    }


    private void play(){
        mMediaPlayer.start();
    }

    private void pause(){
        mMediaPlayer.pause();
    }

}
