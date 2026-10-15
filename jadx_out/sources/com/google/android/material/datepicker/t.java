package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.shungo.app.R;
import e.n0;
import java.util.Calendar;
import y0.d1;
import y0.g0;
import y0.p0;

/* JADX INFO: loaded from: classes.dex */
public final class t extends g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f1502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n0 f1503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1504e;

    public t(ContextThemeWrapper contextThemeWrapper, c cVar, n0 n0Var) {
        p pVar = cVar.f1438b;
        p pVar2 = cVar.f1441e;
        if (pVar.f1486b.compareTo(pVar2.f1486b) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (pVar2.f1486b.compareTo(cVar.f1439c.f1486b) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        int i4 = q.f1493e;
        int i5 = l.f1460f0;
        this.f1504e = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i4) + (n.K(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f1502c = cVar;
        this.f1503d = n0Var;
        if (this.f5141a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f5142b = true;
    }

    @Override // y0.g0
    public final int a() {
        return this.f1502c.f1444h;
    }

    @Override // y0.g0
    public final long b(int i4) {
        Calendar calendarB = w.b(this.f1502c.f1438b.f1486b);
        calendarB.add(2, i4);
        return new p(calendarB).f1486b.getTimeInMillis();
    }

    @Override // y0.g0
    public final void c(d1 d1Var, int i4) {
        s sVar = (s) d1Var;
        c cVar = this.f1502c;
        Calendar calendarB = w.b(cVar.f1438b.f1486b);
        calendarB.add(2, i4);
        p pVar = new p(calendarB);
        sVar.f1500t.setText(pVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) sVar.f1501u.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !pVar.equals(materialCalendarGridView.a().f1495b)) {
            new q(pVar, cVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // y0.g0
    public final d1 d(RecyclerView recyclerView) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, (ViewGroup) recyclerView, false);
        if (!n.K(recyclerView.getContext(), android.R.attr.windowFullscreen)) {
            return new s(linearLayout, false);
        }
        linearLayout.setLayoutParams(new p0(-1, this.f1504e));
        return new s(linearLayout, true);
    }
}
