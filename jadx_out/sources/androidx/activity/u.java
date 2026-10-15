package androidx.activity;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f328a = new u();

    public final OnBackInvokedCallback a(j3.a aVar) {
        c3.h.b0(aVar, "onBackInvoked");
        return new t(0, aVar);
    }

    public final void b(Object obj, int i4, Object obj2) {
        c3.h.b0(obj, "dispatcher");
        c3.h.b0(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i4, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        c3.h.b0(obj, "dispatcher");
        c3.h.b0(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
