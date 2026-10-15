package b4;

import a4.x;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class i extends l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final x f1125h = new x(6, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f1126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f1127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f1128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Class f1129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class f1130g;

    public i(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f1126c = method;
        this.f1127d = method2;
        this.f1128e = method3;
        this.f1129f = cls;
        this.f1130g = cls2;
    }

    @Override // b4.l
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f1128e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e5) {
            throw new AssertionError("failed to remove ALPN", e5);
        } catch (InvocationTargetException e6) {
            throw new AssertionError("failed to remove ALPN", e6);
        }
    }

    @Override // b4.l
    public final void d(SSLSocket sSLSocket, String str, List list) {
        c3.h.b0(list, "protocols");
        try {
            this.f1126c.invoke(null, sSLSocket, Proxy.newProxyInstance(l.class.getClassLoader(), new Class[]{this.f1129f, this.f1130g}, new h(x.e(list))));
        } catch (IllegalAccessException e5) {
            throw new AssertionError("failed to set ALPN", e5);
        } catch (InvocationTargetException e6) {
            throw new AssertionError("failed to set ALPN", e6);
        }
    }

    @Override // b4.l
    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f1127d.invoke(null, sSLSocket));
            c3.h.Y(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            h hVar = (h) invocationHandler;
            boolean z4 = hVar.f1123b;
            if (!z4 && hVar.f1124c == null) {
                l.j(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, 6);
                return null;
            }
            if (z4) {
                return null;
            }
            return hVar.f1124c;
        } catch (IllegalAccessException e5) {
            throw new AssertionError("failed to get ALPN selected protocol", e5);
        } catch (InvocationTargetException e6) {
            throw new AssertionError("failed to get ALPN selected protocol", e6);
        }
    }
}
