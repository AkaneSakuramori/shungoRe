package q1;

import android.view.View;
import android.view.ViewParent;
import c3.h;
import com.google.android.material.behavior.SwipeDismissBehavior;
import i0.e0;
import i0.f0;
import i0.v0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a extends h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3880j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3881k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f3882l;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f3882l = swipeDismissBehavior;
    }

    @Override // c3.h
    public final boolean H2(View view, int i4) {
        int i5 = this.f3881k;
        return (i5 == -1 || i5 == i4) && this.f3882l.r(view);
    }

    @Override // c3.h
    public final void M1(View view, int i4) {
        this.f3881k = i4;
        this.f3880j = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f3882l;
            swipeDismissBehavior.f1349c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f1349c = false;
        }
    }

    @Override // c3.h
    public final void N1(int i4) {
        this.f3882l.getClass();
    }

    @Override // c3.h
    public final void O1(View view, int i4, int i5) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f3882l;
        float f5 = width * swipeDismissBehavior.f1352f;
        float width2 = view.getWidth() * swipeDismissBehavior.f1353g;
        float fAbs = Math.abs(i4 - this.f3880j);
        if (fAbs <= f5) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f5) / (width2 - f5))), 1.0f));
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    @Override // c3.h
    public final void P1(View view, float f5, float f6) {
        int i4;
        int left;
        int i5;
        this.f3881k = -1;
        int width = view.getWidth();
        boolean z4 = true;
        SwipeDismissBehavior swipeDismissBehavior = this.f3882l;
        if (f5 != 0.0f) {
            WeakHashMap weakHashMap = v0.f2983a;
            boolean z5 = f0.d(view) == 1;
            int i6 = swipeDismissBehavior.f1350d;
            if (i6 != 2 && (i6 != 0 ? i6 != 1 || (!z5 ? f5 < 0.0f : f5 > 0.0f) : !z5 ? f5 > 0.0f : f5 < 0.0f)) {
                i4 = this.f3880j;
                z4 = false;
            } else if (f5 >= 0.0f) {
                left = view.getLeft();
                i5 = this.f3880j;
                if (left < i5) {
                    i4 = this.f3880j - width;
                } else {
                    i4 = i5 + width;
                }
            } else {
                i4 = this.f3880j - width;
            }
        } else {
            if (Math.abs(view.getLeft() - this.f3880j) < Math.round(view.getWidth() * swipeDismissBehavior.f1351e)) {
                i4 = this.f3880j;
                z4 = false;
            } else if (f5 >= 0.0f) {
                left = view.getLeft();
                i5 = this.f3880j;
                if (left < i5) {
                    i4 = this.f3880j - width;
                } else {
                    i4 = i5 + width;
                }
            } else {
                i4 = this.f3880j - width;
            }
        }
        if (swipeDismissBehavior.f1347a.o(i4, view.getTop())) {
            b bVar = new b(swipeDismissBehavior, view, z4);
            WeakHashMap weakHashMap2 = v0.f2983a;
            e0.m(view, bVar);
        }
    }

    @Override // c3.h
    public final int e1(View view) {
        return view.getWidth();
    }

    @Override // c3.h
    public final int g0(View view, int i4) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = v0.f2983a;
        boolean z4 = f0.d(view) == 1;
        int i5 = this.f3882l.f1350d;
        if (i5 == 0) {
            if (z4) {
                width = this.f3880j - view.getWidth();
                width2 = this.f3880j;
            } else {
                width = this.f3880j;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i5 != 1) {
            width = this.f3880j - view.getWidth();
            width2 = view.getWidth() + this.f3880j;
        } else if (z4) {
            width = this.f3880j;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f3880j - view.getWidth();
            width2 = this.f3880j;
        }
        return Math.min(Math.max(width, i4), width2);
    }

    @Override // c3.h
    public final int h0(View view, int i4) {
        return view.getTop();
    }
}
