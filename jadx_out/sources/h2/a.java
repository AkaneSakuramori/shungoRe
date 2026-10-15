package h2;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i4 = message.what;
        if (i4 == 0) {
            defpackage.a.n(message.obj);
            throw null;
        }
        if (i4 != 1) {
            return false;
        }
        defpackage.a.n(message.obj);
        throw null;
    }
}
