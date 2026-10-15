package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import e.n0;

/* JADX INFO: loaded from: classes.dex */
public final class r implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f1498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f1499c;

    public r(t tVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f1499c = tVar;
        this.f1498b = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        MaterialCalendarGridView materialCalendarGridView = this.f1498b;
        q qVarA = materialCalendarGridView.a();
        if (i4 < qVarA.a() || i4 > qVarA.c()) {
            return;
        }
        n0 n0Var = this.f1499c.f1503d;
        long jLongValue = materialCalendarGridView.a().getItem(i4).longValue();
        Object obj = n0Var.f1896c;
        if (jLongValue < ((d) ((l) obj).V.f1440d).f1445b) {
            return;
        }
        ((l) obj).getClass();
        throw null;
    }
}
