package com.otaliastudios.cameraview.demo;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class CustomProgressBar extends ProgressBar {

    private OnDrawEventListener listener;

    public CustomProgressBar(Context context) {
        super(context);
    }

    public CustomProgressBar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomProgressBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if (listener != null) {
            listener.onDrawEvent();
        }
    }

    public void setListener(OnDrawEventListener listener) {
        this.listener = listener;
    }

    interface OnDrawEventListener {
        void onDrawEvent();
    }
}
