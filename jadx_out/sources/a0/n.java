package a0;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f33c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f34d;

    public /* synthetic */ n(int i4, int i5, Object obj) {
        this.f32b = i5;
        this.f34d = obj;
        this.f33c = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f32b;
        int i5 = this.f33c;
        Object obj = this.f34d;
        switch (i4) {
            case 0:
                ((c3.h) obj).G1(i5);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                View view = (View) sideSheetBehavior.f1533p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, i5, false);
                }
                break;
        }
    }
}
