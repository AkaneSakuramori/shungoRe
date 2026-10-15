package i;

import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.ActionBarContextView;

/* JADX INFO: loaded from: classes.dex */
public final class c implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2531b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2533d;

    public c(ActionBarContextView actionBarContextView, g.c cVar) {
        this.f2533d = actionBarContextView;
        this.f2532c = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i4 = this.f2531b;
        Object obj = this.f2532c;
        switch (i4) {
            case 0:
                ((g.c) obj).a();
                break;
            default:
                x3 x3Var = (x3) this.f2533d;
                Window.Callback callback = x3Var.f2847k;
                if (callback != null && x3Var.f2848l) {
                    callback.onMenuItemSelected(0, (h.a) obj);
                    break;
                }
                break;
        }
    }

    public c(x3 x3Var) {
        this.f2533d = x3Var;
        this.f2532c = new h.a(x3Var.f2837a.getContext(), x3Var.f2844h);
    }
}
