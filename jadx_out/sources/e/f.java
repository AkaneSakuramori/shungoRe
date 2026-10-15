package e;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class f extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f1840a;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i4 = message.what;
        if (i4 == -3 || i4 == -2 || i4 == -1) {
            ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f1840a.get(), message.what);
        } else {
            if (i4 != 1) {
                return;
            }
            ((DialogInterface) message.obj).dismiss();
        }
    }
}
