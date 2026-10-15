package y0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f5279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5280d;

    public final void a(int i4, int i5) {
        if (i4 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i6 = this.f5280d;
        int i7 = i6 * 2;
        int[] iArr = this.f5279c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f5279c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i7 >= iArr.length) {
            int[] iArr3 = new int[i6 * 4];
            this.f5279c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f5279c;
        iArr4[i7] = i4;
        iArr4[i7 + 1] = i5;
        this.f5280d++;
    }

    public final void b(RecyclerView recyclerView, boolean z4) {
        this.f5280d = 0;
        int[] iArr = this.f5279c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        o0 o0Var = recyclerView.f1042m;
        if (recyclerView.f1040l == null || o0Var == null || !o0Var.f5236i) {
            return;
        }
        if (z4) {
            if (!recyclerView.f1026e.g()) {
                o0Var.i(recyclerView.f1040l.a(), this);
            }
        } else if (!recyclerView.K()) {
            o0Var.h(this.f5277a, this.f5278b, recyclerView.f1025d0, this);
        }
        int i4 = this.f5280d;
        if (i4 > o0Var.f5237j) {
            o0Var.f5237j = i4;
            o0Var.f5238k = z4;
            recyclerView.f1022c.l();
        }
    }
}
