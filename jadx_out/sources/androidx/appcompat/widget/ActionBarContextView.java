package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.shungo.app.R;
import h.o;
import i.b4;
import i.h;
import i.m;
import i0.d1;
import i0.e0;
import i0.v0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i.a f385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionMenuView f387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m f388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d1 f390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f391h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f392i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f393j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f394k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f395l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f396m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f397n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinearLayout f398o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f399p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f400q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f401r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f402s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f403t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f404u;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        this.f385b = new i.a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f386c = context;
        } else {
            this.f386c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        e.c cVar = new e.c(context, context.obtainStyledAttributes(attributeSet, d.a.f1657d, R.attr.actionModeStyle, 0));
        Drawable drawableH = cVar.h(0);
        WeakHashMap weakHashMap = v0.f2983a;
        e0.q(this, drawableH);
        this.f401r = cVar.n(5, 0);
        this.f402s = cVar.n(4, 0);
        this.f389f = ((TypedArray) cVar.f1780d).getLayoutDimension(3, 0);
        this.f404u = cVar.n(2, R.layout.abc_action_mode_close_item_material);
        cVar.v();
    }

    public static int f(View view, int i4, int i5) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), i5);
        return Math.max(0, i4 - view.getMeasuredWidth());
    }

    public static int j(View view, int i4, int i5, int i6, boolean z4) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i7 = ((i6 - measuredHeight) / 2) + i5;
        if (z4) {
            view.layout(i4 - measuredWidth, i7, i4, measuredHeight + i7);
        } else {
            view.layout(i4, i7, i4 + measuredWidth, measuredHeight + i7);
        }
        return z4 ? -measuredWidth : measuredWidth;
    }

    public final void c(g.c cVar) {
        View view = this.f395l;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f404u, (ViewGroup) this, false);
            this.f395l = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f395l);
        }
        View viewFindViewById = this.f395l.findViewById(R.id.action_mode_close_button);
        this.f396m = viewFindViewById;
        viewFindViewById.setOnClickListener(new i.c(this, cVar));
        o oVarC = cVar.c();
        m mVar = this.f388e;
        if (mVar != null) {
            mVar.f();
            h hVar = mVar.f2675u;
            if (hVar != null && hVar.b()) {
                hVar.f2346j.dismiss();
            }
        }
        m mVar2 = new m(getContext());
        this.f388e = mVar2;
        mVar2.f2667m = true;
        mVar2.f2668n = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        oVarC.b(this.f388e, this.f386c);
        m mVar3 = this.f388e;
        h.e0 e0Var = mVar3.f2663i;
        if (e0Var == null) {
            h.e0 e0Var2 = (h.e0) mVar3.f2659e.inflate(mVar3.f2661g, (ViewGroup) this, false);
            mVar3.f2663i = e0Var2;
            e0Var2.b(mVar3.f2658d);
            mVar3.c();
        }
        h.e0 e0Var3 = mVar3.f2663i;
        if (e0Var != e0Var3) {
            ((ActionMenuView) e0Var3).setPresenter(mVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) e0Var3;
        this.f387d = actionMenuView;
        WeakHashMap weakHashMap = v0.f2983a;
        e0.q(actionMenuView, null);
        addView(this.f387d, layoutParams);
    }

    public final void d() {
        if (this.f398o == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f398o = linearLayout;
            this.f399p = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f400q = (TextView) this.f398o.findViewById(R.id.action_bar_subtitle);
            int i4 = this.f401r;
            if (i4 != 0) {
                this.f399p.setTextAppearance(getContext(), i4);
            }
            int i5 = this.f402s;
            if (i5 != 0) {
                this.f400q.setTextAppearance(getContext(), i5);
            }
        }
        this.f399p.setText(this.f393j);
        this.f400q.setText(this.f394k);
        boolean z4 = !TextUtils.isEmpty(this.f393j);
        boolean z5 = !TextUtils.isEmpty(this.f394k);
        this.f400q.setVisibility(z5 ? 0 : 8);
        this.f398o.setVisibility((z4 || z5) ? 0 : 8);
        if (this.f398o.getParent() == null) {
            addView(this.f398o);
        }
    }

    public final void e() {
        removeAllViews();
        this.f397n = null;
        this.f387d = null;
        this.f388e = null;
        View view = this.f396m;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, d.a.f1654a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        m mVar = this.f388e;
        if (mVar != null) {
            mVar.f2671q = new g.a(mVar.f2657c, 0).b();
            o oVar = mVar.f2658d;
            if (oVar != null) {
                oVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f390g != null ? this.f385b.f2516c : getVisibility();
    }

    public int getContentHeight() {
        return this.f389f;
    }

    public CharSequence getSubtitle() {
        return this.f394k;
    }

    public CharSequence getTitle() {
        return this.f393j;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f392i = false;
        }
        if (!this.f392i) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f392i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f392i = false;
        }
        return true;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f391h = false;
        }
        if (!this.f391h) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f391h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f391h = false;
        }
        return true;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i4) {
        if (i4 != getVisibility()) {
            d1 d1Var = this.f390g;
            if (d1Var != null) {
                d1Var.b();
            }
            super.setVisibility(i4);
        }
    }

    public final d1 l(int i4, long j4) {
        d1 d1Var = this.f390g;
        if (d1Var != null) {
            d1Var.b();
        }
        i.a aVar = this.f385b;
        if (i4 != 0) {
            d1 d1VarA = v0.a(this);
            d1VarA.a(0.0f);
            d1VarA.c(j4);
            aVar.f2517d.f390g = d1VarA;
            aVar.f2516c = i4;
            d1VarA.d(aVar);
            return d1VarA;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        d1 d1VarA2 = v0.a(this);
        d1VarA2.a(1.0f);
        d1VarA2.c(j4);
        aVar.f2517d.f390g = d1VarA2;
        aVar.f2516c = i4;
        d1VarA2.d(aVar);
        return d1VarA2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m mVar = this.f388e;
        if (mVar != null) {
            mVar.f();
            h hVar = this.f388e.f2675u;
            if (hVar == null || !hVar.b()) {
                return;
            }
            hVar.f2346j.dismiss();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        boolean zA = b4.a(this);
        int paddingRight = zA ? (i6 - i4) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i7 - i5) - getPaddingTop()) - getPaddingBottom();
        View view = this.f395l;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f395l.getLayoutParams();
            int i8 = zA ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i9 = zA ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i10 = zA ? paddingRight - i8 : paddingRight + i8;
            int iJ = j(this.f395l, i10, paddingTop, paddingTop2, zA) + i10;
            paddingRight = zA ? iJ - i9 : iJ + i9;
        }
        LinearLayout linearLayout = this.f398o;
        if (linearLayout != null && this.f397n == null && linearLayout.getVisibility() != 8) {
            paddingRight += j(this.f398o, paddingRight, paddingTop, paddingTop2, zA);
        }
        View view2 = this.f397n;
        if (view2 != null) {
            j(view2, paddingRight, paddingTop, paddingTop2, zA);
        }
        int paddingLeft = zA ? getPaddingLeft() : (i6 - i4) - getPaddingRight();
        ActionMenuView actionMenuView = this.f387d;
        if (actionMenuView != null) {
            j(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zA);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        if (View.MeasureSpec.getMode(i4) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i5) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i4);
        int size2 = this.f389f;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i5);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f395l;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f395l.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f387d;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f387d, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f398o;
        if (linearLayout != null && this.f397n == null) {
            if (this.f403t) {
                this.f398o.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f398o.getMeasuredWidth();
                boolean z4 = measuredWidth <= paddingLeft;
                if (z4) {
                    paddingLeft -= measuredWidth;
                }
                this.f398o.setVisibility(z4 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f397n;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i6 = layoutParams.width;
            int i7 = i6 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i6 >= 0) {
                paddingLeft = Math.min(i6, paddingLeft);
            }
            int i8 = layoutParams.height;
            int i9 = i8 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i8 >= 0) {
                iMin = Math.min(i8, iMin);
            }
            this.f397n.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(iMin, i9));
        }
        if (this.f389f > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i10) {
                i10 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i10);
    }

    public void setContentHeight(int i4) {
        this.f389f = i4;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f397n;
        if (view2 != null) {
            removeView(view2);
        }
        this.f397n = view;
        if (view != null && (linearLayout = this.f398o) != null) {
            removeView(linearLayout);
            this.f398o = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f394k = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f393j = charSequence;
        d();
        v0.m(this, charSequence);
    }

    public void setTitleOptional(boolean z4) {
        if (z4 != this.f403t) {
            requestLayout();
        }
        this.f403t = z4;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
