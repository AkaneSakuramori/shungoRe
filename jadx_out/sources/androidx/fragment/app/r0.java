package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w0 f878a = new w0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y0 f879b;

    static {
        y0 y0Var;
        try {
            y0Var = (y0) c1.m.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            y0Var = null;
        }
        f879b = y0Var;
    }

    public static void a(q qVar, q qVar2, boolean z4) {
        if (z4) {
            qVar2.getClass();
        } else {
            qVar.getClass();
        }
    }

    public static void b(ArrayList arrayList, int i4) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((View) arrayList.get(size)).setVisibility(i4);
        }
    }
}
