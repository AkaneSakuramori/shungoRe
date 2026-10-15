package y0;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5208a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5209b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5210c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5211d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f5213f;

    public l1(StaggeredGridLayoutManager staggeredGridLayoutManager, int i4) {
        this.f5213f = staggeredGridLayoutManager;
        this.f5212e = i4;
    }

    public final void a() {
        ArrayList arrayList = this.f5208a;
        View view = (View) arrayList.get(arrayList.size() - 1);
        i1 i1Var = (i1) view.getLayoutParams();
        this.f5210c = this.f5213f.f1065r.b(view);
        i1Var.getClass();
    }

    public final void b() {
        this.f5208a.clear();
        this.f5209b = Integer.MIN_VALUE;
        this.f5210c = Integer.MIN_VALUE;
        this.f5211d = 0;
    }

    public final int c() {
        boolean z4 = this.f5213f.f1070w;
        ArrayList arrayList = this.f5208a;
        return z4 ? e(arrayList.size() - 1, -1) : e(0, arrayList.size());
    }

    public final int d() {
        boolean z4 = this.f5213f.f1070w;
        ArrayList arrayList = this.f5208a;
        return z4 ? e(0, arrayList.size()) : e(arrayList.size() - 1, -1);
    }

    public final int e(int i4, int i5) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f5213f;
        int iF = staggeredGridLayoutManager.f1065r.f();
        int iE = staggeredGridLayoutManager.f1065r.e();
        int i6 = i5 > i4 ? 1 : -1;
        while (i4 != i5) {
            View view = (View) this.f5208a.get(i4);
            int iD = staggeredGridLayoutManager.f1065r.d(view);
            int iB = staggeredGridLayoutManager.f1065r.b(view);
            boolean z4 = iD <= iE;
            boolean z5 = iB >= iF;
            if (z4 && z5 && (iD < iF || iB > iE)) {
                return o0.F(view);
            }
            i4 += i6;
        }
        return -1;
    }

    public final int f(int i4) {
        int i5 = this.f5210c;
        if (i5 != Integer.MIN_VALUE) {
            return i5;
        }
        if (this.f5208a.size() == 0) {
            return i4;
        }
        a();
        return this.f5210c;
    }

    public final View g(int i4, int i5) {
        ArrayList arrayList = this.f5208a;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f5213f;
        View view = null;
        if (i5 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f1070w && o0.F(view2) >= i4) || ((!staggeredGridLayoutManager.f1070w && o0.F(view2) <= i4) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
        } else {
            int size2 = arrayList.size();
            int i6 = 0;
            while (i6 < size2) {
                View view3 = (View) arrayList.get(i6);
                if ((staggeredGridLayoutManager.f1070w && o0.F(view3) <= i4) || ((!staggeredGridLayoutManager.f1070w && o0.F(view3) >= i4) || !view3.hasFocusable())) {
                    break;
                }
                i6++;
                view = view3;
            }
        }
        return view;
    }

    public final int h(int i4) {
        int i5 = this.f5209b;
        if (i5 != Integer.MIN_VALUE) {
            return i5;
        }
        if (this.f5208a.size() == 0) {
            return i4;
        }
        View view = (View) this.f5208a.get(0);
        i1 i1Var = (i1) view.getLayoutParams();
        this.f5209b = this.f5213f.f1065r.d(view);
        i1Var.getClass();
        return this.f5209b;
    }
}
