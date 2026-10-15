package o2;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class p extends c3.h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Method f3647j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f3648k;

    public p(Method method, Object obj) {
        this.f3647j = method;
        this.f3648k = obj;
    }

    @Override // c3.h
    public final Object C1(Class cls) {
        c3.h.K(cls);
        return this.f3647j.invoke(this.f3648k, cls);
    }
}
