package com.google.android.material.datepicker;

import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1436b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f1437a;

    static {
        p pVarA = p.a(1900, 0);
        Calendar calendarD = w.d(null);
        calendarD.setTimeInMillis(pVarA.f1491g);
        w.b(calendarD).getTimeInMillis();
        p pVarA2 = p.a(2100, 11);
        Calendar calendarD2 = w.d(null);
        calendarD2.setTimeInMillis(pVarA2.f1491g);
        w.b(calendarD2).getTimeInMillis();
    }
}
