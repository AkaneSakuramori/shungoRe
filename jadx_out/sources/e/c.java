package e;

import android.content.ClipDescription;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import i.y0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class c implements m0.k, l0.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static c f1777f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f1781e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(androidx.lifecycle.q0 q0Var, a4.x xVar, int i4) {
        this(q0Var, xVar);
        this.f1778b = 7;
        c3.h.b0(q0Var, "store");
        c3.h.b0(xVar, "factory");
    }

    public static c u(Context context, AttributeSet attributeSet, int[] iArr, int i4) {
        return new c(context, context.obtainStyledAttributes(attributeSet, iArr, i4, 0));
    }

    public final androidx.lifecycle.n0 a(Class cls, String str) {
        androidx.lifecycle.n0 n0VarA;
        c3.h.b0(str, "key");
        androidx.lifecycle.q0 q0Var = (androidx.lifecycle.q0) this.f1779c;
        q0Var.getClass();
        androidx.lifecycle.n0 n0Var = (androidx.lifecycle.n0) q0Var.f978a.get(str);
        if (cls.isInstance(n0Var)) {
            c3.h.Y(n0Var, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return n0Var;
        }
        u0.d dVar = new u0.d((u0.b) this.f1781e);
        dVar.f4670a.put(androidx.lifecycle.o0.f977b, str);
        try {
            n0VarA = ((androidx.lifecycle.p0) this.f1780d).b(cls, dVar);
        } catch (AbstractMethodError unused) {
            n0VarA = ((androidx.lifecycle.p0) this.f1780d).a(cls);
        }
        androidx.lifecycle.q0 q0Var2 = (androidx.lifecycle.q0) this.f1779c;
        q0Var2.getClass();
        c3.h.b0(n0VarA, "viewModel");
        androidx.lifecycle.n0 n0Var2 = (androidx.lifecycle.n0) q0Var2.f978a.put(str, n0VarA);
        if (n0Var2 != null) {
            n0Var2.a();
        }
        return n0VarA;
    }

    public final boolean b(int i4, boolean z4) {
        return ((TypedArray) this.f1780d).getBoolean(i4, z4);
    }

    public final ColorStateList c(int i4) {
        int resourceId;
        ColorStateList colorStateListB;
        return (!((TypedArray) this.f1780d).hasValue(i4) || (resourceId = ((TypedArray) this.f1780d).getResourceId(i4, 0)) == 0 || (colorStateListB = z.d.b((Context) this.f1779c, resourceId)) == null) ? ((TypedArray) this.f1780d).getColorStateList(i4) : colorStateListB;
    }

    public final int d(int i4, int i5) {
        return ((TypedArray) this.f1780d).getDimensionPixelOffset(i4, i5);
    }

    public final int e(int i4, int i5) {
        return ((TypedArray) this.f1780d).getDimensionPixelSize(i4, i5);
    }

    @Override // l0.d
    public final ClipDescription f() {
        return (ClipDescription) this.f1780d;
    }

    @Override // l0.d
    public final void g() {
    }

    public final Drawable h(int i4) {
        int resourceId;
        return (!((TypedArray) this.f1780d).hasValue(i4) || (resourceId = ((TypedArray) this.f1780d).getResourceId(i4, 0)) == 0) ? ((TypedArray) this.f1780d).getDrawable(i4) : r3.q.g((Context) this.f1779c, resourceId);
    }

    public final Drawable i(int i4) {
        int resourceId;
        Drawable drawableF;
        if (!((TypedArray) this.f1780d).hasValue(i4) || (resourceId = ((TypedArray) this.f1780d).getResourceId(i4, 0)) == 0) {
            return null;
        }
        i.x xVarA = i.x.a();
        Context context = (Context) this.f1779c;
        synchronized (xVarA) {
            drawableF = xVarA.f2835a.f(context, resourceId, true);
        }
        return drawableF;
    }

    public final Typeface j(int i4, int i5, y0 y0Var) {
        int resourceId = ((TypedArray) this.f1780d).getResourceId(i4, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f1781e) == null) {
            this.f1781e = new TypedValue();
        }
        Context context = (Context) this.f1779c;
        TypedValue typedValue = (TypedValue) this.f1781e;
        ThreadLocal threadLocal = a0.q.f38a;
        if (context.isRestricted()) {
            return null;
        }
        return a0.q.b(context, resourceId, typedValue, i5, y0Var, true, false);
    }

    public final int k(int i4, int i5) {
        return ((TypedArray) this.f1780d).getInt(i4, i5);
    }

    @Override // l0.d
    public final Uri l() {
        return (Uri) this.f1781e;
    }

    public final Location m(String str) {
        try {
            if (((LocationManager) this.f1780d).isProviderEnabled(str)) {
                return ((LocationManager) this.f1780d).getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e5) {
            Log.d("TwilightManager", "Failed to get last known location", e5);
            return null;
        }
    }

    public final int n(int i4, int i5) {
        return ((TypedArray) this.f1780d).getResourceId(i4, i5);
    }

    public final String o(int i4) {
        return ((TypedArray) this.f1780d).getString(i4);
    }

    @Override // l0.d
    public final Object p() {
        return null;
    }

    public final CharSequence q(int i4) {
        return ((TypedArray) this.f1780d).getText(i4);
    }

    public final boolean r(int i4) {
        return ((TypedArray) this.f1780d).hasValue(i4);
    }

    @Override // l0.d
    public final Uri s() {
        return (Uri) this.f1779c;
    }

    public final boolean t(int i4, r.d dVar, s.n nVar) {
        s.b bVar = (s.b) this.f1780d;
        int[] iArr = dVar.f3969p0;
        bVar.f4134a = iArr[0];
        bVar.f4135b = iArr[1];
        bVar.f4136c = dVar.r();
        ((s.b) this.f1780d).f4137d = dVar.l();
        s.b bVar2 = (s.b) this.f1780d;
        bVar2.f4142i = false;
        bVar2.f4143j = i4;
        boolean z4 = bVar2.f4134a == 3;
        boolean z5 = bVar2.f4135b == 3;
        boolean z6 = z4 && dVar.W > 0.0f;
        boolean z7 = z5 && dVar.W > 0.0f;
        int[] iArr2 = dVar.f3973t;
        if (z6 && iArr2[0] == 4) {
            bVar2.f4134a = 1;
        }
        if (z7 && iArr2[1] == 4) {
            bVar2.f4135b = 1;
        }
        nVar.b(dVar, bVar2);
        dVar.P(((s.b) this.f1780d).f4138e);
        dVar.M(((s.b) this.f1780d).f4139f);
        s.b bVar3 = (s.b) this.f1780d;
        dVar.E = bVar3.f4141h;
        dVar.J(bVar3.f4140g);
        s.b bVar4 = (s.b) this.f1780d;
        bVar4.f4143j = 0;
        return bVar4.f4142i;
    }

    public final String toString() {
        switch (this.f1778b) {
            case 3:
                String str = "[ ";
                if (((p.i) this.f1779c) != null) {
                    for (int i4 = 0; i4 < 9; i4++) {
                        str = str + ((p.i) this.f1779c).f3707i[i4] + " ";
                    }
                }
                return str + "] " + ((p.i) this.f1779c);
            default:
                return super.toString();
        }
    }

    public final void v() {
        ((TypedArray) this.f1780d).recycle();
    }

    public final void w(r.e eVar, int i4, int i5, int i6) {
        int i7 = eVar.f3941b0;
        int i8 = eVar.f3943c0;
        eVar.f3941b0 = 0;
        eVar.f3943c0 = 0;
        eVar.P(i5);
        eVar.M(i6);
        if (i7 < 0) {
            eVar.f3941b0 = 0;
        } else {
            eVar.f3941b0 = i7;
        }
        if (i8 < 0) {
            eVar.f3943c0 = 0;
        } else {
            eVar.f3943c0 = i8;
        }
        r.e eVar2 = (r.e) this.f1781e;
        eVar2.f3982t0 = i4;
        eVar2.S();
    }

    public final void x(r.e eVar) {
        ((ArrayList) this.f1779c).clear();
        int size = eVar.f4025q0.size();
        for (int i4 = 0; i4 < size; i4++) {
            r.d dVar = (r.d) eVar.f4025q0.get(i4);
            int[] iArr = dVar.f3969p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                ((ArrayList) this.f1779c).add(dVar);
            }
        }
        eVar.f3981s0.f4147b = true;
    }

    public c(k1.d dVar) {
        this.f1778b = 8;
        this.f1779c = dVar;
        this.f1780d = new LinkedHashMap();
        this.f1781e = new LinkedHashMap();
    }

    public c(p.g gVar, p.g gVar2) {
        this.f1778b = 3;
        this.f1781e = gVar;
        this.f1780d = gVar2;
    }

    public c(androidx.lifecycle.q0 q0Var, androidx.lifecycle.p0 p0Var, u0.b bVar) {
        this.f1778b = 7;
        c3.h.b0(q0Var, "store");
        c3.h.b0(p0Var, "factory");
        c3.h.b0(bVar, "defaultCreationExtras");
        this.f1779c = q0Var;
        this.f1780d = p0Var;
        this.f1781e = bVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(androidx.lifecycle.q0 q0Var, a4.x xVar) {
        this(q0Var, xVar, u0.a.f4669b);
        this.f1778b = 7;
    }

    public c(Runnable runnable) {
        this.f1778b = 5;
        this.f1780d = new CopyOnWriteArrayList();
        this.f1781e = new HashMap();
        this.f1779c = runnable;
    }

    public c(Context context, TypedArray typedArray) {
        this.f1778b = 2;
        this.f1779c = context;
        this.f1780d = typedArray;
    }

    public c(Context context, LocationManager locationManager) {
        this.f1778b = 1;
        this.f1781e = new p0();
        this.f1779c = context;
        this.f1780d = locationManager;
    }

    public c(r.e eVar) {
        this.f1778b = 4;
        this.f1779c = new ArrayList();
        this.f1780d = new s.b();
        this.f1781e = eVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(androidx.lifecycle.r0 r0Var, u0.c cVar) {
        u0.b bVarA;
        this.f1778b = 7;
        androidx.lifecycle.q0 q0VarH = r0Var.h();
        if (r0Var instanceof androidx.lifecycle.h) {
            bVarA = ((androidx.lifecycle.h) r0Var).a();
        } else {
            bVarA = u0.a.f4669b;
        }
        this(q0VarH, cVar, bVarA);
    }
}
