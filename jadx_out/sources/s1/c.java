package s1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.shungo.app.R;
import f2.g;
import f2.h;
import f2.l;
import f2.x;
import i0.f0;
import i0.v0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialButton f4200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f4201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4205f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4207h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f4208i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f4209j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f4210k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f4211l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h f4212m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f4216q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public RippleDrawable f4218s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4219t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4213n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4214o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f4215p = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f4217r = true;

    public c(MaterialButton materialButton, l lVar) {
        this.f4200a = materialButton;
        this.f4201b = lVar;
    }

    public final x a() {
        RippleDrawable rippleDrawable = this.f4218s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f4218s.getNumberOfLayers() > 2 ? (x) this.f4218s.getDrawable(2) : (x) this.f4218s.getDrawable(1);
    }

    public final h b(boolean z4) {
        RippleDrawable rippleDrawable = this.f4218s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (h) ((LayerDrawable) ((InsetDrawable) this.f4218s.getDrawable(0)).getDrawable()).getDrawable(!z4 ? 1 : 0);
    }

    public final void c(l lVar) {
        this.f4201b = lVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(lVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(lVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(lVar);
        }
    }

    public final void d(int i4, int i5) {
        WeakHashMap weakHashMap = v0.f2983a;
        MaterialButton materialButton = this.f4200a;
        int iF = f0.f(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int iE = f0.e(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        int i6 = this.f4204e;
        int i7 = this.f4205f;
        this.f4205f = i5;
        this.f4204e = i4;
        if (!this.f4214o) {
            e();
        }
        f0.k(materialButton, iF, (paddingTop + i4) - i6, iE, (paddingBottom + i5) - i7);
    }

    public final void e() {
        h hVar = new h(this.f4201b);
        MaterialButton materialButton = this.f4200a;
        hVar.i(materialButton.getContext());
        c0.b.h(hVar, this.f4209j);
        PorterDuff.Mode mode = this.f4208i;
        if (mode != null) {
            c0.b.i(hVar, mode);
        }
        float f5 = this.f4207h;
        ColorStateList colorStateList = this.f4210k;
        hVar.f2057b.f2045k = f5;
        hVar.invalidateSelf();
        g gVar = hVar.f2057b;
        if (gVar.f2038d != colorStateList) {
            gVar.f2038d = colorStateList;
            hVar.onStateChange(hVar.getState());
        }
        h hVar2 = new h(this.f4201b);
        hVar2.setTint(0);
        float f6 = this.f4207h;
        int iO0 = this.f4213n ? c3.h.O0(materialButton, R.attr.colorSurface) : 0;
        hVar2.f2057b.f2045k = f6;
        hVar2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iO0);
        g gVar2 = hVar2.f2057b;
        if (gVar2.f2038d != colorStateListValueOf) {
            gVar2.f2038d = colorStateListValueOf;
            hVar2.onStateChange(hVar2.getState());
        }
        h hVar3 = new h(this.f4201b);
        this.f4212m = hVar3;
        c0.b.g(hVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(d2.a.a(this.f4211l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{hVar2, hVar}), this.f4202c, this.f4204e, this.f4203d, this.f4205f), this.f4212m);
        this.f4218s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        h hVarB = b(false);
        if (hVarB != null) {
            hVarB.j(this.f4219t);
            hVarB.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        h hVarB = b(false);
        h hVarB2 = b(true);
        if (hVarB != null) {
            float f5 = this.f4207h;
            ColorStateList colorStateList = this.f4210k;
            hVarB.f2057b.f2045k = f5;
            hVarB.invalidateSelf();
            g gVar = hVarB.f2057b;
            if (gVar.f2038d != colorStateList) {
                gVar.f2038d = colorStateList;
                hVarB.onStateChange(hVarB.getState());
            }
            if (hVarB2 != null) {
                float f6 = this.f4207h;
                int iO0 = this.f4213n ? c3.h.O0(this.f4200a, R.attr.colorSurface) : 0;
                hVarB2.f2057b.f2045k = f6;
                hVarB2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iO0);
                g gVar2 = hVarB2.f2057b;
                if (gVar2.f2038d != colorStateListValueOf) {
                    gVar2.f2038d = colorStateListValueOf;
                    hVarB2.onStateChange(hVarB2.getState());
                }
            }
        }
    }
}
