package i;

import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final class z2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SearchView f2882c;

    public /* synthetic */ z2(SearchView searchView, int i4) {
        this.f2881b = i4;
        this.f2882c = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f2881b;
        SearchView searchView = this.f2882c;
        switch (i4) {
            case 0:
                searchView.u();
                break;
            default:
                n0.b bVar = searchView.P;
                if (bVar instanceof l3) {
                    bVar.b(null);
                }
                break;
        }
    }
}
