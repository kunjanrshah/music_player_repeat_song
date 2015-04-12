package com.drc.music;

import android.app.Activity;
import android.os.Bundle;

import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;

public class Test extends Activity implements OnCompletionListener {

  MediaPlayer mediaPlayer;

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
  }

  public void onCompletion(MediaPlayer mp) {
    mediaPlayer.start();
  }

  public void onStart() {
    super.onStart();
    mediaPlayer = MediaPlayer.create(this, R.raw.hosanna);//raw/s.mp3
    mediaPlayer.setOnCompletionListener(this);
    mediaPlayer.start();
  }

  public void onStop() {
    super.onStop();
    // Log.v("CustomAudioPlayer","onStop Called");
    mediaPlayer.stop();
    mediaPlayer.release();
  }

}
/*
import java.io.IOException;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;

public class Test extends Activity {

  MediaPlayer mediaPlayer;

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
    mediaPlayer = new MediaPlayer();

    try {
      mediaPlayer.setDataSource("http://192.168.0.129/android_project/TeAmo.mp3");
      mediaPlayer.prepare();
      mediaPlayer.start();
    } catch (IOException e) {
      Log.v("AUDIOHTTPPLAYER", e.getMessage());
    }
  }
}*/