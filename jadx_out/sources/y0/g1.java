package y0;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class g1 extends s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5143a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f5144b;

    public g1(d0 d0Var) {
        this.f5144b = d0Var;
    }

    @Override // y0.s0
    public final void a(RecyclerView recyclerView, int i4) {
        if (i4 == 0 && this.f5143a) {
            this.f5143a = false;
            this.f5144b.f();
        }
    }

    @Override // y0.s0
    public final void b(RecyclerView recyclerView, int i4, int i5) {
        if (i4 == 0 && i5 == 0) {
            return;
        }
        this.f5143a = true;
    }
}
