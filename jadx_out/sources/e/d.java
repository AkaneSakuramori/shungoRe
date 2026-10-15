package e;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import i.t0;
import i.w0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1785d;

    public /* synthetic */ d(Object obj, int i4, Object obj2) {
        this.f1783b = i4;
        this.f1785d = obj;
        this.f1784c = obj2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        int i5 = this.f1783b;
        Object obj = this.f1785d;
        switch (i5) {
            case 0:
                e eVar = (e) obj;
                DialogInterface.OnClickListener onClickListener = eVar.f1809h;
                h hVar = (h) this.f1784c;
                onClickListener.onClick(hVar.f1847b, i4);
                if (!eVar.f1810i) {
                    hVar.f1847b.dismiss();
                }
                break;
            default:
                t0 t0Var = (t0) obj;
                t0Var.H.setSelection(i4);
                w0 w0Var = t0Var.H;
                if (w0Var.getOnItemClickListener() != null) {
                    w0Var.performItemClick(view, i4, t0Var.E.getItemId(i4));
                }
                t0Var.dismiss();
                break;
        }
    }
}
