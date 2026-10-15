package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.shungo.app.R;
import i0.a0;
import i0.v0;
import java.util.WeakHashMap;
import y0.d1;

/* JADX INFO: loaded from: classes.dex */
public final class s extends d1 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f1500t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final MaterialCalendarGridView f1501u;

    public s(LinearLayout linearLayout, boolean z4) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f1500t = textView;
        WeakHashMap weakHashMap = v0.f2983a;
        new a0(R.id.tag_accessibility_heading, 3).b(textView, Boolean.TRUE);
        this.f1501u = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z4) {
            return;
        }
        textView.setVisibility(8);
    }
}
