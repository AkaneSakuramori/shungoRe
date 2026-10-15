package androidx.activity;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: loaded from: classes.dex */
public final class v implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j3.l f329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j3.l f330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j3.a f331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j3.a f332d;

    public v(j3.l lVar, j3.l lVar2, j3.a aVar, j3.a aVar2) {
        this.f329a = lVar;
        this.f330b = lVar2;
        this.f331c = aVar;
        this.f332d = aVar2;
    }

    public final void onBackCancelled() {
        this.f332d.a();
    }

    public final void onBackInvoked() {
        this.f331c.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        c3.h.b0(backEvent, "backEvent");
        this.f330b.e(new b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        c3.h.b0(backEvent, "backEvent");
        this.f329a.e(new b(backEvent));
    }
}
