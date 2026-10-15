package r1;

import android.view.View;
import c3.h;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class b extends h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f4054j;

    public b(BottomSheetBehavior bottomSheetBehavior) {
        this.f4054j = bottomSheetBehavior;
    }

    @Override // c3.h
    public final boolean H2(View view, int i4) {
        BottomSheetBehavior bottomSheetBehavior = this.f4054j;
        int i5 = bottomSheetBehavior.L;
        if (i5 == 1 || bottomSheetBehavior.f1356a0) {
            return false;
        }
        if (i5 == 3 && bottomSheetBehavior.Y == i4) {
            WeakReference weakReference = bottomSheetBehavior.V;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        System.currentTimeMillis();
        WeakReference weakReference2 = bottomSheetBehavior.U;
        return weakReference2 != null && weakReference2.get() == view;
    }

    @Override // c3.h
    public final void N1(int i4) {
        if (i4 == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.f4054j;
            if (bottomSheetBehavior.K) {
                bottomSheetBehavior.C(1);
            }
        }
    }

    @Override // c3.h
    public final void O1(View view, int i4, int i5) {
        this.f4054j.u(i5);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0049  */
    /* JADX WARN: Code duplicated, block: B:34:0x0082  */
    /* JADX WARN: Code duplicated, block: B:6:0x000d  */
    @Override // c3.h
    public final void P1(View view, float f5, float f6) {
        int i4 = 6;
        BottomSheetBehavior bottomSheetBehavior = this.f4054j;
        if (f6 < 0.0f) {
            if (bottomSheetBehavior.f1357b) {
                i4 = 3;
            } else {
                int top = view.getTop();
                System.currentTimeMillis();
                if (top <= bottomSheetBehavior.E) {
                    i4 = 3;
                }
            }
        } else if (bottomSheetBehavior.I && bottomSheetBehavior.D(view, f6)) {
            if (Math.abs(f5) >= Math.abs(f6) || f6 <= bottomSheetBehavior.f1361d) {
                if (view.getTop() > (bottomSheetBehavior.x() + bottomSheetBehavior.T) / 2) {
                    i4 = 5;
                } else if (bottomSheetBehavior.f1357b || Math.abs(view.getTop() - bottomSheetBehavior.x()) < Math.abs(view.getTop() - bottomSheetBehavior.E)) {
                    i4 = 3;
                }
            } else {
                i4 = 5;
            }
        } else if (f6 == 0.0f || Math.abs(f5) > Math.abs(f6)) {
            int top2 = view.getTop();
            if (!bottomSheetBehavior.f1357b) {
                int i5 = bottomSheetBehavior.E;
                if (top2 < i5) {
                    if (top2 < Math.abs(top2 - bottomSheetBehavior.G)) {
                        i4 = 3;
                    }
                } else if (Math.abs(top2 - i5) >= Math.abs(top2 - bottomSheetBehavior.G)) {
                    i4 = 4;
                }
            } else if (Math.abs(top2 - bottomSheetBehavior.D) < Math.abs(top2 - bottomSheetBehavior.G)) {
                i4 = 3;
            } else {
                i4 = 4;
            }
        } else if (bottomSheetBehavior.f1357b) {
            i4 = 4;
        } else {
            int top3 = view.getTop();
            if (Math.abs(top3 - bottomSheetBehavior.E) >= Math.abs(top3 - bottomSheetBehavior.G)) {
                i4 = 4;
            }
        }
        bottomSheetBehavior.getClass();
        bottomSheetBehavior.E(view, i4, true);
    }

    @Override // c3.h
    public final int f1() {
        BottomSheetBehavior bottomSheetBehavior = this.f4054j;
        return bottomSheetBehavior.I ? bottomSheetBehavior.T : bottomSheetBehavior.G;
    }

    @Override // c3.h
    public final int g0(View view, int i4) {
        return view.getLeft();
    }

    @Override // c3.h
    public final int h0(View view, int i4) {
        return h.f0(i4, this.f4054j.x(), f1());
    }
}
