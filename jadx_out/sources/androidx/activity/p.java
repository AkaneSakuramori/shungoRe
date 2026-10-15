package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: loaded from: classes.dex */
public abstract class p extends Dialog implements androidx.lifecycle.r, a0, z0.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.lifecycle.t f286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z0.f f287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f288d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, int i4) {
        super(context, i4);
        c3.h.b0(context, "context");
        this.f287c = z0.c.b(this);
        this.f288d = new z(new d(2, this));
    }

    public static void a(p pVar) {
        c3.h.b0(pVar, "this$0");
        super.onBackPressed();
    }

    @Override // z0.g
    public final z0.e e() {
        return this.f287c.f5440b;
    }

    public final androidx.lifecycle.t f() {
        androidx.lifecycle.t tVar = this.f286b;
        if (tVar != null) {
            return tVar;
        }
        androidx.lifecycle.t tVar2 = new androidx.lifecycle.t(this);
        this.f286b = tVar2;
        return tVar2;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f288d.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            c3.h.a0(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            z zVar = this.f288d;
            zVar.getClass();
            zVar.f341e = onBackInvokedDispatcher;
            zVar.c(zVar.f343g);
        }
        this.f287c.b(bundle);
        f().e(androidx.lifecycle.l.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        c3.h.a0(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f287c.c(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        f().e(androidx.lifecycle.l.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        f().e(androidx.lifecycle.l.ON_DESTROY);
        this.f286b = null;
        super.onStop();
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t t() {
        return f();
    }
}
