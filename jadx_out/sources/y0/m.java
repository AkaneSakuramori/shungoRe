package y0;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class m extends s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f5214a;

    public m(p pVar) {
        this.f5214a = pVar;
    }

    @Override // y0.s0
    public final void b(RecyclerView recyclerView, int i4, int i5) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        p pVar = this.f5214a;
        int iComputeVerticalScrollRange = pVar.f5265s.computeVerticalScrollRange();
        int i6 = pVar.f5264r;
        int i7 = iComputeVerticalScrollRange - i6;
        int i8 = pVar.f5247a;
        pVar.f5266t = i7 > 0 && i6 >= i8;
        int iComputeHorizontalScrollRange = pVar.f5265s.computeHorizontalScrollRange();
        int i9 = pVar.f5263q;
        boolean z4 = iComputeHorizontalScrollRange - i9 > 0 && i9 >= i8;
        pVar.f5267u = z4;
        boolean z5 = pVar.f5266t;
        if (!z5 && !z4) {
            if (pVar.f5268v != 0) {
                pVar.f(0);
                return;
            }
            return;
        }
        if (z5) {
            float f5 = i6;
            pVar.f5258l = (int) ((((f5 / 2.0f) + iComputeVerticalScrollOffset) * f5) / iComputeVerticalScrollRange);
            pVar.f5257k = Math.min(i6, (i6 * i6) / iComputeVerticalScrollRange);
        }
        if (pVar.f5267u) {
            float f6 = iComputeHorizontalScrollOffset;
            float f7 = i9;
            pVar.f5261o = (int) ((((f7 / 2.0f) + f6) * f7) / iComputeHorizontalScrollRange);
            pVar.f5260n = Math.min(i9, (i9 * i9) / iComputeHorizontalScrollRange);
        }
        int i10 = pVar.f5268v;
        if (i10 == 0 || i10 == 1) {
            pVar.f(1);
        }
    }
}
