package androidx.fragment.app;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class n extends c3.h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f816j;

    public n(q qVar) {
        this.f816j = qVar;
    }

    @Override // c3.h
    public final View F1(int i4) {
        q qVar = this.f816j;
        View view = qVar.F;
        if (view != null) {
            return view.findViewById(i4);
        }
        throw new IllegalStateException("Fragment " + qVar + " does not have a view");
    }

    @Override // c3.h
    public final boolean J1() {
        return this.f816j.F != null;
    }
}
