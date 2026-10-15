package androidx.activity;

import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes.dex */
final class ImmLeaksCleaner implements androidx.lifecycle.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f244b;

    @Override // androidx.lifecycle.p
    public final void b(androidx.lifecycle.r rVar, androidx.lifecycle.l lVar) {
        if (lVar != androidx.lifecycle.l.ON_DESTROY) {
            return;
        }
        if (f244b == 0) {
            try {
                f244b = 2;
                InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                f244b = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f244b == 1) {
            throw null;
        }
    }
}
