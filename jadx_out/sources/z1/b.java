package z1;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import i0.e0;
import i0.f0;
import i0.v0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public CharSequence A;
    public CharSequence B;
    public boolean C;
    public Bitmap E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int[] L;
    public boolean M;
    public final TextPaint N;
    public final TextPaint O;
    public TimeInterpolator P;
    public TimeInterpolator Q;
    public float R;
    public float S;
    public float T;
    public ColorStateList U;
    public float V;
    public float W;
    public float X;
    public StaticLayout Y;
    public float Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f5443a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public float f5444a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f5445b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f5446b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f5447c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public CharSequence f5448c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f5449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f5451e;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f5458j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f5459k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f5460l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f5461m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f5462n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f5463o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f5464p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f5465q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Typeface f5466r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Typeface f5467s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Typeface f5468t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Typeface f5469u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Typeface f5470v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Typeface f5471w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Typeface f5472x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public c2.a f5473y;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5453f = 16;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5455g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f5456h = 15.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f5457i = 15.0f;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f5474z = TextUtils.TruncateAt.END;
    public final boolean D = true;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final int f5450d0 = 1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final float f5452e0 = 1.0f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final int f5454f0 = 1;

    public b(View view) {
        this.f5443a = view;
        TextPaint textPaint = new TextPaint(129);
        this.N = textPaint;
        this.O = new TextPaint(textPaint);
        this.f5449d = new Rect();
        this.f5447c = new Rect();
        this.f5451e = new RectF();
        g(view.getContext().getResources().getConfiguration());
    }

    public static int a(int i4, int i5, float f5) {
        float f6 = 1.0f - f5;
        return Color.argb(Math.round((Color.alpha(i5) * f5) + (Color.alpha(i4) * f6)), Math.round((Color.red(i5) * f5) + (Color.red(i4) * f6)), Math.round((Color.green(i5) * f5) + (Color.green(i4) * f6)), Math.round((Color.blue(i5) * f5) + (Color.blue(i4) * f6)));
    }

    public static float f(float f5, float f6, float f7, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f7 = timeInterpolator.getInterpolation(f7);
        }
        return o1.a.a(f5, f6, f7);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = v0.f2983a;
        boolean z4 = f0.d(this.f5443a) == 1;
        if (this.D) {
            return (z4 ? g0.k.f2300d : g0.k.f2299c).b(charSequence, charSequence.length());
        }
        return z4;
    }

    public final void c(float f5, boolean z4) {
        float f6;
        float f7;
        Typeface typeface;
        boolean z5;
        Layout.Alignment alignment;
        if (this.A == null) {
            return;
        }
        float fWidth = this.f5449d.width();
        float fWidth2 = this.f5447c.width();
        if (Math.abs(f5 - 1.0f) < 1.0E-5f) {
            f6 = this.f5457i;
            f7 = this.V;
            this.F = 1.0f;
            typeface = this.f5466r;
        } else {
            float f8 = this.f5456h;
            float f9 = this.W;
            Typeface typeface2 = this.f5469u;
            if (Math.abs(f5 - 0.0f) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = f(this.f5456h, this.f5457i, f5, this.Q) / this.f5456h;
            }
            float f10 = this.f5457i / this.f5456h;
            fWidth = (z4 || fWidth2 * f10 <= fWidth) ? fWidth2 : Math.min(fWidth / f10, fWidth2);
            f6 = f8;
            f7 = f9;
            typeface = typeface2;
        }
        TextPaint textPaint = this.N;
        if (fWidth > 0.0f) {
            boolean z6 = this.G != f6;
            boolean z7 = this.X != f7;
            boolean z8 = this.f5472x != typeface;
            StaticLayout staticLayout = this.Y;
            boolean z9 = z6 || z7 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z8 || this.M;
            this.G = f6;
            this.X = f7;
            this.f5472x = typeface;
            this.M = false;
            textPaint.setLinearText(this.F != 1.0f);
            z5 = z9;
        } else {
            z5 = false;
        }
        if (this.B == null || z5) {
            textPaint.setTextSize(this.G);
            textPaint.setTypeface(this.f5472x);
            textPaint.setLetterSpacing(this.X);
            boolean zB = b(this.A);
            this.C = zB;
            int i4 = this.f5450d0;
            if (i4 <= 1 || zB) {
                i4 = 1;
            }
            if (i4 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f5453f, zB ? 1 : 0) & 7;
                if (absoluteGravity == 1) {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                } else if (absoluteGravity != 5) {
                    alignment = this.C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                } else {
                    alignment = this.C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                }
            }
            g gVar = new g(this.A, textPaint, (int) fWidth);
            gVar.f5494l = this.f5474z;
            gVar.f5493k = zB;
            gVar.f5487e = alignment;
            gVar.f5492j = false;
            gVar.f5488f = i4;
            float f11 = this.f5452e0;
            gVar.f5489g = 0.0f;
            gVar.f5490h = f11;
            gVar.f5491i = this.f5454f0;
            StaticLayout staticLayoutA = gVar.a();
            staticLayoutA.getClass();
            this.Y = staticLayoutA;
            this.B = staticLayoutA.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.O;
        textPaint.setTextSize(this.f5457i);
        textPaint.setTypeface(this.f5466r);
        textPaint.setLetterSpacing(this.V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f5468t;
            if (typeface != null) {
                this.f5467s = c3.h.y1(configuration, typeface);
            }
            Typeface typeface2 = this.f5471w;
            if (typeface2 != null) {
                this.f5470v = c3.h.y1(configuration, typeface2);
            }
            Typeface typeface3 = this.f5467s;
            if (typeface3 == null) {
                typeface3 = this.f5468t;
            }
            this.f5466r = typeface3;
            Typeface typeface4 = this.f5470v;
            if (typeface4 == null) {
                typeface4 = this.f5471w;
            }
            this.f5469u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z4) {
        float fMeasureText;
        StaticLayout staticLayout;
        View view = this.f5443a;
        if ((view.getHeight() <= 0 || view.getWidth() <= 0) && !z4) {
            return;
        }
        c(1.0f, z4);
        CharSequence charSequence = this.B;
        TextPaint textPaint = this.N;
        if (charSequence != null && (staticLayout = this.Y) != null) {
            this.f5448c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f5474z);
        }
        CharSequence charSequence2 = this.f5448c0;
        if (charSequence2 != null) {
            this.Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f5455g, this.C ? 1 : 0);
        int i4 = absoluteGravity & 112;
        Rect rect = this.f5449d;
        if (i4 == 48) {
            this.f5461m = rect.top;
        } else if (i4 != 80) {
            this.f5461m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f5461m = textPaint.ascent() + rect.bottom;
        }
        int i5 = absoluteGravity & 8388615;
        if (i5 == 1) {
            this.f5463o = rect.centerX() - (this.Z / 2.0f);
        } else if (i5 != 5) {
            this.f5463o = rect.left;
        } else {
            this.f5463o = rect.right - this.Z;
        }
        c(0.0f, z4);
        StaticLayout staticLayout2 = this.Y;
        float height = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.Y;
        if (staticLayout3 == null || this.f5450d0 <= 1) {
            CharSequence charSequence3 = this.B;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.Y;
        if (staticLayout4 != null) {
            staticLayout4.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f5453f, this.C ? 1 : 0);
        int i6 = absoluteGravity2 & 112;
        Rect rect2 = this.f5447c;
        if (i6 == 48) {
            this.f5460l = rect2.top;
        } else if (i6 != 80) {
            this.f5460l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f5460l = textPaint.descent() + (rect2.bottom - height);
        }
        int i7 = absoluteGravity2 & 8388615;
        if (i7 == 1) {
            this.f5462n = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i7 != 5) {
            this.f5462n = rect2.left;
        } else {
            this.f5462n = rect2.right - fMeasureText;
        }
        Bitmap bitmap = this.E;
        if (bitmap != null) {
            bitmap.recycle();
            this.E = null;
        }
        l(this.f5445b);
        float f5 = this.f5445b;
        float f6 = f(rect2.left, rect.left, f5, this.P);
        RectF rectF = this.f5451e;
        rectF.left = f6;
        rectF.top = f(this.f5460l, this.f5461m, f5, this.P);
        rectF.right = f(rect2.right, rect.right, f5, this.P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f5, this.P);
        this.f5464p = f(this.f5462n, this.f5463o, f5, this.P);
        this.f5465q = f(this.f5460l, this.f5461m, f5, this.P);
        l(f5);
        t0.b bVar = o1.a.f3596b;
        this.f5444a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f5, bVar);
        WeakHashMap weakHashMap = v0.f2983a;
        e0.k(view);
        this.f5446b0 = f(1.0f, 0.0f, f5, bVar);
        e0.k(view);
        ColorStateList colorStateList = this.f5459k;
        ColorStateList colorStateList2 = this.f5458j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(e(colorStateList2), e(this.f5459k), f5));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f7 = this.V;
        float f8 = this.W;
        if (f7 != f8) {
            textPaint.setLetterSpacing(f(f8, f7, f5, bVar));
        } else {
            textPaint.setLetterSpacing(f7);
        }
        this.H = f(0.0f, this.R, f5, null);
        this.I = f(0.0f, this.S, f5, null);
        this.J = f(0.0f, this.T, f5, null);
        int iA = a(e(null), e(this.U), f5);
        this.K = iA;
        textPaint.setShadowLayer(this.H, this.I, this.J, iA);
        e0.k(view);
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f5459k == colorStateList && this.f5458j == colorStateList) {
            return;
        }
        this.f5459k = colorStateList;
        this.f5458j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        c2.a aVar = this.f5473y;
        if (aVar != null) {
            aVar.f1236l = true;
        }
        if (this.f5468t == typeface) {
            return false;
        }
        this.f5468t = typeface;
        Typeface typefaceY1 = c3.h.y1(this.f5443a.getContext().getResources().getConfiguration(), typeface);
        this.f5467s = typefaceY1;
        if (typefaceY1 == null) {
            typefaceY1 = this.f5468t;
        }
        this.f5466r = typefaceY1;
        return true;
    }

    public final void k(float f5) {
        if (f5 < 0.0f) {
            f5 = 0.0f;
        } else if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        if (f5 != this.f5445b) {
            this.f5445b = f5;
            Rect rect = this.f5447c;
            float f6 = rect.left;
            Rect rect2 = this.f5449d;
            float f7 = f(f6, rect2.left, f5, this.P);
            RectF rectF = this.f5451e;
            rectF.left = f7;
            rectF.top = f(this.f5460l, this.f5461m, f5, this.P);
            rectF.right = f(rect.right, rect2.right, f5, this.P);
            rectF.bottom = f(rect.bottom, rect2.bottom, f5, this.P);
            this.f5464p = f(this.f5462n, this.f5463o, f5, this.P);
            this.f5465q = f(this.f5460l, this.f5461m, f5, this.P);
            l(f5);
            t0.b bVar = o1.a.f3596b;
            this.f5444a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f5, bVar);
            WeakHashMap weakHashMap = v0.f2983a;
            View view = this.f5443a;
            e0.k(view);
            this.f5446b0 = f(1.0f, 0.0f, f5, bVar);
            e0.k(view);
            ColorStateList colorStateList = this.f5459k;
            ColorStateList colorStateList2 = this.f5458j;
            TextPaint textPaint = this.N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(e(colorStateList2), e(this.f5459k), f5));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f8 = this.V;
            float f9 = this.W;
            if (f8 != f9) {
                textPaint.setLetterSpacing(f(f9, f8, f5, bVar));
            } else {
                textPaint.setLetterSpacing(f8);
            }
            this.H = f(0.0f, this.R, f5, null);
            this.I = f(0.0f, this.S, f5, null);
            this.J = f(0.0f, this.T, f5, null);
            int iA = a(e(null), e(this.U), f5);
            this.K = iA;
            textPaint.setShadowLayer(this.H, this.I, this.J, iA);
            e0.k(view);
        }
    }

    public final void l(float f5) {
        c(f5, false);
        WeakHashMap weakHashMap = v0.f2983a;
        e0.k(this.f5443a);
    }

    public final void m(Typeface typeface) {
        boolean z4;
        boolean zJ = j(typeface);
        if (this.f5471w != typeface) {
            this.f5471w = typeface;
            Typeface typefaceY1 = c3.h.y1(this.f5443a.getContext().getResources().getConfiguration(), typeface);
            this.f5470v = typefaceY1;
            if (typefaceY1 == null) {
                typefaceY1 = this.f5471w;
            }
            this.f5469u = typefaceY1;
            z4 = true;
        } else {
            z4 = false;
        }
        if (zJ || z4) {
            h(false);
        }
    }
}
