package com.best.ios;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

public abstract class IOSActivity extends AppCompatActivity {

    public final String TAG = getClass().getSimpleName();

    abstract void viewDidLoad();
    abstract void viewWillAppear();
    abstract void viewDidAppear();
    abstract void viewWillDisappear();
    abstract void viewDidDisappear();
    abstract void loadViews(Bundle savedInstanceState);


    ViewGroup view;
    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        view = (ViewGroup)findViewById(android.R.id.content);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "onCreate: " + System.currentTimeMillis());

        loadViews(savedInstanceState);

        view.addView(new Dreidel(this));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart: " + System.currentTimeMillis());

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume: " + System.currentTimeMillis());

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        Log.e(TAG, hasFocus + " - onWindowFocusChanged: " + System.currentTimeMillis());

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause: " + System.currentTimeMillis());

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop: " + System.currentTimeMillis());

    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.e(TAG, "onDetachedFromWindow: " + System.currentTimeMillis());

    }

    public class Dreidel extends View {
        public final String TAG = getClass().getSimpleName();

        public Dreidel(Context context) {
            super(context);
            init(null, 0);
        }

        public Dreidel(Context context, AttributeSet attrs) {
            super(context, attrs);
            init(attrs, 0);
        }

        public Dreidel(Context context, AttributeSet attrs, int defStyle) {
            super(context, attrs, defStyle);
            init(attrs, defStyle);
        }

        private void init(AttributeSet attrs, int defStyle) {
            Log.e(TAG, "init: " + System.currentTimeMillis());
        }

        @Override
        protected void onSizeChanged(int w, int h, int oldw, int oldh) {
            super.onSizeChanged(w, h, oldw, oldh);
            Log.e(TAG, "onSizeChanged: " + System.currentTimeMillis());

        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Log.e(TAG, "onDraw: " + System.currentTimeMillis());
            viewDidAppear();
        }
    }
}