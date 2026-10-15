package f2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c3.h f2092a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c3.h f2093b = new j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c3.h f2094c = new j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c3.h f2095d = new j();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f2096e = new a(0.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f2097f = new a(0.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f2098g = new a(0.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f2099h = new a(0.0f);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e f2100i = c3.h.z0();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e f2101j = c3.h.z0();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f2102k = c3.h.z0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e f2103l = c3.h.z0();

    public static k a(Context context, int i4, int i5, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i4);
        if (i5 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i5);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(n1.a.f3560v);
        try {
            int i6 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i7 = typedArrayObtainStyledAttributes.getInt(3, i6);
            int i8 = typedArrayObtainStyledAttributes.getInt(4, i6);
            int i9 = typedArrayObtainStyledAttributes.getInt(2, i6);
            int i10 = typedArrayObtainStyledAttributes.getInt(1, i6);
            c cVarC = c(typedArrayObtainStyledAttributes, 5, aVar);
            c cVarC2 = c(typedArrayObtainStyledAttributes, 8, cVarC);
            c cVarC3 = c(typedArrayObtainStyledAttributes, 9, cVarC);
            c cVarC4 = c(typedArrayObtainStyledAttributes, 7, cVarC);
            c cVarC5 = c(typedArrayObtainStyledAttributes, 6, cVarC);
            k kVar = new k();
            c3.h hVarX0 = c3.h.x0(i7);
            kVar.f2080a = hVarX0;
            k.b(hVarX0);
            kVar.f2084e = cVarC2;
            c3.h hVarX1 = c3.h.x0(i8);
            kVar.f2081b = hVarX1;
            k.b(hVarX1);
            kVar.f2085f = cVarC3;
            c3.h hVarX2 = c3.h.x0(i9);
            kVar.f2082c = hVarX2;
            k.b(hVarX2);
            kVar.f2086g = cVarC4;
            c3.h hVarX3 = c3.h.x0(i10);
            kVar.f2083d = hVarX3;
            k.b(hVarX3);
            kVar.f2087h = cVarC5;
            return kVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static k b(Context context, AttributeSet attributeSet, int i4, int i5) {
        a aVar = new a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n1.a.f3554p, i4, i5);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i4, c cVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i4);
        if (typedValuePeekValue == null) {
            return cVar;
        }
        int i5 = typedValuePeekValue.type;
        if (i5 == 5) {
            return new a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i5 == 6 ? new i(typedValuePeekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public final boolean d(RectF rectF) {
        boolean z4 = this.f2103l.getClass().equals(e.class) && this.f2101j.getClass().equals(e.class) && this.f2100i.getClass().equals(e.class) && this.f2102k.getClass().equals(e.class);
        float fA = this.f2096e.a(rectF);
        return z4 && ((this.f2097f.a(rectF) > fA ? 1 : (this.f2097f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f2099h.a(rectF) > fA ? 1 : (this.f2099h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f2098g.a(rectF) > fA ? 1 : (this.f2098g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f2093b instanceof j) && (this.f2092a instanceof j) && (this.f2094c instanceof j) && (this.f2095d instanceof j));
    }

    public final k e() {
        k kVar = new k();
        kVar.f2080a = new j();
        kVar.f2081b = new j();
        kVar.f2082c = new j();
        kVar.f2083d = new j();
        kVar.f2084e = new a(0.0f);
        kVar.f2085f = new a(0.0f);
        kVar.f2086g = new a(0.0f);
        kVar.f2087h = new a(0.0f);
        kVar.f2088i = c3.h.z0();
        kVar.f2089j = c3.h.z0();
        kVar.f2090k = c3.h.z0();
        kVar.f2080a = this.f2092a;
        kVar.f2081b = this.f2093b;
        kVar.f2082c = this.f2094c;
        kVar.f2083d = this.f2095d;
        kVar.f2084e = this.f2096e;
        kVar.f2085f = this.f2097f;
        kVar.f2086g = this.f2098g;
        kVar.f2087h = this.f2099h;
        kVar.f2088i = this.f2100i;
        kVar.f2089j = this.f2101j;
        kVar.f2090k = this.f2102k;
        kVar.f2091l = this.f2103l;
        return kVar;
    }
}
