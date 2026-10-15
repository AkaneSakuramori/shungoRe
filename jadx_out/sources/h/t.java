package h;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final class t extends FrameLayout implements g.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CollapsibleActionView f2482b;

    /* JADX WARN: Multi-variable type inference failed */
    public t(View view) {
        super(view.getContext());
        this.f2482b = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // g.d
    public final void a() {
        this.f2482b.onActionViewExpanded();
    }

    @Override // g.d
    public final void d() {
        this.f2482b.onActionViewCollapsed();
    }
}
