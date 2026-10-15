package i2;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f3000b;

    public /* synthetic */ b(o oVar, int i4) {
        this.f2999a = i4;
        this.f3000b = oVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        int i4 = this.f2999a;
        o oVar = this.f3000b;
        switch (i4) {
            case 0:
                d dVar = (d) oVar;
                dVar.t(dVar.u());
                break;
            default:
                k kVar = (k) oVar;
                kVar.f3025l = z4;
                kVar.q();
                if (!z4) {
                    kVar.t(false);
                    kVar.f3026m = false;
                }
                break;
        }
    }
}
