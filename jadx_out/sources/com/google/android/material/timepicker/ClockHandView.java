package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.shungo.app.R;
import i0.e0;
import i0.v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ValueAnimator f1603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f1605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f1607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f1608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RectF f1609h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f1610i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f1611j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1612k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public double f1613l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1614m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1615n;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f1603b = new ValueAnimator();
        this.f1605d = new ArrayList();
        Paint paint = new Paint();
        this.f1608g = paint;
        this.f1609h = new RectF();
        this.f1615n = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n1.a.f3543e, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        c3.h.k2(context, R.attr.motionDurationLong2, 200);
        c3.h.l2(context, R.attr.motionEasingEmphasizedInterpolator, o1.a.f3596b);
        this.f1614m = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f1606e = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f1610i = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f1607f = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = v0.f2983a;
        e0.s(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int a(int i4) {
        return i4 == 2 ? Math.round(this.f1614m * 0.66f) : this.f1614m;
    }

    public final void b(float f5) {
        ValueAnimator valueAnimator = this.f1603b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c(f5);
    }

    public final void c(float f5) {
        float f6 = f5 % 360.0f;
        this.f1611j = f6;
        this.f1613l = Math.toRadians(f6 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fA = a(this.f1615n);
        float fCos = (((float) Math.cos(this.f1613l)) * fA) + width;
        float fSin = (fA * ((float) Math.sin(this.f1613l))) + height;
        float f7 = this.f1606e;
        this.f1609h.set(fCos - f7, fSin - f7, fCos + f7, fSin + f7);
        Iterator it = this.f1605d.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((d) it.next());
            if (Math.abs(clockFaceView.J - f6) > 0.001f) {
                clockFaceView.J = f6;
                clockFaceView.o();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int iA = a(this.f1615n);
        float f5 = width;
        float f6 = iA;
        float fCos = (((float) Math.cos(this.f1613l)) * f6) + f5;
        float f7 = height;
        float fSin = (f6 * ((float) Math.sin(this.f1613l))) + f7;
        Paint paint = this.f1608g;
        paint.setStrokeWidth(0.0f);
        int i4 = this.f1606e;
        canvas.drawCircle(fCos, fSin, i4, paint);
        double dSin = Math.sin(this.f1613l);
        double d5 = iA - i4;
        paint.setStrokeWidth(this.f1610i);
        canvas.drawLine(f5, f7, width + ((int) (Math.cos(this.f1613l) * d5)), height + ((int) (d5 * dSin)), paint);
        canvas.drawCircle(f5, f7, this.f1607f, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        if (this.f1603b.isRunning()) {
            return;
        }
        b(this.f1611j);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean z5;
        int actionMasked = motionEvent.getActionMasked();
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        boolean z6 = false;
        if (actionMasked == 0) {
            this.f1612k = false;
            z4 = true;
            z5 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z5 = this.f1612k;
            if (this.f1604c) {
                this.f1615n = ((float) Math.hypot((double) (x4 - ((float) (getWidth() / 2))), (double) (y4 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z4 = false;
        } else {
            z5 = false;
            z4 = false;
        }
        boolean z7 = this.f1612k;
        int degrees = (int) Math.toDegrees(Math.atan2(y4 - (getHeight() / 2), x4 - (getWidth() / 2)));
        int i4 = degrees + 90;
        if (i4 < 0) {
            i4 = degrees + 450;
        }
        float f5 = i4;
        boolean z8 = this.f1611j != f5;
        if (z4 && z8) {
            z6 = true;
        } else if (z8 || z5) {
            b(f5);
            z6 = true;
        }
        this.f1612k = z7 | z6;
        return true;
    }
}
