package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c3.h;
import com.shungo.app.R;
import i.d;
import java.util.Iterator;
import java.util.LinkedHashSet;
import w.a;

/* JADX INFO: loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TimeInterpolator f1342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TimeInterpolator f1343e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ViewPropertyAnimator f1346h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f1339a = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1344f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1345g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // w.a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i4) {
        this.f1344f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f1340b = h.k2(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f1341c = h.k2(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f1342d = h.l2(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, o1.a.f3598d);
        this.f1343e = h.l2(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, o1.a.f3597c);
        return false;
    }

    @Override // w.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6, int[] iArr) {
        int i7 = 3;
        LinkedHashSet linkedHashSet = this.f1339a;
        if (i4 > 0) {
            if (this.f1345g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f1346h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f1345g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                defpackage.a.n(it.next());
                throw null;
            }
            this.f1346h = view.animate().translationY(this.f1344f).setInterpolator(this.f1343e).setDuration(this.f1341c).setListener(new d(i7, this));
            return;
        }
        if (i4 >= 0 || this.f1345g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f1346h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f1345g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            defpackage.a.n(it2.next());
            throw null;
        }
        this.f1346h = view.animate().translationY(0).setInterpolator(this.f1342d).setDuration(this.f1340b).setListener(new d(i7, this));
    }

    @Override // w.a
    public boolean o(View view, int i4, int i5) {
        return i4 == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
