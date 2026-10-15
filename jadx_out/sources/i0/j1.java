package i0;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class j1 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1.e f2930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c2 f2931b;

    public j1(View view, r1.e eVar) {
        this.f2930a = eVar;
        WeakHashMap weakHashMap = v0.f2983a;
        c2 c2VarA = l0.a(view);
        this.f2931b = c2VarA != null ? new e.n0(c2VarA).v() : null;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        a2 a2Var;
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.f2931b = c2.g(view, windowInsets);
            return k1.i(view, windowInsets);
        }
        c2 c2VarG = c2.g(view, windowInsets);
        if (this.f2931b == null) {
            WeakHashMap weakHashMap = v0.f2983a;
            this.f2931b = l0.a(view);
        }
        if (this.f2931b == null) {
            this.f2931b = c2VarG;
            return k1.i(view, windowInsets);
        }
        r1.e eVarJ = k1.j(view);
        if (eVarJ != null && Objects.equals(eVarJ.f4065a, windowInsets)) {
            return k1.i(view, windowInsets);
        }
        c2 c2Var = this.f2931b;
        int i4 = 1;
        int i5 = 0;
        while (true) {
            a2Var = c2VarG.f2902a;
            if (i4 > 256) {
                break;
            }
            if (!a2Var.f(i4).equals(c2Var.f2902a.f(i4))) {
                i5 |= i4;
            }
            i4 <<= 1;
        }
        if (i5 == 0) {
            return k1.i(view, windowInsets);
        }
        c2 c2Var2 = this.f2931b;
        if ((i5 & 8) != 0) {
            interpolator = a2Var.f(8).f1084d > c2Var2.f2902a.f(8).f1084d ? k1.f2932e : k1.f2933f;
        } else {
            interpolator = k1.f2934g;
        }
        o1 o1Var = new o1(i5, interpolator, 160L);
        o1Var.f2949a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(o1Var.f2949a.a());
        b0.c cVarF = a2Var.f(i5);
        b0.c cVarF2 = c2Var2.f2902a.f(i5);
        int iMin = Math.min(cVarF.f1081a, cVarF2.f1081a);
        int i6 = cVarF.f1082b;
        int i7 = cVarF2.f1082b;
        int iMin2 = Math.min(i6, i7);
        int i8 = cVarF.f1083c;
        int i9 = cVarF2.f1083c;
        int iMin3 = Math.min(i8, i9);
        int i10 = cVarF.f1084d;
        int i11 = i5;
        int i12 = cVarF2.f1084d;
        i.a0 a0Var = new i.a0(b0.c.b(iMin, iMin2, iMin3, Math.min(i10, i12)), 6, b0.c.b(Math.max(cVarF.f1081a, cVarF2.f1081a), Math.max(i6, i7), Math.max(i8, i9), Math.max(i10, i12)));
        k1.f(view, windowInsets, false);
        duration.addUpdateListener(new h1(o1Var, c2VarG, c2Var2, i11, view));
        duration.addListener(new b1(this, o1Var, view, 1));
        v.a(view, new i1(view, o1Var, a0Var, duration));
        this.f2931b = c2VarG;
        return k1.i(view, windowInsets);
    }
}
