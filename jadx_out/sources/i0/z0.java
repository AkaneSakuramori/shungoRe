package i0;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public abstract class z0 {
    public static boolean a(ViewParent viewParent, View view, float f5, float f6, boolean z4) {
        return viewParent.onNestedFling(view, f5, f6, z4);
    }

    public static boolean b(ViewParent viewParent, View view, float f5, float f6) {
        return viewParent.onNestedPreFling(view, f5, f6);
    }

    public static void c(ViewParent viewParent, View view, int i4, int i5, int[] iArr) {
        viewParent.onNestedPreScroll(view, i4, i5, iArr);
    }

    public static void d(ViewParent viewParent, View view, int i4, int i5, int i6, int i7) {
        viewParent.onNestedScroll(view, i4, i5, i6, i7);
    }

    public static void e(ViewParent viewParent, View view, View view2, int i4) {
        viewParent.onNestedScrollAccepted(view, view2, i4);
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int i4) {
        return viewParent.onStartNestedScroll(view, view2, i4);
    }

    public static void g(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }
}
