package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.c0;
import androidx.fragment.app.i0;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3.i f338b = new a3.i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c0 f339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f343g;

    public z(Runnable runnable) {
        OnBackInvokedCallback onBackInvokedCallbackA;
        this.f337a = runnable;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33) {
            if (i4 >= 34) {
                int i5 = 0;
                int i6 = 1;
                onBackInvokedCallbackA = w.f333a.a(new r(this, i5), new r(this, i6), new s(this, i5), new s(this, i6));
            } else {
                onBackInvokedCallbackA = u.f328a.a(new s(this, 2));
            }
            this.f340d = onBackInvokedCallbackA;
        }
    }

    public final void a(androidx.lifecycle.r rVar, c0 c0Var) {
        c3.h.b0(c0Var, "onBackPressedCallback");
        androidx.lifecycle.t tVarT = rVar.t();
        if (tVarT.f983f == androidx.lifecycle.m.f966b) {
            return;
        }
        c0Var.f710b.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, tVarT, c0Var));
        d();
        c0Var.f711c = new y(0, this);
    }

    public final void b() {
        Object objPrevious;
        a3.i iVar = this.f338b;
        iVar.getClass();
        ListIterator listIterator = iVar.listIterator(iVar.f71d);
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((c0) objPrevious).f709a);
        c0 c0Var = (c0) objPrevious;
        this.f339c = null;
        if (c0Var == null) {
            Runnable runnable = this.f337a;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        i0 i0Var = c0Var.f712d;
        i0Var.x(true);
        if (i0Var.f756h.f709a) {
            i0Var.K();
        } else {
            i0Var.f755g.b();
        }
    }

    public final void c(boolean z4) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f341e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f340d) == null) {
            return;
        }
        u uVar = u.f328a;
        if (z4 && !this.f342f) {
            uVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f342f = true;
        } else {
            if (z4 || !this.f342f) {
                return;
            }
            uVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f342f = false;
        }
    }

    public final void d() {
        boolean z4 = this.f343g;
        a3.i iVar = this.f338b;
        boolean z5 = false;
        if (!(iVar instanceof Collection) || !iVar.isEmpty()) {
            Iterator it = iVar.iterator();
            while (it.hasNext()) {
                if (((c0) it.next()).f709a) {
                    z5 = true;
                    break;
                }
            }
        }
        this.f343g = z5;
        if (z5 == z4 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        c(z5);
    }
}
