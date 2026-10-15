package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements a1.b {
    @Override // a1.b
    public final List a() {
        return a3.p.f75b;
    }

    @Override // a1.b
    public final Object b(Context context) {
        c3.h.b0(context, "context");
        a1.a aVarC = a1.a.c(context);
        c3.h.a0(aVarC, "getInstance(context)");
        if (!aVarC.f55b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
        }
        if (!o.f975a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            c3.h.Y(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new n());
        }
        d0 d0Var = d0.f943j;
        d0Var.getClass();
        d0Var.f948f = new Handler();
        d0Var.f949g.e(l.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        c3.h.Y(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new b0(d0Var));
        return d0Var;
    }
}
