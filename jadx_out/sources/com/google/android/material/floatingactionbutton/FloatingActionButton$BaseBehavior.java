package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import w.a;
import w.d;

/* JADX INFO: loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends a {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // w.a
    public final boolean a(View view) {
        defpackage.a.l(view);
        throw null;
    }

    @Override // w.a
    public final void c(d dVar) {
        if (dVar.f4826h == 0) {
            dVar.f4826h = 80;
        }
    }

    @Override // w.a
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        defpackage.a.l(view);
        throw null;
    }

    @Override // w.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i4) {
        defpackage.a.l(view);
        throw null;
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n1.a.f3545g);
        typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
