package z3;

import f4.i;
import q3.l;
import t3.p;
import t3.q;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f5512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f5513b = 262144;

    public a(i iVar) {
        this.f5512a = iVar;
    }

    public final q a() {
        p pVar = new p();
        while (true) {
            String strN = this.f5512a.n(this.f5513b);
            this.f5513b -= (long) strN.length();
            if (strN.length() == 0) {
                return pVar.b();
            }
            int iY2 = l.Y2(strN, ':', 1, false, 4);
            if (iY2 != -1) {
                String strSubstring = strN.substring(0, iY2);
                c3.h.a0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = strN.substring(iY2 + 1);
                c3.h.a0(strSubstring2, "this as java.lang.String).substring(startIndex)");
                pVar.a(strSubstring, strSubstring2);
            } else if (strN.charAt(0) == ':') {
                String strSubstring3 = strN.substring(1);
                c3.h.a0(strSubstring3, "this as java.lang.String).substring(startIndex)");
                pVar.a("", strSubstring3);
            } else {
                pVar.a("", strN);
            }
        }
    }
}
