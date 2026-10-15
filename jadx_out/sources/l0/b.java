package l0;

import android.provider.Settings;
import c3.h;
import com.shungo.app.MainActivity;
import u2.p;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements j0.d, androidx.activity.result.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3366a;

    public /* synthetic */ b(Object obj) {
        this.f3366a = obj;
    }

    @Override // androidx.activity.result.c
    public final void b(Object obj) {
        MainActivity mainActivity = (MainActivity) this.f3366a;
        int i4 = MainActivity.F;
        h.b0(mainActivity, "this$0");
        mainActivity.o().post(new p(mainActivity, Settings.canDrawOverlays(mainActivity), 1));
    }
}
