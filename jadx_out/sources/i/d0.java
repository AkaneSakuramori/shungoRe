package i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements j0.b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2549b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f2550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2551d;

    public d0(ImageView imageView) {
        this.f2550c = imageView;
    }

    public final void a() {
        o3 o3Var;
        ImageView imageView = (ImageView) this.f2550c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            t1.a(drawable);
        }
        if (drawable == null || (o3Var = (o3) this.f2551d) == null) {
            return;
        }
        x.d(drawable, o3Var, imageView.getDrawableState());
    }

    public final void b(AttributeSet attributeSet, int i4) {
        int iN;
        View view = this.f2550c;
        ImageView imageView = (ImageView) view;
        Context context = imageView.getContext();
        int[] iArr = d.a.f1659f;
        e.c cVarU = e.c.u(context, attributeSet, iArr, i4);
        i0.v0.k(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) cVarU.f1780d, i4);
        try {
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null && (iN = cVarU.n(1, -1)) != -1 && (drawable = r3.q.g(((ImageView) view).getContext(), iN)) != null) {
                ((ImageView) view).setImageDrawable(drawable);
            }
            if (drawable != null) {
                t1.a(drawable);
            }
            if (cVarU.r(2)) {
                m0.f.c((ImageView) view, cVarU.c(2));
            }
            if (cVarU.r(3)) {
                m0.f.d((ImageView) view, t1.b(cVarU.k(3, -1), null));
            }
        } finally {
            cVarU.v();
        }
    }

    public final void c(int i4) {
        View view = this.f2550c;
        if (i4 != 0) {
            ImageView imageView = (ImageView) view;
            Drawable drawableG = r3.q.g(imageView.getContext(), i4);
            if (drawableG != null) {
                t1.a(drawableG);
            }
            imageView.setImageDrawable(drawableG);
        } else {
            ((ImageView) view).setImageDrawable(null);
        }
        a();
    }

    public final void d(ColorStateList colorStateList) {
        if (((o3) this.f2551d) == null) {
            this.f2551d = new o3(0);
        }
        o3 o3Var = (o3) this.f2551d;
        o3Var.f2739c = colorStateList;
        o3Var.f2738b = true;
        a();
    }

    public final void e(PorterDuff.Mode mode) {
        if (((o3) this.f2551d) == null) {
            this.f2551d = new o3(0);
        }
        o3 o3Var = (o3) this.f2551d;
        o3Var.f2740d = mode;
        o3Var.f2737a = true;
        a();
    }

    @Override // j0.b0
    public final boolean j(View view) {
        throw null;
    }
}
