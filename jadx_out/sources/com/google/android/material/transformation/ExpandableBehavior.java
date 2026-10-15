package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import i0.h0;
import i0.v0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import w.a;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableBehavior extends a {
    public ExpandableBehavior() {
    }

    @Override // w.a
    public abstract void b(View view);

    @Override // w.a
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        defpackage.a.n(view2);
        throw null;
    }

    @Override // w.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i4) {
        WeakHashMap weakHashMap = v0.f2983a;
        if (!h0.c(view)) {
            ArrayList arrayListJ = coordinatorLayout.j(view);
            int size = arrayListJ.size();
            for (int i5 = 0; i5 < size; i5++) {
                b(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
