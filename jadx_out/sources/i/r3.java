package i;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class r3 implements p, h.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2767b;

    public /* synthetic */ r3(Toolbar toolbar) {
        this.f2767b = toolbar;
    }

    @Override // h.m
    public final void d(h.o oVar) {
        Toolbar toolbar = this.f2767b;
        m mVar = toolbar.f476b.f434u;
        if (mVar == null || !mVar.h()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.H.f1780d).iterator();
            if (it.hasNext()) {
                defpackage.a.n(it.next());
                throw null;
            }
        }
    }

    @Override // h.m
    public final boolean e(h.o oVar, MenuItem menuItem) {
        this.f2767b.getClass();
        return false;
    }
}
