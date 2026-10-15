package j;

import android.os.Looper;
import c3.h;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class e extends h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f3126j;

    public e() {
        Executors.newFixedThreadPool(4, new c());
    }

    public final boolean Q2() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
