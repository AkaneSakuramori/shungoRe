package c2;

import android.graphics.Typeface;
import c3.h;
import e.n0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Typeface f1234j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n0 f1235k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1236l;

    public a(n0 n0Var, Typeface typeface) {
        this.f1234j = typeface;
        this.f1235k = n0Var;
    }

    @Override // c3.h
    public final void G1(int i4) {
        if (this.f1236l) {
            return;
        }
        z1.b bVar = (z1.b) this.f1235k.f1896c;
        if (bVar.j(this.f1234j)) {
            bVar.h(false);
        }
    }

    @Override // c3.h
    public final void I1(Typeface typeface, boolean z4) {
        if (this.f1236l) {
            return;
        }
        z1.b bVar = (z1.b) this.f1235k.f1896c;
        if (bVar.j(typeface)) {
            bVar.h(false);
        }
    }
}
