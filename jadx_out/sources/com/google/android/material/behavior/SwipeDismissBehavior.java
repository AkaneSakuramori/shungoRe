package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import e.n0;
import i0.e0;
import i0.v0;
import j0.i;
import java.util.WeakHashMap;
import p0.e;
import w.a;

/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f1347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1350d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1351e = 0.5f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f1352f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f1353g = 0.5f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q1.a f1354h = new q1.a(this);

    @Override // w.a
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zO = this.f1348b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zO = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f1348b = zO;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1348b = false;
        }
        if (!zO) {
            return false;
        }
        if (this.f1347a == null) {
            this.f1347a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f1354h);
        }
        return !this.f1349c && this.f1347a.p(motionEvent);
    }

    @Override // w.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i4) {
        WeakHashMap weakHashMap = v0.f2983a;
        if (e0.c(view) == 0) {
            e0.s(view, 1);
            v0.i(view, 1048576);
            v0.g(view, 0);
            if (r(view)) {
                v0.j(view, i.f3136j, new n0(25, this));
            }
        }
        return false;
    }

    @Override // w.a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f1347a == null) {
            return false;
        }
        if (this.f1349c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f1347a.j(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
