package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class j implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f775b;

    public j(m mVar) {
        this.f775b = mVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        m mVar = this.f775b;
        Dialog dialog = mVar.f799e0;
        if (dialog != null) {
            mVar.onDismiss(dialog);
        }
    }
}
