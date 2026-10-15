package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;
import y0.o0;

/* JADX INFO: loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f1450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f1451d;

    public /* synthetic */ f(l lVar, t tVar, int i4) {
        this.f1449b = i4;
        this.f1451d = lVar;
        this.f1450c = tVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i4 = this.f1449b;
        t tVar = this.f1450c;
        l lVar = this.f1451d;
        switch (i4) {
            case 0:
                int iI0 = ((LinearLayoutManager) lVar.f1461a0.getLayoutManager()).I0() - 1;
                if (iI0 >= 0) {
                    Calendar calendarB = w.b(tVar.f1502c.f1438b.f1486b);
                    calendarB.add(2, iI0);
                    lVar.G(new p(calendarB));
                }
                break;
            default:
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) lVar.f1461a0.getLayoutManager();
                View viewK0 = linearLayoutManager.K0(0, linearLayoutManager.v(), false);
                int iF = (viewK0 == null ? -1 : o0.F(viewK0)) + 1;
                if (iF < lVar.f1461a0.getAdapter().a()) {
                    Calendar calendarB2 = w.b(tVar.f1502c.f1438b.f1486b);
                    calendarB2.add(2, iF);
                    lVar.G(new p(calendarB2));
                }
                break;
        }
    }
}
