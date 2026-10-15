package i;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final class g2 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2595c;

    public /* synthetic */ g2(int i4, Object obj) {
        this.f2594b = i4;
        this.f2595c = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i4, long j4) {
        z1 z1Var;
        int i5 = this.f2594b;
        Object obj = this.f2595c;
        switch (i5) {
            case 0:
                if (i4 != -1 && (z1Var = ((m2) obj).f2687d) != null) {
                    z1Var.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) obj).q(i4);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
