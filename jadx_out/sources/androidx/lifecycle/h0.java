package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends Fragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f953c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c0 f954b;

    public final void a(l lVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            c3.h.a0(activity, "activity");
            f2.e.l(activity, lVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(l.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(l.ON_DESTROY);
        this.f954b = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(l.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        c0 c0Var = this.f954b;
        if (c0Var != null) {
            c0Var.f942a.a();
        }
        a(l.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        c0 c0Var = this.f954b;
        if (c0Var != null) {
            d0 d0Var = c0Var.f942a;
            int i4 = d0Var.f944b + 1;
            d0Var.f944b = i4;
            if (i4 == 1 && d0Var.f947e) {
                d0Var.f949g.e(l.ON_START);
                d0Var.f947e = false;
            }
        }
        a(l.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(l.ON_STOP);
    }
}
