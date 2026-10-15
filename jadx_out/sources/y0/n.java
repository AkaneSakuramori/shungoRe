package y0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class n extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5220a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5221b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5222c;

    public n(View view) {
        this.f5222c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f5220a) {
            case 0:
                this.f5221b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i4 = this.f5220a;
        Object obj = this.f5222c;
        switch (i4) {
            case 0:
                if (!this.f5221b) {
                    p pVar = (p) obj;
                    if (((Float) pVar.f5272z.getAnimatedValue()).floatValue() != 0.0f) {
                        pVar.A = 2;
                        pVar.f5265s.invalidate();
                    } else {
                        pVar.A = 0;
                        pVar.f(0);
                    }
                } else {
                    this.f5221b = false;
                }
                break;
            default:
                View view = (View) obj;
                c1.y.f1231a.i(view, 1.0f);
                if (this.f5221b) {
                    view.setLayerType(0, null);
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f5220a) {
            case 1:
                View view = (View) this.f5222c;
                WeakHashMap weakHashMap = i0.v0.f2983a;
                if (i0.e0.h(view) && view.getLayerType() == 0) {
                    this.f5221b = true;
                    view.setLayerType(2, null);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public n(p pVar) {
        this.f5222c = pVar;
    }
}
