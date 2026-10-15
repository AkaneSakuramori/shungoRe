package q1;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import i0.e0;
import i0.v0;
import java.util.WeakHashMap;
import p0.e;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f3883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f3884c;

    public b(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z4) {
        this.f3884c = swipeDismissBehavior;
        this.f3883b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e eVar = this.f3884c.f1347a;
        if (eVar == null || !eVar.f()) {
            return;
        }
        WeakHashMap weakHashMap = v0.f2983a;
        e0.m(this.f3883b, this);
    }
}
