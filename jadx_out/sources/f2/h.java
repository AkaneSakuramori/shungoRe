package f2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import e.n0;
import java.util.BitSet;

/* JADX INFO: loaded from: classes.dex */
public class h extends Drawable implements x {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Paint f2056x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f2057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v[] f2058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v[] f2059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BitSet f2060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2061f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Matrix f2062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Path f2063h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Path f2064i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RectF f2065j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final RectF f2066k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Region f2067l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Region f2068m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public l f2069n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Paint f2070o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Paint f2071p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e2.a f2072q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n0 f2073r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o f2074s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f2075t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public PorterDuffColorFilter f2076u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final RectF f2077v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f2078w;

    static {
        Paint paint = new Paint(1);
        f2056x = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public h() {
        this(new l());
    }

    public final void a(RectF rectF, Path path) {
        o oVar = this.f2074s;
        g gVar = this.f2057b;
        oVar.a(gVar.f2035a, gVar.f2044j, rectF, this.f2073r, path);
        if (this.f2057b.f2043i != 1.0f) {
            Matrix matrix = this.f2062g;
            matrix.reset();
            float f5 = this.f2057b.f2043i;
            matrix.setScale(f5, f5, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f2077v, true);
    }

    public final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z4) {
        int color;
        int iC;
        if (colorStateList == null || mode == null) {
            return (!z4 || (iC = c((color = paint.getColor()))) == color) ? null : new PorterDuffColorFilter(iC, PorterDuff.Mode.SRC_IN);
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z4) {
            colorForState = c(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public final int c(int i4) {
        int i5;
        g gVar = this.f2057b;
        float f5 = gVar.f2048n + gVar.f2049o + gVar.f2047m;
        y1.a aVar = gVar.f2036b;
        if (aVar == null || !aVar.f5366a || b0.a.d(i4, 255) != aVar.f5369d) {
            return i4;
        }
        float f6 = aVar.f5370e;
        float fMin = (f6 <= 0.0f || f5 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f5 / f6)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i4);
        int iT1 = c3.h.t1(b0.a.d(i4, 255), aVar.f5367b, fMin);
        if (fMin > 0.0f && (i5 = aVar.f5368c) != 0) {
            iT1 = b0.a.b(b0.a.d(i5, y1.a.f5365f), iT1);
        }
        return b0.a.d(iT1, iAlpha);
    }

    public final void d(Canvas canvas) {
        if (this.f2060e.cardinality() > 0) {
            Log.w("h", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i4 = this.f2057b.f2052r;
        Path path = this.f2063h;
        e2.a aVar = this.f2072q;
        if (i4 != 0) {
            canvas.drawPath(path, aVar.f1978a);
        }
        for (int i5 = 0; i5 < 4; i5++) {
            v vVar = this.f2058c[i5];
            int i6 = this.f2057b.f2051q;
            Matrix matrix = v.f2138b;
            vVar.a(matrix, aVar, i6, canvas);
            this.f2059d[i5].a(matrix, aVar, this.f2057b.f2051q, canvas);
        }
        if (this.f2078w) {
            g gVar = this.f2057b;
            int iSin = (int) (Math.sin(Math.toRadians(gVar.f2053s)) * ((double) gVar.f2052r));
            g gVar2 = this.f2057b;
            int iCos = (int) (Math.cos(Math.toRadians(gVar2.f2053s)) * ((double) gVar2.f2052r));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f2056x);
            canvas.translate(iSin, iCos);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:26:0x010c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0114  */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int iWidth;
        Paint paint = this.f2070o;
        paint.setColorFilter(this.f2075t);
        int alpha = paint.getAlpha();
        int i4 = this.f2057b.f2046l;
        paint.setAlpha(((i4 + (i4 >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f2071p;
        paint2.setColorFilter(this.f2076u);
        paint2.setStrokeWidth(this.f2057b.f2045k);
        int alpha2 = paint2.getAlpha();
        int i5 = this.f2057b.f2046l;
        paint2.setAlpha(((i5 + (i5 >>> 7)) * alpha2) >>> 8);
        boolean z4 = this.f2061f;
        Path path = this.f2063h;
        if (z4) {
            float strokeWidth = h() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            l lVar = this.f2057b.f2035a;
            f fVar = new f(-strokeWidth);
            k kVarE = lVar.e();
            kVarE.f2084e = fVar.a(lVar.f2096e);
            kVarE.f2085f = fVar.a(lVar.f2097f);
            kVarE.f2087h = fVar.a(lVar.f2099h);
            kVarE.f2086g = fVar.a(lVar.f2098g);
            l lVarA = kVarE.a();
            this.f2069n = lVarA;
            o oVar = this.f2074s;
            float f5 = this.f2057b.f2044j;
            RectF rectF = this.f2066k;
            rectF.set(g());
            float strokeWidth2 = h() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth2, strokeWidth2);
            oVar.a(lVarA, f5, rectF, null, this.f2064i);
            a(g(), path);
            this.f2061f = false;
        }
        g gVar = this.f2057b;
        int i6 = gVar.f2050p;
        if (i6 != 1 && gVar.f2051q > 0) {
            if (i6 != 2) {
                int i7 = Build.VERSION.SDK_INT;
                if (!gVar.f2035a.d(g()) && !path.isConvex() && i7 < 29) {
                    canvas.save();
                    g gVar2 = this.f2057b;
                    int iSin = (int) (Math.sin(Math.toRadians(gVar2.f2053s)) * ((double) gVar2.f2052r));
                    g gVar3 = this.f2057b;
                    canvas.translate(iSin, (int) (Math.cos(Math.toRadians(gVar3.f2053s)) * ((double) gVar3.f2052r)));
                    if (!this.f2078w) {
                        RectF rectF2 = this.f2077v;
                        iWidth = (int) (rectF2.width() - getBounds().width());
                        int iHeight = (int) (rectF2.height() - getBounds().height());
                        if (iWidth >= 0 || iHeight < 0) {
                            throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f2057b.f2051q * 2) + ((int) rectF2.width()) + iWidth, (this.f2057b.f2051q * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                        float f6 = (getBounds().left - this.f2057b.f2051q) - iWidth;
                        float f7 = (getBounds().top - this.f2057b.f2051q) - iHeight;
                        canvas2.translate(-f6, -f7);
                        d(canvas2);
                        canvas.drawBitmap(bitmapCreateBitmap, f6, f7, (Paint) null);
                        bitmapCreateBitmap.recycle();
                        canvas.restore();
                    } else {
                        d(canvas);
                        canvas.restore();
                    }
                }
            } else {
                canvas.save();
                g gVar4 = this.f2057b;
                int iSin2 = (int) (Math.sin(Math.toRadians(gVar4.f2053s)) * ((double) gVar4.f2052r));
                g gVar5 = this.f2057b;
                canvas.translate(iSin2, (int) (Math.cos(Math.toRadians(gVar5.f2053s)) * ((double) gVar5.f2052r)));
                if (!this.f2078w) {
                    RectF rectF3 = this.f2077v;
                    iWidth = (int) (rectF3.width() - getBounds().width());
                    int iHeight2 = (int) (rectF3.height() - getBounds().height());
                    if (iWidth >= 0) {
                    }
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                d(canvas);
                canvas.restore();
            }
        }
        g gVar6 = this.f2057b;
        Paint.Style style = gVar6.f2055u;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            e(canvas, paint, path, gVar6.f2035a, g());
        }
        if (h()) {
            f(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final void e(Canvas canvas, Paint paint, Path path, l lVar, RectF rectF) {
        if (!lVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = lVar.f2097f.a(rectF) * this.f2057b.f2044j;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    public void f(Canvas canvas) {
        Paint paint = this.f2071p;
        Path path = this.f2064i;
        l lVar = this.f2069n;
        RectF rectF = this.f2066k;
        rectF.set(g());
        float strokeWidth = h() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        e(canvas, paint, path, lVar, rectF);
    }

    public final RectF g() {
        RectF rectF = this.f2065j;
        rectF.set(getBounds());
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f2057b.f2046l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f2057b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        g gVar = this.f2057b;
        if (gVar.f2050p == 2) {
            return;
        }
        if (gVar.f2035a.d(g())) {
            outline.setRoundRect(getBounds(), this.f2057b.f2035a.f2096e.a(g()) * this.f2057b.f2044j);
            return;
        }
        RectF rectFG = g();
        Path path = this.f2063h;
        a(rectFG, path);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            outline.setPath(path);
            return;
        }
        if (i4 >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f2057b.f2042h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f2067l;
        region.set(bounds);
        RectF rectFG = g();
        Path path = this.f2063h;
        a(rectFG, path);
        Region region2 = this.f2068m;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final boolean h() {
        Paint.Style style = this.f2057b.f2055u;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f2071p.getStrokeWidth() > 0.0f;
    }

    public final void i(Context context) {
        this.f2057b.f2036b = new y1.a(context);
        n();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f2061f = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f2057b.f2040f) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f2057b.f2039e) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f2057b.f2038d) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f2057b.f2037c) != null && colorStateList4.isStateful())));
    }

    public final void j(float f5) {
        g gVar = this.f2057b;
        if (gVar.f2048n != f5) {
            gVar.f2048n = f5;
            n();
        }
    }

    public final void k(ColorStateList colorStateList) {
        g gVar = this.f2057b;
        if (gVar.f2037c != colorStateList) {
            gVar.f2037c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean l(int[] iArr) {
        boolean z4;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f2057b.f2037c == null || color2 == (colorForState2 = this.f2057b.f2037c.getColorForState(iArr, (color2 = (paint2 = this.f2070o).getColor())))) {
            z4 = false;
        } else {
            paint2.setColor(colorForState2);
            z4 = true;
        }
        if (this.f2057b.f2038d == null || color == (colorForState = this.f2057b.f2038d.getColorForState(iArr, (color = (paint = this.f2071p).getColor())))) {
            return z4;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean m() {
        PorterDuffColorFilter porterDuffColorFilter = this.f2075t;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f2076u;
        g gVar = this.f2057b;
        this.f2075t = b(gVar.f2040f, gVar.f2041g, this.f2070o, true);
        g gVar2 = this.f2057b;
        this.f2076u = b(gVar2.f2039e, gVar2.f2041g, this.f2071p, false);
        g gVar3 = this.f2057b;
        if (gVar3.f2054t) {
            int colorForState = gVar3.f2040f.getColorForState(getState(), 0);
            e2.a aVar = this.f2072q;
            aVar.getClass();
            aVar.f1981d = b0.a.d(colorForState, 68);
            aVar.f1982e = b0.a.d(colorForState, 20);
            aVar.f1983f = b0.a.d(colorForState, 0);
            aVar.f1978a.setColor(aVar.f1981d);
        }
        return (h0.b.a(porterDuffColorFilter, this.f2075t) && h0.b.a(porterDuffColorFilter2, this.f2076u)) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f2057b = new g(this.f2057b);
        return this;
    }

    public final void n() {
        g gVar = this.f2057b;
        float f5 = gVar.f2048n + gVar.f2049o;
        gVar.f2051q = (int) Math.ceil(0.75f * f5);
        this.f2057b.f2052r = (int) Math.ceil(f5 * 0.25f);
        m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f2061f = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z4 = l(iArr) || m();
        if (z4) {
            invalidateSelf();
        }
        return z4;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        g gVar = this.f2057b;
        if (gVar.f2046l != i4) {
            gVar.f2046l = i4;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2057b.getClass();
        super.invalidateSelf();
    }

    @Override // f2.x
    public final void setShapeAppearanceModel(l lVar) {
        this.f2057b.f2035a = lVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i4) {
        setTintList(ColorStateList.valueOf(i4));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f2057b.f2040f = colorStateList;
        m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        g gVar = this.f2057b;
        if (gVar.f2041g != mode) {
            gVar.f2041g = mode;
            m();
            super.invalidateSelf();
        }
    }

    public h(Context context, AttributeSet attributeSet, int i4, int i5) {
        this(l.b(context, attributeSet, i4, i5).a());
    }

    public h(l lVar) {
        this(new g(lVar));
    }

    public h(g gVar) {
        o oVar;
        this.f2058c = new v[4];
        this.f2059d = new v[4];
        this.f2060e = new BitSet(8);
        this.f2062g = new Matrix();
        this.f2063h = new Path();
        this.f2064i = new Path();
        this.f2065j = new RectF();
        this.f2066k = new RectF();
        this.f2067l = new Region();
        this.f2068m = new Region();
        Paint paint = new Paint(1);
        this.f2070o = paint;
        Paint paint2 = new Paint(1);
        this.f2071p = paint2;
        this.f2072q = new e2.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            oVar = m.f2104a;
        } else {
            oVar = new o();
        }
        this.f2074s = oVar;
        this.f2077v = new RectF();
        this.f2078w = true;
        this.f2057b = gVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m();
        l(getState());
        this.f2073r = new n0(29, this);
    }
}
