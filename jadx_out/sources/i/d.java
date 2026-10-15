package i;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2548b;

    public /* synthetic */ d(int i4, Object obj) {
        this.f2547a = i4;
        this.f2548b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f2547a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2548b;
                actionBarOverlayLayout.f427x = null;
                actionBarOverlayLayout.f415l = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i4 = this.f2547a;
        Object obj = this.f2548b;
        switch (i4) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.f427x = null;
                actionBarOverlayLayout.f415l = false;
                return;
            case 1:
                ((c1.q) obj).m();
                animator.removeListener(this);
                return;
            case 2:
                d1.e eVar = (d1.e) obj;
                ArrayList arrayList = new ArrayList(eVar.f1695f);
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ColorStateList colorStateList = ((u1.a) arrayList.get(i5)).f4675b.f4688p;
                    if (colorStateList != null) {
                        c0.b.h(eVar, colorStateList);
                    }
                }
                return;
            case 3:
                ((HideBottomViewOnScrollBehavior) obj).f1346h = null;
                return;
            case 4:
            default:
                ((ExpandableTransformationBehavior) obj).getClass();
                return;
            case 5:
                defpackage.a.n(obj);
                throw null;
            case 6:
                i2.k kVar = (i2.k) obj;
                kVar.q();
                kVar.f3031r.start();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i4 = this.f2547a;
        Object obj = this.f2548b;
        switch (i4) {
            case 2:
                d1.e eVar = (d1.e) obj;
                ArrayList arrayList = new ArrayList(eVar.f1695f);
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    u1.c cVar = ((u1.a) arrayList.get(i5)).f4675b;
                    ColorStateList colorStateList = cVar.f4688p;
                    if (colorStateList != null) {
                        c0.b.g(eVar, colorStateList.getColorForState(cVar.f4692t, colorStateList.getDefaultColor()));
                    }
                }
                return;
            case 5:
                defpackage.a.n(obj);
                throw null;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
