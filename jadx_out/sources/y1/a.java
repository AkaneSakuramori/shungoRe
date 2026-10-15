package y1;

import android.content.Context;
import c3.h;
import com.shungo.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f5365f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f5370e;

    public a(Context context) {
        boolean zJ2 = h.j2(context, R.attr.elevationOverlayEnabled, false);
        int iN0 = h.N0(context, R.attr.elevationOverlayColor, 0);
        int iN1 = h.N0(context, R.attr.elevationOverlayAccentColor, 0);
        int iN2 = h.N0(context, R.attr.colorSurface, 0);
        float f5 = context.getResources().getDisplayMetrics().density;
        this.f5366a = zJ2;
        this.f5367b = iN0;
        this.f5368c = iN1;
        this.f5369d = iN2;
        this.f5370e = f5;
    }
}
