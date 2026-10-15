package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class t extends c3.h implements androidx.lifecycle.r0, androidx.activity.a0, androidx.activity.result.h, l0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Activity f883j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Context f884k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Handler f885l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i0 f886m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ u f887n;

    public t(e.m mVar) {
        this.f887n = mVar;
        Handler handler = new Handler();
        this.f886m = new i0();
        this.f883j = mVar;
        this.f884k = mVar;
        this.f885l = handler;
    }

    @Override // c3.h
    public final View F1(int i4) {
        return this.f887n.findViewById(i4);
    }

    @Override // c3.h
    public final boolean J1() {
        Window window = this.f887n.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // androidx.lifecycle.r0
    public final androidx.lifecycle.q0 h() {
        return this.f887n.h();
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t t() {
        return this.f887n.f891s;
    }

    @Override // androidx.fragment.app.l0
    public final void z() {
        this.f887n.getClass();
    }
}
