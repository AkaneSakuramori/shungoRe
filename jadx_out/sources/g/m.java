package g;

import android.view.View;
import i.x3;
import i0.e1;

/* JADX INFO: loaded from: classes.dex */
public final class m extends c3.h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2264j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2265k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2266l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f2267m;

    public m(n nVar) {
        this.f2264j = 0;
        this.f2267m = nVar;
        this.f2265k = false;
        this.f2266l = 0;
    }

    @Override // c3.h, i0.e1
    public final void C() {
        int i4 = this.f2264j;
        Object obj = this.f2267m;
        switch (i4) {
            case 0:
                if (!this.f2265k) {
                    this.f2265k = true;
                    e1 e1Var = ((n) obj).f2271d;
                    if (e1Var != null) {
                        e1Var.C();
                    }
                    break;
                }
                break;
            default:
                ((x3) obj).f2837a.setVisibility(0);
                break;
        }
    }

    @Override // i0.e1
    public final void a() {
        int i4 = this.f2264j;
        Object obj = this.f2267m;
        switch (i4) {
            case 0:
                int i5 = this.f2266l + 1;
                this.f2266l = i5;
                n nVar = (n) obj;
                if (i5 == nVar.f2268a.size()) {
                    e1 e1Var = nVar.f2271d;
                    if (e1Var != null) {
                        e1Var.a();
                    }
                    this.f2266l = 0;
                    this.f2265k = false;
                    nVar.f2272e = false;
                }
                break;
            default:
                if (!this.f2265k) {
                    ((x3) obj).f2837a.setVisibility(this.f2266l);
                }
                break;
        }
    }

    @Override // c3.h, i0.e1
    public final void x(View view) {
        switch (this.f2264j) {
            case 1:
                this.f2265k = true;
                break;
        }
    }

    public m(x3 x3Var, int i4) {
        this.f2264j = 1;
        this.f2267m = x3Var;
        this.f2266l = i4;
        this.f2265k = false;
    }
}
