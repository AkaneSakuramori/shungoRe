package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class o extends c3.h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c3.h f622j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f623k;

    public o(c3.h hVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f622j = hVar;
        this.f623k = threadPoolExecutor;
    }

    @Override // c3.h
    public final void E1(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f623k;
        try {
            this.f622j.E1(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // c3.h
    public final void K1(g.h hVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f623k;
        try {
            this.f622j.K1(hVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
