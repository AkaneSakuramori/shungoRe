package o2;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class r extends c3.h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Method f3651j;

    public r(Method method) {
        this.f3651j = method;
    }

    @Override // c3.h
    public final Object C1(Class cls) {
        c3.h.K(cls);
        return this.f3651j.invoke(null, cls, Object.class);
    }
}
