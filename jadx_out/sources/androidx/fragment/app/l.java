package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class l extends c3.h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c3.h f793j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m f794k;

    public l(m mVar, n nVar) {
        this.f794k = mVar;
        this.f793j = nVar;
    }

    @Override // c3.h
    public final View F1(int i4) {
        c3.h hVar = this.f793j;
        if (hVar.J1()) {
            return hVar.F1(i4);
        }
        Dialog dialog = this.f794k.f799e0;
        if (dialog != null) {
            return dialog.findViewById(i4);
        }
        return null;
    }

    @Override // c3.h
    public final boolean J1() {
        return this.f793j.J1() || this.f794k.f802h0;
    }
}
