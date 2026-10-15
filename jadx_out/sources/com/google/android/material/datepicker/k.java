package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import y0.o0;
import y0.s0;

/* JADX INFO: loaded from: classes.dex */
public final class k extends s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f1457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f1458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f1459c;

    public k(l lVar, t tVar, MaterialButton materialButton) {
        this.f1459c = lVar;
        this.f1457a = tVar;
        this.f1458b = materialButton;
    }

    @Override // y0.s0
    public final void a(RecyclerView recyclerView, int i4) {
        if (i4 == 0) {
            recyclerView.announceForAccessibility(this.f1458b.getText());
        }
    }

    @Override // y0.s0
    public final void b(RecyclerView recyclerView, int i4, int i5) {
        int iI0;
        l lVar = this.f1459c;
        if (i4 < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) lVar.f1461a0.getLayoutManager();
            View viewK0 = linearLayoutManager.K0(0, linearLayoutManager.v(), false);
            iI0 = viewK0 == null ? -1 : o0.F(viewK0);
        } else {
            iI0 = ((LinearLayoutManager) lVar.f1461a0.getLayoutManager()).I0();
        }
        t tVar = this.f1457a;
        Calendar calendarB = w.b(tVar.f1502c.f1438b.f1486b);
        calendarB.add(2, iI0);
        lVar.W = new p(calendarB);
        Calendar calendarB2 = w.b(tVar.f1502c.f1438b.f1486b);
        calendarB2.add(2, iI0);
        this.f1458b.setText(new p(calendarB2).c());
    }
}
