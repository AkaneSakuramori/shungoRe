package c;

import android.content.Intent;
import androidx.activity.n;
import c3.h;

/* JADX INFO: loaded from: classes.dex */
public final class d extends h {
    @Override // c3.h
    public final Intent B0(n nVar, Object obj) {
        Intent intent = (Intent) obj;
        h.b0(nVar, "context");
        return intent;
    }

    @Override // c3.h
    public final Object R1(Intent intent, int i4) {
        return new androidx.activity.result.b(intent, i4);
    }
}
