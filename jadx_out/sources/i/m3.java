package i;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f2710a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f2711b = {-16842910};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f2712c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f2713d = {R.attr.state_pressed};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f2714e = {R.attr.state_checked};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f2715f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f2716g = new int[1];

    public static void a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(d.a.f1663j);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i4) {
        ColorStateList colorStateListD = d(context, i4);
        if (colorStateListD != null && colorStateListD.isStateful()) {
            return colorStateListD.getColorForState(f2711b, colorStateListD.getDefaultColor());
        }
        ThreadLocal threadLocal = f2710a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f5 = typedValue.getFloat();
        int iC = c(context, i4);
        return b0.a.d(iC, Math.round(Color.alpha(iC) * f5));
    }

    public static int c(Context context, int i4) {
        int[] iArr = f2716g;
        iArr[0] = i4;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        e.c cVar = new e.c(context, typedArrayObtainStyledAttributes);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            cVar.v();
        }
    }

    public static ColorStateList d(Context context, int i4) {
        int[] iArr = f2716g;
        iArr[0] = i4;
        e.c cVar = new e.c(context, context.obtainStyledAttributes((AttributeSet) null, iArr));
        try {
            return cVar.c(0);
        } finally {
            cVar.v();
        }
    }
}
