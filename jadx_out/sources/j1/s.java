package j1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.shungo.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f3217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f3218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f3219g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f3220h;

    public s(String str, String str2, a aVar) {
        c3.h.b0(str2, "audience");
        this.f3213a = str;
        this.f3214b = str2;
        this.f3217e = aVar;
    }

    public s(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(c3.h.m2(R.attr.materialCalendarStyle, context, com.google.android.material.datepicker.l.class.getCanonicalName()).data, n1.a.f3550l);
        this.f3213a = i.r.b(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        this.f3219g = i.r.b(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        this.f3214b = i.r.b(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        this.f3215c = i.r.b(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListP0 = c3.h.P0(context, typedArrayObtainStyledAttributes, 7);
        this.f3216d = i.r.b(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.f3217e = i.r.b(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f3218f = i.r.b(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        Paint paint = new Paint();
        this.f3220h = paint;
        paint.setColor(colorStateListP0.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
