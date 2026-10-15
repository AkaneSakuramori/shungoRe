package v1;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import f2.g;
import f2.h;
import f2.k;
import f2.o;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import z1.i;

/* JADX INFO: loaded from: classes.dex */
public final class f extends h implements Drawable.Callback, z1.h {
    public static final int[] H0 = {R.attr.state_enabled};
    public static final ShapeDrawable I0 = new ShapeDrawable(new OvalShape());
    public float A;
    public boolean A0;
    public float B;
    public ColorStateList B0;
    public ColorStateList C;
    public WeakReference C0;
    public float D;
    public TextUtils.TruncateAt D0;
    public ColorStateList E;
    public boolean E0;
    public CharSequence F;
    public int F0;
    public boolean G;
    public boolean G0;
    public Drawable H;
    public ColorStateList I;
    public float J;
    public boolean K;
    public boolean L;
    public Drawable M;
    public RippleDrawable N;
    public ColorStateList O;
    public float P;
    public SpannableStringBuilder Q;
    public boolean R;
    public boolean S;
    public Drawable T;
    public ColorStateList U;
    public o1.b V;
    public o1.b W;
    public float X;
    public float Y;
    public float Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public float f4779a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f4780b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public float f4781c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public float f4782d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public float f4783e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final Context f4784f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final Paint f4785g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Paint.FontMetrics f4786h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final RectF f4787i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final PointF f4788j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Path f4789k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final i f4790l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f4791m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f4792n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f4793o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f4794p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f4795q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f4796r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f4797s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f4798t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f4799u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public ColorFilter f4800v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public PorterDuffColorFilter f4801w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public ColorStateList f4802x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ColorStateList f4803y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public PorterDuff.Mode f4804y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ColorStateList f4805z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int[] f4806z0;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.shungo.app.R.attr.chipStyle, com.shungo.app.R.style.Widget_MaterialComponents_Chip_Action);
        this.B = -1.0f;
        this.f4785g0 = new Paint(1);
        this.f4786h0 = new Paint.FontMetrics();
        this.f4787i0 = new RectF();
        this.f4788j0 = new PointF();
        this.f4789k0 = new Path();
        this.f4799u0 = 255;
        this.f4804y0 = PorterDuff.Mode.SRC_IN;
        this.C0 = new WeakReference(null);
        i(context);
        this.f4784f0 = context;
        i iVar = new i(this);
        this.f4790l0 = iVar;
        this.F = "";
        iVar.f5495a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = H0;
        setState(iArr);
        if (!Arrays.equals(this.f4806z0, iArr)) {
            this.f4806z0 = iArr;
            if (U()) {
                w(getState(), iArr);
            }
        }
        this.E0 = true;
        int[] iArr2 = d2.a.f1763a;
        I0.setTint(-1);
    }

    public static void V(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean t(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean u(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(boolean z4) {
        if (this.S != z4) {
            boolean zS = S();
            this.S = z4;
            boolean zS2 = S();
            if (zS != zS2) {
                if (zS2) {
                    o(this.T);
                } else {
                    V(this.T);
                }
                invalidateSelf();
                v();
            }
        }
    }

    public final void B(float f5) {
        if (this.B != f5) {
            this.B = f5;
            k kVarE = this.f2057b.f2035a.e();
            kVarE.f2084e = new f2.a(f5);
            kVarE.f2085f = new f2.a(f5);
            kVarE.f2086g = new f2.a(f5);
            kVarE.f2087h = new f2.a(f5);
            setShapeAppearanceModel(kVarE.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final void C(Drawable drawable) {
        ?? r4;
        Object obj = this.H;
        if (obj == null) {
            r4 = 0;
        } else if (obj instanceof c0.e) {
            r4 = obj;
            ((c0.f) ((c0.e) obj)).getClass();
            r4 = 0;
        }
        if (r4 != drawable) {
            float fQ = q();
            this.H = drawable != null ? drawable.mutate() : null;
            float fQ2 = q();
            V(r4);
            if (T()) {
                o(this.H);
            }
            invalidateSelf();
            if (fQ != fQ2) {
                v();
            }
        }
    }

    public final void D(float f5) {
        if (this.J != f5) {
            float fQ = q();
            this.J = f5;
            float fQ2 = q();
            invalidateSelf();
            if (fQ != fQ2) {
                v();
            }
        }
    }

    public final void E(ColorStateList colorStateList) {
        this.K = true;
        if (this.I != colorStateList) {
            this.I = colorStateList;
            if (T()) {
                c0.b.h(this.H, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void F(boolean z4) {
        if (this.G != z4) {
            boolean zT = T();
            this.G = z4;
            boolean zT2 = T();
            if (zT != zT2) {
                if (zT2) {
                    o(this.H);
                } else {
                    V(this.H);
                }
                invalidateSelf();
                v();
            }
        }
    }

    public final void G(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            if (this.G0) {
                g gVar = this.f2057b;
                if (gVar.f2038d != colorStateList) {
                    gVar.f2038d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void H(float f5) {
        if (this.D != f5) {
            this.D = f5;
            this.f4785g0.setStrokeWidth(f5);
            if (this.G0) {
                this.f2057b.f2045k = f5;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final void I(Drawable drawable) {
        ?? r4;
        Object obj = this.M;
        if (obj == null) {
            r4 = 0;
        } else if (obj instanceof c0.e) {
            r4 = obj;
            ((c0.f) ((c0.e) obj)).getClass();
            r4 = 0;
        }
        if (r4 != drawable) {
            float fR = r();
            this.M = drawable != null ? drawable.mutate() : null;
            int[] iArr = d2.a.f1763a;
            this.N = new RippleDrawable(d2.a.a(this.E), this.M, I0);
            float fR2 = r();
            V(r4);
            if (U()) {
                o(this.M);
            }
            invalidateSelf();
            if (fR != fR2) {
                v();
            }
        }
    }

    public final void J(float f5) {
        if (this.f4782d0 != f5) {
            this.f4782d0 = f5;
            invalidateSelf();
            if (U()) {
                v();
            }
        }
    }

    public final void K(float f5) {
        if (this.P != f5) {
            this.P = f5;
            invalidateSelf();
            if (U()) {
                v();
            }
        }
    }

    public final void L(float f5) {
        if (this.f4781c0 != f5) {
            this.f4781c0 = f5;
            invalidateSelf();
            if (U()) {
                v();
            }
        }
    }

    public final void M(ColorStateList colorStateList) {
        if (this.O != colorStateList) {
            this.O = colorStateList;
            if (U()) {
                c0.b.h(this.M, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void N(boolean z4) {
        if (this.L != z4) {
            boolean zU = U();
            this.L = z4;
            boolean zU2 = U();
            if (zU != zU2) {
                if (zU2) {
                    o(this.M);
                } else {
                    V(this.M);
                }
                invalidateSelf();
                v();
            }
        }
    }

    public final void O(float f5) {
        if (this.Z != f5) {
            float fQ = q();
            this.Z = f5;
            float fQ2 = q();
            invalidateSelf();
            if (fQ != fQ2) {
                v();
            }
        }
    }

    public final void P(float f5) {
        if (this.Y != f5) {
            float fQ = q();
            this.Y = f5;
            float fQ2 = q();
            invalidateSelf();
            if (fQ != fQ2) {
                v();
            }
        }
    }

    public final void Q(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            this.B0 = this.A0 ? d2.a.a(colorStateList) : null;
            onStateChange(getState());
        }
    }

    public final void R(c2.d dVar) {
        i iVar = this.f4790l0;
        if (iVar.f5500f != dVar) {
            iVar.f5500f = dVar;
            if (dVar != null) {
                TextPaint textPaint = iVar.f5495a;
                Context context = this.f4784f0;
                b bVar = iVar.f5496b;
                dVar.f(context, textPaint, bVar);
                z1.h hVar = (z1.h) iVar.f5499e.get();
                if (hVar != null) {
                    textPaint.drawableState = hVar.getState();
                }
                dVar.e(context, textPaint, bVar);
                iVar.f5498d = true;
            }
            z1.h hVar2 = (z1.h) iVar.f5499e.get();
            if (hVar2 != null) {
                f fVar = (f) hVar2;
                fVar.v();
                fVar.invalidateSelf();
                fVar.onStateChange(hVar2.getState());
            }
        }
    }

    public final boolean S() {
        return this.S && this.T != null && this.f4797s0;
    }

    public final boolean T() {
        return this.G && this.H != null;
    }

    public final boolean U() {
        return this.L && this.M != null;
    }

    @Override // f2.h, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i4;
        RectF rectF;
        int i5;
        int i6;
        int i7;
        RectF rectF2;
        int iSave;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i4 = this.f4799u0) == 0) {
            return;
        }
        int iSaveLayerAlpha = i4 < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i4) : 0;
        boolean z4 = this.G0;
        Paint paint = this.f4785g0;
        RectF rectF3 = this.f4787i0;
        if (!z4) {
            paint.setColor(this.f4791m0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, s(), s(), paint);
        }
        if (!this.G0) {
            paint.setColor(this.f4792n0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f4800v0;
            if (colorFilter == null) {
                colorFilter = this.f4801w0;
            }
            paint.setColorFilter(colorFilter);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, s(), s(), paint);
        }
        if (this.G0) {
            super.draw(canvas);
        }
        if (this.D > 0.0f && !this.G0) {
            paint.setColor(this.f4794p0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.G0) {
                ColorFilter colorFilter2 = this.f4800v0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f4801w0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f5 = bounds.left;
            float f6 = this.D / 2.0f;
            rectF3.set(f5 + f6, bounds.top + f6, bounds.right - f6, bounds.bottom - f6);
            float f7 = this.B - (this.D / 2.0f);
            canvas.drawRoundRect(rectF3, f7, f7, paint);
        }
        paint.setColor(this.f4795q0);
        paint.setStyle(Paint.Style.FILL);
        rectF3.set(bounds);
        if (this.G0) {
            RectF rectF4 = new RectF(bounds);
            Path path = this.f4789k0;
            o oVar = this.f2074s;
            g gVar = this.f2057b;
            oVar.a(gVar.f2035a, gVar.f2044j, rectF4, this.f2073r, path);
            e(canvas, paint, path, this.f2057b.f2035a, g());
        } else {
            canvas.drawRoundRect(rectF3, s(), s(), paint);
        }
        if (T()) {
            p(bounds, rectF3);
            float f8 = rectF3.left;
            float f9 = rectF3.top;
            canvas.translate(f8, f9);
            this.H.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.H.draw(canvas);
            canvas.translate(-f8, -f9);
        }
        if (S()) {
            p(bounds, rectF3);
            float f10 = rectF3.left;
            float f11 = rectF3.top;
            canvas.translate(f10, f11);
            this.T.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.T.draw(canvas);
            canvas.translate(-f10, -f11);
        }
        if (!this.E0 || this.F == null) {
            rectF = rectF3;
            i5 = iSaveLayerAlpha;
            i6 = 0;
            i7 = 255;
        } else {
            PointF pointF = this.f4788j0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.F;
            i iVar = this.f4790l0;
            if (charSequence != null) {
                float fQ = q() + this.X + this.f4779a0;
                if (c0.c.a(this) == 0) {
                    pointF.x = bounds.left + fQ;
                } else {
                    pointF.x = bounds.right - fQ;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = iVar.f5495a;
                Paint.FontMetrics fontMetrics = this.f4786h0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF3.setEmpty();
            if (this.F != null) {
                float fQ2 = q() + this.X + this.f4779a0;
                float fR = r() + this.f4783e0 + this.f4780b0;
                if (c0.c.a(this) == 0) {
                    rectF3.left = bounds.left + fQ2;
                    rectF3.right = bounds.right - fR;
                } else {
                    rectF3.left = bounds.left + fR;
                    rectF3.right = bounds.right - fQ2;
                }
                rectF3.top = bounds.top;
                rectF3.bottom = bounds.bottom;
            }
            c2.d dVar = iVar.f5500f;
            TextPaint textPaint2 = iVar.f5495a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                iVar.f5500f.e(this.f4784f0, textPaint2, iVar.f5496b);
            }
            textPaint2.setTextAlign(align);
            boolean z5 = Math.round(iVar.a(this.F.toString())) > Math.round(rectF3.width());
            if (z5) {
                iSave = canvas.save();
                canvas.clipRect(rectF3);
            } else {
                iSave = 0;
            }
            CharSequence charSequenceEllipsize = this.F;
            if (z5 && this.D0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF3.width(), this.D0);
            }
            CharSequence charSequence2 = charSequenceEllipsize;
            int length = charSequence2.length();
            float f12 = pointF.x;
            float f13 = pointF.y;
            rectF = rectF3;
            i5 = iSaveLayerAlpha;
            i6 = 0;
            i7 = 255;
            canvas.drawText(charSequence2, 0, length, f12, f13, textPaint2);
            if (z5) {
                canvas.restoreToCount(iSave);
            }
        }
        if (U()) {
            rectF.setEmpty();
            if (U()) {
                float f14 = this.f4783e0 + this.f4782d0;
                if (c0.c.a(this) == 0) {
                    float f15 = bounds.right - f14;
                    rectF2 = rectF;
                    rectF2.right = f15;
                    rectF2.left = f15 - this.P;
                } else {
                    rectF2 = rectF;
                    float f16 = bounds.left + f14;
                    rectF2.left = f16;
                    rectF2.right = f16 + this.P;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f17 = this.P;
                float f18 = fExactCenterY - (f17 / 2.0f);
                rectF2.top = f18;
                rectF2.bottom = f18 + f17;
            } else {
                rectF2 = rectF;
            }
            float f19 = rectF2.left;
            float f20 = rectF2.top;
            canvas.translate(f19, f20);
            this.M.setBounds(i6, i6, (int) rectF2.width(), (int) rectF2.height());
            int[] iArr = d2.a.f1763a;
            this.N.setBounds(this.M.getBounds());
            this.N.jumpToCurrentState();
            this.N.draw(canvas);
            canvas.translate(-f19, -f20);
        }
        if (this.f4799u0 < i7) {
            canvas.restoreToCount(i5);
        }
    }

    @Override // f2.h, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f4799u0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f4800v0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.A;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(r() + this.f4790l0.a(this.F.toString()) + q() + this.X + this.f4779a0 + this.f4780b0 + this.f4783e0), this.F0);
    }

    @Override // f2.h, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // f2.h, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.G0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.A, this.B);
        } else {
            outline.setRoundRect(bounds, this.B);
        }
        outline.setAlpha(this.f4799u0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // f2.h, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        c2.d dVar;
        ColorStateList colorStateList;
        return t(this.f4803y) || t(this.f4805z) || t(this.C) || (this.A0 && t(this.B0)) || (!((dVar = this.f4790l0.f5500f) == null || (colorStateList = dVar.f1252j) == null || !colorStateList.isStateful()) || ((this.S && this.T != null && this.R) || u(this.H) || u(this.T) || t(this.f4802x0)));
    }

    public final void o(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        c0.c.b(drawable, c0.c.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.M) {
            if (drawable.isStateful()) {
                drawable.setState(this.f4806z0);
            }
            c0.b.h(drawable, this.O);
            return;
        }
        Drawable drawable2 = this.H;
        if (drawable == drawable2 && this.K) {
            c0.b.h(drawable2, this.I);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i4) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i4);
        if (T()) {
            zOnLayoutDirectionChanged |= c0.c.b(this.H, i4);
        }
        if (S()) {
            zOnLayoutDirectionChanged |= c0.c.b(this.T, i4);
        }
        if (U()) {
            zOnLayoutDirectionChanged |= c0.c.b(this.M, i4);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i4) {
        boolean zOnLevelChange = super.onLevelChange(i4);
        if (T()) {
            zOnLevelChange |= this.H.setLevel(i4);
        }
        if (S()) {
            zOnLevelChange |= this.T.setLevel(i4);
        }
        if (U()) {
            zOnLevelChange |= this.M.setLevel(i4);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // f2.h, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.G0) {
            super.onStateChange(iArr);
        }
        return w(iArr, this.f4806z0);
    }

    public final void p(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (T() || S()) {
            float f5 = this.X + this.Y;
            Drawable drawable = this.f4797s0 ? this.T : this.H;
            float intrinsicWidth = this.J;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (c0.c.a(this) == 0) {
                float f6 = rect.left + f5;
                rectF.left = f6;
                rectF.right = f6 + intrinsicWidth;
            } else {
                float f7 = rect.right - f5;
                rectF.right = f7;
                rectF.left = f7 - intrinsicWidth;
            }
            Drawable drawable2 = this.f4797s0 ? this.T : this.H;
            float fCeil = this.J;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f4784f0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    public final float q() {
        if (!T() && !S()) {
            return 0.0f;
        }
        float f5 = this.Y;
        Drawable drawable = this.f4797s0 ? this.T : this.H;
        float intrinsicWidth = this.J;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f5 + this.Z;
    }

    public final float r() {
        if (U()) {
            return this.f4781c0 + this.P + this.f4782d0;
        }
        return 0.0f;
    }

    public final float s() {
        return this.G0 ? this.f2057b.f2035a.f2096e.a(g()) : this.B;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j4);
        }
    }

    @Override // f2.h, android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        if (this.f4799u0 != i4) {
            this.f4799u0 = i4;
            invalidateSelf();
        }
    }

    @Override // f2.h, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f4800v0 != colorFilter) {
            this.f4800v0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // f2.h, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f4802x0 != colorStateList) {
            this.f4802x0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // f2.h, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f4804y0 != mode) {
            this.f4804y0 = mode;
            ColorStateList colorStateList = this.f4802x0;
            this.f4801w0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z5) {
        boolean visible = super.setVisible(z4, z5);
        if (T()) {
            visible |= this.H.setVisible(z4, z5);
        }
        if (S()) {
            visible |= this.T.setVisible(z4, z5);
        }
        if (U()) {
            visible |= this.M.setVisible(z4, z5);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v() {
        e eVar = (e) this.C0.get();
        if (eVar != null) {
            Chip chip = (Chip) eVar;
            chip.b(chip.f1428q);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    public final boolean w(int[] iArr, int[] iArr2) {
        boolean z4;
        boolean z5;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f4803y;
        int iC = c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f4791m0) : 0);
        boolean state = true;
        if (this.f4791m0 != iC) {
            this.f4791m0 = iC;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f4805z;
        int iC2 = c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f4792n0) : 0);
        if (this.f4792n0 != iC2) {
            this.f4792n0 = iC2;
            zOnStateChange = true;
        }
        int iB = b0.a.b(iC2, iC);
        if ((this.f4793o0 != iB) | (this.f2057b.f2037c == null)) {
            this.f4793o0 = iB;
            k(ColorStateList.valueOf(iB));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.C;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f4794p0) : 0;
        if (this.f4794p0 != colorForState) {
            this.f4794p0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.B0 == null || !d2.a.b(iArr)) ? 0 : this.B0.getColorForState(iArr, this.f4795q0);
        if (this.f4795q0 != colorForState2) {
            this.f4795q0 = colorForState2;
            if (this.A0) {
                zOnStateChange = true;
            }
        }
        c2.d dVar = this.f4790l0.f5500f;
        int colorForState3 = (dVar == null || (colorStateList = dVar.f1252j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f4796r0);
        if (this.f4796r0 != colorForState3) {
            this.f4796r0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 != null) {
            int length = state2.length;
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    if (state2[i4] != 16842912) {
                        i4++;
                    } else if (this.R) {
                        z4 = true;
                        break;
                    }
                }
                z4 = false;
                break;
            }
        } else {
            z4 = false;
            break;
        }
        if (this.f4797s0 == z4 || this.T == null) {
            z5 = false;
        } else {
            float fQ = q();
            this.f4797s0 = z4;
            if (fQ != q()) {
                zOnStateChange = true;
                z5 = true;
            } else {
                z5 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.f4802x0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f4798t0) : 0;
        if (this.f4798t0 != colorForState4) {
            this.f4798t0 = colorForState4;
            ColorStateList colorStateList6 = this.f4802x0;
            PorterDuff.Mode mode = this.f4804y0;
            this.f4801w0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (u(this.H)) {
            state |= this.H.setState(iArr);
        }
        if (u(this.T)) {
            state |= this.T.setState(iArr);
        }
        if (u(this.M)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.M.setState(iArr3);
        }
        int[] iArr4 = d2.a.f1763a;
        if (u(this.N)) {
            state |= this.N.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z5) {
            v();
        }
        return state;
    }

    public final void x(boolean z4) {
        if (this.R != z4) {
            this.R = z4;
            float fQ = q();
            if (!z4 && this.f4797s0) {
                this.f4797s0 = false;
            }
            float fQ2 = q();
            invalidateSelf();
            if (fQ != fQ2) {
                v();
            }
        }
    }

    public final void y(Drawable drawable) {
        if (this.T != drawable) {
            float fQ = q();
            this.T = drawable;
            float fQ2 = q();
            V(this.T);
            o(this.T);
            invalidateSelf();
            if (fQ != fQ2) {
                v();
            }
        }
    }

    public final void z(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.U != colorStateList) {
            this.U = colorStateList;
            if (this.S && (drawable = this.T) != null && this.R) {
                c0.b.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }
}
