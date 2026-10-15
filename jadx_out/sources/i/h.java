package i;

import android.content.Context;
import android.view.View;
import com.shungo.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class h extends h.a0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2596m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m f2597n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, Context context, h.o oVar, l lVar) {
        super(R.attr.actionOverflowMenuStyle, 0, context, lVar, oVar, true);
        this.f2597n = mVar;
        this.f2343g = 8388613;
        e.n0 n0Var = mVar.f2678x;
        this.f2345i = n0Var;
        h.x xVar = this.f2346j;
        if (xVar != null) {
            xVar.e(n0Var);
        }
    }

    @Override // h.a0
    public final void c() {
        int i4 = this.f2596m;
        m mVar = this.f2597n;
        switch (i4) {
            case 0:
                mVar.f2675u = null;
                super.c();
                break;
            default:
                h.o oVar = mVar.f2658d;
                if (oVar != null) {
                    oVar.c(true);
                }
                mVar.f2674t = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, Context context, h.i0 i0Var, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, context, view, i0Var, false);
        this.f2597n = mVar;
        if (!i0Var.A.f()) {
            View view2 = mVar.f2664j;
            this.f2342f = view2 == null ? (View) mVar.f2663i : view2;
        }
        e.n0 n0Var = mVar.f2678x;
        this.f2345i = n0Var;
        h.x xVar = this.f2346j;
        if (xVar != null) {
            xVar.e(n0Var);
        }
    }
}
