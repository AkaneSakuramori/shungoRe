package h;

import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class y implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f2490b;

    public y(a0 a0Var) {
        this.f2490b = a0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2490b.c();
    }
}
