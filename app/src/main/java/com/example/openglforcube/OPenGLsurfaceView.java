package com.example.openglforcube;

import android.content.Context;
import android.opengl.GLSurfaceView;

public class OPenGLsurfaceView extends GLSurfaceView {
    private OpenGLRendER rendER;

    public OPenGLsurfaceView(Context context) {
        super(context);
        setEGLContextClientVersion(2);
        rendER=new OpenGLRendER(context);
        setRenderer(rendER);
        //setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);

    }
}
