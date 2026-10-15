package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.shungo.app.R;
import i0.f1;
import i0.g1;
import i0.h0;
import i0.h2;
import i0.k0;
import i0.v0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class n<S> extends androidx.fragment.app.m {
    public static final /* synthetic */ int G0 = 0;
    public TextView A0;
    public CheckableImageButton B0;
    public f2.h C0;
    public boolean D0;
    public CharSequence E0;
    public CharSequence F0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final LinkedHashSet f1468i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final LinkedHashSet f1469j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f1470k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public u f1471l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public c f1472m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public l f1473n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f1474o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public CharSequence f1475p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f1476q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f1477r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f1478s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public CharSequence f1479t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f1480u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public CharSequence f1481v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f1482w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public CharSequence f1483x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f1484y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public CharSequence f1485z0;

    public n() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f1468i0 = new LinkedHashSet();
        this.f1469j0 = new LinkedHashSet();
    }

    public static int J(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        p pVar = new p(w.c());
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding);
        int i4 = pVar.f1489e;
        return ((i4 - 1) * dimensionPixelOffset2) + (dimensionPixelSize * i4) + (dimensionPixelOffset * 2);
    }

    public static boolean K(Context context, int i4) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(c3.h.m2(R.attr.materialCalendarStyle, context, l.class.getCanonicalName()).data, new int[]{i4});
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z4;
    }

    @Override // androidx.fragment.app.m
    public final Dialog H() {
        Context contextC = C();
        C();
        int i4 = this.f1470k0;
        if (i4 == 0) {
            I();
            throw null;
        }
        Dialog dialog = new Dialog(contextC, i4);
        Context context = dialog.getContext();
        this.f1476q0 = K(context, android.R.attr.windowFullscreen);
        this.C0 = new f2.h(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, n1.a.f3550l, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.C0.i(context);
        this.C0.k(ColorStateList.valueOf(color));
        f2.h hVar = this.C0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = v0.f2983a;
        hVar.j(k0.i(decorView));
        return dialog;
    }

    public final void I() {
        defpackage.a.j(this.f853g.getParcelable("DATE_SELECTOR_KEY"));
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f1468i0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f1469j0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.F;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.q
    public final void q(Bundle bundle) {
        super.q(bundle);
        if (bundle == null) {
            bundle = this.f853g;
        }
        this.f1470k0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        defpackage.a.j(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f1472m0 = (c) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        defpackage.a.j(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f1474o0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f1475p0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f1477r0 = bundle.getInt("INPUT_MODE_KEY");
        this.f1478s0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f1479t0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f1480u0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f1481v0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f1482w0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f1483x0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f1484y0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f1485z0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f1475p0;
        if (text == null) {
            text = C().getResources().getText(this.f1474o0);
        }
        this.E0 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.F0 = text;
    }

    @Override // androidx.fragment.app.q
    public final View r(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(this.f1476q0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f1476q0) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(J(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(J(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = v0.f2983a;
        h0.f(textView, 1);
        this.B0 = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.A0 = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.B0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.B0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, r3.q.g(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], r3.q.g(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.B0.setChecked(this.f1477r0 != 0);
        v0.l(this.B0, null);
        CheckableImageButton checkableImageButton2 = this.B0;
        this.B0.setContentDescription(this.f1477r0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.B0.setOnClickListener(new m(0, this));
        I();
        throw null;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.q
    public final void w(Bundle bundle) {
        super.w(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f1470k0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        c cVar = this.f1472m0;
        a aVar = new a();
        int i4 = a.f1436b;
        int i5 = a.f1436b;
        long j4 = cVar.f1438b.f1491g;
        long j5 = cVar.f1439c.f1491g;
        aVar.f1437a = Long.valueOf(cVar.f1441e.f1491g);
        int i6 = cVar.f1442f;
        l lVar = this.f1473n0;
        p pVar = lVar == null ? null : lVar.W;
        if (pVar != null) {
            aVar.f1437a = Long.valueOf(pVar.f1491g);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", cVar.f1440d);
        p pVarB = p.b(j4);
        p pVarB2 = p.b(j5);
        b bVar = (b) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l4 = aVar.f1437a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new c(pVarB, pVarB2, bVar, l4 == null ? null : p.b(l4.longValue()), i6));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f1474o0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f1475p0);
        bundle.putInt("INPUT_MODE_KEY", this.f1477r0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f1478s0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f1479t0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f1480u0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f1481v0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f1482w0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f1483x0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f1484y0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f1485z0);
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.q
    public final void x() {
        u uVar;
        super.x();
        Dialog dialog = this.f799e0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.f1476q0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.C0);
            if (!this.D0) {
                View viewFindViewById = D().findViewById(R.id.fullscreen_header);
                ColorStateList colorStateListR0 = c3.h.R0(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListR0 != null ? Integer.valueOf(colorStateListR0.getDefaultColor()) : null;
                int i4 = Build.VERSION.SDK_INT;
                boolean z4 = false;
                boolean z5 = numValueOf == null || numValueOf.intValue() == 0;
                int iN0 = c3.h.N0(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z5) {
                    numValueOf = Integer.valueOf(iN0);
                }
                Integer numValueOf2 = Integer.valueOf(iN0);
                if (i4 >= 30) {
                    g1.a(window, false);
                } else {
                    f1.a(window, false);
                }
                window.getContext();
                int iD = i4 < 27 ? b0.a.d(c3.h.N0(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(iD);
                new h2(window, window.getDecorView()).f2922a.N(c3.h.n1(0) || c3.h.n1(numValueOf.intValue()));
                boolean zN1 = c3.h.n1(numValueOf2.intValue());
                if (c3.h.n1(iD) || (iD == 0 && zN1)) {
                    z4 = true;
                }
                new h2(window, window.getDecorView()).f2922a.M(z4);
                int paddingTop = viewFindViewById.getPaddingTop();
                int i5 = viewFindViewById.getLayoutParams().height;
                androidx.activity.result.i iVar = new androidx.activity.result.i();
                iVar.f319e = this;
                iVar.f316b = i5;
                iVar.f318d = viewFindViewById;
                iVar.f317c = paddingTop;
                WeakHashMap weakHashMap = v0.f2983a;
                k0.u(viewFindViewById, iVar);
                this.D0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = C().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.C0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.f799e0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new w1.a(dialog2, rect));
        }
        C();
        int i6 = this.f1470k0;
        if (i6 == 0) {
            I();
            throw null;
        }
        I();
        c cVar = this.f1472m0;
        l lVar = new l();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i6);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", cVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", cVar.f1441e);
        lVar.F(bundle);
        this.f1473n0 = lVar;
        if (this.f1477r0 == 1) {
            uVar = lVar;
            I();
            c cVar2 = this.f1472m0;
            o oVar = new o();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i6);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", cVar2);
            oVar.F(bundle2);
            uVar = oVar;
        }
        uVar = lVar;
        this.f1471l0 = uVar;
        this.A0.setText((this.f1477r0 == 1 && C().getResources().getConfiguration().orientation == 2) ? this.F0 : this.E0);
        I();
        g();
        throw null;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.q
    public final void y() {
        this.f1471l0.T.clear();
        super.y();
    }
}
