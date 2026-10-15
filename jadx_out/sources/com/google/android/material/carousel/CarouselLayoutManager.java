package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import i.a0;
import java.util.List;
import t1.a;
import t1.b;
import t1.c;
import t1.e;
import y0.a1;
import y0.c0;
import y0.o0;
import y0.p0;
import y0.v0;
import y0.z0;

/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends o0 implements z0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c f1412p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a f1413q;

    /* JADX WARN: Type inference failed for: r0v1, types: [t1.a] */
    public CarouselLayoutManager() {
        new b();
        final int i4 = 0;
        this.f1413q = new View.OnLayoutChangeListener(this) { // from class: t1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CarouselLayoutManager f4249b;

            {
                this.f4249b = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                int i13 = i4;
                CarouselLayoutManager carouselLayoutManager = this.f4249b;
                switch (i13) {
                    case 0:
                        carouselLayoutManager.getClass();
                        if (i5 != i9 || i6 != i10 || i7 != i11 || i8 != i12) {
                            view.post(new androidx.activity.d(7, carouselLayoutManager));
                        }
                        break;
                    default:
                        carouselLayoutManager.getClass();
                        if (i5 != i9 || i6 != i10 || i7 != i11 || i8 != i12) {
                            view.post(new androidx.activity.d(7, carouselLayoutManager));
                        }
                        break;
                }
            }
        };
        j0();
        F0(0);
    }

    public static float A0(float f5, a0 a0Var) {
        e eVar = (e) a0Var.f2519c;
        eVar.getClass();
        e eVar2 = (e) a0Var.f2520d;
        eVar2.getClass();
        eVar.getClass();
        eVar2.getClass();
        return o1.a.b(0.0f, 0.0f, 0.0f, 0.0f, f5);
    }

    public static a0 B0(float f5, List list, boolean z4) {
        float f6 = Float.MAX_VALUE;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        float f7 = -3.4028235E38f;
        float f8 = Float.MAX_VALUE;
        float f9 = Float.MAX_VALUE;
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((e) list.get(i8)).getClass();
            float fAbs = Math.abs(0.0f - f5);
            if (0.0f <= f5 && fAbs <= f6) {
                i4 = i8;
                f6 = fAbs;
            }
            if (0.0f > f5 && fAbs <= f8) {
                i6 = i8;
                f8 = fAbs;
            }
            if (0.0f <= f9) {
                i5 = i8;
                f9 = 0.0f;
            }
            if (0.0f > f7) {
                i7 = i8;
                f7 = 0.0f;
            }
        }
        if (i4 == -1) {
            i4 = i5;
        }
        if (i6 == -1) {
            i6 = i7;
        }
        return new a0((e) list.get(i4), (e) list.get(i6));
    }

    public final boolean C0() {
        return this.f1412p.f4254a == 0;
    }

    public final boolean D0() {
        return C0() && A() == 1;
    }

    public final void E0() {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    public final void F0(int i4) {
        c cVar;
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException(defpackage.a.e("invalid orientation:", i4));
        }
        c(null);
        c cVar2 = this.f1412p;
        if (cVar2 == null || i4 != cVar2.f4254a) {
            if (i4 == 0) {
                cVar = new c(0, this, 1);
            } else {
                if (i4 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                cVar = new c(1, this, 0);
            }
            this.f1412p = cVar;
            j0();
        }
    }

    @Override // y0.o0
    public final void O(RecyclerView recyclerView) {
        j0();
        recyclerView.addOnLayoutChangeListener(this.f1413q);
    }

    @Override // y0.o0
    public final void P(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f1413q);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    @Override // y0.o0
    public final View Q(View view, int i4, v0 v0Var, a1 a1Var) {
        byte b5;
        if (v() == 0) {
            return null;
        }
        int i5 = this.f1412p.f4254a;
        if (i4 == 1) {
            b5 = -1;
        } else if (i4 == 2) {
            b5 = 1;
        } else if (i4 != 17) {
            if (i4 != 33) {
                if (i4 != 66) {
                    if (i4 != 130) {
                        Log.d("CarouselLayoutManager", "Unknown focus request:" + i4);
                    } else if (i5 == 1) {
                        b5 = 1;
                    }
                    b5 = -2147483648;
                } else if (i5 != 0) {
                    b5 = -2147483648;
                } else if (D0()) {
                    b5 = -1;
                } else {
                    b5 = 1;
                }
            } else if (i5 == 1) {
                b5 = -1;
            } else {
                b5 = -2147483648;
            }
        } else if (i5 != 0) {
            b5 = -2147483648;
        } else if (D0()) {
            b5 = 1;
        } else {
            b5 = -1;
        }
        if (b5 == -2147483648) {
            return null;
        }
        if (b5 == -1) {
            if (o0.F(view) == 0) {
                return null;
            }
            int iF = o0.F(u(0)) - 1;
            if (iF < 0 || iF >= z()) {
                return u(D0() ? v() - 1 : 0);
            }
            y0(iF);
            v0Var.d(iF);
            E0();
            throw null;
        }
        if (o0.F(view) == z() - 1) {
            return null;
        }
        int iF2 = o0.F(u(v() - 1)) + 1;
        if (iF2 < 0 || iF2 >= z()) {
            return u(D0() ? 0 : v() - 1);
        }
        y0(iF2);
        v0Var.d(iF2);
        E0();
        throw null;
    }

    @Override // y0.o0
    public final void R(AccessibilityEvent accessibilityEvent) {
        super.R(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(o0.F(u(0)));
            accessibilityEvent.setToIndex(o0.F(u(v() - 1)));
        }
    }

    @Override // y0.o0
    public final void U(int i4, int i5) {
        z();
    }

    @Override // y0.o0
    public final void X(int i4, int i5) {
        z();
    }

    @Override // y0.o0
    public final void Z(v0 v0Var, a1 a1Var) {
        if (a1Var.b() <= 0 || z0() <= 0.0f) {
            e0(v0Var);
            return;
        }
        D0();
        v0Var.d(0);
        E0();
        throw null;
    }

    @Override // y0.z0
    public final PointF a(int i4) {
        return null;
    }

    @Override // y0.o0
    public final void a0(a1 a1Var) {
        if (v() == 0) {
            return;
        }
        o0.F(u(0));
    }

    @Override // y0.o0
    public final boolean d() {
        return C0();
    }

    @Override // y0.o0
    public final boolean e() {
        return !C0();
    }

    @Override // y0.o0
    public final boolean i0(RecyclerView recyclerView, View view, Rect rect, boolean z4, boolean z5) {
        return false;
    }

    @Override // y0.o0
    public final int j(a1 a1Var) {
        v();
        return 0;
    }

    @Override // y0.o0
    public final int k(a1 a1Var) {
        return 0;
    }

    @Override // y0.o0
    public final int k0(int i4, v0 v0Var, a1 a1Var) {
        if (!C0() || v() == 0 || i4 == 0) {
            return 0;
        }
        v0Var.d(0);
        E0();
        throw null;
    }

    @Override // y0.o0
    public final int l(a1 a1Var) {
        return 0;
    }

    @Override // y0.o0
    public final void l0(int i4) {
    }

    @Override // y0.o0
    public final int m(a1 a1Var) {
        v();
        return 0;
    }

    @Override // y0.o0
    public final int m0(int i4, v0 v0Var, a1 a1Var) {
        if (!e() || v() == 0 || i4 == 0) {
            return 0;
        }
        v0Var.d(0);
        E0();
        throw null;
    }

    @Override // y0.o0
    public final int n(a1 a1Var) {
        return 0;
    }

    @Override // y0.o0
    public final int o(a1 a1Var) {
        return 0;
    }

    @Override // y0.o0
    public final p0 r() {
        return new p0(-2, -2);
    }

    @Override // y0.o0
    public final void v0(RecyclerView recyclerView, int i4) {
        c0 c0Var = new c0(this, recyclerView.getContext(), 1);
        c0Var.f5349a = i4;
        w0(c0Var);
    }

    @Override // y0.o0
    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerY();
        if (C0()) {
            rect.centerX();
        }
        throw null;
    }

    public final void y0(int i4) {
        c cVar = this.f1412p;
        int i5 = cVar.f4252b;
        CarouselLayoutManager carouselLayoutManager = cVar.f4253c;
        switch (i5) {
            case 0:
                switch (i5) {
                    case 0:
                        break;
                    default:
                        carouselLayoutManager.E();
                        break;
                }
                break;
            default:
                if (!carouselLayoutManager.D0()) {
                    switch (cVar.f4252b) {
                        case 0:
                            carouselLayoutManager.C();
                    }
                } else {
                    cVar.a();
                }
                break;
        }
        throw null;
    }

    public final int z0() {
        return C0() ? this.f5241n : this.f5242o;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [t1.a] */
    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        new b();
        final int i6 = 1;
        this.f1413q = new View.OnLayoutChangeListener(this) { // from class: t1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CarouselLayoutManager f4249b;

            {
                this.f4249b = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
                int i15 = i6;
                CarouselLayoutManager carouselLayoutManager = this.f4249b;
                switch (i15) {
                    case 0:
                        carouselLayoutManager.getClass();
                        if (i7 != i11 || i8 != i12 || i9 != i13 || i10 != i14) {
                            view.post(new androidx.activity.d(7, carouselLayoutManager));
                        }
                        break;
                    default:
                        carouselLayoutManager.getClass();
                        if (i7 != i11 || i8 != i12 || i9 != i13 || i10 != i14) {
                            view.post(new androidx.activity.d(7, carouselLayoutManager));
                        }
                        break;
                }
            }
        };
        j0();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n1.a.f3540b);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            j0();
            F0(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
