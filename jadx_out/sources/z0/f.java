package z0;

import android.os.Bundle;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import androidx.savedstate.Recreator;
import c3.h;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f5439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f5440b = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5441c;

    public f(g gVar) {
        this.f5439a = gVar;
    }

    public final void a() {
        g gVar = this.f5439a;
        t tVarT = gVar.t();
        if (tVarT.f983f != m.f967c) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        tVarT.a(new Recreator(gVar));
        final e eVar = this.f5440b;
        eVar.getClass();
        if (!(!eVar.f5434b)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        tVarT.a(new p() { // from class: z0.a
            @Override // androidx.lifecycle.p
            public final void b(r rVar, l lVar) {
                e eVar2 = eVar;
                h.b0(eVar2, "this$0");
                if (lVar == l.ON_START) {
                    eVar2.f5438f = true;
                } else if (lVar == l.ON_STOP) {
                    eVar2.f5438f = false;
                }
            }
        });
        eVar.f5434b = true;
        this.f5441c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f5441c) {
            a();
        }
        t tVarT = this.f5439a.t();
        if (!(!(tVarT.f983f.compareTo(m.f969e) >= 0))) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + tVarT.f983f).toString());
        }
        e eVar = this.f5440b;
        if (!eVar.f5434b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!eVar.f5436d)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        eVar.f5435c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        eVar.f5436d = true;
    }

    public final void c(Bundle bundle) {
        h.b0(bundle, "outBundle");
        e eVar = this.f5440b;
        eVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = eVar.f5435c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        k.g gVar = eVar.f5433a;
        gVar.getClass();
        k.d dVar = new k.d(gVar);
        gVar.f3243d.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((d) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
