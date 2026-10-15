package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f1619b;

    public b(ClockFaceView clockFaceView) {
        this.f1619b = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f1619b;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f1599w.f1606e) - clockFaceView.E;
        if (height != clockFaceView.f1623u) {
            clockFaceView.f1623u = height;
            clockFaceView.n();
            int i4 = clockFaceView.f1623u;
            ClockHandView clockHandView = clockFaceView.f1599w;
            clockHandView.f1614m = i4;
            clockHandView.invalidate();
        }
        return true;
    }
}
