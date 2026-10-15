package e;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import androidx.fragment.app.c1;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f1775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1776b;

    public b0(c1 c1Var, e0.e eVar) {
        this.f1775a = c1Var;
        this.f1776b = eVar;
    }

    public final void a() {
        Object obj = this.f1775a;
        if (((BroadcastReceiver) obj) != null) {
            try {
                ((e0) this.f1776b).f1825l.unregisterReceiver((BroadcastReceiver) obj);
            } catch (IllegalArgumentException unused) {
            }
            this.f1775a = null;
        }
    }

    public final void b() {
        c1 c1Var = (c1) this.f1775a;
        e0.e eVar = (e0.e) this.f1776b;
        HashSet hashSet = c1Var.f717e;
        if (hashSet.remove(eVar) && hashSet.isEmpty()) {
            c1Var.b();
        }
    }

    public abstract IntentFilter c();

    public abstract int d();

    public final boolean e() {
        int iC = defpackage.a.c(((c1) this.f1775a).f715c.F);
        int i4 = ((c1) this.f1775a).f713a;
        return iC == i4 || !(iC == 2 || i4 == 2);
    }

    public abstract void f();

    public final void g() {
        a();
        IntentFilter intentFilterC = c();
        if (intentFilterC == null || intentFilterC.countActions() == 0) {
            return;
        }
        if (((BroadcastReceiver) this.f1775a) == null) {
            this.f1775a = new a0(this);
        }
        ((e0) this.f1776b).f1825l.registerReceiver((BroadcastReceiver) this.f1775a, intentFilterC);
    }

    public b0(e0 e0Var) {
        this.f1776b = e0Var;
    }
}
