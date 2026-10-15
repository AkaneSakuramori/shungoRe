package z1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import i.e2;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends e2 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Drawable f5477q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Rect f5478r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rect f5479s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f5480t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f5481u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f5482v;

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f5478r = new Rect();
        this.f5479s = new Rect();
        this.f5480t = 119;
        this.f5481u = true;
        this.f5482v = false;
        int[] iArr = n1.a.f3546h;
        k.a(context, attributeSet, 0, 0);
        k.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f5480t = typedArrayObtainStyledAttributes.getInt(1, this.f5480t);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f5481u = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f5477q;
        if (drawable != null) {
            if (this.f5482v) {
                this.f5482v = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z4 = this.f5481u;
                Rect rect = this.f5478r;
                if (z4) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i4 = this.f5480t;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f5479s;
                Gravity.apply(i4, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f5, float f6) {
        super.drawableHotspotChanged(f5, f6);
        Drawable drawable = this.f5477q;
        if (drawable != null) {
            drawable.setHotspot(f5, f6);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f5477q;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f5477q.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f5477q;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f5480t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f5477q;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // i.e2, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        this.f5482v = z4 | this.f5482v;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        this.f5482v = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f5477q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f5477q);
            }
            this.f5477q = drawable;
            this.f5482v = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f5480t == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i4) {
        if (this.f5480t != i4) {
            if ((8388615 & i4) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            this.f5480t = i4;
            if (i4 == 119 && this.f5477q != null) {
                this.f5477q.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f5477q;
    }
}
