package androidx.activity;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Executor, ViewTreeObserver.OnDrawListener, Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f268c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f270e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f267b = SystemClock.uptimeMillis() + 10000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f269d = false;

    public m(androidx.fragment.app.u uVar) {
        this.f270e = uVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f268c = runnable;
        View decorView = this.f270e.getWindow().getDecorView();
        if (!this.f269d) {
            decorView.postOnAnimation(new d(1, this));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z4;
        Runnable runnable = this.f268c;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f267b) {
                this.f269d = false;
                this.f270e.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f268c = null;
        q qVar = this.f270e.f278j;
        synchronized (qVar.f289a) {
            z4 = qVar.f290b;
        }
        if (z4) {
            this.f269d = false;
            this.f270e.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f270e.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
