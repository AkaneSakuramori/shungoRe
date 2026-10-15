package f2;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import e.n0;
import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w[] f2110a = new w[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix[] f2111b = new Matrix[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix[] f2112c = new Matrix[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PointF f2113d = new PointF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f2114e = new Path();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Path f2115f = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f2116g = new w();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f2117h = new float[2];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f2118i = new float[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Path f2119j = new Path();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Path f2120k = new Path();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f2121l = true;

    public o() {
        for (int i4 = 0; i4 < 4; i4++) {
            this.f2110a[i4] = new w();
            this.f2111b[i4] = new Matrix();
            this.f2112c[i4] = new Matrix();
        }
    }

    public final void a(l lVar, float f5, RectF rectF, n0 n0Var, Path path) {
        char c5;
        int i4;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        w[] wVarArr;
        RectF rectF2;
        l lVar2;
        e eVar;
        Path path2;
        c cVar;
        c3.h hVar;
        path.rewind();
        Path path3 = this.f2114e;
        path3.rewind();
        Path path4 = this.f2115f;
        path4.rewind();
        path4.addRect(rectF, Path.Direction.CW);
        n nVar = new n(lVar, f5, rectF, n0Var, path);
        int i5 = 0;
        while (true) {
            c5 = 1;
            matrixArr = this.f2112c;
            fArr = this.f2117h;
            matrixArr2 = this.f2111b;
            wVarArr = this.f2110a;
            rectF2 = nVar.f2107c;
            lVar2 = nVar.f2105a;
            if (i5 >= 4) {
                break;
            }
            if (i5 == 1) {
                cVar = lVar2.f2098g;
            } else if (i5 != 2) {
                cVar = i5 != 3 ? lVar2.f2097f : lVar2.f2096e;
            } else {
                cVar = lVar2.f2099h;
            }
            if (i5 == 1) {
                hVar = lVar2.f2094c;
            } else if (i5 != 2) {
                hVar = i5 != 3 ? lVar2.f2093b : lVar2.f2092a;
            } else {
                hVar = lVar2.f2095d;
            }
            w wVar = wVarArr[i5];
            hVar.getClass();
            hVar.S0(nVar.f2109e, cVar.a(rectF2), wVar);
            int i6 = i5 + 1;
            float f6 = (i6 % 4) * 90;
            matrixArr2[i5].reset();
            PointF pointF = this.f2113d;
            if (i5 == 1) {
                pointF.set(rectF2.right, rectF2.bottom);
            } else if (i5 == 2) {
                pointF.set(rectF2.left, rectF2.bottom);
            } else if (i5 != 3) {
                pointF.set(rectF2.right, rectF2.top);
            } else {
                pointF.set(rectF2.left, rectF2.top);
            }
            matrixArr2[i5].setTranslate(pointF.x, pointF.y);
            matrixArr2[i5].preRotate(f6);
            w wVar2 = wVarArr[i5];
            fArr[0] = wVar2.f2142c;
            fArr[1] = wVar2.f2143d;
            matrixArr2[i5].mapPoints(fArr);
            matrixArr[i5].reset();
            matrixArr[i5].setTranslate(fArr[0], fArr[1]);
            matrixArr[i5].preRotate(f6);
            i5 = i6;
        }
        int i7 = 0;
        for (i4 = 4; i7 < i4; i4 = 4) {
            w wVar3 = wVarArr[i7];
            fArr[0] = wVar3.f2140a;
            fArr[c5] = wVar3.f2141b;
            matrixArr2[i7].mapPoints(fArr);
            Path path5 = nVar.f2106b;
            if (i7 == 0) {
                path5.moveTo(fArr[0], fArr[c5]);
            } else {
                path5.lineTo(fArr[0], fArr[c5]);
            }
            wVarArr[i7].b(matrixArr2[i7], path5);
            n0 n0Var2 = nVar.f2108d;
            if (n0Var2 != null) {
                w wVar4 = wVarArr[i7];
                Matrix matrix = matrixArr2[i7];
                BitSet bitSet = ((h) n0Var2.f1896c).f2060e;
                wVar4.getClass();
                bitSet.set(i7, false);
                v[] vVarArr = ((h) n0Var2.f1896c).f2058c;
                wVar4.a(wVar4.f2145f);
                vVarArr[i7] = new p(new ArrayList(wVar4.f2147h), new Matrix(matrix));
            }
            int i8 = i7 + 1;
            int i9 = i8 % 4;
            w wVar5 = wVarArr[i7];
            fArr[0] = wVar5.f2142c;
            fArr[1] = wVar5.f2143d;
            matrixArr2[i7].mapPoints(fArr);
            w wVar6 = wVarArr[i9];
            float f7 = wVar6.f2140a;
            float[] fArr2 = this.f2118i;
            fArr2[0] = f7;
            fArr2[1] = wVar6.f2141b;
            matrixArr2[i9].mapPoints(fArr2);
            Path path6 = path3;
            Path path7 = path4;
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            w wVar7 = wVarArr[i7];
            fArr[0] = wVar7.f2142c;
            fArr[1] = wVar7.f2143d;
            matrixArr2[i7].mapPoints(fArr);
            if (i7 == 1 || i7 == 3) {
                Math.abs(rectF2.centerX() - fArr[0]);
            } else {
                Math.abs(rectF2.centerY() - fArr[1]);
            }
            w wVar8 = this.f2116g;
            wVar8.d(0.0f, 270.0f, 0.0f);
            if (i7 == 1) {
                eVar = lVar2.f2102k;
            } else if (i7 != 2) {
                eVar = i7 != 3 ? lVar2.f2101j : lVar2.f2100i;
            } else {
                eVar = lVar2.f2103l;
            }
            eVar.getClass();
            wVar8.c(fMax, 0.0f);
            Path path8 = this.f2119j;
            path8.reset();
            wVar8.b(matrixArr[i7], path8);
            if (this.f2121l && (b(path8, i7) || b(path8, i9))) {
                path2 = path7;
                path8.op(path8, path2, Path.Op.DIFFERENCE);
                fArr[0] = wVar8.f2140a;
                fArr[1] = wVar8.f2141b;
                matrixArr[i7].mapPoints(fArr);
                path6.moveTo(fArr[0], fArr[1]);
                wVar8.b(matrixArr[i7], path6);
                path3 = path6;
            } else {
                path3 = path6;
                path2 = path7;
                wVar8.b(matrixArr[i7], path5);
            }
            if (n0Var2 != null) {
                Matrix matrix2 = matrixArr[i7];
                ((h) n0Var2.f1896c).f2060e.set(i7 + 4, false);
                v[] vVarArr2 = ((h) n0Var2.f1896c).f2059d;
                wVar8.a(wVar8.f2145f);
                vVarArr2[i7] = new p(new ArrayList(wVar8.f2147h), new Matrix(matrix2));
            }
            path4 = path2;
            nVar = nVar;
            i7 = i8;
            c5 = 1;
        }
        path.close();
        path3.close();
        if (path3.isEmpty()) {
            return;
        }
        path.op(path3, Path.Op.UNION);
    }

    public final boolean b(Path path, int i4) {
        Path path2 = this.f2120k;
        path2.reset();
        this.f2110a[i4].b(this.f2111b[i4], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
