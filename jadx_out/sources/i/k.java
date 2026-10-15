package i;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class k extends c2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2627k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f2628l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ View f2629m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(View view, View view2, Object obj, int i4) {
        super(view2);
        this.f2627k = i4;
        this.f2629m = view;
        this.f2628l = obj;
    }

    @Override // i.c2
    public final h.g0 b() {
        switch (this.f2627k) {
            case 0:
                h hVar = ((l) this.f2629m).f2636e.f2674t;
                if (hVar == null) {
                    return null;
                }
                return hVar.a();
            default:
                return (t0) this.f2628l;
        }
    }

    @Override // i.c2
    public final boolean c() {
        int i4 = this.f2627k;
        View view = this.f2629m;
        switch (i4) {
            case 0:
                ((l) view).f2636e.l();
                break;
            default:
                w0 w0Var = (w0) view;
                if (!w0Var.getInternalPopup().a()) {
                    w0Var.f2820g.e(o0.b(w0Var), o0.a(w0Var));
                }
                break;
        }
        return true;
    }

    @Override // i.c2
    public final boolean d() {
        switch (this.f2627k) {
            case 0:
                m mVar = ((l) this.f2629m).f2636e;
                if (mVar.f2676v != null) {
                    return false;
                }
                mVar.f();
                return true;
            default:
                super.d();
                return true;
        }
    }
}
