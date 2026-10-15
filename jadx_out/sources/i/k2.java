package i;

import android.os.Handler;
import android.widget.AbsListView;

/* JADX INFO: loaded from: classes.dex */
public final class k2 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m2 f2630a;

    public k2(m2 m2Var) {
        this.f2630a = m2Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i4, int i5, int i6) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i4) {
        if (i4 == 1) {
            m2 m2Var = this.f2630a;
            if (m2Var.A.getInputMethodMode() == 2 || m2Var.A.getContentView() == null) {
                return;
            }
            Handler handler = m2Var.f2706w;
            f2 f2Var = m2Var.f2702s;
            handler.removeCallbacks(f2Var);
            f2Var.run();
        }
    }
}
