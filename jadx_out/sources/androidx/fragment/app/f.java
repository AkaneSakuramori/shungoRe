package androidx.fragment.app;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class f extends e.b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x f739e;

    public final x h(Context context) {
        if (this.f738d) {
            return this.f739e;
        }
        c1 c1Var = (c1) this.f1775a;
        x xVarV1 = c3.h.v1(context, c1Var.f715c, c1Var.f713a == 2, this.f737c);
        this.f739e = xVarV1;
        this.f738d = true;
        return xVarV1;
    }
}
