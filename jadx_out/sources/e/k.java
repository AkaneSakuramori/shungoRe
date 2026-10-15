package e;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class k implements z0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1884a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1885b;

    public k(z0.e eVar) {
        c3.h.b0(eVar, "registry");
        this.f1885b = new LinkedHashSet();
        eVar.b("androidx.savedstate.Restarter", this);
    }

    @Override // z0.d
    public final Bundle a() {
        int i4 = this.f1884a;
        Object obj = this.f1885b;
        switch (i4) {
            case 0:
                Bundle bundle = new Bundle();
                ((m) obj).l().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((Set) obj));
                return bundle2;
        }
    }

    public k(m mVar) {
        this.f1885b = mVar;
    }
}
