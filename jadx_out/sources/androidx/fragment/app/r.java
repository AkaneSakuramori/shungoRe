package androidx.fragment.app;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class r implements z0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f877a;

    public r(e.m mVar) {
        this.f877a = mVar;
    }

    @Override // z0.d
    public final Bundle a() {
        u uVar;
        Bundle bundle = new Bundle();
        do {
            uVar = this.f877a;
        } while (u.k(((t) uVar.f890r.f785c).f886m));
        uVar.f891s.e(androidx.lifecycle.l.ON_STOP);
        j0 j0VarP = ((t) uVar.f890r.f785c).f886m.P();
        if (j0VarP != null) {
            bundle.putParcelable("android:support:fragments", j0VarP);
        }
        return bundle;
    }
}
