package c2;

import a0.q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import c3.h;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f1243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f1248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f1249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f1250h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f1251i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ColorStateList f1252j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f1253k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f1254l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1255m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Typeface f1256n;

    public d(Context context, int i4) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i4, n1.a.f3563y);
        this.f1253k = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f1252j = h.P0(context, typedArrayObtainStyledAttributes, 3);
        h.P0(context, typedArrayObtainStyledAttributes, 4);
        h.P0(context, typedArrayObtainStyledAttributes, 5);
        this.f1245c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f1246d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i5 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f1254l = typedArrayObtainStyledAttributes.getResourceId(i5, 0);
        this.f1244b = typedArrayObtainStyledAttributes.getString(i5);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f1243a = h.P0(context, typedArrayObtainStyledAttributes, 6);
        this.f1247e = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f1248f = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f1249g = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i4, n1.a.f3555q);
        this.f1250h = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f1251i = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f1256n;
        int i4 = this.f1245c;
        if (typeface == null && (str = this.f1244b) != null) {
            this.f1256n = Typeface.create(str, i4);
        }
        if (this.f1256n == null) {
            int i5 = this.f1246d;
            if (i5 == 1) {
                this.f1256n = Typeface.SANS_SERIF;
            } else if (i5 == 2) {
                this.f1256n = Typeface.SERIF;
            } else if (i5 != 3) {
                this.f1256n = Typeface.DEFAULT;
            } else {
                this.f1256n = Typeface.MONOSPACE;
            }
            this.f1256n = Typeface.create(this.f1256n, i4);
        }
    }

    public final Typeface b(Context context) {
        if (this.f1255m) {
            return this.f1256n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceA = q.a(context, this.f1254l);
                this.f1256n = typefaceA;
                if (typefaceA != null) {
                    this.f1256n = Typeface.create(typefaceA, this.f1245c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e5) {
                Log.d("TextAppearance", "Error loading font " + this.f1244b, e5);
            }
        }
        a();
        this.f1255m = true;
        return this.f1256n;
    }

    public final void c(Context context, h hVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i4 = this.f1254l;
        if (i4 == 0) {
            this.f1255m = true;
        }
        if (this.f1255m) {
            hVar.I1(this.f1256n, true);
            return;
        }
        try {
            b bVar = new b(this, hVar);
            ThreadLocal threadLocal = q.f38a;
            if (context.isRestricted()) {
                bVar.O(-4);
            } else {
                q.b(context, i4, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f1255m = true;
            hVar.G1(1);
        } catch (Exception e5) {
            Log.d("TextAppearance", "Error loading font " + this.f1244b, e5);
            this.f1255m = true;
            hVar.G1(-3);
        }
    }

    public final boolean d(Context context) {
        int i4 = this.f1254l;
        Typeface typefaceB = null;
        if (i4 != 0) {
            ThreadLocal threadLocal = q.f38a;
            if (!context.isRestricted()) {
                typefaceB = q.b(context, i4, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceB != null;
    }

    public final void e(Context context, TextPaint textPaint, h hVar) {
        f(context, textPaint, hVar);
        ColorStateList colorStateList = this.f1252j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f1243a;
        textPaint.setShadowLayer(this.f1249g, this.f1247e, this.f1248f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, h hVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f1256n);
        c(context, new c(this, context, textPaint, hVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceY1 = h.y1(context.getResources().getConfiguration(), typeface);
        if (typefaceY1 != null) {
            typeface = typefaceY1;
        }
        textPaint.setTypeface(typeface);
        int i4 = (~typeface.getStyle()) & this.f1245c;
        textPaint.setFakeBoldText((i4 & 1) != 0);
        textPaint.setTextSkewX((i4 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f1253k);
        if (this.f1250h) {
            textPaint.setLetterSpacing(this.f1251i);
        }
    }
}
