package r2;

import java.lang.reflect.AccessibleObject;
import o2.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f4070a;

    static {
        f4070a = g.f3622a < 9 ? new a() : new c();
    }

    public abstract void a(AccessibleObject accessibleObject);
}
