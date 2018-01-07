package com.jaydot2.games.jared.spacewars;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button leftBtn;
    private Button rightBtn;
    private Image spaceship;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        leftBtn = (Button)findViewById(R.id.leftButton);
        rightBtn = (Button)findViewById(R.id.rightButton);


        leftBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Jared debug message", "clicked left button");
                //TODO add code to move spaceship
                sendMessageToScreen("Move spaceship left!");
            }
        });

        rightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Jared debug message", "clicked right button");
                //TODO add code to move spaceship
                sendMessageToScreen("Move spaceship right!");
            }
        });
    }

    protected void sendMessageToScreen(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
