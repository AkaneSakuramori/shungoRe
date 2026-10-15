package i;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: loaded from: classes.dex */
public abstract class n3 extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f2717a = new Object();

    public static void a(Context context) {
        if (context.getResources() instanceof p3) {
            return;
        }
        context.getResources();
        int i4 = z3.f2883a;
    }
}
