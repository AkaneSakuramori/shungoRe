package h;

import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
import e.n0;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActionProvider f2479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f2480b;

    public r(w wVar, ActionProvider actionProvider) {
        this.f2480b = wVar;
        this.f2479a = actionProvider;
    }

    public abstract /* bridge */ /* synthetic */ boolean a();

    public abstract View b(MenuItem menuItem);

    public abstract /* bridge */ /* synthetic */ boolean c();

    public abstract void d(n0 n0Var);
}
