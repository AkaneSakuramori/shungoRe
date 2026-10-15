package j;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import y2.q;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3122b;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f3122b) {
            case 2:
                runnable.run();
                break;
            case 3:
                runnable.run();
                break;
            case 4:
                runnable.run();
                break;
            case 5:
                runnable.run();
                break;
            default:
                Handler handler = q.f5409a;
                if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                    q.f5409a.post(runnable);
                } else {
                    runnable.run();
                }
                break;
        }
    }
}
