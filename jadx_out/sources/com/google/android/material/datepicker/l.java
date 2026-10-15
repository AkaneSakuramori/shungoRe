package com.google.android.material.datepicker;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import e.n0;
import i0.v0;
import java.util.ArrayList;
import y0.d0;
import y0.g1;

/* JADX INFO: loaded from: classes.dex */
public final class l<S> extends u {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final /* synthetic */ int f1460f0 = 0;
    public int U;
    public c V;
    public p W;
    public int X;
    public j1.s Y;
    public RecyclerView Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public RecyclerView f1461a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public View f1462b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public View f1463c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public View f1464d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public View f1465e0;

    public final void G(p pVar) {
        t tVar = (t) this.f1461a0.getAdapter();
        int iD = tVar.f1502c.f1438b.d(pVar);
        int iD2 = iD - tVar.f1502c.f1438b.d(this.W);
        boolean z4 = Math.abs(iD2) > 3;
        boolean z5 = iD2 > 0;
        this.W = pVar;
        if (z4 && z5) {
            this.f1461a0.a0(iD - 3);
            this.f1461a0.post(new g(this, iD));
        } else if (!z4) {
            this.f1461a0.post(new g(this, iD));
        } else {
            this.f1461a0.a0(iD + 3);
            this.f1461a0.post(new g(this, iD));
        }
    }

    public final void H(int i4) {
        this.X = i4;
        if (i4 == 2) {
            this.Z.getLayoutManager().l0(this.W.f1488d - ((y) this.Z.getAdapter()).f1507c.V.f1438b.f1488d);
            this.f1464d0.setVisibility(0);
            this.f1465e0.setVisibility(8);
            this.f1462b0.setVisibility(8);
            this.f1463c0.setVisibility(8);
            return;
        }
        if (i4 == 1) {
            this.f1464d0.setVisibility(8);
            this.f1465e0.setVisibility(0);
            this.f1462b0.setVisibility(0);
            this.f1463c0.setVisibility(0);
            G(this.W);
        }
    }

    @Override // androidx.fragment.app.q
    public final void q(Bundle bundle) {
        super.q(bundle);
        if (bundle == null) {
            bundle = this.f853g;
        }
        this.U = bundle.getInt("THEME_RES_ID_KEY");
        defpackage.a.j(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.V = (c) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        defpackage.a.j(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.W = (p) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.q
    public final View r(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i4;
        int i5;
        d0 d0Var;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(g(), this.U);
        this.Y = new j1.s(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        p pVar = this.V.f1438b;
        int i6 = 1;
        int i7 = 0;
        if (n.K(contextThemeWrapper, R.attr.windowFullscreen)) {
            i4 = com.shungo.app.R.layout.mtrl_calendar_vertical;
            i5 = 1;
        } else {
            i4 = com.shungo.app.R.layout.mtrl_calendar_horizontal;
            i5 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i4, viewGroup, false);
        Resources resources = C().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.shungo.app.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.shungo.app.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.shungo.app.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.shungo.app.R.dimen.mtrl_calendar_days_of_week_height);
        int i8 = q.f1493e;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.shungo.app.R.dimen.mtrl_calendar_month_vertical_padding) * (i8 - 1)) + (resources.getDimensionPixelSize(com.shungo.app.R.dimen.mtrl_calendar_day_height) * i8) + resources.getDimensionPixelOffset(com.shungo.app.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(com.shungo.app.R.id.mtrl_calendar_days_of_week);
        v0.l(gridView, new h(i7, this));
        int i9 = this.V.f1442f;
        gridView.setAdapter((ListAdapter) (i9 > 0 ? new e(i9) : new e()));
        gridView.setNumColumns(pVar.f1489e);
        gridView.setEnabled(false);
        this.f1461a0 = (RecyclerView) viewInflate.findViewById(com.shungo.app.R.id.mtrl_calendar_months);
        g();
        this.f1461a0.setLayoutManager(new i(this, i5, i5));
        this.f1461a0.setTag("MONTHS_VIEW_GROUP_TAG");
        t tVar = new t(contextThemeWrapper, this.V, new n0(27, this));
        this.f1461a0.setAdapter(tVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.shungo.app.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) viewInflate.findViewById(com.shungo.app.R.id.mtrl_calendar_year_selector_frame);
        this.Z = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.Z.setLayoutManager(new GridLayoutManager(integer));
            this.Z.setAdapter(new y(this));
            this.Z.g(new j(this));
        }
        if (viewInflate.findViewById(com.shungo.app.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(com.shungo.app.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            int i10 = 2;
            v0.l(materialButton, new h(i10, this));
            View viewFindViewById = viewInflate.findViewById(com.shungo.app.R.id.month_navigation_previous);
            this.f1462b0 = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(com.shungo.app.R.id.month_navigation_next);
            this.f1463c0 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f1464d0 = viewInflate.findViewById(com.shungo.app.R.id.mtrl_calendar_year_selector_frame);
            this.f1465e0 = viewInflate.findViewById(com.shungo.app.R.id.mtrl_calendar_day_selector_frame);
            H(1);
            materialButton.setText(this.W.c());
            this.f1461a0.h(new k(this, tVar, materialButton));
            materialButton.setOnClickListener(new e.b(i10, this));
            this.f1463c0.setOnClickListener(new f(this, tVar, i6));
            this.f1462b0.setOnClickListener(new f(this, tVar, i7));
        }
        if (!n.K(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (d0Var = new d0()).f5098a) != (recyclerView = this.f1461a0)) {
            g1 g1Var = d0Var.f5099b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f1029f0;
                if (arrayList != null) {
                    arrayList.remove(g1Var);
                }
                d0Var.f5098a.setOnFlingListener(null);
            }
            d0Var.f5098a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                d0Var.f5098a.h(g1Var);
                d0Var.f5098a.setOnFlingListener(d0Var);
                new Scroller(d0Var.f5098a.getContext(), new DecelerateInterpolator());
                d0Var.f();
            }
        }
        this.f1461a0.a0(tVar.f1502c.f1438b.d(this.W));
        v0.l(this.f1461a0, new h(i6, this));
        return viewInflate;
    }

    @Override // androidx.fragment.app.q
    public final void w(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.U);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.V);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.W);
    }
}
