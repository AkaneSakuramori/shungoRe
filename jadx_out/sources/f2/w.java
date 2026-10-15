package f2;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f2140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f2141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f2142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f2143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f2144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f2145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f2146g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f2147h = new ArrayList();

    public w() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f5) {
        float f6 = this.f2144e;
        if (f6 == f5) {
            return;
        }
        float f7 = ((f5 - f6) + 360.0f) % 360.0f;
        if (f7 > 180.0f) {
            return;
        }
        float f8 = this.f2142c;
        float f9 = this.f2143d;
        s sVar = new s(f8, f9, f8, f9);
        sVar.f2133f = this.f2144e;
        sVar.f2134g = f7;
        this.f2147h.add(new q(sVar));
        this.f2144e = f5;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f2146g;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((u) arrayList.get(i4)).a(matrix, path);
        }
    }

    public final void c(float f5, float f6) {
        t tVar = new t();
        tVar.f2135b = f5;
        tVar.f2136c = f6;
        this.f2146g.add(tVar);
        r rVar = new r(tVar, this.f2142c, this.f2143d);
        float fB = rVar.b() + 270.0f;
        float fB2 = rVar.b() + 270.0f;
        a(fB);
        this.f2147h.add(rVar);
        this.f2144e = fB2;
        this.f2142c = f5;
        this.f2143d = f6;
    }

    public final void d(float f5, float f6, float f7) {
        this.f2140a = 0.0f;
        this.f2141b = f5;
        this.f2142c = 0.0f;
        this.f2143d = f5;
        this.f2144e = f6;
        this.f2145f = (f6 + f7) % 360.0f;
        this.f2146g.clear();
        this.f2147h.clear();
    }
}
