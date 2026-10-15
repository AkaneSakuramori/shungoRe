package t3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n implements b, k, m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f4404d = new n();

    @Override // t3.b
    public i.w a(e0 e0Var, b0 b0Var) {
        return null;
    }

    public List b(String str) throws UnknownHostException {
        c3.h.b0(str, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            c3.h.a0(allByName, "getAllByName(hostname)");
            int length = allByName.length;
            if (length != 0) {
                return length != 1 ? new ArrayList(new a3.h(allByName, false)) : c3.h.u1(allByName[0]);
            }
            return a3.p.f75b;
        } catch (NullPointerException e5) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException.initCause(e5);
            throw unknownHostException;
        }
    }
}
