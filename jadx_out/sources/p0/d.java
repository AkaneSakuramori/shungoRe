package p0;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3730a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f5) {
        switch (this.f3730a) {
            case 0:
                float f6 = f5 - 1.0f;
                return (f6 * f6 * f6 * f6 * f6) + 1.0f;
            default:
                float f7 = f5 - 1.0f;
                return (f7 * f7 * f7 * f7 * f7) + 1.0f;
        }
    }
}
