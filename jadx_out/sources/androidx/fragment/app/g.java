package androidx.fragment.app;

import android.transition.Transition;

/* JADX INFO: loaded from: classes.dex */
public final class g extends e.b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f744e;

    public g(c1 c1Var, e0.e eVar, boolean z4, boolean z5) {
        Object objL;
        Object objK;
        super(c1Var, eVar);
        int i4 = c1Var.f713a;
        q qVar = c1Var.f715c;
        if (i4 == 2) {
            if (z4) {
                objK = qVar.k();
            } else {
                qVar.getClass();
                objK = null;
            }
            this.f742c = objK;
            if (z4) {
                qVar.getClass();
            } else {
                qVar.getClass();
            }
            this.f743d = true;
        } else {
            if (z4) {
                objL = qVar.l();
            } else {
                qVar.getClass();
                objL = null;
            }
            this.f742c = objL;
            this.f743d = true;
        }
        if (!z5) {
            this.f744e = null;
        } else if (z4) {
            this.f744e = qVar.m();
        } else {
            qVar.getClass();
            this.f744e = null;
        }
    }

    public final y0 h(Object obj) {
        if (obj == null) {
            return null;
        }
        w0 w0Var = r0.f878a;
        if (obj instanceof Transition) {
            return w0Var;
        }
        y0 y0Var = r0.f879b;
        if (y0Var != null && y0Var.e(obj)) {
            return y0Var;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + ((c1) this.f1775a).f715c + " is not a valid framework Transition or AndroidX Transition");
    }
}
