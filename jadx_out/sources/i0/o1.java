package i0;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n1 f2949a;

    public o1(int i4, Interpolator interpolator, long j4) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f2949a = new m1(x.i(i4, interpolator, j4));
        } else {
            this.f2949a = new k1(i4, interpolator, j4);
        }
    }
}
