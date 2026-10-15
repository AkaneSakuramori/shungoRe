package i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f2559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o3 f2560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o3 f2561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o3 f2562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o3 f2563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o3 f2564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o3 f2565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o3 f2566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o1 f2567i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2568j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2569k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Typeface f2570l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2571m;

    public e1(TextView textView) {
        this.f2559a = textView;
        this.f2567i = new o1(textView);
    }

    public static o3 c(Context context, x xVar, int i4) {
        ColorStateList colorStateListH;
        synchronized (xVar) {
            colorStateListH = xVar.f2835a.h(context, i4);
        }
        if (colorStateListH == null) {
            return null;
        }
        o3 o3Var = new o3(0);
        o3Var.f2738b = true;
        o3Var.f2739c = colorStateListH;
        return o3Var;
    }

    public static void h(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i4 >= 30) {
            l0.a.a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i4 >= 30) {
            l0.a.a(editorInfo, text);
            return;
        }
        int i5 = editorInfo.initialSelStart;
        int i6 = editorInfo.initialSelEnd;
        int i7 = i5 > i6 ? i6 : i5;
        if (i5 <= i6) {
            i5 = i6;
        }
        int length = text.length();
        if (i7 < 0 || i5 > length) {
            c3.h.u2(editorInfo, null, 0, 0);
            return;
        }
        int i8 = editorInfo.inputType & 4095;
        if (i8 == 129 || i8 == 225 || i8 == 18) {
            c3.h.u2(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            c3.h.u2(editorInfo, text, i7, i5);
            return;
        }
        int i9 = i5 - i7;
        int i10 = i9 > 1024 ? 0 : i9;
        int i11 = 2048 - i10;
        int iMin = Math.min(text.length() - i5, i11 - Math.min(i7, (int) (((double) i11) * 0.8d)));
        int iMin2 = Math.min(i7, i11 - iMin);
        int i12 = i7 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i12))) {
            i12++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i5 + iMin) - 1))) {
            iMin--;
        }
        int i13 = iMin2 + i10;
        c3.h.u2(editorInfo, i10 != i9 ? TextUtils.concat(text.subSequence(i12, i12 + iMin2), text.subSequence(i5, iMin + i5)) : text.subSequence(i12, i13 + iMin + i12), iMin2, i13);
    }

    public final void a(Drawable drawable, o3 o3Var) {
        if (drawable == null || o3Var == null) {
            return;
        }
        x.d(drawable, o3Var, this.f2559a.getDrawableState());
    }

    public final void b() {
        o3 o3Var = this.f2560b;
        TextView textView = this.f2559a;
        if (o3Var != null || this.f2561c != null || this.f2562d != null || this.f2563e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f2560b);
            a(compoundDrawables[1], this.f2561c);
            a(compoundDrawables[2], this.f2562d);
            a(compoundDrawables[3], this.f2563e);
        }
        if (this.f2564f == null && this.f2565g == null) {
            return;
        }
        Drawable[] drawableArrA = a1.a(textView);
        a(drawableArrA[0], this.f2564f);
        a(drawableArrA[2], this.f2565g);
    }

    public final ColorStateList d() {
        o3 o3Var = this.f2566h;
        if (o3Var != null) {
            return (ColorStateList) o3Var.f2739c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        o3 o3Var = this.f2566h;
        if (o3Var != null) {
            return (PorterDuff.Mode) o3Var.f2740d;
        }
        return null;
    }

    public final void f(AttributeSet attributeSet, int i4) {
        boolean zB;
        boolean z4;
        String strO;
        String strO2;
        int i5;
        int i6;
        int resourceId;
        int i7;
        TextView textView = this.f2559a;
        Context context = textView.getContext();
        x xVarA = x.a();
        int[] iArr = d.a.f1661h;
        e.c cVarU = e.c.u(context, attributeSet, iArr, i4);
        i0.v0.k(textView, textView.getContext(), iArr, attributeSet, (TypedArray) cVarU.f1780d, i4);
        int iN = cVarU.n(0, -1);
        if (cVarU.r(3)) {
            this.f2560b = c(context, xVarA, cVarU.n(3, 0));
        }
        if (cVarU.r(1)) {
            this.f2561c = c(context, xVarA, cVarU.n(1, 0));
        }
        if (cVarU.r(4)) {
            this.f2562d = c(context, xVarA, cVarU.n(4, 0));
        }
        if (cVarU.r(2)) {
            this.f2563e = c(context, xVarA, cVarU.n(2, 0));
        }
        int i8 = Build.VERSION.SDK_INT;
        if (cVarU.r(5)) {
            this.f2564f = c(context, xVarA, cVarU.n(5, 0));
        }
        if (cVarU.r(6)) {
            this.f2565g = c(context, xVarA, cVarU.n(6, 0));
        }
        cVarU.v();
        boolean z5 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = d.a.f1676w;
        if (iN != -1) {
            e.c cVar = new e.c(context, context.obtainStyledAttributes(iN, iArr2));
            if (z5 || !cVar.r(14)) {
                zB = false;
                z4 = false;
            } else {
                zB = cVar.b(14, false);
                z4 = true;
            }
            n(context, cVar);
            if (cVar.r(15)) {
                strO = cVar.o(15);
                i7 = 13;
            } else {
                i7 = 13;
                strO = null;
            }
            strO2 = cVar.r(i7) ? cVar.o(i7) : null;
            cVar.v();
        } else {
            zB = false;
            z4 = false;
            strO = null;
            strO2 = null;
        }
        e.c cVar2 = new e.c(context, context.obtainStyledAttributes(attributeSet, iArr2, i4, 0));
        if (!z5 && cVar2.r(14)) {
            zB = cVar2.b(14, false);
            z4 = true;
        }
        if (cVar2.r(15)) {
            strO = cVar2.o(15);
        }
        if (cVar2.r(13)) {
            strO2 = cVar2.o(13);
        }
        String str = strO2;
        if (i8 >= 28 && cVar2.r(0) && cVar2.e(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, cVar2);
        cVar2.v();
        if (!z5 && z4) {
            textView.setAllCaps(zB);
        }
        Typeface typeface = this.f2570l;
        if (typeface != null) {
            if (this.f2569k == -1) {
                textView.setTypeface(typeface, this.f2568j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            c1.d(textView, str);
        }
        if (strO != null) {
            b1.b(textView, b1.a(strO));
        }
        int[] iArr3 = d.a.f1662i;
        o1 o1Var = this.f2567i;
        Context context2 = o1Var.f2735j;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr3, i4, 0);
        TextView textView2 = o1Var.f2734i;
        i0.v0.k(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes, i4);
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            o1Var.f2726a = typedArrayObtainStyledAttributes.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(4) ? typedArrayObtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(2) ? typedArrayObtainStyledAttributes.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(1) ? typedArrayObtainStyledAttributes.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(3) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i9 = 0; i9 < length; i9++) {
                    iArr4[i9] = typedArrayObtainTypedArray.getDimensionPixelSize(i9, -1);
                }
                o1Var.f2731f = o1.b(iArr4);
                o1Var.i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!o1Var.j()) {
            o1Var.f2726a = 0;
        } else if (o1Var.f2726a == 1) {
            if (!o1Var.f2732g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i6 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i6 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i6, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                o1Var.k(dimension2, dimension3, dimension);
            }
            o1Var.h();
        }
        if (b4.f2530b && o1Var.f2726a != 0) {
            int[] iArr5 = o1Var.f2731f;
            if (iArr5.length > 0) {
                if (c1.a(textView) != -1.0f) {
                    c1.b(textView, Math.round(o1Var.f2729d), Math.round(o1Var.f2730e), Math.round(o1Var.f2728c), 0);
                } else {
                    c1.c(textView, iArr5, 0);
                }
            }
        }
        e.c cVar3 = new e.c(context, context.obtainStyledAttributes(attributeSet, iArr3));
        int iN2 = cVar3.n(8, -1);
        Drawable drawableB = iN2 != -1 ? xVarA.b(context, iN2) : null;
        int iN3 = cVar3.n(13, -1);
        Drawable drawableB2 = iN3 != -1 ? xVarA.b(context, iN3) : null;
        int iN4 = cVar3.n(9, -1);
        Drawable drawableB3 = iN4 != -1 ? xVarA.b(context, iN4) : null;
        int iN5 = cVar3.n(6, -1);
        Drawable drawableB4 = iN5 != -1 ? xVarA.b(context, iN5) : null;
        int iN6 = cVar3.n(10, -1);
        Drawable drawableB5 = iN6 != -1 ? xVarA.b(context, iN6) : null;
        int iN7 = cVar3.n(7, -1);
        Drawable drawableB6 = iN7 != -1 ? xVarA.b(context, iN7) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] drawableArrA = a1.a(textView);
            if (drawableB5 == null) {
                drawableB5 = drawableArrA[0];
            }
            if (drawableB2 == null) {
                drawableB2 = drawableArrA[1];
            }
            if (drawableB6 == null) {
                drawableB6 = drawableArrA[2];
            }
            if (drawableB4 == null) {
                drawableB4 = drawableArrA[3];
            }
            a1.b(textView, drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] drawableArrA2 = a1.a(textView);
            Drawable drawable = drawableArrA2[0];
            if (drawable == null && drawableArrA2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = drawableArrA2[1];
                }
                Drawable drawable2 = drawableArrA2[2];
                if (drawableB4 == null) {
                    drawableB4 = drawableArrA2[3];
                }
                a1.b(textView, drawable, drawableB2, drawable2, drawableB4);
            }
        }
        if (cVar3.r(11)) {
            m0.q.f(textView, cVar3.c(11));
        }
        if (cVar3.r(12)) {
            i5 = -1;
            m0.q.g(textView, t1.b(cVar3.k(12, -1), null));
        } else {
            i5 = -1;
        }
        int iE = cVar3.e(15, i5);
        int iE2 = cVar3.e(18, i5);
        int iE3 = cVar3.e(19, i5);
        cVar3.v();
        if (iE != i5) {
            c3.h.q2(textView, iE);
        }
        if (iE2 != i5) {
            c3.h.s2(textView, iE2);
        }
        if (iE3 != i5) {
            c3.h.W(iE3);
            int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
            if (iE3 != fontMetricsInt) {
                textView.setLineSpacing(iE3 - fontMetricsInt, 1.0f);
            }
        }
    }

    public final void g(Context context, int i4) {
        String strO;
        e.c cVar = new e.c(context, context.obtainStyledAttributes(i4, d.a.f1676w));
        boolean zR = cVar.r(14);
        TextView textView = this.f2559a;
        if (zR) {
            textView.setAllCaps(cVar.b(14, false));
        }
        if (cVar.r(0) && cVar.e(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, cVar);
        if (cVar.r(13) && (strO = cVar.o(13)) != null) {
            c1.d(textView, strO);
        }
        cVar.v();
        Typeface typeface = this.f2570l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f2568j);
        }
    }

    public final void i(int i4, int i5, int i6, int i7) {
        o1 o1Var = this.f2567i;
        if (o1Var.j()) {
            DisplayMetrics displayMetrics = o1Var.f2735j.getResources().getDisplayMetrics();
            o1Var.k(TypedValue.applyDimension(i7, i4, displayMetrics), TypedValue.applyDimension(i7, i5, displayMetrics), TypedValue.applyDimension(i7, i6, displayMetrics));
            if (o1Var.h()) {
                o1Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i4) {
        o1 o1Var = this.f2567i;
        if (o1Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i4 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = o1Var.f2735j.getResources().getDisplayMetrics();
                    for (int i5 = 0; i5 < length; i5++) {
                        iArrCopyOf[i5] = Math.round(TypedValue.applyDimension(i4, iArr[i5], displayMetrics));
                    }
                }
                o1Var.f2731f = o1.b(iArrCopyOf);
                if (!o1Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                o1Var.f2732g = false;
            }
            if (o1Var.h()) {
                o1Var.a();
            }
        }
    }

    public final void k(int i4) {
        o1 o1Var = this.f2567i;
        if (o1Var.j()) {
            if (i4 == 0) {
                o1Var.f2726a = 0;
                o1Var.f2729d = -1.0f;
                o1Var.f2730e = -1.0f;
                o1Var.f2728c = -1.0f;
                o1Var.f2731f = new int[0];
                o1Var.f2727b = false;
                return;
            }
            if (i4 != 1) {
                throw new IllegalArgumentException(defpackage.a.e("Unknown auto-size text type: ", i4));
            }
            DisplayMetrics displayMetrics = o1Var.f2735j.getResources().getDisplayMetrics();
            o1Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (o1Var.h()) {
                o1Var.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.f2566h == null) {
            this.f2566h = new o3(0);
        }
        o3 o3Var = this.f2566h;
        o3Var.f2739c = colorStateList;
        o3Var.f2738b = colorStateList != null;
        this.f2560b = o3Var;
        this.f2561c = o3Var;
        this.f2562d = o3Var;
        this.f2563e = o3Var;
        this.f2564f = o3Var;
        this.f2565g = o3Var;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.f2566h == null) {
            this.f2566h = new o3(0);
        }
        o3 o3Var = this.f2566h;
        o3Var.f2740d = mode;
        o3Var.f2737a = mode != null;
        this.f2560b = o3Var;
        this.f2561c = o3Var;
        this.f2562d = o3Var;
        this.f2563e = o3Var;
        this.f2564f = o3Var;
        this.f2565g = o3Var;
    }

    public final void n(Context context, e.c cVar) {
        String strO;
        this.f2568j = cVar.k(2, this.f2568j);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            int iK = cVar.k(11, -1);
            this.f2569k = iK;
            if (iK != -1) {
                this.f2568j &= 2;
            }
        }
        if (!cVar.r(10) && !cVar.r(12)) {
            if (cVar.r(1)) {
                this.f2571m = false;
                int iK2 = cVar.k(1, 1);
                if (iK2 == 1) {
                    this.f2570l = Typeface.SANS_SERIF;
                    return;
                } else if (iK2 == 2) {
                    this.f2570l = Typeface.SERIF;
                    return;
                } else {
                    if (iK2 != 3) {
                        return;
                    }
                    this.f2570l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f2570l = null;
        int i5 = cVar.r(12) ? 12 : 10;
        int i6 = this.f2569k;
        int i7 = this.f2568j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceJ = cVar.j(i5, this.f2568j, new y0(this, i6, i7, new WeakReference(this.f2559a)));
                if (typefaceJ != null) {
                    if (i4 < 28 || this.f2569k == -1) {
                        this.f2570l = typefaceJ;
                    } else {
                        this.f2570l = d1.a(Typeface.create(typefaceJ, 0), this.f2569k, (this.f2568j & 2) != 0);
                    }
                }
                this.f2571m = this.f2570l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f2570l != null || (strO = cVar.o(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f2569k == -1) {
            this.f2570l = Typeface.create(strO, this.f2568j);
        } else {
            this.f2570l = d1.a(Typeface.create(strO, 0), this.f2569k, (this.f2568j & 2) != 0);
        }
    }
}
