package i;

import android.database.DataSetObserver;

/* JADX INFO: loaded from: classes.dex */
public final class j2 extends DataSetObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2620b;

    public /* synthetic */ j2(int i4, Object obj) {
        this.f2619a = i4;
        this.f2620b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int i4 = this.f2619a;
        Object obj = this.f2620b;
        switch (i4) {
            case 0:
                m2 m2Var = (m2) obj;
                if (m2Var.A.isShowing()) {
                    m2Var.h();
                }
                break;
            default:
                n0.b bVar = (n0.b) obj;
                bVar.f3531b = true;
                bVar.notifyDataSetChanged();
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        int i4 = this.f2619a;
        Object obj = this.f2620b;
        switch (i4) {
            case 0:
                ((m2) obj).dismiss();
                break;
            default:
                n0.b bVar = (n0.b) obj;
                bVar.f3531b = false;
                bVar.notifyDataSetInvalidated();
                break;
        }
    }
}
