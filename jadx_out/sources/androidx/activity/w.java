package androidx.activity;

import android.window.OnBackInvokedCallback;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f333a = new w();

    public final OnBackInvokedCallback a(j3.l lVar, j3.l lVar2, j3.a aVar, j3.a aVar2) {
        c3.h.b0(lVar, "onBackStarted");
        c3.h.b0(lVar2, "onBackProgressed");
        c3.h.b0(aVar, "onBackInvoked");
        c3.h.b0(aVar2, "onBackCancelled");
        return new v(lVar, lVar2, aVar, aVar2);
    }
}
