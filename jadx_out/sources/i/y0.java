package i;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class y0 extends c3.h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2853j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2854k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ WeakReference f2855l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e1 f2856m;

    public y0(e1 e1Var, int i4, int i5, WeakReference weakReference) {
        this.f2856m = e1Var;
        this.f2853j = i4;
        this.f2854k = i5;
        this.f2855l = weakReference;
    }

    @Override // c3.h
    public final void G1(int i4) {
    }

    @Override // c3.h
    public final void H1(Typeface typeface) {
        int i4;
        if (Build.VERSION.SDK_INT >= 28 && (i4 = this.f2853j) != -1) {
            typeface = d1.a(typeface, i4, (this.f2854k & 2) != 0);
        }
        e1 e1Var = this.f2856m;
        if (e1Var.f2571m) {
            e1Var.f2570l = typeface;
            TextView textView = (TextView) this.f2855l.get();
            if (textView != null) {
                WeakHashMap weakHashMap = i0.v0.f2983a;
                if (i0.h0.b(textView)) {
                    textView.post(new z0(textView, typeface, e1Var.f2568j));
                } else {
                    textView.setTypeface(typeface, e1Var.f2568j);
                }
            }
        }
    }
}
