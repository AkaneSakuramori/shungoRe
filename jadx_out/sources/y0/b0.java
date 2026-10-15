package y0;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f5081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5082b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f5083c = new Rect();

    public b0(o0 o0Var) {
        this.f5081a = o0Var;
    }

    public static a0 a(o0 o0Var, int i4) {
        if (i4 == 0) {
            return new a0(o0Var, 0);
        }
        if (i4 == 1) {
            return new a0(o0Var, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public final int h() {
        if (Integer.MIN_VALUE == this.f5082b) {
            return 0;
        }
        return g() - this.f5082b;
    }

    public abstract int i(View view);

    public abstract int j(View view);

    public abstract void k(int i4);
}
