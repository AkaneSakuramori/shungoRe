package com.google.android.material.internal;

import a0.j;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import c0.b;
import h.d0;
import h.q;
import i.d2;
import i.y3;
import i0.e0;
import i0.v0;
import java.util.WeakHashMap;
import m0.p;
import p1.a;
import z1.d;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends d implements d0 {
    public static final int[] H = {R.attr.state_checked};
    public final CheckedTextView A;
    public FrameLayout B;
    public q C;
    public ColorStateList D;
    public boolean E;
    public Drawable F;
    public final a G;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1513w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f1514x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f1515y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f1516z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1516z = true;
        a aVar = new a(3, this);
        this.G = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.shungo.app.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.shungo.app.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.shungo.app.R.id.design_menu_item_text);
        this.A = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        v0.l(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.B == null) {
                this.B = (FrameLayout) ((ViewStub) findViewById(com.shungo.app.R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.B.removeAllViews();
            this.B.addView(view);
        }
    }

    @Override // h.d0
    public final void c(q qVar) {
        StateListDrawable stateListDrawable;
        this.C = qVar;
        int i4 = qVar.f2453a;
        if (i4 > 0) {
            setId(i4);
        }
        setVisibility(qVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.shungo.app.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(H, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = v0.f2983a;
            e0.q(this, stateListDrawable);
        }
        setCheckable(qVar.isCheckable());
        setChecked(qVar.isChecked());
        setEnabled(qVar.isEnabled());
        setTitle(qVar.f2457e);
        setIcon(qVar.getIcon());
        setActionView(qVar.getActionView());
        setContentDescription(qVar.f2469q);
        y3.a(this, qVar.f2470r);
        q qVar2 = this.C;
        CharSequence charSequence = qVar2.f2457e;
        CheckedTextView checkedTextView = this.A;
        if (charSequence == null && qVar2.getIcon() == null && this.C.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.B;
            if (frameLayout != null) {
                d2 d2Var = (d2) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) d2Var).width = -1;
                this.B.setLayoutParams(d2Var);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.B;
        if (frameLayout2 != null) {
            d2 d2Var2 = (d2) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) d2Var2).width = -2;
            this.B.setLayoutParams(d2Var2);
        }
    }

    @Override // h.d0
    public q getItemData() {
        return this.C;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i4 + 1);
        q qVar = this.C;
        if (qVar != null && qVar.isCheckable() && this.C.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, H);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z4) {
        refreshDrawableState();
        if (this.f1515y != z4) {
            this.f1515y = z4;
            this.G.h(this.A, 2048);
        }
    }

    public void setChecked(boolean z4) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.A;
        checkedTextView.setChecked(z4);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z4 && this.f1516z) ? 1 : 0);
    }

    public void setHorizontalPadding(int i4) {
        setPadding(i4, getPaddingTop(), i4, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.E) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                b.h(drawable, this.D);
            }
            int i4 = this.f1513w;
            drawable.setBounds(0, 0, i4, i4);
        } else if (this.f1514x) {
            if (this.F == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = a0.q.f38a;
                Drawable drawableA = j.a(resources, com.shungo.app.R.drawable.navigation_empty_icon, theme);
                this.F = drawableA;
                if (drawableA != null) {
                    int i5 = this.f1513w;
                    drawableA.setBounds(0, 0, i5, i5);
                }
            }
            drawable = this.F;
        }
        p.e(this.A, drawable, null, null, null);
    }

    public void setIconPadding(int i4) {
        this.A.setCompoundDrawablePadding(i4);
    }

    public void setIconSize(int i4) {
        this.f1513w = i4;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.D = colorStateList;
        this.E = colorStateList != null;
        q qVar = this.C;
        if (qVar != null) {
            setIcon(qVar.getIcon());
        }
    }

    public void setMaxLines(int i4) {
        this.A.setMaxLines(i4);
    }

    public void setNeedsEmptyIcon(boolean z4) {
        this.f1514x = z4;
    }

    public void setTextAppearance(int i4) {
        this.A.setTextAppearance(i4);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.A.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.A.setText(charSequence);
    }
}
