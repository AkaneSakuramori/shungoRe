package e;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import i.t3;

/* JADX INFO: loaded from: classes.dex */
public final class b implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1774c;

    public /* synthetic */ b(int i4, Object obj) {
        this.f1773b = i4;
        this.f1774c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i4 = this.f1773b;
        Object obj = this.f1774c;
        switch (i4) {
            case 0:
                h hVar = (h) obj;
                Button button = hVar.f1851f;
                hVar.f1868w.obtainMessage(1, hVar.f1847b).sendToTarget();
                break;
            case 1:
                t3 t3Var = ((Toolbar) obj).M;
                h.q qVar = t3Var == null ? null : t3Var.f2780c;
                if (qVar != null) {
                    qVar.collapseActionView();
                }
                break;
            default:
                com.google.android.material.datepicker.l lVar = (com.google.android.material.datepicker.l) obj;
                int i5 = lVar.X;
                if (i5 == 2) {
                    lVar.H(1);
                } else if (i5 == 1) {
                    lVar.H(2);
                }
                break;
        }
    }
}
