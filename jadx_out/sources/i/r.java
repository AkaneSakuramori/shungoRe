package i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f2757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f2758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f2759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f2760g;

    public r(View view) {
        this.f2754a = 0;
        this.f2755b = -1;
        this.f2756c = view;
        this.f2757d = x.a();
    }

    public static r b(Context context, int i4) {
        c3.h.U("Cannot create a CalendarItemStyle with a styleResId of 0", i4 != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i4, n1.a.f3551m);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListP0 = c3.h.P0(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListP1 = c3.h.P0(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListP2 = c3.h.P0(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        f2.l lVarA = f2.l.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new f2.a(0)).a();
        typedArrayObtainStyledAttributes.recycle();
        return new r(colorStateListP0, colorStateListP1, colorStateListP2, dimensionPixelSize, lVarA, rect);
    }

    public final void a() {
        View view = (View) this.f2756c;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((o3) this.f2758e) != null) {
                if (((o3) this.f2760g) == null) {
                    this.f2760g = new o3(0);
                }
                o3 o3Var = (o3) this.f2760g;
                o3Var.f2739c = null;
                o3Var.f2738b = false;
                o3Var.f2740d = null;
                o3Var.f2737a = false;
                WeakHashMap weakHashMap = i0.v0.f2983a;
                ColorStateList colorStateListG = i0.k0.g(view);
                if (colorStateListG != null) {
                    o3Var.f2738b = true;
                    o3Var.f2739c = colorStateListG;
                }
                PorterDuff.Mode modeH = i0.k0.h(view);
                if (modeH != null) {
                    o3Var.f2737a = true;
                    o3Var.f2740d = modeH;
                }
                if (o3Var.f2738b || o3Var.f2737a) {
                    x.d(background, o3Var, view.getDrawableState());
                    return;
                }
            }
            o3 o3Var2 = (o3) this.f2759f;
            if (o3Var2 != null) {
                x.d(background, o3Var2, view.getDrawableState());
                return;
            }
            o3 o3Var3 = (o3) this.f2758e;
            if (o3Var3 != null) {
                x.d(background, o3Var3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList c() {
        Object obj = this.f2759f;
        if (((o3) obj) != null) {
            return (ColorStateList) ((o3) obj).f2739c;
        }
        return null;
    }

    public final PorterDuff.Mode d() {
        Object obj = this.f2759f;
        if (((o3) obj) != null) {
            return (PorterDuff.Mode) ((o3) obj).f2740d;
        }
        return null;
    }

    public final void e(AttributeSet attributeSet, int i4) {
        ColorStateList colorStateListH;
        Object obj = this.f2756c;
        View view = (View) obj;
        Context context = view.getContext();
        int[] iArr = d.a.f1679z;
        e.c cVarU = e.c.u(context, attributeSet, iArr, i4);
        i0.v0.k(view, view.getContext(), iArr, attributeSet, (TypedArray) cVarU.f1780d, i4);
        try {
            if (cVarU.r(0)) {
                this.f2755b = cVarU.n(0, -1);
                x xVar = (x) this.f2757d;
                Context context2 = ((View) obj).getContext();
                int i5 = this.f2755b;
                synchronized (xVar) {
                    colorStateListH = xVar.f2835a.h(context2, i5);
                }
                if (colorStateListH != null) {
                    h(colorStateListH);
                }
            }
            if (cVarU.r(1)) {
                i0.k0.q((View) obj, cVarU.c(1));
            }
            if (cVarU.r(2)) {
                i0.k0.r((View) obj, t1.b(cVarU.k(2, -1), null));
            }
            cVarU.v();
        } catch (Throwable th) {
            cVarU.v();
            throw th;
        }
    }

    public final void f() {
        this.f2755b = -1;
        h(null);
        a();
    }

    public final void g(int i4) {
        ColorStateList colorStateListH;
        this.f2755b = i4;
        x xVar = (x) this.f2757d;
        if (xVar != null) {
            Context context = ((View) this.f2756c).getContext();
            synchronized (xVar) {
                colorStateListH = xVar.f2835a.h(context, i4);
            }
        } else {
            colorStateListH = null;
        }
        h(colorStateListH);
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((o3) this.f2758e) == null) {
                this.f2758e = new o3(0);
            }
            Object obj = this.f2758e;
            ((o3) obj).f2739c = colorStateList;
            ((o3) obj).f2738b = true;
        } else {
            this.f2758e = null;
        }
        a();
    }

    public final void i(ColorStateList colorStateList) {
        if (((o3) this.f2759f) == null) {
            this.f2759f = new o3(0);
        }
        o3 o3Var = (o3) this.f2759f;
        o3Var.f2739c = colorStateList;
        o3Var.f2738b = true;
        a();
    }

    public final void j(PorterDuff.Mode mode) {
        if (((o3) this.f2759f) == null) {
            this.f2759f = new o3(0);
        }
        o3 o3Var = (o3) this.f2759f;
        o3Var.f2740d = mode;
        o3Var.f2737a = true;
        a();
    }

    public final String toString() {
        switch (this.f2754a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f2756c) + ", mProviderPackage: " + ((String) this.f2757d) + ", mQuery: " + ((String) this.f2758e) + ", mCertificates:");
                for (int i4 = 0; i4 < ((List) this.f2759f).size(); i4++) {
                    sb.append(" [");
                    List list = (List) ((List) this.f2759f).get(i4);
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list.get(i5), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                }
                sb.append("}");
                sb.append("mCertificatesArray: " + this.f2755b);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public r(String str, String str2, String str3, List list) {
        this.f2754a = 1;
        str.getClass();
        this.f2756c = str;
        str2.getClass();
        this.f2757d = str2;
        this.f2758e = str3;
        list.getClass();
        this.f2759f = list;
        this.f2755b = 0;
        this.f2760g = str + "-" + str2 + "-" + str3;
    }

    public r(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i4, f2.l lVar, Rect rect) {
        this.f2754a = 2;
        c3.h.W(rect.left);
        c3.h.W(rect.top);
        c3.h.W(rect.right);
        c3.h.W(rect.bottom);
        this.f2756c = rect;
        this.f2757d = colorStateList2;
        this.f2758e = colorStateList;
        this.f2759f = colorStateList3;
        this.f2755b = i4;
        this.f2760g = lVar;
    }
}
