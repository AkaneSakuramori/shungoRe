package i;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final class d3 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2553c;

    public /* synthetic */ d3(View view, int i4) {
        this.f2552b = i4;
        this.f2553c = view;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        Object item;
        int i5 = this.f2552b;
        View view2 = this.f2553c;
        switch (i5) {
            case 0:
                ((SearchView) view2).p(i4);
                break;
            default:
                i2.t tVar = (i2.t) view2;
                if (i4 < 0) {
                    m2 m2Var = tVar.f3096f;
                    item = !m2Var.A.isShowing() ? null : m2Var.f2687d.getSelectedItem();
                } else {
                    item = tVar.getAdapter().getItem(i4);
                }
                i2.t tVar2 = (i2.t) view2;
                i2.t.a(tVar2, item);
                AdapterView.OnItemClickListener onItemClickListener = tVar2.getOnItemClickListener();
                m2 m2Var2 = tVar2.f3096f;
                if (onItemClickListener != null) {
                    if (view == null || i4 < 0) {
                        view = m2Var2.A.isShowing() ? m2Var2.f2687d.getSelectedView() : null;
                        i4 = !m2Var2.A.isShowing() ? -1 : m2Var2.f2687d.getSelectedItemPosition();
                        j4 = !m2Var2.A.isShowing() ? Long.MIN_VALUE : m2Var2.f2687d.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(m2Var2.f2687d, view, i4, j4);
                }
                m2Var2.dismiss();
                break;
        }
    }
}
