package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class x0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f916f;

    public x0(int i4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f912b = i4;
        this.f913c = arrayList;
        this.f914d = arrayList2;
        this.f915e = arrayList3;
        this.f916f = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i4 = 0; i4 < this.f912b; i4++) {
            View view = (View) this.f913c.get(i4);
            String str = (String) this.f914d.get(i4);
            WeakHashMap weakHashMap = i0.v0.f2983a;
            i0.k0.v(view, str);
            i0.k0.v((View) this.f915e.get(i4), (String) this.f916f.get(i4));
        }
    }
}
