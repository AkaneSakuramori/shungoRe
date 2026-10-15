package i;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2753c;

    public /* synthetic */ q3(Toolbar toolbar, int i4) {
        this.f2752b = i4;
        this.f2753c = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f2752b;
        Toolbar toolbar = this.f2753c;
        switch (i4) {
            case 0:
                toolbar.o();
                break;
            default:
                t3 t3Var = toolbar.M;
                h.q qVar = t3Var == null ? null : t3Var.f2780c;
                if (qVar != null) {
                    qVar.collapseActionView();
                }
                break;
        }
    }
}
