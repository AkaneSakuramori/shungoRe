package b2;

import android.R;
import android.content.res.ColorStateList;
import c3.h;
import i.i0;
import m0.b;

/* JADX INFO: loaded from: classes.dex */
public final class a extends i0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[][] f1102h = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f1103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1104g;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f1103f == null) {
            int iO0 = h.O0(this, com.shungo.app.R.attr.colorControlActivated);
            int iO1 = h.O0(this, com.shungo.app.R.attr.colorOnSurface);
            int iO2 = h.O0(this, com.shungo.app.R.attr.colorSurface);
            this.f1103f = new ColorStateList(f1102h, new int[]{h.t1(iO2, iO0, 1.0f), h.t1(iO2, iO1, 0.54f), h.t1(iO2, iO1, 0.38f), h.t1(iO2, iO1, 0.38f)});
        }
        return this.f1103f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1104g && b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z4) {
        this.f1104g = z4;
        if (z4) {
            b.c(this, getMaterialThemeColorsTintList());
        } else {
            b.c(this, null);
        }
    }
}
