package f2;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class r extends v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f2125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f2126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f2127e;

    public r(t tVar, float f5, float f6) {
        this.f2125c = tVar;
        this.f2126d = f5;
        this.f2127e = f6;
    }

    @Override // f2.v
    public final void a(Matrix matrix, e2.a aVar, int i4, Canvas canvas) {
        t tVar = this.f2125c;
        float f5 = tVar.f2136c;
        float f6 = this.f2127e;
        float f7 = tVar.f2135b;
        float f8 = this.f2126d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f5 - f6, f7 - f8), 0.0f);
        Matrix matrix2 = this.f2139a;
        matrix2.set(matrix);
        matrix2.preTranslate(f8, f6);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i4;
        rectF.offset(0.0f, -i4);
        int[] iArr = e2.a.f1974i;
        iArr[0] = aVar.f1983f;
        iArr[1] = aVar.f1982e;
        iArr[2] = aVar.f1981d;
        Paint paint = aVar.f1980c;
        float f9 = rectF.left;
        paint.setShader(new LinearGradient(f9, rectF.top, f9, rectF.bottom, iArr, e2.a.f1975j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        t tVar = this.f2125c;
        return (float) Math.toDegrees(Math.atan((tVar.f2136c - this.f2127e) / (tVar.f2135b - this.f2126d)));
    }
}
