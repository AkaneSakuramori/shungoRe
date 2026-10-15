package e;

import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import i.a2;
import i.q1;
import i0.c2;
import i0.t1;
import i0.v0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class t implements i0.s, a2, q1, h.b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f1941c;

    public /* synthetic */ t(e0 e0Var, int i4) {
        this.f1940b = i4;
        this.f1941c = e0Var;
    }

    @Override // h.b0
    public final void b(h.o oVar, boolean z4) {
        d0 d0Var;
        int i4 = this.f1940b;
        e0 e0Var = this.f1941c;
        switch (i4) {
            case 3:
                e0Var.r(oVar);
                break;
            default:
                h.o oVarK = oVar.k();
                int i5 = 0;
                boolean z5 = oVarK != oVar;
                if (z5) {
                    oVar = oVarK;
                }
                d0[] d0VarArr = e0Var.M;
                int length = d0VarArr != null ? d0VarArr.length : 0;
                while (true) {
                    if (i5 >= length) {
                        d0Var = null;
                    } else {
                        d0Var = d0VarArr[i5];
                        if (d0Var == null || d0Var.f1793h != oVar) {
                            i5++;
                        }
                    }
                }
                if (d0Var != null) {
                    if (!z5) {
                        e0Var.s(d0Var, z4);
                    } else {
                        e0Var.q(d0Var.f1786a, d0Var, oVarK);
                        e0Var.s(d0Var, true);
                    }
                }
                break;
        }
    }

    @Override // h.b0
    public final boolean k(h.o oVar) {
        Window.Callback callback;
        int i4 = this.f1940b;
        e0 e0Var = this.f1941c;
        switch (i4) {
            case 3:
                Window.Callback callback2 = e0Var.f1826m.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, oVar);
                }
                break;
            default:
                if (oVar == oVar.k() && e0Var.G && (callback = e0Var.f1826m.getCallback()) != null && !e0Var.R) {
                    callback.onMenuOpened(108, oVar);
                }
                break;
        }
        return true;
    }

    @Override // i0.s
    public final c2 q(View view, c2 c2Var) {
        int iD = c2Var.d();
        int iJ = this.f1941c.J(c2Var, null);
        if (iD != iJ) {
            int iB = c2Var.b();
            int iC = c2Var.c();
            int iA = c2Var.a();
            n0 n0Var = new n0(c2Var);
            ((t1) n0Var.f1896c).g(b0.c.b(iB, iJ, iC, iA));
            c2Var = n0Var.v();
        }
        WeakHashMap weakHashMap = v0.f2983a;
        WindowInsets windowInsetsF = c2Var.f();
        if (windowInsetsF == null) {
            return c2Var;
        }
        WindowInsets windowInsetsB = i0.i0.b(view, windowInsetsF);
        return !windowInsetsB.equals(windowInsetsF) ? c2.g(view, windowInsetsB) : c2Var;
    }
}
