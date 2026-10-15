package c1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import i0.v0;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g extends q {
    public static final c A;
    public static final c B;
    public static final c C;
    public static final c D;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String[] f1164y = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final c f1165z;

    static {
        new b(PointF.class, "boundsOrigin").f1141a = new Rect();
        f1165z = new c(PointF.class, "topLeft", 0);
        A = new c(PointF.class, "bottomRight", 1);
        B = new c(PointF.class, "bottomRight", 2);
        C = new c(PointF.class, "topLeft", 3);
        D = new c(PointF.class, "position", 4);
    }

    public static void H(x xVar) {
        View view = xVar.f1229b;
        WeakHashMap weakHashMap = v0.f2983a;
        if (!i0.h0.c(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap map = xVar.f1228a;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", xVar.f1229b.getParent());
    }

    @Override // c1.q
    public final void d(x xVar) {
        H(xVar);
    }

    @Override // c1.q
    public final void g(x xVar) {
        H(xVar);
    }

    @Override // c1.q
    public final Animator k(ViewGroup viewGroup, x xVar, x xVar2) {
        int i4;
        g gVar;
        Animator animatorOfObject;
        if (xVar == null || xVar2 == null) {
            return null;
        }
        HashMap map = xVar.f1228a;
        HashMap map2 = xVar2.f1228a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        Rect rect = (Rect) map.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
        int i5 = rect.left;
        int i6 = rect2.left;
        int i7 = rect.top;
        int i8 = rect2.top;
        int i9 = rect.right;
        int i10 = rect2.right;
        int i11 = rect.bottom;
        int i12 = rect2.bottom;
        int i13 = i9 - i5;
        int i14 = i11 - i7;
        int i15 = i10 - i6;
        int i16 = i12 - i8;
        Rect rect3 = (Rect) map.get("android:changeBounds:clip");
        Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
        if ((i13 == 0 || i14 == 0) && (i15 == 0 || i16 == 0)) {
            i4 = 0;
        } else {
            i4 = (i5 == i6 && i7 == i8) ? 0 : 1;
            if (i9 != i10 || i11 != i12) {
                i4++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i4++;
        }
        int i17 = i4;
        if (i17 <= 0) {
            return null;
        }
        View view = xVar2.f1229b;
        y.a(view, i5, i7, i9, i11);
        if (i17 != 2) {
            gVar = this;
            if (i5 == i6 && i7 == i8) {
                gVar.f1216u.getClass();
                animatorOfObject = ObjectAnimator.ofObject(view, B, (TypeConverter) null, z0.c.c(i9, i11, i10, i12));
            } else {
                gVar.f1216u.getClass();
                animatorOfObject = ObjectAnimator.ofObject(view, C, (TypeConverter) null, z0.c.c(i5, i7, i6, i8));
            }
        } else if (i13 == i15 && i14 == i16) {
            gVar = this;
            gVar.f1216u.getClass();
            animatorOfObject = ObjectAnimator.ofObject(view, D, (TypeConverter) null, z0.c.c(i5, i7, i6, i8));
        } else {
            gVar = this;
            f fVar = new f();
            fVar.f1155e = view;
            gVar.f1216u.getClass();
            ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(fVar, f1165z, (TypeConverter) null, z0.c.c(i5, i7, i6, i8));
            gVar.f1216u.getClass();
            ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(fVar, A, (TypeConverter) null, z0.c.c(i9, i11, i10, i12));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfObject, objectAnimatorOfObject2);
            animatorSet.addListener(new d(fVar));
            animatorOfObject = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            c3.h.C2(viewGroup4, true);
            gVar.a(new e(viewGroup4));
        }
        return animatorOfObject;
    }

    @Override // c1.q
    public final String[] p() {
        return f1164y;
    }
}
