package c1;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class e extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1145a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1146b;

    public e(ViewGroup viewGroup) {
        this.f1146b = viewGroup;
    }

    @Override // c1.r, c1.p
    public final void a() {
        c3.h.C2(this.f1146b, false);
        this.f1145a = true;
    }

    @Override // c1.r, c1.p
    public final void b() {
        c3.h.C2(this.f1146b, false);
    }

    @Override // c1.p
    public final void d(q qVar) {
        if (!this.f1145a) {
            c3.h.C2(this.f1146b, false);
        }
        qVar.v(this);
    }

    @Override // c1.r, c1.p
    public final void e() {
        c3.h.C2(this.f1146b, true);
    }
}
