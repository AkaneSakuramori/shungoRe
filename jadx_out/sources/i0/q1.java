package i0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class q1 extends t1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Field f2954e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f2955f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Constructor f2956g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f2957h = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WindowInsets f2958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b0.c f2959d;

    public q1() {
        this.f2958c = i();
    }

    private static WindowInsets i() {
        if (!f2955f) {
            try {
                f2954e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e5);
            }
            f2955f = true;
        }
        Field field = f2954e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e6) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e6);
            }
        }
        if (!f2957h) {
            try {
                f2956g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e7);
            }
            f2957h = true;
        }
        Constructor constructor = f2956g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e8) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e8);
            }
        }
        return null;
    }

    @Override // i0.t1
    public c2 b() {
        a();
        c2 c2VarG = c2.g(null, this.f2958c);
        b0.c[] cVarArr = this.f2965b;
        a2 a2Var = c2VarG.f2902a;
        a2Var.o(cVarArr);
        a2Var.q(this.f2959d);
        return c2VarG;
    }

    @Override // i0.t1
    public void e(b0.c cVar) {
        this.f2959d = cVar;
    }

    @Override // i0.t1
    public void g(b0.c cVar) {
        WindowInsets windowInsets = this.f2958c;
        if (windowInsets != null) {
            this.f2958c = windowInsets.replaceSystemWindowInsets(cVar.f1081a, cVar.f1082b, cVar.f1083c, cVar.f1084d);
        }
    }

    public q1(c2 c2Var) {
        super(c2Var);
        this.f2958c = c2Var.f();
    }
}
