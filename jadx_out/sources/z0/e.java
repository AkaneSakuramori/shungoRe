package z0;

import android.os.Bundle;
import androidx.lifecycle.i;
import c3.h;
import e.k;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f5435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k f5437e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k.g f5433a = new k.g();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5438f = true;

    public final Bundle a(String str) {
        if (!this.f5436d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.f5435c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.f5435c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f5435c;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f5435c = null;
        }
        return bundle2;
    }

    public final void b(String str, d dVar) {
        Object obj;
        h.b0(dVar, "provider");
        k.g gVar = this.f5433a;
        k.c cVarA = gVar.a(str);
        if (cVarA != null) {
            obj = cVarA.f3233b;
        } else {
            k.c cVar = new k.c(str, dVar);
            gVar.f3244e++;
            k.c cVar2 = gVar.f3242c;
            if (cVar2 == null) {
                gVar.f3241b = cVar;
                gVar.f3242c = cVar;
            } else {
                cVar2.f3234c = cVar;
                cVar.f3235d = cVar2;
                gVar.f3242c = cVar;
            }
            obj = null;
        }
        if (((d) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void c() {
        if (!this.f5438f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        k kVar = this.f5437e;
        if (kVar == null) {
            kVar = new k(this);
        }
        this.f5437e = kVar;
        try {
            i.class.getDeclaredConstructor(new Class[0]);
            k kVar2 = this.f5437e;
            if (kVar2 != null) {
                ((Set) kVar2.f1885b).add(i.class.getName());
            }
        } catch (NoSuchMethodException e5) {
            throw new IllegalArgumentException("Class " + i.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e5);
        }
    }
}
