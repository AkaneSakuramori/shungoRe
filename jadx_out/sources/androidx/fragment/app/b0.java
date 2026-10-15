package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements androidx.activity.result.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f700b;

    public /* synthetic */ b0(i0 i0Var, int i4) {
        this.f699a = i4;
        this.f700b = i0Var;
    }

    public final void a(androidx.activity.result.b bVar) {
        int i4 = this.f699a;
        i0 i0Var = this.f700b;
        switch (i4) {
            case 0:
                f0 f0Var = (f0) i0Var.f773y.pollFirst();
                if (f0Var != null) {
                    String str = f0Var.f740b;
                    q qVarC = i0Var.f751c.c(str);
                    if (qVarC != null) {
                        qVarC.o(f0Var.f741c, bVar.f299b, bVar.f300c);
                    } else {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                    }
                } else {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                }
                break;
            default:
                f0 f0Var2 = (f0) i0Var.f773y.pollFirst();
                if (f0Var2 != null) {
                    String str2 = f0Var2.f740b;
                    q qVarC2 = i0Var.f751c.c(str2);
                    if (qVarC2 != null) {
                        qVarC2.o(f0Var2.f741c, bVar.f299b, bVar.f300c);
                    } else {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                    }
                } else {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                }
                break;
        }
    }

    @Override // androidx.activity.result.c
    public final void b(Object obj) {
        switch (this.f699a) {
            case 0:
                a((androidx.activity.result.b) obj);
                break;
            case 1:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    iArr[i4] = ((Boolean) arrayList.get(i4)).booleanValue() ? 0 : -1;
                }
                i0 i0Var = this.f700b;
                f0 f0Var = (f0) i0Var.f773y.pollFirst();
                if (f0Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                } else {
                    String str = f0Var.f740b;
                    if (i0Var.f751c.c(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    }
                }
                break;
            default:
                a((androidx.activity.result.b) obj);
                break;
        }
    }

    public final void c(q qVar, e0.e eVar) {
        boolean z4;
        synchronized (eVar) {
            z4 = eVar.f1955a;
        }
        if (z4) {
            return;
        }
        i0 i0Var = this.f700b;
        HashSet hashSet = (HashSet) i0Var.f759k.get(qVar);
        if (hashSet != null && hashSet.remove(eVar) && hashSet.isEmpty()) {
            i0Var.f759k.remove(qVar);
            if (qVar.f848b < 5) {
                qVar.B();
                i0Var.f761m.p(false);
                qVar.E = null;
                qVar.F = null;
                qVar.O = null;
                qVar.P.e(null);
                qVar.f861o = false;
                i0Var.H(i0Var.f763o, qVar);
            }
        }
    }

    public final void d(q qVar, e0.e eVar) {
        i0 i0Var = this.f700b;
        if (i0Var.f759k.get(qVar) == null) {
            i0Var.f759k.put(qVar, new HashSet());
        }
        ((HashSet) i0Var.f759k.get(qVar)).add(eVar);
    }
}
