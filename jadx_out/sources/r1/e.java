package r1;

import android.view.View;
import android.view.WindowInsets;
import i0.c2;
import i0.o1;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WindowInsets f4065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f4066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f4069e = new int[2];

    public e(View view) {
        this.f4066b = view;
    }

    public final void a(c2 c2Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o1 o1Var = (o1) it.next();
            if ((o1Var.f2949a.c() & 8) != 0) {
                this.f4066b.setTranslationY(o1.a.c(this.f4068d, 0, o1Var.f2949a.b()));
                return;
            }
        }
    }
}
