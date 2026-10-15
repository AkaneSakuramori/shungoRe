package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class o<S> extends u {
    public int U;
    public c V;

    @Override // androidx.fragment.app.q
    public final void q(Bundle bundle) {
        super.q(bundle);
        if (bundle == null) {
            bundle = this.f853g;
        }
        this.U = bundle.getInt("THEME_RES_ID_KEY");
        defpackage.a.j(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.V = (c) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.q
    public final View r(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(g(), this.U));
        throw null;
    }

    @Override // androidx.fragment.app.q
    public final void w(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.U);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.V);
    }
}
