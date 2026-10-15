package i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f2833b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static x f2834c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u2 f2835a;

    public static synchronized x a() {
        try {
            if (f2834c == null) {
                c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2834c;
    }

    public static synchronized void c() {
        if (f2834c == null) {
            x xVar = new x();
            f2834c = xVar;
            xVar.f2835a = u2.c();
            u2 u2Var = f2834c.f2835a;
            w wVar = new w();
            synchronized (u2Var) {
                u2Var.f2794e = wVar;
            }
        }
    }

    public static void d(Drawable drawable, o3 o3Var, int[] iArr) {
        PorterDuff.Mode mode = u2.f2787f;
        int[] state = drawable.getState();
        int[] iArr2 = t1.f2777a;
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z4 = o3Var.f2738b;
        if (!z4 && !o3Var.f2737a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterG = null;
        ColorStateList colorStateList = z4 ? (ColorStateList) o3Var.f2739c : null;
        PorterDuff.Mode mode2 = o3Var.f2737a ? (PorterDuff.Mode) o3Var.f2740d : u2.f2787f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterG = u2.g(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterG);
    }

    public final synchronized Drawable b(Context context, int i4) {
        return this.f2835a.e(context, i4);
    }
}
