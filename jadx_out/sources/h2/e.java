package h2;

import android.os.Handler;
import android.os.Message;
import g.h;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f2513a;

    public e(h hVar) {
        this.f2513a = hVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        h hVar = this.f2513a;
        defpackage.a.n(message.obj);
        synchronized (hVar.f2224c) {
            defpackage.a.n(hVar.f2225d);
            throw null;
        }
    }
}
