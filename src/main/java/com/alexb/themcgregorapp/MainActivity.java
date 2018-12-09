package com.alexb.themcgregorapp;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        public void buttonTapped(View view) {

            try {
                int id = view.getId();
                String ourId = "";
                ourId = view.getResources().getResourceEntryName(id);
                int resourceId = getResources().getIdentifier(ourId, "raw", "com.alexb.themcgregorapp");

                MediaPlayer mplayer = MediaPlayer.create(this, resourceId);
                mplayer.start();

            } catch (Exception e) {
                Toast.makeText(getApplicationContext(), "There is no song for this button", Toast.LENGTH_LONG).show();
            }

        }
    }