package f2;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class t extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f2135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f2136c;

    @Override // f2.u
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f2137a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f2135b, this.f2136c);
        path.transform(matrix);
    }
}
