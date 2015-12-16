package com.ajayabhatt.portfolioapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);

        Button spotifyButton = (Button) findViewById(R.id.spotify_button);
        Button scoresButton = (Button) findViewById(R.id.scores_button);
        Button libraryButton = (Button) findViewById(R.id.library_button);
        Button buildButton = (Button) findViewById(R.id.build_button);
        Button xyzReaderButton = (Button) findViewById(R.id.xyz_button);
        Button capstoneButton = (Button) findViewById(R.id.capstone_button);

        spotifyButton.setOnClickListener(this);
        scoresButton.setOnClickListener(this);
        libraryButton.setOnClickListener(this);
        buildButton.setOnClickListener(this);
        xyzReaderButton.setOnClickListener(this);
        capstoneButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.spotify_button:
                showToast("This button will launch spotify streamer project");
                break;
            case R.id.scores_button:
                showToast("This button will launch scores app project");
                break;
            case R.id.library_button:
                showToast("This button will launch library app project");
                break;
            case R.id.build_button:
                showToast("This button will launch build it bigger project");
                break;
            case R.id.xyz_button:
                showToast("This button will launch XYZ reader project");
                break;
            case R.id.capstone_button:
                showToast("This button will launch Capstone project");
                break;
        }
    }


    private void showToast(String message) {
        if(message!=null) {
            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
        }
    }
}
