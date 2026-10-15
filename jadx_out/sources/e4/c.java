package e4;

import a3.p;
import c3.h;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import q3.l;
import r3.q;

/* JADX INFO: loaded from: classes.dex */
public final class c implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f1995a = new c();

    public static List a(X509Certificate x509Certificate, int i4) {
        Object obj;
        p pVar = p.f75b;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return pVar;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && h.I(list.get(0), Integer.valueOf(i4)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return pVar;
        }
    }

    public static boolean b(String str) {
        int i4;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + length2 + " < 0").toString());
        }
        if (length2 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + length2 + " > " + str.length()).toString());
        }
        long j4 = 0;
        int i5 = 0;
        while (i5 < length2) {
            char cCharAt = str.charAt(i5);
            if (cCharAt < 128) {
                j4++;
            } else {
                if (cCharAt < 2048) {
                    i4 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i4 = 3;
                } else {
                    int i6 = i5 + 1;
                    char cCharAt2 = i6 < length2 ? str.charAt(i6) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j4++;
                        i5 = i6;
                    } else {
                        j4 += (long) 4;
                        i5 += 2;
                    }
                }
                j4 += (long) i4;
            }
            i5++;
        }
        return length == ((int) j4);
    }

    public static boolean c(String str, X509Certificate x509Certificate) {
        int length;
        h.b0(str, "host");
        byte[] bArr = u3.b.f4761a;
        if (u3.b.f4766f.a(str)) {
            String strX = q.x(str);
            List listA = a(x509Certificate, 7);
            if (!listA.isEmpty()) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    if (h.I(strX, q.x((String) it.next()))) {
                        return true;
                    }
                }
            }
        } else {
            if (b(str)) {
                Locale locale = Locale.US;
                h.a0(locale, "US");
                str = str.toLowerCase(locale);
                h.a0(str, "this as java.lang.String).toLowerCase(locale)");
            }
            List<String> listA2 = a(x509Certificate, 2);
            if (!listA2.isEmpty()) {
                for (String lowerCase : listA2) {
                    if (str.length() != 0 && !l.o3(str, ".", false) && !str.endsWith("..") && lowerCase != null && lowerCase.length() != 0 && !l.o3(lowerCase, ".", false) && !lowerCase.endsWith("..")) {
                        String strConcat = !str.endsWith(".") ? str.concat(".") : str;
                        if (!lowerCase.endsWith(".")) {
                            lowerCase = lowerCase.concat(".");
                        }
                        if (b(lowerCase)) {
                            Locale locale2 = Locale.US;
                            h.a0(locale2, "US");
                            lowerCase = lowerCase.toLowerCase(locale2);
                            h.a0(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        }
                        if (!l.R2(lowerCase, "*", false)) {
                            if (h.I(strConcat, lowerCase)) {
                                return true;
                            }
                        } else if (l.o3(lowerCase, "*.", false) && l.Y2(lowerCase, '*', 1, false, 4) == -1 && strConcat.length() >= lowerCase.length() && !h.I("*.", lowerCase)) {
                            String strSubstring = lowerCase.substring(1);
                            h.a0(strSubstring, "this as java.lang.String).substring(startIndex)");
                            if (strConcat.endsWith(strSubstring) && ((length = strConcat.length() - strSubstring.length()) <= 0 || l.c3(strConcat, '.', length - 1, 4) == -1)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        h.b0(str, "host");
        h.b0(sSLSession, "session");
        if (!b(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            h.Y(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return c(str, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
