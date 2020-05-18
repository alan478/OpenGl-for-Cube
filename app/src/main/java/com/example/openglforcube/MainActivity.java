package com.example.openglforcube;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private OPenGLsurfaceView gLsurfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gLsurfaceView=new OPenGLsurfaceView(this);
        setContentView(gLsurfaceView);
    }
}
