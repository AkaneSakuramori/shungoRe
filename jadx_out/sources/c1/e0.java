package c1;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import com.shungo.app.R;
import e.n0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f1150d;

    public e0(i iVar, ViewGroup viewGroup, View view, View view2) {
        this.f1150d = iVar;
        this.f1147a = viewGroup;
        this.f1148b = view;
        this.f1149c = view2;
    }

    @Override // c1.r, c1.p
    public final void b() {
        ((ViewGroupOverlay) new n0(this.f1147a).f1896c).remove(this.f1148b);
    }

    @Override // c1.p
    public final void d(q qVar) {
        this.f1149c.setTag(R.id.save_overlay_view, null);
        ((ViewGroupOverlay) new n0(this.f1147a).f1896c).remove(this.f1148b);
        qVar.v(this);
    }

    @Override // c1.r, c1.p
    public final void e() {
        View view = this.f1148b;
        if (view.getParent() == null) {
            ((ViewGroupOverlay) new n0(this.f1147a).f1896c).add(view);
            return;
        }
        i iVar = this.f1150d;
        ArrayList arrayList = iVar.f1209n;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).cancel();
        }
        ArrayList arrayList2 = iVar.f1213r;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList arrayList3 = (ArrayList) iVar.f1213r.clone();
        int size2 = arrayList3.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ((p) arrayList3.get(i4)).a();
        }
    }
}
