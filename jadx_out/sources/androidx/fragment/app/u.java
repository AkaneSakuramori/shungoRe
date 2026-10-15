package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class u extends androidx.activity.n implements y.c, y.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k f890r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f892t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f893u;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final androidx.lifecycle.t f891s = new androidx.lifecycle.t(this);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f894v = true;

    public u() {
        e.m mVar = (e.m) this;
        this.f890r = new k(2, new t(mVar));
        this.f274f.f5440b.b("android:support:fragments", new r(mVar));
        i(new s(mVar));
    }

    public static boolean k(i0 i0Var) {
        boolean zK = false;
        for (q qVar : i0Var.f751c.f()) {
            if (qVar != null) {
                t tVar = qVar.f866t;
                if ((tVar == null ? null : tVar.f887n) != null) {
                    zK |= k(qVar.f());
                }
                z0 z0Var = qVar.O;
                androidx.lifecycle.m mVar = androidx.lifecycle.m.f969e;
                if (z0Var != null) {
                    z0Var.c();
                    if (z0Var.f926c.f983f.compareTo(mVar) >= 0) {
                        qVar.O.f926c.g();
                        zK = true;
                    }
                }
                if (qVar.N.f983f.compareTo(mVar) >= 0) {
                    qVar.N.g();
                    zK = true;
                }
            }
        }
        return zK;
    }

    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f892t);
        printWriter.print(" mResumed=");
        printWriter.print(this.f893u);
        printWriter.print(" mStopped=");
        printWriter.print(this.f894v);
        if (getApplication() != null) {
            new v0.b(this, h()).Q2(str2, printWriter);
        }
        ((t) this.f890r.f785c).f886m.u(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.activity.n, android.app.Activity
    public final void onActivityResult(int i4, int i5, Intent intent) {
        this.f890r.f();
        super.onActivityResult(i4, i5, intent);
    }

    @Override // androidx.activity.n, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        k kVar = this.f890r;
        kVar.f();
        super.onConfigurationChanged(configuration);
        ((t) kVar.f785c).f886m.h(configuration);
    }

    @Override // androidx.activity.n, y.j, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f891s.e(androidx.lifecycle.l.ON_CREATE);
        i0 i0Var = ((t) this.f890r.f785c).f886m;
        i0Var.A = false;
        i0Var.B = false;
        i0Var.H.f792h = false;
        i0Var.s(1);
    }

    @Override // androidx.activity.n, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i4, Menu menu) {
        if (i4 != 0) {
            super.onCreatePanelMenu(i4, menu);
            return true;
        }
        super.onCreatePanelMenu(i4, menu);
        getMenuInflater();
        return ((t) this.f890r.f785c).f886m.j() | true;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((t) this.f890r.f785c).f886m.f754f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((t) this.f890r.f785c).f886m.k();
        this.f891s.e(androidx.lifecycle.l.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        ((t) this.f890r.f785c).f886m.l();
    }

    @Override // androidx.activity.n, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i4, MenuItem menuItem) {
        if (super.onMenuItemSelected(i4, menuItem)) {
            return true;
        }
        k kVar = this.f890r;
        if (i4 == 0) {
            return ((t) kVar.f785c).f886m.n();
        }
        if (i4 != 6) {
            return false;
        }
        return ((t) kVar.f785c).f886m.i();
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z4) {
        ((t) this.f890r.f785c).f886m.m(z4);
    }

    @Override // androidx.activity.n, android.app.Activity
    public final void onNewIntent(Intent intent) {
        this.f890r.f();
        super.onNewIntent(intent);
    }

    @Override // androidx.activity.n, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i4, Menu menu) {
        if (i4 == 0) {
            ((t) this.f890r.f785c).f886m.o();
        }
        super.onPanelClosed(i4, menu);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f893u = false;
        ((t) this.f890r.f785c).f886m.s(5);
        this.f891s.e(androidx.lifecycle.l.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z4) {
        ((t) this.f890r.f785c).f886m.q(z4);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f891s.e(androidx.lifecycle.l.ON_RESUME);
        i0 i0Var = ((t) this.f890r.f785c).f886m;
        i0Var.A = false;
        i0Var.B = false;
        i0Var.H.f792h = false;
        i0Var.s(7);
    }

    @Override // androidx.activity.n, android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i4, View view, Menu menu) {
        if (i4 == 0) {
            super.onPreparePanel(0, view, menu);
            return ((t) this.f890r.f785c).f886m.r() | true;
        }
        super.onPreparePanel(i4, view, menu);
        return true;
    }

    @Override // androidx.activity.n, android.app.Activity
    public final void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        this.f890r.f();
        super.onRequestPermissionsResult(i4, strArr, iArr);
    }

    @Override // android.app.Activity
    public final void onResume() {
        k kVar = this.f890r;
        kVar.f();
        super.onResume();
        this.f893u = true;
        ((t) kVar.f785c).f886m.x(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        k kVar = this.f890r;
        kVar.f();
        super.onStart();
        this.f894v = false;
        boolean z4 = this.f892t;
        Object obj = kVar.f785c;
        if (!z4) {
            this.f892t = true;
            i0 i0Var = ((t) obj).f886m;
            i0Var.A = false;
            i0Var.B = false;
            i0Var.H.f792h = false;
            i0Var.s(4);
        }
        ((t) obj).f886m.x(true);
        this.f891s.e(androidx.lifecycle.l.ON_START);
        i0 i0Var2 = ((t) obj).f886m;
        i0Var2.A = false;
        i0Var2.B = false;
        i0Var2.H.f792h = false;
        i0Var2.s(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f890r.f();
    }

    @Override // android.app.Activity
    public void onStop() {
        k kVar;
        super.onStop();
        this.f894v = true;
        do {
            kVar = this.f890r;
        } while (k(((t) kVar.f785c).f886m));
        i0 i0Var = ((t) kVar.f785c).f886m;
        i0Var.B = true;
        i0Var.H.f792h = true;
        i0Var.s(4);
        this.f891s.e(androidx.lifecycle.l.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((t) this.f890r.f785c).f886m.f754f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }
}
