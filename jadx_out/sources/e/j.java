package e;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.shungo.app.R;
import i0.v0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class j extends androidx.activity.p implements DialogInterface, n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e0 f1880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f0 f1881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f1882g;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v1, types: [e.f0] */
    public j(Context context, int i4) {
        int iP = p(context, i4);
        super(context, l(context, iP));
        this.f1881f = new i0.l() { // from class: e.f0
            @Override // i0.l
            public final boolean f(KeyEvent keyEvent) {
                return this.f1841b.w(keyEvent);
            }
        };
        r rVarK = k();
        ((e0) rVarK).U = l(context, iP);
        rVarK.f();
        this.f1882g = new h(getContext(), this, getWindow());
    }

    public static int l(Context context, int i4) {
        if (i4 != 0) {
            return i4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public static int p(Context context, int i4) {
        if (((i4 >>> 24) & 255) >= 1) {
            return i4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // e.n
    public final /* bridge */ /* synthetic */ void b() {
    }

    @Override // e.n
    public final /* bridge */ /* synthetic */ void c() {
    }

    @Override // e.n
    public final /* bridge */ /* synthetic */ void d() {
    }

    @Override // android.app.Dialog
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e0 e0Var = (e0) k();
        e0Var.w();
        ((ViewGroup) e0Var.B.findViewById(android.R.id.content)).addView(view, layoutParams);
        e0Var.f1827n.a(e0Var.f1826m.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void dismiss() {
        super.dismiss();
        k().g();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return c3.h.H0(this.f1881f, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final View findViewById(int i4) {
        e0 e0Var = (e0) k();
        e0Var.w();
        return e0Var.f1826m.findViewById(i4);
    }

    public final r k() {
        if (this.f1880e == null) {
            l0 l0Var = r.f1907b;
            this.f1880e = new e0(getContext(), getWindow(), this, this);
        }
        return this.f1880e;
    }

    @Override // android.app.Dialog
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void invalidateOptionsMenu() {
        k().b();
    }

    public final void n(Bundle bundle) {
        k().a();
        super.onCreate(bundle);
        k().f();
    }

    @Override // androidx.activity.p, android.app.Dialog
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void onStop() {
        super.onStop();
        e0 e0Var = (e0) k();
        e0Var.A();
        s0 s0Var = e0Var.f1829p;
        if (s0Var != null) {
            s0Var.C = false;
            g.n nVar = s0Var.B;
            if (nVar != null) {
                nVar.a();
            }
        }
    }

    @Override // androidx.activity.p, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i4;
        ListAdapter listAdapter;
        View viewFindViewById;
        n(bundle);
        h hVar = this.f1882g;
        hVar.f1847b.setContentView(hVar.f1863r);
        Window window = hVar.f1848c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupB = h.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = h.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = h.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        hVar.f1854i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        hVar.f1854i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(android.R.id.message);
        hVar.f1859n = textView;
        if (textView != null) {
            textView.setVisibility(8);
            hVar.f1854i.removeView(hVar.f1859n);
            if (hVar.f1850e != null) {
                ViewGroup viewGroup2 = (ViewGroup) hVar.f1854i.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(hVar.f1854i);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(hVar.f1850e, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupB2.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupB3.findViewById(android.R.id.button1);
        hVar.f1851f = button;
        b bVar = hVar.f1869x;
        button.setOnClickListener(bVar);
        if (TextUtils.isEmpty(null)) {
            hVar.f1851f.setVisibility(8);
            i4 = 0;
        } else {
            hVar.f1851f.setText((CharSequence) null);
            hVar.f1851f.setVisibility(0);
            i4 = 1;
        }
        Button button2 = (Button) viewGroupB3.findViewById(android.R.id.button2);
        hVar.f1852g = button2;
        button2.setOnClickListener(bVar);
        if (TextUtils.isEmpty(null)) {
            hVar.f1852g.setVisibility(8);
        } else {
            hVar.f1852g.setText((CharSequence) null);
            hVar.f1852g.setVisibility(0);
            i4 |= 2;
        }
        Button button3 = (Button) viewGroupB3.findViewById(android.R.id.button3);
        hVar.f1853h = button3;
        button3.setOnClickListener(bVar);
        if (TextUtils.isEmpty(null)) {
            hVar.f1853h.setVisibility(8);
        } else {
            hVar.f1853h.setText((CharSequence) null);
            hVar.f1853h.setVisibility(0);
            i4 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        hVar.f1846a.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i4 == 1) {
                Button button4 = hVar.f1851f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i4 == 2) {
                Button button5 = hVar.f1852g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i4 == 4) {
                Button button6 = hVar.f1853h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i4 == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (hVar.f1860o != null) {
            viewGroupB.addView(hVar.f1860o, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            hVar.f1857l = (ImageView) window.findViewById(android.R.id.icon);
            if ((!TextUtils.isEmpty(hVar.f1849d)) && hVar.f1867v) {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                hVar.f1858m = textView2;
                textView2.setText(hVar.f1849d);
                int i5 = hVar.f1855j;
                if (i5 != 0) {
                    hVar.f1857l.setImageResource(i5);
                } else {
                    Drawable drawable = hVar.f1856k;
                    if (drawable != null) {
                        hVar.f1857l.setImageDrawable(drawable);
                    } else {
                        hVar.f1858m.setPadding(hVar.f1857l.getPaddingLeft(), hVar.f1857l.getPaddingTop(), hVar.f1857l.getPaddingRight(), hVar.f1857l.getPaddingBottom());
                        hVar.f1857l.setVisibility(8);
                    }
                }
            } else {
                window.findViewById(R.id.title_template).setVisibility(8);
                hVar.f1857l.setVisibility(8);
                viewGroupB.setVisibility(8);
            }
        }
        boolean z4 = viewGroup.getVisibility() != 8;
        int i6 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z5 = viewGroupB3.getVisibility() != 8;
        if (!z5 && (viewFindViewById = viewGroupB2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i6 != 0) {
            NestedScrollView nestedScrollView2 = hVar.f1854i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = hVar.f1850e != null ? viewGroupB.findViewById(R.id.titleDividerNoCustom) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupB2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = hVar.f1850e;
        if (alertController$RecycleListView instanceof AlertController$RecycleListView) {
            alertController$RecycleListView.getClass();
            if (!z5 || i6 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i6 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f344b, alertController$RecycleListView.getPaddingRight(), z5 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f345c);
            }
        }
        if (!z4) {
            View view = hVar.f1850e;
            if (view == null) {
                view = hVar.f1854i;
            }
            if (view != null) {
                int i7 = i6 | (z5 ? 2 : 0);
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = v0.f2983a;
                i0.l0.d(view, i7, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = hVar.f1850e;
        if (alertController$RecycleListView2 == null || (listAdapter = hVar.f1861p) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i8 = hVar.f1862q;
        if (i8 > -1) {
            alertController$RecycleListView2.setItemChecked(i8, true);
            alertController$RecycleListView2.setSelection(i8);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1882g.f1854i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i4, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i4, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1882g.f1854i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i4, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void setContentView(int i4) {
        k().j(i4);
    }

    @Override // android.app.Dialog
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void setContentView(View view) {
        k().k(view);
    }

    @Override // android.app.Dialog
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k().l(view, layoutParams);
    }

    @Override // android.app.Dialog
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void setTitle(int i4) {
        super.setTitle(i4);
        k().m(getContext().getString(i4));
    }

    public final void v(CharSequence charSequence) {
        super.setTitle(charSequence);
        k().m(charSequence);
    }

    public final boolean w(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        v(charSequence);
        h hVar = this.f1882g;
        hVar.f1849d = charSequence;
        TextView textView = hVar.f1858m;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
