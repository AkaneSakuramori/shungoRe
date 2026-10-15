package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.shungo.app.R;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class e extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Calendar f1446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1448d;

    public e() {
        Calendar calendarD = w.d(null);
        this.f1446b = calendarD;
        this.f1447c = calendarD.getMaximum(7);
        this.f1448d = calendarD.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f1447c;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i4) {
        int i5 = this.f1447c;
        if (i4 >= i5) {
            return null;
        }
        int i6 = i4 + this.f1448d;
        if (i6 > i5) {
            i6 -= i5;
        }
        return Integer.valueOf(i6);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i5 = i4 + this.f1448d;
        int i6 = this.f1447c;
        if (i5 > i6) {
            i5 -= i6;
        }
        Calendar calendar = this.f1446b;
        calendar.set(7, i5);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public e(int i4) {
        Calendar calendarD = w.d(null);
        this.f1446b = calendarD;
        this.f1447c = calendarD.getMaximum(7);
        this.f1448d = i4;
    }
}
