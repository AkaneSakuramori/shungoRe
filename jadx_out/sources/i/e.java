package i;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f2555c;

    public /* synthetic */ e(ActionBarOverlayLayout actionBarOverlayLayout, int i4) {
        this.f2554b = i4;
        this.f2555c = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f2554b;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2555c;
        switch (i4) {
            case 0:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f427x = actionBarOverlayLayout.f408e.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f428y);
                break;
            default:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f427x = actionBarOverlayLayout.f408e.animate().translationY(-actionBarOverlayLayout.f408e.getHeight()).setListener(actionBarOverlayLayout.f428y);
                break;
        }
    }
}
