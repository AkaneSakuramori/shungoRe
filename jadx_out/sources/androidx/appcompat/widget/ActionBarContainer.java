package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.shungo.app.R;
import i.x2;
import i0.e0;
import i0.v0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f382h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f383i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f384j;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.b bVar = new i.b(this);
        WeakHashMap weakHashMap = v0.f2983a;
        e0.q(this, bVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.a.f1654a);
        boolean z4 = false;
        this.f379e = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f380f = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f384j = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f382h = true;
            this.f381g = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f382h ? !(this.f379e != null || this.f380f != null) : this.f381g == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f379e;
        if (drawable != null && drawable.isStateful()) {
            this.f379e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f380f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f380f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f381g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f381g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f379e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f380f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f381g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f377c = findViewById(R.id.action_bar);
        this.f378d = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f376b || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        boolean z5;
        super.onLayout(z4, i4, i5, i6, i7);
        if (this.f382h) {
            Drawable drawable = this.f381g;
            if (drawable == null) {
                return;
            } else {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        } else {
            if (this.f379e != null) {
                if (this.f377c.getVisibility() == 0) {
                    this.f379e.setBounds(this.f377c.getLeft(), this.f377c.getTop(), this.f377c.getRight(), this.f377c.getBottom());
                } else {
                    View view = this.f378d;
                    if (view == null || view.getVisibility() != 0) {
                        this.f379e.setBounds(0, 0, 0, 0);
                    } else {
                        this.f379e.setBounds(this.f378d.getLeft(), this.f378d.getTop(), this.f378d.getRight(), this.f378d.getBottom());
                    }
                }
                z5 = true;
            } else {
                z5 = false;
            }
            this.f383i = false;
            if (!z5) {
                return;
            }
        }
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        if (this.f377c == null && View.MeasureSpec.getMode(i5) == Integer.MIN_VALUE && (i6 = this.f384j) >= 0) {
            i5 = View.MeasureSpec.makeMeasureSpec(Math.min(i6, View.MeasureSpec.getSize(i5)), Integer.MIN_VALUE);
        }
        super.onMeasure(i4, i5);
        if (this.f377c == null) {
            return;
        }
        View.MeasureSpec.getMode(i5);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f379e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f379e);
        }
        this.f379e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f377c;
            if (view != null) {
                this.f379e.setBounds(view.getLeft(), this.f377c.getTop(), this.f377c.getRight(), this.f377c.getBottom());
            }
        }
        boolean z4 = false;
        if (!this.f382h ? !(this.f379e != null || this.f380f != null) : this.f381g == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f381g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f381g);
        }
        this.f381g = drawable;
        boolean z4 = this.f382h;
        boolean z5 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z4 && (drawable2 = this.f381g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z4 ? !(this.f379e != null || this.f380f != null) : this.f381g == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f380f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f380f);
        }
        this.f380f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f383i && this.f380f != null) {
                throw null;
            }
        }
        boolean z4 = false;
        if (!this.f382h ? !(this.f379e != null || this.f380f != null) : this.f381g == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(x2 x2Var) {
    }

    public void setTransitioning(boolean z4) {
        this.f376b = z4;
        setDescendantFocusability(z4 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        boolean z4 = i4 == 0;
        Drawable drawable = this.f379e;
        if (drawable != null) {
            drawable.setVisible(z4, false);
        }
        Drawable drawable2 = this.f380f;
        if (drawable2 != null) {
            drawable2.setVisible(z4, false);
        }
        Drawable drawable3 = this.f381g;
        if (drawable3 != null) {
            drawable3.setVisible(z4, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f379e;
        boolean z4 = this.f382h;
        return (drawable == drawable2 && !z4) || (drawable == this.f380f && this.f383i) || ((drawable == this.f381g && z4) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i4) {
        if (i4 != 0) {
            return super.startActionModeForChild(view, callback, i4);
        }
        return null;
    }
}
