package i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class o1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final RectF f2724l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f2725m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2726a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2727b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f2728c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f2729d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f2730e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f2731f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2732g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextPaint f2733h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f2734i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f2735j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l1 f2736k;

    static {
        new ConcurrentHashMap();
    }

    public o1(TextView textView) {
        this.f2734i = textView;
        this.f2735j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f2736k = new m1();
        } else {
            this.f2736k = new l1();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i4 : iArr) {
            if (i4 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i4)) < 0) {
                arrayList.add(Integer.valueOf(i4));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr2[i5] = ((Integer) arrayList.get(i5)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f2725m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                concurrentHashMap.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e5) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e5);
            return null;
        }
    }

    public static Object e(Object obj, String str, Object obj2) {
        try {
            return d(str).invoke(obj, new Object[0]);
        } catch (Exception e5) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e5);
            return obj2;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f2727b) {
                if (this.f2734i.getMeasuredHeight() <= 0 || this.f2734i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f2736k.b(this.f2734i) ? 1048576 : (this.f2734i.getMeasuredWidth() - this.f2734i.getTotalPaddingLeft()) - this.f2734i.getTotalPaddingRight();
                int height = (this.f2734i.getHeight() - this.f2734i.getCompoundPaddingBottom()) - this.f2734i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f2724l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fC = c(rectF);
                        if (fC != this.f2734i.getTextSize()) {
                            g(0, fC);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.f2727b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f2731f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i4 = length - 1;
        int i5 = 0;
        int i6 = 1;
        while (i6 <= i4) {
            int i7 = (i6 + i4) / 2;
            int i8 = this.f2731f[i7];
            TextView textView = this.f2734i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int iB = i1.b(textView);
            TextPaint textPaint = this.f2733h;
            if (textPaint == null) {
                this.f2733h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f2733h.set(textView.getPaint());
            this.f2733h.setTextSize(i8);
            StaticLayout staticLayoutA = k1.a(text, (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), iB, this.f2734i, this.f2733h, this.f2736k);
            if ((iB == -1 || (staticLayoutA.getLineCount() <= iB && staticLayoutA.getLineEnd(staticLayoutA.getLineCount() - 1) == text.length())) && staticLayoutA.getHeight() <= rectF.bottom) {
                int i9 = i7 + 1;
                i5 = i6;
                i6 = i9;
            } else {
                i5 = i7 - 1;
                i4 = i5;
            }
        }
        return this.f2731f[i5];
    }

    public final boolean f() {
        return j() && this.f2726a != 0;
    }

    public final void g(int i4, float f5) {
        Context context = this.f2735j;
        float fApplyDimension = TypedValue.applyDimension(i4, f5, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f2734i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zA = j1.a(textView);
            if (textView.getLayout() != null) {
                this.f2727b = false;
                try {
                    Method methodD = d("nullLayouts");
                    if (methodD != null) {
                        methodD.invoke(textView, new Object[0]);
                    }
                } catch (Exception e5) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e5);
                }
                if (zA) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f2726a == 1) {
            if (!this.f2732g || this.f2731f.length == 0) {
                int iFloor = ((int) Math.floor((this.f2730e - this.f2729d) / this.f2728c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i4 = 0; i4 < iFloor; i4++) {
                    iArr[i4] = Math.round((i4 * this.f2728c) + this.f2729d);
                }
                this.f2731f = b(iArr);
            }
            this.f2727b = true;
        } else {
            this.f2727b = false;
        }
        return this.f2727b;
    }

    public final boolean i() {
        int[] iArr = this.f2731f;
        int length = iArr.length;
        boolean z4 = length > 0;
        this.f2732g = z4;
        if (z4) {
            this.f2726a = 1;
            this.f2729d = iArr[0];
            this.f2730e = iArr[length - 1];
            this.f2728c = -1.0f;
        }
        return z4;
    }

    public final boolean j() {
        return !(this.f2734i instanceof z);
    }

    public final void k(float f5, float f6, float f7) {
        if (f5 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f5 + "px) is less or equal to (0px)");
        }
        if (f6 <= f5) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f6 + "px) is less or equal to minimum auto-size text size (" + f5 + "px)");
        }
        if (f7 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f7 + "px) is less or equal to (0px)");
        }
        this.f2726a = 1;
        this.f2729d = f5;
        this.f2730e = f6;
        this.f2728c = f7;
        this.f2732g = false;
    }
}
