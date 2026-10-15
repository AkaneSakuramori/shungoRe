package androidx.fragment.app;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f873b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f876e;

    public q0(h hVar, ArrayList arrayList, c1 c1Var) {
        this.f876e = hVar;
        this.f874c = arrayList;
        this.f875d = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f873b;
        Object obj = this.f876e;
        Object obj2 = this.f875d;
        Object obj3 = this.f874c;
        switch (i4) {
            case 0:
                ((b0) obj3).c((q) obj2, (e0.e) obj);
                break;
            case 1:
                ((b0) obj3).c((q) obj2, (e0.e) obj);
                break;
            default:
                List list = (List) obj3;
                c1 c1Var = (c1) obj2;
                if (list.contains(c1Var)) {
                    list.remove(c1Var);
                    ((h) obj).getClass();
                    defpackage.a.a(c1Var.f713a, c1Var.f715c.F);
                }
                break;
        }
    }
}
