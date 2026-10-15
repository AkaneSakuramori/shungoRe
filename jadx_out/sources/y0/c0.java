package y0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends z {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f5086q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f5087r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Object obj, Context context, int i4) {
        super(context);
        this.f5086q = i4;
        this.f5087r = obj;
    }

    @Override // y0.z
    public final int b(View view, int i4) {
        switch (this.f5086q) {
            case 1:
                ((CarouselLayoutManager) this.f5087r).getClass();
                return 0;
            default:
                return super.b(view, i4);
        }
    }

    @Override // y0.z
    public final int c(View view, int i4) {
        switch (this.f5086q) {
            case 1:
                ((CarouselLayoutManager) this.f5087r).getClass();
                return 0;
            default:
                return super.c(view, i4);
        }
    }

    @Override // y0.z
    public final float d(DisplayMetrics displayMetrics) {
        switch (this.f5086q) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            case 1:
            default:
                return 25.0f / displayMetrics.densityDpi;
            case 2:
                return 100.0f / displayMetrics.densityDpi;
        }
    }

    @Override // y0.z
    public final int e(int i4) {
        switch (this.f5086q) {
            case 0:
                return Math.min(100, super.e(i4));
            default:
                return super.e(i4);
        }
    }

    @Override // y0.z
    public final PointF f(int i4) {
        switch (this.f5086q) {
            case 1:
                ((CarouselLayoutManager) this.f5087r).getClass();
                return null;
            default:
                return super.f(i4);
        }
    }

    @Override // y0.z
    public final void h(View view, a1 a1Var, y0 y0Var) {
        switch (this.f5086q) {
            case 0:
                d0 d0Var = (d0) this.f5087r;
                int[] iArrA = d0Var.a(d0Var.f5098a.getLayoutManager(), view);
                int i4 = iArrA[0];
                int i5 = iArrA[1];
                int iCeil = (int) Math.ceil(((double) e(Math.max(Math.abs(i4), Math.abs(i5)))) / 0.3356d);
                if (iCeil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f5358j;
                    y0Var.f5342a = i4;
                    y0Var.f5343b = i5;
                    y0Var.f5344c = iCeil;
                    y0Var.f5346e = decelerateInterpolator;
                    y0Var.f5347f = true;
                }
                break;
            default:
                super.h(view, a1Var, y0Var);
                break;
        }
    }
}
