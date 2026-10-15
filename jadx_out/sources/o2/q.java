package o2;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class q extends c3.h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Method f3649j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3650k;

    public q(int i4, Method method) {
        this.f3649j = method;
        this.f3650k = i4;
    }

    @Override // c3.h
    public final Object C1(Class cls) {
        c3.h.K(cls);
        return this.f3649j.invoke(null, cls, Integer.valueOf(this.f3650k));
    }
}
