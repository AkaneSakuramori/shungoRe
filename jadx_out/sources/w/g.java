package w;

import android.view.View;
import i0.k0;
import i0.v0;
import java.util.Comparator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4837a;

    public /* synthetic */ g(int i4) {
        this.f4837a = i4;
    }

    public final int a(View view, View view2) {
        switch (this.f4837a) {
            case 0:
                WeakHashMap weakHashMap = v0.f2983a;
                float fM = k0.m(view);
                float fM2 = k0.m(view2);
                if (fM > fM2) {
                    return -1;
                }
                return fM < fM2 ? 1 : 0;
            default:
                return view.getTop() - view2.getTop();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if (r8 < r9) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0096, code lost:
    
        if (r0 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a2, code lost:
    
        if (r0 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        if (c3.h.n0(r5, r6) < 0) goto L10;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compare(java.lang.Object r8, java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.g.compare(java.lang.Object, java.lang.Object):int");
    }
}
