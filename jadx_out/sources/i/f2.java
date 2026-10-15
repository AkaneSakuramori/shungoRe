package i;

import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m2 f2592c;

    public /* synthetic */ f2(m2 m2Var, int i4) {
        this.f2591b = i4;
        this.f2592c = m2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f2591b;
        m2 m2Var = this.f2592c;
        switch (i4) {
            case 1:
                z1 z1Var = m2Var.f2687d;
                if (z1Var != null) {
                    z1Var.setListSelectionHidden(true);
                    z1Var.requestLayout();
                }
                break;
            default:
                z1 z1Var2 = m2Var.f2687d;
                if (z1Var2 != null) {
                    WeakHashMap weakHashMap = i0.v0.f2983a;
                    if (i0.h0.b(z1Var2) && m2Var.f2687d.getCount() > m2Var.f2687d.getChildCount() && m2Var.f2687d.getChildCount() <= m2Var.f2697n) {
                        m2Var.A.setInputMethodMode(2);
                        m2Var.h();
                        break;
                    }
                }
                break;
        }
    }
}
