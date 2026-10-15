package androidx.lifecycle;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l0 implements z0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0.e f962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z2.d f965d;

    public l0(z0.e eVar, androidx.fragment.app.u uVar) {
        c3.h.b0(eVar, "savedStateRegistry");
        this.f962a = eVar;
        this.f965d = new z2.d(new k0(0, uVar));
    }

    @Override // z0.d
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f964c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((m0) this.f965d.a()).f972c.entrySet().iterator();
        if (!it.hasNext()) {
            this.f963b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        defpackage.a.n(entry.getValue());
        throw null;
    }
}
