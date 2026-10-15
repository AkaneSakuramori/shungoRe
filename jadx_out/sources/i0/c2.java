package i0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c2 f2901b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2 f2902a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f2901b = z1.f2996q;
        } else {
            f2901b = a2.f2887b;
        }
    }

    public c2(WindowInsets windowInsets) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            this.f2902a = new z1(this, windowInsets);
            return;
        }
        if (i4 >= 29) {
            this.f2902a = new y1(this, windowInsets);
        } else if (i4 >= 28) {
            this.f2902a = new w1(this, windowInsets);
        } else {
            this.f2902a = new v1(this, windowInsets);
        }
    }

    public static b0.c e(b0.c cVar, int i4, int i5, int i6, int i7) {
        int iMax = Math.max(0, cVar.f1081a - i4);
        int iMax2 = Math.max(0, cVar.f1082b - i5);
        int iMax3 = Math.max(0, cVar.f1083c - i6);
        int iMax4 = Math.max(0, cVar.f1084d - i7);
        return (iMax == i4 && iMax2 == i5 && iMax3 == i6 && iMax4 == i7) ? cVar : b0.c.b(iMax, iMax2, iMax3, iMax4);
    }

    public static c2 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        c2 c2Var = new c2(windowInsets);
        if (view != null) {
            WeakHashMap weakHashMap = v0.f2983a;
            if (h0.b(view)) {
                c2 c2VarA = l0.a(view);
                a2 a2Var = c2Var.f2902a;
                a2Var.p(c2VarA);
                a2Var.d(view.getRootView());
            }
        }
        return c2Var;
    }

    public final int a() {
        return this.f2902a.j().f1084d;
    }

    public final int b() {
        return this.f2902a.j().f1081a;
    }

    public final int c() {
        return this.f2902a.j().f1083c;
    }

    public final int d() {
        return this.f2902a.j().f1082b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2)) {
            return false;
        }
        return h0.b.a(this.f2902a, ((c2) obj).f2902a);
    }

    public final WindowInsets f() {
        a2 a2Var = this.f2902a;
        if (a2Var instanceof u1) {
            return ((u1) a2Var).f2975c;
        }
        return null;
    }

    public final int hashCode() {
        a2 a2Var = this.f2902a;
        if (a2Var == null) {
            return 0;
        }
        return a2Var.hashCode();
    }

    public c2() {
        this.f2902a = new a2(this);
    }
}
