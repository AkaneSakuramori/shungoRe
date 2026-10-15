package c4;

import a4.x;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public class f implements n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f1285f = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f1286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f1287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f1288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f1289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f1290e;

    public f(Class cls) throws NoSuchMethodException {
        this.f1286a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        c3.h.a0(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f1287b = declaredMethod;
        this.f1288c = cls.getMethod("setHostname", String.class);
        this.f1289d = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f1290e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // c4.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f1286a.isInstance(sSLSocket);
    }

    @Override // c4.n
    public final String b(SSLSocket sSLSocket) {
        if (!this.f1286a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f1289d.invoke(sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, q3.a.f3886a);
            }
            return null;
        } catch (IllegalAccessException e5) {
            throw new AssertionError(e5);
        } catch (InvocationTargetException e6) {
            Throwable cause = e6.getCause();
            if ((cause instanceof NullPointerException) && c3.h.I(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e6);
        }
    }

    @Override // c4.n
    public final boolean c() {
        return b4.c.f1112e.l();
    }

    @Override // c4.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        c3.h.b0(list, "protocols");
        if (this.f1286a.isInstance(sSLSocket)) {
            try {
                this.f1287b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f1288c.invoke(sSLSocket, str);
                }
                Method method = this.f1290e;
                b4.l lVar = b4.l.f1135a;
                method.invoke(sSLSocket, x.i(list));
            } catch (IllegalAccessException e5) {
                throw new AssertionError(e5);
            } catch (InvocationTargetException e6) {
                throw new AssertionError(e6);
            }
        }
    }
}
