package u3;

import c3.h;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4760b;

    public /* synthetic */ a(String str, boolean z4) {
        this.f4759a = str;
        this.f4760b = z4;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f4759a;
        h.b0(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.f4760b);
        return thread;
    }
}
