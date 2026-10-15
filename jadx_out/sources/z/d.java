package z;

import a0.k;
import a0.l;
import a0.m;
import a0.q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
import y.y;
import y.z;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f5428a = new Object();

    public static int a(Context context, String str) {
        if (str == null) {
            throw new NullPointerException("permission must be non-null");
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return y.a(new z(context).f5056a) ? 0 : -1;
    }

    public static ColorStateList b(Context context, int i4) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        l lVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        m mVar = new m(resources, theme);
        synchronized (q.f40c) {
            try {
                SparseArray sparseArray = (SparseArray) q.f39b.get(mVar);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (lVar = (l) sparseArray.get(i4)) == null) {
                    colorStateList = null;
                } else {
                    if (lVar.f28b.equals(resources.getConfiguration())) {
                        if (theme != null || lVar.f29c != 0) {
                            if (theme == null || lVar.f29c != theme.hashCode()) {
                            }
                        }
                        colorStateList = lVar.f27a;
                    }
                    sparseArray.remove(i4);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = q.f38a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i4, typedValue, true);
        int i5 = typedValue.type;
        if (i5 < 28 || i5 > 31) {
            try {
                colorStateListA = a0.c.a(resources, resources.getXml(i4), theme);
            } catch (Exception e5) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e5);
            }
        }
        if (colorStateListA == null) {
            return k.b(resources, i4, theme);
        }
        synchronized (q.f40c) {
            try {
                WeakHashMap weakHashMap = q.f39b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(mVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(mVar, sparseArray2);
                }
                sparseArray2.append(i4, new l(colorStateListA, mVar.f30a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return colorStateListA;
    }
}
