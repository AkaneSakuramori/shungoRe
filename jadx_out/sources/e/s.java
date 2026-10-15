package e;

import android.view.ViewGroup;
import i0.d1;
import i0.v0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f1922c;

    public /* synthetic */ s(e0 e0Var, int i4) {
        this.f1921b = i4;
        this.f1922c = e0Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        ViewGroup viewGroup;
        int i4 = this.f1921b;
        e0 e0Var = this.f1922c;
        switch (i4) {
            case 0:
                if ((1 & e0Var.f1816a0) != 0) {
                    e0Var.v(0);
                }
                if ((e0Var.f1816a0 & 4096) != 0) {
                    e0Var.v(108);
                }
                e0Var.Z = false;
                e0Var.f1816a0 = 0;
                break;
            default:
                e0Var.f1837x.showAtLocation(e0Var.f1836w, 55, 0, 0);
                d1 d1Var = e0Var.f1839z;
                if (d1Var != null) {
                    d1Var.b();
                }
                if (e0Var.A && (viewGroup = e0Var.B) != null) {
                    WeakHashMap weakHashMap = v0.f2983a;
                    z4 = i0.h0.c(viewGroup);
                }
                if (!z4) {
                    e0Var.f1836w.setAlpha(1.0f);
                    e0Var.f1836w.setVisibility(0);
                } else {
                    e0Var.f1836w.setAlpha(0.0f);
                    d1 d1VarA = v0.a(e0Var.f1836w);
                    d1VarA.a(1.0f);
                    e0Var.f1839z = d1VarA;
                    d1VarA.d(new u(0, this));
                }
                break;
        }
    }
}
