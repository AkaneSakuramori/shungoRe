package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class i implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f748b;

    public i(m mVar) {
        this.f748b = mVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        m mVar = this.f748b;
        Dialog dialog = mVar.f799e0;
        if (dialog != null) {
            mVar.onCancel(dialog);
        }
    }
}
