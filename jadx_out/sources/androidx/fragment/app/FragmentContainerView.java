package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.shungo.app.R;
import i0.c2;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f662e;

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        this.f662e = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s0.a.f4198b);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + "\"");
        }
    }

    public final void a(View view) {
        ArrayList arrayList = this.f660c;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f659b == null) {
            this.f659b = new ArrayList();
        }
        this.f659b.add(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof q ? (q) tag : null) != null) {
            super.addView(view, i4, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i4, ViewGroup.LayoutParams layoutParams, boolean z4) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof q ? (q) tag : null) != null) {
            return super.addViewInLayout(view, i4, layoutParams, z4);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        c2 c2VarG;
        c2 c2VarG2 = c2.g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f661d;
        if (onApplyWindowInsetsListener != null) {
            c2VarG = c2.g(null, onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            WeakHashMap weakHashMap = i0.v0.f2983a;
            WindowInsets windowInsetsF = c2VarG2.f();
            if (windowInsetsF != null) {
                WindowInsets windowInsetsB = i0.i0.b(this, windowInsetsF);
                if (!windowInsetsB.equals(windowInsetsF)) {
                    c2VarG2 = c2.g(this, windowInsetsB);
                }
            }
            c2VarG = c2VarG2;
        }
        if (!c2VarG.f2902a.m()) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                WeakHashMap weakHashMap2 = i0.v0.f2983a;
                WindowInsets windowInsetsF2 = c2VarG.f();
                if (windowInsetsF2 != null) {
                    WindowInsets windowInsetsA = i0.i0.a(childAt, windowInsetsF2);
                    if (!windowInsetsA.equals(windowInsetsF2)) {
                        c2.g(childAt, windowInsetsA);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f662e && this.f659b != null) {
            for (int i4 = 0; i4 < this.f659b.size(); i4++) {
                super.drawChild(canvas, (View) this.f659b.get(i4), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j4) {
        ArrayList arrayList;
        if (!this.f662e || (arrayList = this.f659b) == null || arrayList.size() <= 0 || !this.f659b.contains(view)) {
            return super.drawChild(canvas, view, j4);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        ArrayList arrayList = this.f660c;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList arrayList2 = this.f659b;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f662e = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z4) {
        if (z4) {
            a(view);
        }
        super.removeDetachedView(view, z4);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i4) {
        a(getChildAt(i4));
        super.removeViewAt(i4);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i4, int i5) {
        for (int i6 = i4; i6 < i4 + i5; i6++) {
            a(getChildAt(i6));
        }
        super.removeViews(i4, i5);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i4, int i5) {
        for (int i6 = i4; i6 < i4 + i5; i6++) {
            a(getChildAt(i6));
        }
        super.removeViewsInLayout(i4, i5);
    }

    public void setDrawDisappearingViewsLast(boolean z4) {
        this.f662e = z4;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f661d = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f660c == null) {
                this.f660c = new ArrayList();
            }
            this.f660c.add(view);
        }
        super.startViewTransition(view);
    }
}
