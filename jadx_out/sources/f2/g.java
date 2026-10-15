package f2;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class g extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f2035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y1.a f2036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f2037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorStateList f2038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ColorStateList f2039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f2040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f2041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Rect f2042h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f2043i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f2044j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f2045k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2046l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f2047m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f2048n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f2049o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f2050p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2051q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2052r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f2053s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f2054t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Paint.Style f2055u;

    public g(l lVar) {
        this.f2037c = null;
        this.f2038d = null;
        this.f2039e = null;
        this.f2040f = null;
        this.f2041g = PorterDuff.Mode.SRC_IN;
        this.f2042h = null;
        this.f2043i = 1.0f;
        this.f2044j = 1.0f;
        this.f2046l = 255;
        this.f2047m = 0.0f;
        this.f2048n = 0.0f;
        this.f2049o = 0.0f;
        this.f2050p = 0;
        this.f2051q = 0;
        this.f2052r = 0;
        this.f2053s = 0;
        this.f2054t = false;
        this.f2055u = Paint.Style.FILL_AND_STROKE;
        this.f2035a = lVar;
        this.f2036b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        h hVar = new h(this);
        hVar.f2061f = true;
        return hVar;
    }

    public g(g gVar) {
        this.f2037c = null;
        this.f2038d = null;
        this.f2039e = null;
        this.f2040f = null;
        this.f2041g = PorterDuff.Mode.SRC_IN;
        this.f2042h = null;
        this.f2043i = 1.0f;
        this.f2044j = 1.0f;
        this.f2046l = 255;
        this.f2047m = 0.0f;
        this.f2048n = 0.0f;
        this.f2049o = 0.0f;
        this.f2050p = 0;
        this.f2051q = 0;
        this.f2052r = 0;
        this.f2053s = 0;
        this.f2054t = false;
        this.f2055u = Paint.Style.FILL_AND_STROKE;
        this.f2035a = gVar.f2035a;
        this.f2036b = gVar.f2036b;
        this.f2045k = gVar.f2045k;
        this.f2037c = gVar.f2037c;
        this.f2038d = gVar.f2038d;
        this.f2041g = gVar.f2041g;
        this.f2040f = gVar.f2040f;
        this.f2046l = gVar.f2046l;
        this.f2043i = gVar.f2043i;
        this.f2052r = gVar.f2052r;
        this.f2050p = gVar.f2050p;
        this.f2054t = gVar.f2054t;
        this.f2044j = gVar.f2044j;
        this.f2047m = gVar.f2047m;
        this.f2048n = gVar.f2048n;
        this.f2049o = gVar.f2049o;
        this.f2051q = gVar.f2051q;
        this.f2053s = gVar.f2053s;
        this.f2039e = gVar.f2039e;
        this.f2055u = gVar.f2055u;
        if (gVar.f2042h != null) {
            this.f2042h = new Rect(gVar.f2042h);
        }
    }
}
