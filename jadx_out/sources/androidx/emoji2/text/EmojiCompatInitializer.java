package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements a1.b {
    @Override // a1.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // a1.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Boolean b(Context context) {
        Object objB;
        v vVar = new v(new g.a(context, 1));
        vVar.f606b = 1;
        if (m.f609j == null) {
            synchronized (m.f608i) {
                try {
                    if (m.f609j == null) {
                        m.f609j = new m(vVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        a1.a aVarC = a1.a.c(context);
        aVarC.getClass();
        synchronized (a1.a.f53e) {
            try {
                objB = aVarC.f54a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        final androidx.lifecycle.t tVarT = ((androidx.lifecycle.r) objB).t();
        tVarT.a(new androidx.lifecycle.d() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.d
            public final void a() {
                EmojiCompatInitializer.this.getClass();
                (Build.VERSION.SDK_INT >= 28 ? c.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new p(), 500L);
                tVarT.b(this);
            }
        });
        return Boolean.TRUE;
    }
}
