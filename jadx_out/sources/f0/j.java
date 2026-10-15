package f0;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final class j implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2024b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new i(runnable, this.f2023a, this.f2024b);
    }
}
