package f2;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class s extends u {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final RectF f2128h = new RectF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f2129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f2130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f2131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f2132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f2133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f2134g;

    public s(float f5, float f6, float f7, float f8) {
        this.f2129b = f5;
        this.f2130c = f6;
        this.f2131d = f7;
        this.f2132e = f8;
    }

    @Override // f2.u
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f2137a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f2128h;
        rectF.set(this.f2129b, this.f2130c, this.f2131d, this.f2132e);
        path.arcTo(rectF, this.f2133f, this.f2134g, false);
        path.transform(matrix);
    }
}
