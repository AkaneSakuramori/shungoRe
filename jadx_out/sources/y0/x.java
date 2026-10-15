package y0;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5331f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5332g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5333h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5334i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5335j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f5336k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f5337l;

    public final void a(View view) {
        int iC;
        int size = this.f5336k.size();
        View view2 = null;
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < size; i5++) {
            View view3 = ((d1) this.f5336k.get(i5)).f5103a;
            p0 p0Var = (p0) view3.getLayoutParams();
            if (view3 != view && !p0Var.f5273a.j() && (iC = (p0Var.f5273a.c() - this.f5329d) * this.f5330e) >= 0 && iC < i4) {
                view2 = view3;
                if (iC == 0) {
                    break;
                } else {
                    i4 = iC;
                }
            }
        }
        if (view2 == null) {
            this.f5329d = -1;
        } else {
            this.f5329d = ((p0) view2.getLayoutParams()).f5273a.c();
        }
    }

    public final View b(v0 v0Var) {
        List list = this.f5336k;
        if (list == null) {
            View viewD = v0Var.d(this.f5329d);
            this.f5329d += this.f5330e;
            return viewD;
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            View view = ((d1) this.f5336k.get(i4)).f5103a;
            p0 p0Var = (p0) view.getLayoutParams();
            if (!p0Var.f5273a.j() && this.f5329d == p0Var.f5273a.c()) {
                a(view);
                return view;
            }
        }
        return null;
    }
}
