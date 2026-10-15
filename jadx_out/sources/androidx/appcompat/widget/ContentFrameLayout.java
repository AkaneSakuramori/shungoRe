package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import e.e0;
import e.t;
import h.o;
import i.h;
import i.m;
import i.q1;
import i.r1;
import i.x3;
import i0.d1;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TypedValue f444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TypedValue f446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TypedValue f447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TypedValue f448f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TypedValue f449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f450h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public q1 f451i;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f450h = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f448f == null) {
            this.f448f = new TypedValue();
        }
        return this.f448f;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f449g == null) {
            this.f449g = new TypedValue();
        }
        return this.f449g;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f446d == null) {
            this.f446d = new TypedValue();
        }
        return this.f446d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f447e == null) {
            this.f447e = new TypedValue();
        }
        return this.f447e;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f444b == null) {
            this.f444b = new TypedValue();
        }
        return this.f444b;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f445c == null) {
            this.f445c = new TypedValue();
        }
        return this.f445c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        q1 q1Var = this.f451i;
        if (q1Var != null) {
            q1Var.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        m mVar;
        super.onDetachedFromWindow();
        q1 q1Var = this.f451i;
        if (q1Var != null) {
            e0 e0Var = ((t) q1Var).f1941c;
            r1 r1Var = e0Var.f1832s;
            if (r1Var != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) r1Var;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((x3) actionBarOverlayLayout.f409f).f2837a.f476b;
                if (actionMenuView != null && (mVar = actionMenuView.f434u) != null) {
                    mVar.f();
                    h hVar = mVar.f2675u;
                    if (hVar != null && hVar.b()) {
                        hVar.f2346j.dismiss();
                    }
                }
            }
            if (e0Var.f1837x != null) {
                e0Var.f1826m.getDecorView().removeCallbacks(e0Var.f1838y);
                if (e0Var.f1837x.isShowing()) {
                    try {
                        e0Var.f1837x.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                e0Var.f1837x = null;
            }
            d1 d1Var = e0Var.f1839z;
            if (d1Var != null) {
                d1Var.b();
            }
            o oVar = e0Var.z(0).f1793h;
            if (oVar != null) {
                oVar.c(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        int iMakeMeasureSpec;
        boolean z4;
        int iMakeMeasureSpec2;
        int i6;
        int i7;
        float fraction;
        int i8;
        int i9;
        float fraction2;
        int i10;
        int i11;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z5 = true;
        boolean z6 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        Rect rect = this.f450h;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i4;
            z4 = false;
        } else {
            TypedValue typedValue = z6 ? this.f447e : this.f446d;
            if (typedValue == null || (i10 = typedValue.type) == 0) {
                iMakeMeasureSpec = i4;
                z4 = false;
            } else {
                if (i10 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i10 == 6) {
                        int i12 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i12, i12);
                    } else {
                        i11 = 0;
                    }
                    if (i11 > 0) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i11 - (rect.left + rect.right), View.MeasureSpec.getSize(i4)), 1073741824);
                        z4 = true;
                    } else {
                        iMakeMeasureSpec = i4;
                        z4 = false;
                    }
                }
                i11 = (int) fraction3;
                if (i11 > 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i11 - (rect.left + rect.right), View.MeasureSpec.getSize(i4)), 1073741824);
                    z4 = true;
                } else {
                    iMakeMeasureSpec = i4;
                    z4 = false;
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i5;
        } else {
            TypedValue typedValue2 = z6 ? this.f448f : this.f449g;
            if (typedValue2 == null || (i8 = typedValue2.type) == 0) {
                iMakeMeasureSpec2 = i5;
            } else {
                if (i8 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i8 == 6) {
                        int i13 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i13, i13);
                    } else {
                        i9 = 0;
                    }
                    if (i9 > 0) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i9 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i5)), 1073741824);
                    } else {
                        iMakeMeasureSpec2 = i5;
                    }
                }
                i9 = (int) fraction2;
                if (i9 > 0) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i9 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i5)), 1073741824);
                } else {
                    iMakeMeasureSpec2 = i5;
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z4 || mode != Integer.MIN_VALUE) {
            z5 = false;
        } else {
            TypedValue typedValue3 = z6 ? this.f445c : this.f444b;
            if (typedValue3 == null || (i6 = typedValue3.type) == 0) {
                z5 = false;
            } else {
                if (i6 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i6 == 6) {
                        int i14 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i14, i14);
                    } else {
                        i7 = 0;
                    }
                    if (i7 > 0) {
                        i7 -= rect.left + rect.right;
                    }
                    if (measuredWidth < i7) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                    } else {
                        z5 = false;
                    }
                }
                i7 = (int) fraction;
                if (i7 > 0) {
                    i7 -= rect.left + rect.right;
                }
                if (measuredWidth < i7) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                } else {
                    z5 = false;
                }
            }
        }
        if (z5) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }

    public void setAttachListener(q1 q1Var) {
        this.f451i = q1Var;
    }
}
