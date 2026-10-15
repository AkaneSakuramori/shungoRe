package com.google.android.material.datepicker;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import y0.o0;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f1453c;

    public g(l lVar, int i4) {
        this.f1453c = lVar;
        this.f1452b = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.f1453c.f1461a0;
        if (recyclerView.f1058v) {
            return;
        }
        o0 o0Var = recyclerView.f1042m;
        if (o0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            o0Var.v0(recyclerView, this.f1452b);
        }
    }
}
