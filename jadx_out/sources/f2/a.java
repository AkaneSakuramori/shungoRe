package f2;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2029a;

    public a(float f5) {
        this.f2029a = f5;
    }

    @Override // f2.c
    public final float a(RectF rectF) {
        return this.f2029a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f2029a == ((a) obj).f2029a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f2029a)});
    }
}
