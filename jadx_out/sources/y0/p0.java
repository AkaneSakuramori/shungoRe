package y0;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class p0 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d1 f5273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f5274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5276d;

    public p0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5274b = new Rect();
        this.f5275c = true;
        this.f5276d = false;
    }

    public p0(int i4, int i5) {
        super(i4, i5);
        this.f5274b = new Rect();
        this.f5275c = true;
        this.f5276d = false;
    }

    public p0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f5274b = new Rect();
        this.f5275c = true;
        this.f5276d = false;
    }

    public p0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f5274b = new Rect();
        this.f5275c = true;
        this.f5276d = false;
    }

    public p0(p0 p0Var) {
        super((ViewGroup.LayoutParams) p0Var);
        this.f5274b = new Rect();
        this.f5275c = true;
        this.f5276d = false;
    }
}
