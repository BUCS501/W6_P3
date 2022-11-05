package com.example.sse.customlistview_sse;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_player);
        videoView = (VideoView) findViewById(R.id.videoView);

        MediaController mediaController = new MediaController(this);
        String newVideoPath = "android.resource://" + getPackageName() + "/" + R.raw.khan;

        videoView.setVideoURI(Uri.parse(newVideoPath));
        videoView.start();


    }
}
