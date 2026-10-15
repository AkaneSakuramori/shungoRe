package f2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class q extends v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f2124c;

    public q(s sVar) {
        this.f2124c = sVar;
    }

    @Override // f2.v
    public final void a(Matrix matrix, e2.a aVar, int i4, Canvas canvas) {
        s sVar = this.f2124c;
        float f5 = sVar.f2133f;
        float f6 = sVar.f2134g;
        RectF rectF = new RectF(sVar.f2129b, sVar.f2130c, sVar.f2131d, sVar.f2132e);
        aVar.getClass();
        boolean z4 = f6 < 0.0f;
        Path path = aVar.f1984g;
        int[] iArr = e2.a.f1976k;
        if (z4) {
            iArr[0] = 0;
            iArr[1] = aVar.f1983f;
            iArr[2] = aVar.f1982e;
            iArr[3] = aVar.f1981d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f5, f6);
            path.close();
            float f7 = -i4;
            rectF.inset(f7, f7);
            iArr[0] = 0;
            iArr[1] = aVar.f1981d;
            iArr[2] = aVar.f1982e;
            iArr[3] = aVar.f1983f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f8 = 1.0f - (i4 / fWidth);
        float[] fArr = e2.a.f1977l;
        fArr[1] = f8;
        fArr[2] = ((1.0f - f8) / 2.0f) + f8;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = aVar.f1979b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z4) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.f1985h);
        }
        canvas.drawArc(rectF, f5, f6, true, paint);
        canvas.restore();
    }
}
