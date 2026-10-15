package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import y0.a1;
import y0.c0;

/* JADX INFO: loaded from: classes.dex */
public final class i extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ l F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, int i4, int i5) {
        super(i4);
        this.F = lVar;
        this.E = i5;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, y0.o0
    public final void v0(RecyclerView recyclerView, int i4) {
        c0 c0Var = new c0(this, recyclerView.getContext(), 2);
        c0Var.f5349a = i4;
        w0(c0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void y0(a1 a1Var, int[] iArr) {
        int i4 = this.E;
        l lVar = this.F;
        if (i4 == 0) {
            iArr[0] = lVar.f1461a0.getWidth();
            iArr[1] = lVar.f1461a0.getWidth();
        } else {
            iArr[0] = lVar.f1461a0.getHeight();
            iArr[1] = lVar.f1461a0.getHeight();
        }
    }
}
