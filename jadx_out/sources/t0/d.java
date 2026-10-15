package t0;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f4246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4247b;

    public d(float[] fArr) {
        this.f4246a = fArr;
        this.f4247b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f5) {
        if (f5 >= 1.0f) {
            return 1.0f;
        }
        if (f5 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f4246a;
        int iMin = Math.min((int) ((fArr.length - 1) * f5), fArr.length - 2);
        float f6 = this.f4247b;
        float f7 = (f5 - (iMin * f6)) / f6;
        float f8 = fArr[iMin];
        return ((fArr[iMin + 1] - f8) * f7) + f8;
    }
}
