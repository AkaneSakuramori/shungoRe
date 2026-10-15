package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.shungo.app.R;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class q extends BaseAdapter {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f1493e = w.d(null).getMaximum(4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f1494f = (w.d(null).getMaximum(7) + w.d(null).getMaximum(5)) - 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f1495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j1.s f1496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f1497d;

    public q(p pVar, c cVar) {
        this.f1495b = pVar;
        this.f1497d = cVar;
        throw null;
    }

    public final int a() {
        int firstDayOfWeek = this.f1497d.f1442f;
        p pVar = this.f1495b;
        Calendar calendar = pVar.f1486b;
        int i4 = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i5 = i4 - firstDayOfWeek;
        return i5 < 0 ? i5 + pVar.f1489e : i5;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i4) {
        if (i4 < a() || i4 > c()) {
            return null;
        }
        int iA = (i4 - a()) + 1;
        Calendar calendarB = w.b(this.f1495b.f1486b);
        calendarB.set(5, iA);
        return Long.valueOf(calendarB.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.f1495b.f1490f) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f1494f;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        return i4 / this.f1495b.f1489e;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d  */
    @Override // android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f1496c == null) {
            this.f1496c = new j1.s(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iA = i4 - a();
        if (iA >= 0) {
            p pVar = this.f1495b;
            if (iA >= pVar.f1490f) {
                textView.setVisibility(8);
                textView.setEnabled(false);
            } else {
                textView.setTag(pVar);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(iA + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
        }
        Long item = getItem(i4);
        if (item != null) {
            item.longValue();
            if (textView != null) {
                textView.getContext();
                w.c().getTimeInMillis();
                throw null;
            }
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
