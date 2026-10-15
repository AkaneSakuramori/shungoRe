package i;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f2803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f2804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f2805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f2806d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
            f2803a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f2804b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f2805c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f2806d = true;
        } catch (NoSuchMethodException e5) {
            e5.printStackTrace();
        }
    }
}
