package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.shungo.app.R;
import java.util.Locale;
import y0.d1;
import y0.g0;

/* JADX INFO: loaded from: classes.dex */
public final class y extends g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f1507c;

    public y(l lVar) {
        this.f1507c = lVar;
    }

    @Override // y0.g0
    public final int a() {
        return this.f1507c.V.f1443g;
    }

    @Override // y0.g0
    public final void c(d1 d1Var, int i4) {
        l lVar = this.f1507c;
        int i5 = lVar.V.f1438b.f1488d + i4;
        String str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i5));
        TextView textView = ((x) d1Var).f1506t;
        textView.setText(str);
        Context context = textView.getContext();
        textView.setContentDescription(w.c().get(1) == i5 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i5)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i5)));
        j1.s sVar = lVar.Y;
        if (w.c().get(1) == i5) {
            Object obj = sVar.f3218f;
        } else {
            Object obj2 = sVar.f3216d;
        }
        throw null;
    }

    @Override // y0.g0
    public final d1 d(RecyclerView recyclerView) {
        return new x((TextView) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.mtrl_calendar_year, (ViewGroup) recyclerView, false));
    }
}
