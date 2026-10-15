package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f978a = new LinkedHashMap();

    public final void a() {
        for (n0 n0Var : this.f978a.values()) {
            HashMap map = n0Var.f973a;
            if (map != null) {
                synchronized (map) {
                    try {
                        for (Object obj : n0Var.f973a.values()) {
                            if (obj instanceof Closeable) {
                                try {
                                    ((Closeable) obj).close();
                                } catch (IOException e5) {
                                    throw new RuntimeException(e5);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            LinkedHashSet linkedHashSet = n0Var.f974b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        for (Closeable closeable : n0Var.f974b) {
                            if (closeable instanceof Closeable) {
                                try {
                                    closeable.close();
                                } catch (IOException e6) {
                                    throw new RuntimeException(e6);
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            n0Var.a();
        }
        this.f978a.clear();
    }
}
