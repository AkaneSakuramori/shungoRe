package j;

import c3.h;

/* JADX INFO: loaded from: classes.dex */
public final class b extends h {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile b f3123k;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f3124j = new e();

    public static b Q2() {
        if (f3123k != null) {
            return f3123k;
        }
        synchronized (b.class) {
            try {
                if (f3123k == null) {
                    f3123k = new b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3123k;
    }
}
