package com.androidtechnical.snackgame;

import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;

public class MainActivity extends Activity {
    SnakeActivity snakeActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get the pixel dimensions of the screen
        Display display = getWindowManager().getDefaultDisplay();

        // Initialize the result into a Point object
        Point size = new Point();
        display.getSize(size);

        // Create a new instance of the SnakeEngine class
        snakeActivity = new SnakeActivity(this, size);

        // Make snakeEngine the view of the Activity
        setContentView(snakeActivity);
    }

    @Override
    protected void onResume() {
        super.onResume();
        snakeActivity.resume();

    }

    @Override
    protected void onPause() {
        super.onPause();

        snakeActivity.pause();

    }
}
