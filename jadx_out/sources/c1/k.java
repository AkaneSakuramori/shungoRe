package c1;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f1178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1179b;

    public k(View view, ArrayList arrayList) {
        this.f1178a = view;
        this.f1179b = arrayList;
    }

    @Override // c1.p
    public final void a() {
    }

    @Override // c1.p
    public final void b() {
    }

    @Override // c1.p
    public final void c() {
    }

    @Override // c1.p
    public final void d(q qVar) {
        qVar.v(this);
        this.f1178a.setVisibility(8);
        ArrayList arrayList = this.f1179b;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((View) arrayList.get(i4)).setVisibility(0);
        }
    }

    @Override // c1.p
    public final void e() {
    }
}
