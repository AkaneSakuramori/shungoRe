package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.shungo.app.R;
import j0.n;
import j0.o;

/* JADX INFO: loaded from: classes.dex */
public final class c extends i0.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f1620d;

    public c(ClockFaceView clockFaceView) {
        this.f1620d = clockFaceView;
    }

    @Override // i0.c
    public final void d(View view, o oVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f2895a;
        AccessibilityNodeInfo accessibilityNodeInfo = oVar.f3144a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f1620d.A.get(iIntValue - 1));
        }
        oVar.i(n.a(0, 1, iIntValue, 1, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        oVar.b(j0.i.f3131e);
    }

    @Override // i0.c
    public final boolean g(View view, int i4, Bundle bundle) {
        if (i4 != 16) {
            return super.g(view, i4, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f1620d;
        view.getHitRect(clockFaceView.f1600x);
        float fCenterX = clockFaceView.f1600x.centerX();
        float fCenterY = clockFaceView.f1600x.centerY();
        clockFaceView.f1599w.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockFaceView.f1599w.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }
}
