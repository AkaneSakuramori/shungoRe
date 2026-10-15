package h;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.shungo.app.R;
import i0.v0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f2338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f2342f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2344h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b0 f2345i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public x f2346j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f2347k;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2343g = 8388611;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y f2348l = new y(this);

    public a0(int i4, int i5, Context context, View view, o oVar, boolean z4) {
        this.f2337a = context;
        this.f2338b = oVar;
        this.f2342f = view;
        this.f2339c = z4;
        this.f2340d = i4;
        this.f2341e = i5;
    }

    public final x a() {
        x h0Var;
        if (this.f2346j == null) {
            Context context = this.f2337a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            z.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                h0Var = new i(this.f2337a, this.f2342f, this.f2340d, this.f2341e, this.f2339c);
            } else {
                Context context2 = this.f2337a;
                o oVar = this.f2338b;
                h0Var = new h0(this.f2340d, this.f2341e, context2, this.f2342f, oVar, this.f2339c);
            }
            h0Var.l(this.f2338b);
            h0Var.r(this.f2348l);
            h0Var.n(this.f2342f);
            h0Var.e(this.f2345i);
            h0Var.o(this.f2344h);
            h0Var.p(this.f2343g);
            this.f2346j = h0Var;
        }
        return this.f2346j;
    }

    public final boolean b() {
        x xVar = this.f2346j;
        return xVar != null && xVar.a();
    }

    public void c() {
        this.f2346j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f2347k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i4, int i5, boolean z4, boolean z5) {
        x xVarA = a();
        xVarA.s(z5);
        if (z4) {
            int i6 = this.f2343g;
            View view = this.f2342f;
            WeakHashMap weakHashMap = v0.f2983a;
            if ((Gravity.getAbsoluteGravity(i6, i0.f0.d(view)) & 7) == 5) {
                i4 -= this.f2342f.getWidth();
            }
            xVarA.q(i4);
            xVarA.t(i5);
            int i7 = (int) ((this.f2337a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            xVarA.f2489b = new Rect(i4 - i7, i5 - i7, i4 + i7, i5 + i7);
        }
        xVarA.h();
    }
}
