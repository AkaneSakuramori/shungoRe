package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c3.h;
import i0.v0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p1.d;
import w.a;

/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1337c;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
        }
    }

    @Override // w.a
    public final void b(View view) {
    }

    @Override // w.a
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        a aVar = ((w.d) view2.getLayoutParams()).f4819a;
        if (aVar instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) aVar).getClass();
            int i4 = this.f1337c;
            int iF0 = bottom - (i4 == 0 ? 0 : h.f0((int) (0.0f * i4), 0, i4));
            WeakHashMap weakHashMap = v0.f2983a;
            view.offsetTopAndBottom(iF0);
        }
        return false;
    }

    @Override // w.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6) {
        int i7 = view.getLayoutParams().height;
        if (i7 != -1 && i7 != -2) {
            return false;
        }
        s(coordinatorLayout.j(view));
        return false;
    }

    @Override // w.a
    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    @Override // p1.d
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i4) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i4);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        new Rect();
        new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n1.a.f3559u);
        this.f1337c = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
