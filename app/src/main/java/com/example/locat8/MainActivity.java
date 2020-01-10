package com.example.locat8;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        VideoView videoView;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Getting the view
        videoView = findViewById(R.id.video);
        Uri video = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video);
        videoView.setVideoURI(video);
        videoView.setZOrderOnTop(true);
        videoView.start();

        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Start_Activity();

            }
        });
    }

    public void Start_Activity() {
        startActivity(new Intent(this, Main2Activity.class));
        finish();
    }
}
