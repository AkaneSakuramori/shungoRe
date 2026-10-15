package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.a;
import com.google.android.material.behavior.SwipeDismissBehavior;
import g.h;
import h2.c;

/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f1540i;

    public BaseTransientBottomBar$Behavior() {
        a aVar = new a();
        this.f1352f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f1353g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f1350d = 0;
        this.f1540i = aVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, w.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        a aVar = this.f1540i;
        aVar.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (h.f2222f == null) {
                    h.f2222f = new h(7);
                }
                h hVar = h.f2222f;
                defpackage.a.n(aVar.f1137a);
                synchronized (hVar.f2224c) {
                    defpackage.a.n(hVar.f2225d);
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (h.f2222f == null) {
                h.f2222f = new h(7);
            }
            h hVar2 = h.f2222f;
            defpackage.a.n(aVar.f1137a);
            synchronized (hVar2.f2224c) {
                defpackage.a.n(hVar2.f2225d);
            }
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean r(View view) {
        this.f1540i.getClass();
        return view instanceof c;
    }
}
