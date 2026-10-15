package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import d.a;
import h.b;
import h.c;
import h.d0;
import h.o;
import h.q;
import i.h1;
import i.n;
import i.y3;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends h1 implements d0, View.OnClickListener, n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public q f346i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f347j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f348k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public h.n f349l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f350m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c f351n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f352o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f353p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f354q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f355r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f356s;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f352o = m();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1656c, 0, 0);
        this.f354q = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f356s = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f355r = -1;
        setSaveEnabled(false);
    }

    @Override // i.n
    public final boolean a() {
        return (TextUtils.isEmpty(getText()) ^ true) && this.f346i.getIcon() == null;
    }

    @Override // i.n
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // h.d0
    public final void c(q qVar) {
        this.f346i = qVar;
        setIcon(qVar.getIcon());
        setTitle(qVar.getTitleCondensed());
        setId(qVar.f2453a);
        setVisibility(qVar.isVisible() ? 0 : 8);
        setEnabled(qVar.isEnabled());
        if (qVar.hasSubMenu() && this.f350m == null) {
            this.f350m = new b(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // h.d0
    public q getItemData() {
        return this.f346i;
    }

    public final boolean m() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        return i4 >= 480 || (i4 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void n() {
        boolean z4 = true;
        boolean z5 = !TextUtils.isEmpty(this.f347j);
        if (this.f348k != null && ((this.f346i.f2477y & 4) != 4 || (!this.f352o && !this.f353p))) {
            z4 = false;
        }
        boolean z6 = z5 & z4;
        setText(z6 ? this.f347j : null);
        CharSequence charSequence = this.f346i.f2469q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z6 ? null : this.f346i.f2457e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f346i.f2470r;
        if (TextUtils.isEmpty(charSequence2)) {
            y3.a(this, z6 ? null : this.f346i.f2457e);
        } else {
            y3.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h.n nVar = this.f349l;
        if (nVar != null) {
            nVar.e(this.f346i);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f352o = m();
        n();
    }

    @Override // i.h1, android.widget.TextView, android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        boolean z4 = !TextUtils.isEmpty(getText());
        if (z4 && (i6 = this.f355r) >= 0) {
            super.setPadding(i6, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i4, i5);
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int measuredWidth = getMeasuredWidth();
        int i7 = this.f354q;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i7) : i7;
        if (mode != 1073741824 && i7 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i5);
        }
        if (z4 || this.f348k == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f348k.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b bVar;
        if (this.f346i.hasSubMenu() && (bVar = this.f350m) != null && bVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z4) {
    }

    public void setChecked(boolean z4) {
    }

    public void setExpandedFormat(boolean z4) {
        if (this.f353p != z4) {
            this.f353p = z4;
            q qVar = this.f346i;
            if (qVar != null) {
                o oVar = qVar.f2466n;
                oVar.f2436k = true;
                oVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f348k = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i4 = this.f356s;
            if (intrinsicWidth > i4) {
                intrinsicHeight = (int) (intrinsicHeight * (i4 / intrinsicWidth));
                intrinsicWidth = i4;
            }
            if (intrinsicHeight > i4) {
                intrinsicWidth = (int) (intrinsicWidth * (i4 / intrinsicHeight));
            } else {
                i4 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i4);
        }
        setCompoundDrawables(drawable, null, null, null);
        n();
    }

    public void setItemInvoker(h.n nVar) {
        this.f349l = nVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i4, int i5, int i6, int i7) {
        this.f355r = i4;
        super.setPadding(i4, i5, i6, i7);
    }

    public void setPopupCallback(c cVar) {
        this.f351n = cVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f347j = charSequence;
        n();
    }
}
