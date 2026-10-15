package d1;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Matrix f1725p = new Matrix();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f1726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f1727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f1728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f1729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Paint f1730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PathMeasure f1731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f1732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f1733h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f1734i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f1735j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f1736k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1737l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f1738m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Boolean f1739n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final n.b f1740o;

    public l() {
        this.f1728c = new Matrix();
        this.f1733h = 0.0f;
        this.f1734i = 0.0f;
        this.f1735j = 0.0f;
        this.f1736k = 0.0f;
        this.f1737l = 255;
        this.f1738m = null;
        this.f1739n = null;
        this.f1740o = new n.b();
        this.f1732g = new i();
        this.f1726a = new Path();
        this.f1727b = new Path();
    }

    public final void a(i iVar, Matrix matrix, Canvas canvas, int i4, int i5) {
        int i6;
        float f5;
        iVar.f1709a.set(matrix);
        Matrix matrix2 = iVar.f1709a;
        matrix2.preConcat(iVar.f1718j);
        canvas.save();
        char c5 = 0;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = iVar.f1710b;
            if (i7 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            j jVar = (j) arrayList.get(i7);
            if (jVar instanceof i) {
                a((i) jVar, matrix2, canvas, i4, i5);
            } else {
                if (jVar instanceof k) {
                    k kVar = (k) jVar;
                    float f6 = i4 / this.f1735j;
                    float f7 = i5 / this.f1736k;
                    float fMin = Math.min(f6, f7);
                    Matrix matrix3 = this.f1728c;
                    matrix3.set(matrix2);
                    matrix3.postScale(f6, f7);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[c5], fArr[1]);
                    i6 = i7;
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f8 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? Math.abs(f8) / fMax : 0.0f;
                    if (fAbs != 0.0f) {
                        kVar.getClass();
                        Path path = this.f1726a;
                        path.reset();
                        b0.f[] fVarArr = kVar.f1721a;
                        if (fVarArr != null) {
                            b0.f.b(fVarArr, path);
                        }
                        Path path2 = this.f1727b;
                        path2.reset();
                        if (kVar instanceof g) {
                            path2.setFillType(kVar.f1723c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix3);
                            canvas.clipPath(path2);
                        } else {
                            h hVar = (h) kVar;
                            float f9 = hVar.f1703j;
                            if (f9 != 0.0f || hVar.f1704k != 1.0f) {
                                float f10 = hVar.f1705l;
                                float f11 = (f9 + f10) % 1.0f;
                                float f12 = (hVar.f1704k + f10) % 1.0f;
                                if (this.f1731f == null) {
                                    this.f1731f = new PathMeasure();
                                }
                                this.f1731f.setPath(path, false);
                                float length = this.f1731f.getLength();
                                float f13 = f11 * length;
                                float f14 = f12 * length;
                                path.reset();
                                if (f13 > f14) {
                                    this.f1731f.getSegment(f13, length, path, true);
                                    f5 = 0.0f;
                                    this.f1731f.getSegment(0.0f, f14, path, true);
                                } else {
                                    f5 = 0.0f;
                                    this.f1731f.getSegment(f13, f14, path, true);
                                }
                                path.rLineTo(f5, f5);
                            }
                            path2.addPath(path, matrix3);
                            a0.d dVar = hVar.f1700g;
                            if ((dVar.f13a == null && dVar.f15c == 0) ? false : true) {
                                if (this.f1730e == null) {
                                    Paint paint = new Paint(1);
                                    this.f1730e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                }
                                Paint paint2 = this.f1730e;
                                Shader shader = dVar.f13a;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix3);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(hVar.f1702i * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i8 = dVar.f15c;
                                    float f15 = hVar.f1702i;
                                    PorterDuff.Mode mode = o.f1754k;
                                    paint2.setColor((i8 & 16777215) | (((int) (Color.alpha(i8) * f15)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(hVar.f1723c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            }
                            a0.d dVar2 = hVar.f1698e;
                            if (dVar2.f13a != null || dVar2.f15c != 0) {
                                if (this.f1729d == null) {
                                    Paint paint3 = new Paint(1);
                                    this.f1729d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.f1729d;
                                Paint.Join join = hVar.f1707n;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = hVar.f1706m;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(hVar.f1708o);
                                Shader shader2 = dVar2.f13a;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix3);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(hVar.f1701h * 255.0f));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i9 = dVar2.f15c;
                                    float f16 = hVar.f1701h;
                                    PorterDuff.Mode mode2 = o.f1754k;
                                    paint4.setColor((i9 & 16777215) | (((int) (Color.alpha(i9) * f16)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(hVar.f1699f * fAbs * fMin);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                }
                i7 = i6 + 1;
                c5 = 0;
            }
            i6 = i7;
            i7 = i6 + 1;
            c5 = 0;
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f1737l;
    }

    public void setAlpha(float f5) {
        setRootAlpha((int) (f5 * 255.0f));
    }

    public void setRootAlpha(int i4) {
        this.f1737l = i4;
    }

    public l(l lVar) {
        this.f1728c = new Matrix();
        this.f1733h = 0.0f;
        this.f1734i = 0.0f;
        this.f1735j = 0.0f;
        this.f1736k = 0.0f;
        this.f1737l = 255;
        this.f1738m = null;
        this.f1739n = null;
        n.b bVar = new n.b();
        this.f1740o = bVar;
        this.f1732g = new i(lVar.f1732g, bVar);
        this.f1726a = new Path(lVar.f1726a);
        this.f1727b = new Path(lVar.f1727b);
        this.f1733h = lVar.f1733h;
        this.f1734i = lVar.f1734i;
        this.f1735j = lVar.f1735j;
        this.f1736k = lVar.f1736k;
        this.f1737l = lVar.f1737l;
        this.f1738m = lVar.f1738m;
        String str = lVar.f1738m;
        if (str != null) {
            bVar.put(str, this);
        }
        this.f1739n = lVar.f1739n;
    }
}
