package o1;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import n.k;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f3599a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f3600b = new k();

    public static b a(Context context, int i4) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i4);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return b(arrayList);
        } catch (Exception e5) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i4), e5);
            return null;
        }
    }

    public static b b(ArrayList arrayList) {
        b bVar = new b();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            Animator animator = (Animator) arrayList.get(i4);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            bVar.f3600b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = a.f3596b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = a.f3597c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = a.f3598d;
            }
            c cVar = new c();
            cVar.f3604d = 0;
            cVar.f3605e = 1;
            cVar.f3601a = startDelay;
            cVar.f3602b = duration;
            cVar.f3603c = interpolator;
            cVar.f3604d = objectAnimator.getRepeatCount();
            cVar.f3605e = objectAnimator.getRepeatMode();
            bVar.f3599a.put(propertyName, cVar);
        }
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f3599a.equals(((b) obj).f3599a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3599a.hashCode();
    }

    public final String toString() {
        return "\n" + b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f3599a + "}\n";
    }
}
