package f2;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f2030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f2031b;

    public b(float f5, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f2030a;
            f5 += ((b) cVar).f2031b;
        }
        this.f2030a = cVar;
        this.f2031b = f5;
    }

    @Override // f2.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f2030a.a(rectF) + this.f2031b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2030a.equals(bVar.f2030a) && this.f2031b == bVar.f2031b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2030a, Float.valueOf(this.f2031b)});
    }
}
