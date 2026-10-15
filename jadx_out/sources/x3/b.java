package x3;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4934d;

    public b(List list) {
        c3.h.b0(list, "connectionSpecs");
        this.f4931a = list;
    }

    public final t3.i a(SSLSocket sSLSocket) throws UnknownServiceException {
        t3.i iVar;
        int i4;
        boolean z4;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i5 = this.f4932b;
        List list = this.f4931a;
        int size = list.size();
        while (true) {
            if (i5 >= size) {
                iVar = null;
                break;
            }
            iVar = (t3.i) list.get(i5);
            if (iVar.b(sSLSocket)) {
                this.f4932b = i5 + 1;
                break;
            }
            i5++;
        }
        if (iVar == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.f4934d);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            c3.h.X(enabledProtocols2);
            String string = Arrays.toString(enabledProtocols2);
            c3.h.a0(string, "toString(this)");
            sb.append(string);
            throw new UnknownServiceException(sb.toString());
        }
        int i6 = this.f4932b;
        int size2 = list.size();
        while (true) {
            i4 = 0;
            if (i6 >= size2) {
                z4 = false;
                break;
            }
            if (((t3.i) list.get(i6)).b(sSLSocket)) {
                z4 = true;
                break;
            }
            i6++;
        }
        this.f4933c = z4;
        boolean z5 = this.f4934d;
        String[] strArr = iVar.f4383c;
        if (strArr != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            c3.h.a0(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = u3.b.o(enabledCipherSuites2, strArr, t3.g.f4356c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        String[] strArr2 = iVar.f4384d;
        if (strArr2 != null) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            c3.h.a0(enabledProtocols3, "sslSocket.enabledProtocols");
            enabledProtocols = u3.b.o(enabledProtocols3, strArr2, b3.a.f1105a);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        c3.h.a0(supportedCipherSuites, "supportedCipherSuites");
        w.g gVar = t3.g.f4356c;
        byte[] bArr = u3.b.f4761a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i4 >= length) {
                i4 = -1;
                break;
            }
            if (gVar.compare(supportedCipherSuites[i4], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i4++;
        }
        if (z5 && i4 != -1) {
            c3.h.a0(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i4];
            c3.h.a0(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] objArrCopyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            c3.h.a0(objArrCopyOf, "copyOf(this, newSize)");
            enabledCipherSuites = (String[]) objArrCopyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        t3.h hVar = new t3.h();
        hVar.f4375a = iVar.f4381a;
        hVar.f4376b = strArr;
        hVar.f4377c = strArr2;
        hVar.f4378d = iVar.f4382b;
        c3.h.a0(enabledCipherSuites, "cipherSuitesIntersection");
        hVar.b((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        c3.h.a0(enabledProtocols, "tlsVersionsIntersection");
        hVar.e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        t3.i iVarA = hVar.a();
        if (iVarA.c() != null) {
            sSLSocket.setEnabledProtocols(iVarA.f4384d);
        }
        if (iVarA.a() != null) {
            sSLSocket.setEnabledCipherSuites(iVarA.f4383c);
        }
        return iVar;
    }
}
