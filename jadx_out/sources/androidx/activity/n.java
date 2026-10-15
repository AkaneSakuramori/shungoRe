package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.SavedStateHandleAttacher;
import androidx.lifecycle.h0;
import androidx.lifecycle.j0;
import androidx.lifecycle.l0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import com.shungo.app.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends y.j implements r0, androidx.lifecycle.h, z0.g, a0, androidx.activity.result.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b.a f271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e.c f272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.t f273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z0.f f274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q0 f275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public z f276h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m f277i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q f278j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f279k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f280l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f281m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f282n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList f283o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f284p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f285q;

    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.activity.e] */
    public n() {
        this.f5036b = new androidx.lifecycle.t(this);
        this.f271c = new b.a();
        this.f272d = new e.c(new d(0, this));
        androidx.lifecycle.t tVar = new androidx.lifecycle.t(this);
        this.f273e = tVar;
        z0.f fVarB = z0.c.b(this);
        this.f274f = fVarB;
        z0.d dVar = null;
        this.f276h = null;
        final androidx.fragment.app.u uVar = (androidx.fragment.app.u) this;
        m mVar = new m(uVar);
        this.f277i = mVar;
        this.f278j = new q(mVar, new j3.a() { // from class: androidx.activity.e
            @Override // j3.a
            public final Object a() {
                uVar.reportFullyDrawn();
                return null;
            }
        });
        this.f279k = new AtomicInteger();
        this.f280l = new i(uVar);
        this.f281m = new CopyOnWriteArrayList();
        this.f282n = new CopyOnWriteArrayList();
        this.f283o = new CopyOnWriteArrayList();
        this.f284p = new CopyOnWriteArrayList();
        this.f285q = new CopyOnWriteArrayList();
        tVar.a(new androidx.lifecycle.p() { // from class: androidx.activity.ComponentActivity$2
            @Override // androidx.lifecycle.p
            public final void b(androidx.lifecycle.r rVar, androidx.lifecycle.l lVar) {
                if (lVar == androidx.lifecycle.l.ON_STOP) {
                    Window window = uVar.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        tVar.a(new androidx.lifecycle.p() { // from class: androidx.activity.ComponentActivity$3
            @Override // androidx.lifecycle.p
            public final void b(androidx.lifecycle.r rVar, androidx.lifecycle.l lVar) {
                if (lVar == androidx.lifecycle.l.ON_DESTROY) {
                    uVar.f271c.f1078b = null;
                    if (!uVar.isChangingConfigurations()) {
                        uVar.h().a();
                    }
                    m mVar2 = uVar.f277i;
                    n nVar = mVar2.f270e;
                    nVar.getWindow().getDecorView().removeCallbacks(mVar2);
                    nVar.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(mVar2);
                }
            }
        });
        tVar.a(new androidx.lifecycle.p() { // from class: androidx.activity.ComponentActivity$4
            @Override // androidx.lifecycle.p
            public final void b(androidx.lifecycle.r rVar, androidx.lifecycle.l lVar) {
                n nVar = uVar;
                if (nVar.f275g == null) {
                    l lVar2 = (l) nVar.getLastNonConfigurationInstance();
                    if (lVar2 != null) {
                        nVar.f275g = lVar2.f266a;
                    }
                    if (nVar.f275g == null) {
                        nVar.f275g = new q0();
                    }
                }
                nVar.f273e.b(this);
            }
        });
        fVarB.a();
        androidx.lifecycle.m mVar2 = tVar.f983f;
        if (mVar2 != androidx.lifecycle.m.f967c && mVar2 != androidx.lifecycle.m.f968d) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        z0.e eVar = fVarB.f5440b;
        eVar.getClass();
        Iterator it = eVar.f5433a.iterator();
        while (true) {
            k.e eVar2 = (k.e) it;
            if (!eVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) eVar2.next();
            c3.h.a0(entry, "components");
            String str = (String) entry.getKey();
            z0.d dVar2 = (z0.d) entry.getValue();
            if (c3.h.I(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                dVar = dVar2;
                break;
            }
        }
        if (dVar == null) {
            l0 l0Var = new l0(this.f274f.f5440b, uVar);
            this.f274f.f5440b.b("androidx.lifecycle.internal.SavedStateHandlesProvider", l0Var);
            this.f273e.a(new SavedStateHandleAttacher(l0Var));
        }
        this.f274f.f5440b.b("android:support:activity-result", new z0.d() { // from class: androidx.activity.f
            @Override // z0.d
            public final Bundle a() {
                n nVar = uVar;
                nVar.getClass();
                Bundle bundle = new Bundle();
                i iVar = nVar.f280l;
                iVar.getClass();
                HashMap map = iVar.f310b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(iVar.f312d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) iVar.f315g.clone());
                return bundle;
            }
        });
        i(new b.b() { // from class: androidx.activity.g
            @Override // b.b
            public final void a() {
                n nVar = uVar;
                Bundle bundleA = nVar.f274f.f5440b.a("android:support:activity-result");
                if (bundleA != null) {
                    i iVar = nVar.f280l;
                    iVar.getClass();
                    ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    iVar.f312d = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    Bundle bundle = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    Bundle bundle2 = iVar.f315g;
                    bundle2.putAll(bundle);
                    for (int i4 = 0; i4 < stringArrayList.size(); i4++) {
                        String str2 = stringArrayList.get(i4);
                        HashMap map = iVar.f310b;
                        boolean zContainsKey = map.containsKey(str2);
                        HashMap map2 = iVar.f309a;
                        if (zContainsKey) {
                            Integer num = (Integer) map.remove(str2);
                            if (!bundle2.containsKey(str2)) {
                                map2.remove(num);
                            }
                        }
                        int iIntValue = integerArrayList.get(i4).intValue();
                        String str3 = stringArrayList.get(i4);
                        map2.put(Integer.valueOf(iIntValue), str3);
                        map.put(str3, Integer.valueOf(iIntValue));
                    }
                }
            }
        });
    }

    @Override // androidx.lifecycle.h
    public final u0.b a() {
        u0.d dVar = new u0.d(u0.a.f4669b);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = dVar.f4670a;
        if (application != null) {
            linkedHashMap.put(o0.f976a, getApplication());
        }
        linkedHashMap.put(j0.f956a, this);
        linkedHashMap.put(j0.f957b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(j0.f958c, getIntent().getExtras());
        }
        return dVar;
    }

    @Override // z0.g
    public final z0.e e() {
        return this.f274f.f5440b;
    }

    @Override // androidx.lifecycle.r0
    public final q0 h() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f275g == null) {
            l lVar = (l) getLastNonConfigurationInstance();
            if (lVar != null) {
                this.f275g = lVar.f266a;
            }
            if (this.f275g == null) {
                this.f275g = new q0();
            }
        }
        return this.f275g;
    }

    public final void i(b.b bVar) {
        b.a aVar = this.f271c;
        aVar.getClass();
        if (aVar.f1078b != null) {
            bVar.a();
        }
        aVar.f1077a.add(bVar);
    }

    public final z j() {
        if (this.f276h == null) {
            this.f276h = new z(new j(0, this));
            this.f273e.a(new androidx.lifecycle.p() { // from class: androidx.activity.ComponentActivity$6
                @Override // androidx.lifecycle.p
                public final void b(androidx.lifecycle.r rVar, androidx.lifecycle.l lVar) {
                    if (lVar != androidx.lifecycle.l.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                        return;
                    }
                    z zVar = this.f243b.f276h;
                    OnBackInvokedDispatcher onBackInvokedDispatcherA = k.a((n) rVar);
                    zVar.getClass();
                    c3.h.b0(onBackInvokedDispatcherA, "invoker");
                    zVar.f341e = onBackInvokedDispatcherA;
                    zVar.c(zVar.f343g);
                }
            });
        }
        return this.f276h;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i4, int i5, Intent intent) {
        if (this.f280l.a(i4, i5, intent)) {
            return;
        }
        super.onActivityResult(i4, i5, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        j().b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f281m.iterator();
        while (it.hasNext()) {
            ((f0.e) ((h0.a) it.next())).b(configuration);
        }
    }

    @Override // y.j, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f274f.b(bundle);
        b.a aVar = this.f271c;
        aVar.getClass();
        aVar.f1078b = this;
        Iterator it = aVar.f1077a.iterator();
        while (it.hasNext()) {
            ((b.b) it.next()).a();
        }
        super.onCreate(bundle);
        int i4 = h0.f953c;
        f2.e.A(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i4, Menu menu) {
        if (i4 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i4, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f272d.f1780d).iterator();
        if (!it.hasNext()) {
            return true;
        }
        defpackage.a.n(it.next());
        throw null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i4, MenuItem menuItem) {
        if (super.onMenuItemSelected(i4, menuItem)) {
            return true;
        }
        if (i4 != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f272d.f1780d).iterator();
        if (!it.hasNext()) {
            return false;
        }
        defpackage.a.n(it.next());
        throw null;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z4, Configuration configuration) {
        super.onMultiWindowModeChanged(z4, configuration);
        Iterator it = this.f284p.iterator();
        while (it.hasNext()) {
            ((f0.e) ((h0.a) it.next())).b(new y.k(z4, configuration));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f283o.iterator();
        while (it.hasNext()) {
            ((f0.e) ((h0.a) it.next())).b(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i4, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.f272d.f1780d).iterator();
        if (it.hasNext()) {
            defpackage.a.n(it.next());
            throw null;
        }
        super.onPanelClosed(i4, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z4, Configuration configuration) {
        super.onPictureInPictureModeChanged(z4, configuration);
        Iterator it = this.f285q.iterator();
        while (it.hasNext()) {
            ((f0.e) ((h0.a) it.next())).b(new y.k(z4, configuration));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i4, View view, Menu menu) {
        if (i4 != 0) {
            return true;
        }
        super.onPreparePanel(i4, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f272d.f1780d).iterator();
        if (!it.hasNext()) {
            return true;
        }
        defpackage.a.n(it.next());
        throw null;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        if (this.f280l.a(i4, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i4, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        l lVar;
        q0 q0Var = this.f275g;
        if (q0Var == null && (lVar = (l) getLastNonConfigurationInstance()) != null) {
            q0Var = lVar.f266a;
        }
        if (q0Var == null) {
            return null;
        }
        l lVar2 = new l();
        lVar2.f266a = q0Var;
        return lVar2;
    }

    @Override // y.j, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.t tVar = this.f273e;
        if (tVar instanceof androidx.lifecycle.t) {
            tVar.g();
        }
        super.onSaveInstanceState(bundle);
        this.f274f.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i4) {
        super.onTrimMemory(i4);
        Iterator it = this.f282n.iterator();
        while (it.hasNext()) {
            ((f0.e) ((h0.a) it.next())).b(Integer.valueOf(i4));
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (c3.h.o1()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            q qVar = this.f278j;
            synchronized (qVar.f289a) {
                try {
                    qVar.f290b = true;
                    Iterator it = qVar.f291c.iterator();
                    while (it.hasNext()) {
                        ((j3.a) it.next()).a();
                    }
                    qVar.f291c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        View decorView = getWindow().getDecorView();
        c3.h.b0(decorView, "<this>");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        c3.h.b0(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        c3.h.b0(decorView3, "<this>");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        c3.h.b0(decorView4, "<this>");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        c3.h.b0(decorView5, "<this>");
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        m mVar = this.f277i;
        if (!mVar.f269d) {
            mVar.f269d = true;
            decorView6.getViewTreeObserver().addOnDrawListener(mVar);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i4) {
        super.startActivityForResult(intent, i4);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i4, Intent intent, int i5, int i6, int i7) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i4, intent, i5, i6, i7);
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t t() {
        return this.f273e;
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i4, Bundle bundle) {
        super.startActivityForResult(intent, i4, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i4, Intent intent, int i5, int i6, int i7, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i4, intent, i5, i6, i7, bundle);
    }
}
