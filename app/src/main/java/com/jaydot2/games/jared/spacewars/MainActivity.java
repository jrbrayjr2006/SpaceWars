package com.jaydot2.games.jared.spacewars;

import android.animation.ObjectAnimator;
import android.media.Image;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private Button leftBtn;
    private Button rightBtn;
    private ImageView spaceship;

    private static final long SHORT_ANNIMATION_DURATION = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        leftBtn = (Button)findViewById(R.id.leftButton);
        rightBtn = (Button)findViewById(R.id.rightButton);
        spaceship = (ImageView)findViewById(R.id.spaceship);

        leftBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startLeftAnimation();
                sendMessageToScreen("Move spaceship left!");
            }
        });

        rightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startRightAnimation();
                sendMessageToScreen("Move spaceship right!");
            }
        });
    }

    protected void sendMessageToScreen(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private View.OnClickListener onClickListenerMoveLeft() {

        return new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.d("Jared debug message", "clicked left button");
                //TODO add code to move spaceship

                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams)spaceship.getLayoutParams();
                ConstraintSet constraintSet1 = new ConstraintSet();
                ConstraintSet constraintSet2 = new ConstraintSet();

//                //TransitionManager.beginDelayedTransition();
//                int top = spaceship.getTop();
//                int left = spaceship.getLeft();
//                int spaceshipHeight = spaceship.getHeight();
//
//                int x = layoutParams.leftMargin;
//                int y = layoutParams.topMargin;
//
//                int x1 = layoutParams.getMarginEnd();
//                int y1 = layoutParams.editorAbsoluteY;
//
//                sendMessageToScreen("Move spaceship left! " + top + " and from top is " + left);
//                spaceship.setLeft(left + 10);
//                spaceship.setLayoutParams(layoutParams);
            }
        };

    }

    protected void startLeftAnimation() {
        Log.d(TAG, "start left animation...");
//        int top = spaceship.getTop();
//        int left, startSpaceshipPosition = spaceship.getLeft();
//        int h, stopSpaceshipPosition = spaceship.getWidth();
//
//        ObjectAnimator objectAnimator = ObjectAnimator.ofInt(spaceship, "left", startSpaceshipPosition, stopSpaceshipPosition).setDuration(2000);
//        objectAnimator.start();
        float fromX = spaceship.getX();
        float toX = spaceship.getX() - 100;
        float fromY = spaceship.getY();
        float toY = spaceship.getY();
        Animation rocketLeftAnimation = new TranslateAnimation(fromX, toX, fromY, toY);
        rocketLeftAnimation.setFillAfter(false);
        rocketLeftAnimation.setDuration(SHORT_ANNIMATION_DURATION);
        spaceship.startAnimation(rocketLeftAnimation);
    }

    protected void startRightAnimation() {
        Log.d(TAG, "start right animation...");
//        int right, startSpaceshipPosition = spaceship.getRight();
//        int w, stopSpaceshipPosition = spaceship.getWidth();
//
//        ObjectAnimator objectAnimator = ObjectAnimator.ofInt(spaceship, "right", startSpaceshipPosition, stopSpaceshipPosition).setDuration(2000);
//        objectAnimator.start();
        float fromX = spaceship.getX();
        float toX = spaceship.getX() + 100;
        float fromY = spaceship.getY();
        float toY = spaceship.getY();
        Animation rocketLeftAnimation = new TranslateAnimation(fromX, toX, fromY, toY);
        rocketLeftAnimation.setFillAfter(false);
        rocketLeftAnimation.setDuration(SHORT_ANNIMATION_DURATION);
        spaceship.startAnimation(rocketLeftAnimation);
    }
}
