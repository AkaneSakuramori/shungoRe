package x2;

import java.io.Closeable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import y2.g;
import y2.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ExecutorService f4929b = Executors.newCachedThreadPool();

    public static g a(String... strArr) {
        g gVar = new g();
        if (strArr.length > 0) {
            gVar.f5377j.add(new y2.b(strArr));
        }
        return gVar;
    }

    public final boolean e() {
        return ((m) this).f5399c >= 1;
    }
}
