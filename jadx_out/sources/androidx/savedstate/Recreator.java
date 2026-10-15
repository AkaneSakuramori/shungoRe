package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;
import androidx.lifecycle.l;
import androidx.lifecycle.n0;
import androidx.lifecycle.p;
import androidx.lifecycle.q0;
import androidx.lifecycle.r;
import androidx.lifecycle.r0;
import androidx.lifecycle.t;
import c3.h;
import defpackage.a;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import z0.b;
import z0.e;
import z0.g;

/* JADX INFO: loaded from: classes.dex */
public final class Recreator implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f1074b;

    public Recreator(g gVar) {
        h.b0(gVar, "owner");
        this.f1074b = gVar;
    }

    @Override // androidx.lifecycle.p
    public final void b(r rVar, l lVar) {
        Object obj;
        boolean z4;
        if (lVar != l.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        rVar.t().b(this);
        Bundle bundleA = this.f1074b.e().a("androidx.savedstate.Restarter");
        if (bundleA == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(b.class);
                h.a0(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
                        h.a0(objNewInstance, "{\n                constr…wInstance()\n            }");
                        g gVar = this.f1074b;
                        h.b0(gVar, "owner");
                        if (!(gVar instanceof r0)) {
                            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
                        }
                        q0 q0VarH = ((r0) gVar).h();
                        e eVarE = gVar.e();
                        q0VarH.getClass();
                        for (String str2 : new HashSet(q0VarH.f978a.keySet())) {
                            h.b0(str2, "key");
                            n0 n0Var = (n0) q0VarH.f978a.get(str2);
                            h.X(n0Var);
                            t tVarT = gVar.t();
                            h.b0(eVarE, "registry");
                            h.b0(tVarT, "lifecycle");
                            HashMap map = n0Var.f973a;
                            if (map == null) {
                                obj = null;
                            } else {
                                synchronized (map) {
                                    obj = n0Var.f973a.get("androidx.lifecycle.savedstate.vm.tag");
                                }
                            }
                            SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
                            if (savedStateHandleController != null && !(z4 = savedStateHandleController.f934b)) {
                                if (!(!z4)) {
                                    throw new IllegalStateException("Already attached to lifecycleOwner".toString());
                                }
                                savedStateHandleController.f934b = true;
                                tVarT.a(savedStateHandleController);
                                throw null;
                            }
                        }
                        if (!new HashSet(q0VarH.f978a.keySet()).isEmpty()) {
                            eVarE.c();
                        }
                    } catch (Exception e5) {
                        throw new RuntimeException("Failed to instantiate " + str, e5);
                    }
                } catch (NoSuchMethodException e6) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e6);
                }
            } catch (ClassNotFoundException e7) {
                throw new RuntimeException(a.g("Class ", str, " wasn't found"), e7);
            }
        }
    }
}
