package androidx.activity;

import android.window.OnBackInvokedCallback;
import e.e0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f327b;

    public /* synthetic */ t(int i4, Object obj) {
        this.f326a = i4;
        this.f327b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f326a) {
            case 0:
                j3.a aVar = (j3.a) this.f327b;
                c3.h.b0(aVar, "$onBackInvoked");
                aVar.a();
                break;
            case 1:
                ((e0) this.f327b).D();
                break;
            default:
                ((Runnable) this.f327b).run();
                break;
        }
    }
}
