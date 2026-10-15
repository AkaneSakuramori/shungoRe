package f2;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2079a;

    public i(float f5) {
        this.f2079a = f5;
    }

    @Override // f2.c
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f2079a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f2079a == ((i) obj).f2079a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f2079a)});
    }
}
