package u2;

import android.content.Intent;
import com.shungo.app.MainActivity;
import com.shungo.app.StartupActivity;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements androidx.activity.result.c, x2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StartupActivity f4758a;

    public /* synthetic */ v(StartupActivity startupActivity) {
        this.f4758a = startupActivity;
    }

    @Override // x2.b
    public final void a(x2.d dVar) {
        int i4 = StartupActivity.f1650y;
        StartupActivity startupActivity = this.f4758a;
        c3.h.b0(startupActivity, "this$0");
        c3.h.b0(dVar, "it");
        startupActivity.startActivity(new Intent(startupActivity, (Class<?>) MainActivity.class));
        startupActivity.finish();
    }

    @Override // androidx.activity.result.c
    public final void b(Object obj) {
        int i4 = StartupActivity.f1650y;
        StartupActivity startupActivity = this.f4758a;
        c3.h.b0(startupActivity, "this$0");
        v vVar = new v(startupActivity);
        ExecutorService executorService = x2.d.f4929b;
        y2.d.b(y2.q.f5410b, vVar);
    }
}
