package f0;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class i extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2022b;

    public i(Runnable runnable, String str, int i4) {
        super(runnable, str);
        this.f2022b = i4;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f2022b);
        super.run();
    }
}
