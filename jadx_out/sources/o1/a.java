package o1;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f3595a = new LinearInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t0.b f3596b = new t0.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t0.a f3597c = new t0.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t0.c f3598d = new t0.c();

    static {
        new DecelerateInterpolator();
    }

    public static float a(float f5, float f6, float f7) {
        return ((f6 - f5) * f7) + f5;
    }

    public static float b(float f5, float f6, float f7, float f8, float f9) {
        if (f9 <= f7) {
            return f5;
        }
        return f9 >= f8 ? f6 : a(f5, f6, (f9 - f7) / (f8 - f7));
    }

    public static int c(int i4, int i5, float f5) {
        return Math.round(f5 * (i5 - i4)) + i4;
    }
}
