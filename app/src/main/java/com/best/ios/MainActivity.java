package com.best.ios;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;

public class MainActivity extends IOSActivity {

    public final String TAG = getClass().getSimpleName();

    TextView text;

    @Override
    void loadViews(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.text1);

    }




    @Override
    void viewDidLoad() {

    }

    @Override
    void viewWillAppear() {

    }

    @Override
    void viewDidAppear() {

        ObjectAnimator rotationAnimator = ObjectAnimator.ofFloat(text, "y", 0f, 500);
        rotationAnimator.setDuration(2000);
        rotationAnimator.setInterpolator(new LinearInterpolator());
        rotationAnimator.start();


    }

    @Override
    void viewWillDisappear() {

    }

    @Override
    void viewDidDisappear() {

    }



}
