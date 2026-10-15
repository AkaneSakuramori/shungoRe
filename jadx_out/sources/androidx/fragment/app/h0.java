package androidx.fragment.app;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f746b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f747c;

    public h0(i0 i0Var, int i4) {
        this.f747c = i0Var;
        this.f745a = i4;
    }

    @Override // androidx.fragment.app.g0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        q qVar = this.f747c.f767s;
        if (qVar == null || this.f745a >= 0 || !qVar.f().K()) {
            return this.f747c.L(arrayList, arrayList2, null, this.f745a, this.f746b);
        }
        return false;
    }
}
