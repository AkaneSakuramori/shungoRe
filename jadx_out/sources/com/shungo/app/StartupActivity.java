package com.shungo.app;

import android.os.Build;
import android.os.Bundle;
import androidx.activity.result.d;
import c.c;
import e.m;
import java.util.concurrent.ExecutorService;
import u2.n;
import u2.v;
import y2.q;

/* JADX INFO: loaded from: classes.dex */
public final class StartupActivity extends m {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f1650y = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final d f1651x;

    public StartupActivity() {
        ExecutorService executorService = x2.d.f4929b;
        y2.d.a();
        this.f1651x = this.f280l.c("activity_rq#" + this.f279k.getAndIncrement(), this, new c(0), new v(this));
    }

    @Override // androidx.fragment.app.u, androidx.activity.n, y.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n.f4742a.a(this);
        if (Build.VERSION.SDK_INT >= 33 && z.d.a(this, "android.permission.POST_NOTIFICATIONS") != 0) {
            this.f1651x.Q2("android.permission.POST_NOTIFICATIONS");
            return;
        }
        v vVar = new v(this);
        ExecutorService executorService = x2.d.f4929b;
        y2.d.b(q.f5410b, vVar);
    }
}
