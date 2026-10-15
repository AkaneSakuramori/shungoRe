package i;

import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;

/* JADX INFO: loaded from: classes.dex */
public final class a implements i0.e1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2515b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f2517d;

    public a(ActionBarContextView actionBarContextView) {
        this.f2517d = actionBarContextView;
    }

    @Override // i0.e1
    public final void C() {
        super/*android.view.View*/.setVisibility(0);
        this.f2515b = false;
    }

    @Override // i0.e1
    public final void a() {
        if (this.f2515b) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f2517d;
        actionBarContextView.f390g = null;
        super/*android.view.View*/.setVisibility(this.f2516c);
    }

    @Override // i0.e1
    public final void x(View view) {
        this.f2515b = true;
    }
}
