package c4;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Method f1293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Method f1294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Method f1295c;

    public /* synthetic */ i(Method method, Method method2, Method method3) {
        this.f1293a = method;
        this.f1294b = method2;
        this.f1295c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
