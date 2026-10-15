package f2;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.KeyListener;
import android.util.Log;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import androidx.lifecycle.k0;
import h.b0;
import java.io.IOException;
import java.net.ProtocolException;
import java.nio.charset.Charset;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import t3.a0;
import t3.f0;
import t3.z;

/* JADX INFO: loaded from: classes.dex */
public class e implements b0, m.b, w0.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static e f2032c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2033b;

    public /* synthetic */ e() {
        this.f2033b = 16;
    }

    public static void A(Activity activity) {
        c3.h.b0(activity, "activity");
        if (Build.VERSION.SDK_INT >= 29) {
            g0.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new g0());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new h0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public static boolean B(String str) {
        return (q3.l.U2("Connection", str) || q3.l.U2("Keep-Alive", str) || q3.l.U2("Proxy-Authenticate", str) || q3.l.U2("Proxy-Authorization", str) || q3.l.U2("TE", str) || q3.l.U2("Trailers", str) || q3.l.U2("Transfer-Encoding", str) || q3.l.U2("Upgrade", str)) ? false : true;
    }

    public static boolean C(int i4, int i5, String str) {
        int i6 = i4 + 2;
        return i6 < i5 && str.charAt(i4) == '%' && u3.b.q(str.charAt(i4 + 1)) != -1 && u3.b.q(str.charAt(i6)) != -1;
    }

    public static int E(int i4, int i5, int i6) throws IOException {
        if ((i5 & 8) != 0) {
            i4--;
        }
        if (i6 <= i4) {
            return i4 - i6;
        }
        throw new IOException("PROTOCOL_ERROR padding " + i6 + " > remaining length " + i4);
    }

    public static t3.q F(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            String str = strArr2[i5];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null".toString());
            }
            strArr2[i5] = q3.l.t3(str).toString();
        }
        int iZ0 = c3.h.Z0(0, strArr2.length - 1, 2);
        if (iZ0 >= 0) {
            while (true) {
                String str2 = strArr2[i4];
                String str3 = strArr2[i4 + 1];
                f(str2);
                g(str3, str2);
                if (i4 == iZ0) {
                    break;
                }
                i4 += 2;
            }
        }
        return new t3.q(strArr2);
    }

    public static y3.h H(String str) throws ProtocolException {
        int i4;
        String strSubstring;
        c3.h.b0(str, "statusLine");
        boolean zO3 = q3.l.o3(str, "HTTP/1.", false);
        t3.x xVar = t3.x.f4478c;
        if (zO3) {
            i4 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                xVar = t3.x.f4479d;
            }
        } else {
            if (!q3.l.o3(str, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i4 = 4;
        }
        int i5 = i4 + 3;
        if (str.length() < i5) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            String strSubstring2 = str.substring(i4, i5);
            c3.h.a0(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            int i6 = Integer.parseInt(strSubstring2);
            if (str.length() <= i5) {
                strSubstring = "";
            } else {
                if (str.charAt(i5) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i4 + 4);
                c3.h.a0(strSubstring, "this as java.lang.String).substring(startIndex)");
            }
            return new y3.h(xVar, i6, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a6  */
    public static long I(int i4, String str) {
        int i5 = i(str, 0, i4, false);
        Matcher matcher = t3.j.f4388m.matcher(str);
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int iZ2 = -1;
        int i9 = -1;
        int i10 = -1;
        while (i5 < i4) {
            int i11 = i(str, i5 + 1, i4, true);
            matcher.region(i5, i11);
            if (i7 == -1 && matcher.usePattern(t3.j.f4388m).matches()) {
                String strGroup = matcher.group(1);
                c3.h.a0(strGroup, "matcher.group(1)");
                i7 = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                c3.h.a0(strGroup2, "matcher.group(2)");
                i9 = Integer.parseInt(strGroup2);
                String strGroup3 = matcher.group(3);
                c3.h.a0(strGroup3, "matcher.group(3)");
                i10 = Integer.parseInt(strGroup3);
            } else if (i8 == -1 && matcher.usePattern(t3.j.f4387l).matches()) {
                String strGroup4 = matcher.group(1);
                c3.h.a0(strGroup4, "matcher.group(1)");
                i8 = Integer.parseInt(strGroup4);
            } else if (iZ2 == -1) {
                Pattern pattern = t3.j.f4386k;
                if (matcher.usePattern(pattern).matches()) {
                    String strGroup5 = matcher.group(1);
                    c3.h.a0(strGroup5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    c3.h.a0(locale, "US");
                    String lowerCase = strGroup5.toLowerCase(locale);
                    c3.h.a0(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = pattern.pattern();
                    c3.h.a0(strPattern, "MONTH_PATTERN.pattern()");
                    iZ2 = q3.l.Z2(strPattern, lowerCase, 0, false, 6) / 4;
                } else if (i6 != -1 && matcher.usePattern(t3.j.f4385j).matches()) {
                    String strGroup6 = matcher.group(1);
                    c3.h.a0(strGroup6, "matcher.group(1)");
                    i6 = Integer.parseInt(strGroup6);
                }
            } else if (i6 != -1) {
            }
            i5 = i(str, i11 + 1, i4, false);
        }
        if (70 <= i6 && i6 < 100) {
            i6 += 1900;
        }
        if (i6 >= 0 && i6 < 70) {
            i6 += 2000;
        }
        if (i6 < 1601) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (iZ2 == -1) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (1 > i8 || i8 >= 32) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i7 < 0 || i7 >= 24) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i9 < 0 || i9 >= 60) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i10 < 0 || i10 >= 60) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(u3.b.f4765e);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i6);
        gregorianCalendar.set(2, iZ2 - 1);
        gregorianCalendar.set(5, i8);
        gregorianCalendar.set(11, i7);
        gregorianCalendar.set(12, i9);
        gregorianCalendar.set(13, i10);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static String J(String str, int i4, int i5, boolean z4, int i6) {
        int i7;
        char[] cArr = t3.s.f4419j;
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = str.length();
        }
        if ((i6 & 4) != 0) {
            z4 = false;
        }
        c3.h.b0(str, "<this>");
        int iCharCount = i4;
        while (iCharCount < i5) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z4)) {
                f4.g gVar = new f4.g();
                gVar.O(i4, iCharCount, str);
                while (iCharCount < i5) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i7 = iCharCount + 2) < i5) {
                        int iQ = u3.b.q(str.charAt(iCharCount + 1));
                        int iQ2 = u3.b.q(str.charAt(i7));
                        if (iQ == -1 || iQ2 == -1) {
                            gVar.Q(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            gVar.K((iQ << 4) + iQ2);
                            iCharCount = Character.charCount(iCodePointAt) + i7;
                        }
                    } else if (iCodePointAt == 43 && z4) {
                        gVar.K(32);
                        iCharCount++;
                    } else {
                        gVar.Q(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return gVar.C(gVar.f2166c, q3.a.f3886a);
            }
            iCharCount++;
        }
        String strSubstring = str.substring(i4, i5);
        c3.h.a0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static ArrayList R(String str) {
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (i4 <= str.length()) {
            int iY2 = q3.l.Y2(str, '&', i4, false, 4);
            if (iY2 == -1) {
                iY2 = str.length();
            }
            int iY3 = q3.l.Y2(str, '=', i4, false, 4);
            if (iY3 == -1 || iY3 > iY2) {
                String strSubstring = str.substring(i4, iY2);
                c3.h.a0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i4, iY3);
                c3.h.a0(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(iY3 + 1, iY2);
                c3.h.a0(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring3);
            }
            i4 = iY2 + 1;
        }
        return arrayList;
    }

    public static void S(List list, StringBuilder sb) {
        c3.h.b0(list, "<this>");
        n3.a aVarA2 = c3.h.A2(c3.h.I2(0, list.size()), 2);
        int i4 = aVarA2.f3565b;
        int i5 = aVarA2.f3566c;
        int i6 = aVarA2.f3567d;
        if ((i6 <= 0 || i4 > i5) && (i6 >= 0 || i5 > i4)) {
            return;
        }
        while (true) {
            String str = (String) list.get(i4);
            String str2 = (String) list.get(i4 + 1);
            if (i4 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (i4 == i5) {
                return;
            } else {
                i4 += i6;
            }
        }
    }

    public static final t3.g c(e eVar, String str) {
        t3.g gVar = new t3.g(str);
        t3.g.f4357d.put(str, gVar);
        return gVar;
    }

    public static final t3.b0 d(t3.b0 b0Var) {
        int i4 = v3.a.f4814a;
        if ((b0Var != null ? b0Var.f4313h : null) == null) {
            return b0Var;
        }
        a0 a0VarE = b0Var.e();
        a0VarE.f4299g = null;
        return a0VarE.a();
    }

    public static String e(String str, int i4, int i5, String str2, boolean z4, boolean z5, boolean z6, boolean z7, int i6) {
        char[] cArr = t3.s.f4419j;
        int i7 = (i6 & 1) != 0 ? 0 : i4;
        int length = (i6 & 2) != 0 ? str.length() : i5;
        boolean z8 = (i6 & 8) != 0 ? false : z4;
        boolean z9 = (i6 & 16) != 0 ? false : z5;
        boolean z10 = (i6 & 32) != 0 ? false : z6;
        boolean z11 = (i6 & 64) == 0 ? z7 : false;
        c3.h.b0(str, "<this>");
        int iCharCount = i7;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i8 = 32;
            int i9 = 128;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z11) || q3.l.S2(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z8 || (z9 && !C(iCharCount, length, str)))) || (iCodePointAt == 43 && z10)))) {
                f4.g gVar = new f4.g();
                gVar.O(i7, iCharCount, str);
                f4.g gVar2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z8 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z10) {
                            gVar.P(z8 ? "+" : "%2B");
                        } else if (iCodePointAt2 < i8 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i9 && !z11) || q3.l.S2(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z8 || (z9 && !C(iCharCount, length, str)))))) {
                            if (gVar2 == null) {
                                gVar2 = new f4.g();
                            }
                            gVar2.Q(iCodePointAt2);
                            while (!gVar2.r()) {
                                byte B = gVar2.B();
                                gVar.K(37);
                                char[] cArr2 = t3.s.f4419j;
                                gVar.K(cArr2[((B & 255) >> 4) & 15]);
                                gVar.K(cArr2[B & 15]);
                            }
                        } else {
                            gVar.Q(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i8 = 32;
                    i9 = 128;
                }
                return gVar.C(gVar.f2166c, q3.a.f3886a);
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i7, length);
        c3.h.a0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static void f(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty".toString());
        }
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char cCharAt = str.charAt(i4);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(u3.b.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i4), str).toString());
            }
        }
    }

    public static void g(String str, String str2) {
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb = new StringBuilder();
                sb.append(u3.b.h("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i4), str2));
                sb.append(u3.b.p(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static z h(String str, t3.u uVar) {
        c3.h.b0(str, "<this>");
        Charset charset = q3.a.f3886a;
        if (uVar != null) {
            Pattern pattern = t3.u.f4429c;
            Charset charsetA = uVar.a(null);
            if (charsetA == null) {
                String str2 = uVar + "; charset=utf-8";
                c3.h.b0(str2, "<this>");
                try {
                    uVar = r(str2);
                } catch (IllegalArgumentException unused) {
                    uVar = null;
                }
            } else {
                charset = charsetA;
            }
        }
        byte[] bytes = str.getBytes(charset);
        c3.h.a0(bytes, "this as java.lang.String).getBytes(charset)");
        int length = bytes.length;
        long length2 = bytes.length;
        long j4 = 0;
        long j5 = length;
        byte[] bArr = u3.b.f4761a;
        if ((j4 | j5) < 0 || j4 > length2 || length2 - j4 < j5) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return new z(length, 0, uVar, bytes);
    }

    public static int i(String str, int i4, int i5, boolean z4) {
        while (i4 < i5) {
            char cCharAt = str.charAt(i4);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z4)) {
                return i4;
            }
            i4++;
        }
        return i5;
    }

    public static int j(String str) {
        c3.h.b0(str, "scheme");
        if (c3.h.I(str, "http")) {
            return 80;
        }
        return c3.h.I(str, "https") ? 443 : -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void l(Activity activity, androidx.lifecycle.l lVar) {
        c3.h.b0(activity, "activity");
        c3.h.b0(lVar, "event");
        if (activity instanceof androidx.lifecycle.r) {
            androidx.lifecycle.t tVarT = ((androidx.lifecycle.r) activity).t();
            if (tVarT instanceof androidx.lifecycle.t) {
                tVarT.e(lVar);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static f0 o(String str) {
        c3.h.b0(str, "javaName");
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return f0.f4350e;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return f0.f4349d;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return f0.f4348c;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return f0.f4351f;
            }
        } else if (str.equals("SSLv3")) {
            return f0.f4352g;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    public static t3.o p(SSLSession sSLSession) throws IOException {
        List listK;
        List listK2 = a3.p.f75b;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null".toString());
        }
        if (c3.h.I(cipherSuite, "TLS_NULL_WITH_NULL_NULL") || c3.h.I(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        t3.g gVarM = t3.g.f4355b.m(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null".toString());
        }
        if (c3.h.I("NONE", protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        f0 f0VarO = o(protocol);
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            listK = peerCertificates != null ? u3.b.k(Arrays.copyOf(peerCertificates, peerCertificates.length)) : listK2;
        } catch (SSLPeerUnverifiedException unused) {
        }
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            listK2 = u3.b.k(Arrays.copyOf(localCertificates, localCertificates.length));
        }
        return new t3.o(f0VarO, gVarM, listK2, new k0(1, listK));
    }

    public static t3.s q(String str) {
        c3.h.b0(str, "<this>");
        t3.r rVar = new t3.r();
        rVar.c(null, str);
        return rVar.b();
    }

    public static t3.u r(String str) {
        c3.h.b0(str, "<this>");
        Matcher matcher = t3.u.f4429c.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }
        String strGroup = matcher.group(1);
        c3.h.a0(strGroup, "typeSubtype.group(1)");
        Locale locale = Locale.US;
        c3.h.a0(locale, "US");
        c3.h.a0(strGroup.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        String strGroup2 = matcher.group(2);
        c3.h.a0(strGroup2, "typeSubtype.group(2)");
        c3.h.a0(strGroup2.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = t3.u.f4430d.matcher(str);
        int iEnd = matcher.end();
        while (iEnd < str.length()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String strSubstring = str.substring(iEnd);
                c3.h.a0(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb.append(strSubstring);
                sb.append("\" for: \"");
                sb.append(str);
                sb.append('\"');
                throw new IllegalArgumentException(sb.toString().toString());
            }
            String strGroup3 = matcher2.group(1);
            if (strGroup3 == null) {
                iEnd = matcher2.end();
            } else {
                String strGroup4 = matcher2.group(2);
                if (strGroup4 == null) {
                    strGroup4 = matcher2.group(3);
                } else if (q3.l.o3(strGroup4, "'", false) && strGroup4.endsWith("'") && strGroup4.length() > 2) {
                    strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                    c3.h.a0(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(strGroup3);
                arrayList.add(strGroup4);
                iEnd = matcher2.end();
            }
        }
        return new t3.u(str, (String[]) arrayList.toArray(new String[0]));
    }

    public static t3.x s(String str) throws IOException {
        t3.x xVar = t3.x.f4478c;
        if (!c3.h.I(str, "http/1.0")) {
            xVar = t3.x.f4479d;
            if (!c3.h.I(str, "http/1.1")) {
                xVar = t3.x.f4482g;
                if (!c3.h.I(str, "h2_prior_knowledge")) {
                    xVar = t3.x.f4481f;
                    if (!c3.h.I(str, "h2")) {
                        xVar = t3.x.f4480e;
                        if (!c3.h.I(str, "spdy/3.1")) {
                            xVar = t3.x.f4483h;
                            if (!c3.h.I(str, "quic")) {
                                throw new IOException("Unexpected protocol: ".concat(str));
                            }
                        }
                    }
                }
            }
        }
        return xVar;
    }

    public static boolean z(InputConnection inputConnection, Editable editable, int i4, int i5, boolean z4) {
        int iMin;
        Object obj = androidx.emoji2.text.m.f608i;
        if (editable == null || inputConnection == null || i4 < 0 || i5 < 0) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) {
            return false;
        }
        if (z4) {
            int iMax = Math.max(i4, 0);
            int length = editable.length();
            if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                loop0: while (true) {
                    boolean z5 = false;
                    while (true) {
                        if (iMax == 0) {
                            break loop0;
                        }
                        selectionStart--;
                        if (selectionStart < 0) {
                            if (!z5) {
                                selectionStart = 0;
                                break loop0;
                            }
                            break;
                        }
                        char cCharAt = editable.charAt(selectionStart);
                        if (z5) {
                            if (Character.isHighSurrogate(cCharAt)) {
                                iMax--;
                            }
                        } else if (!Character.isSurrogate(cCharAt)) {
                            iMax--;
                        } else if (!Character.isHighSurrogate(cCharAt)) {
                            z5 = true;
                        }
                        selectionStart = -1;
                        break;
                    }
                }
            }
            selectionStart = -1;
            break;
            int iMax2 = Math.max(i5, 0);
            iMin = editable.length();
            if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                loop2: while (true) {
                    boolean z6 = false;
                    while (true) {
                        if (iMax2 != 0) {
                            if (selectionEnd >= iMin) {
                                if (!z6) {
                                    break loop2;
                                }
                                break loop2;
                            }
                            char cCharAt2 = editable.charAt(selectionEnd);
                            if (z6) {
                                if (Character.isLowSurrogate(cCharAt2)) {
                                    iMax2--;
                                    selectionEnd++;
                                }
                            } else if (!Character.isSurrogate(cCharAt2)) {
                                iMax2--;
                                selectionEnd++;
                            } else if (!Character.isLowSurrogate(cCharAt2)) {
                                selectionEnd++;
                                z6 = true;
                            }
                            iMin = -1;
                            break loop2;
                        }
                        iMin = selectionEnd;
                        break loop2;
                    }
                }
            }
            iMin = -1;
            break loop2;
            if (selectionStart == -1 || iMin == -1) {
                return false;
            }
        } else {
            selectionStart = Math.max(selectionStart - i4, 0);
            iMin = Math.min(selectionEnd + i5, editable.length());
        }
        androidx.emoji2.text.z[] zVarArr = (androidx.emoji2.text.z[]) editable.getSpans(selectionStart, iMin, androidx.emoji2.text.z.class);
        if (zVarArr == null || zVarArr.length <= 0) {
            return false;
        }
        for (androidx.emoji2.text.z zVar : zVarArr) {
            int spanStart = editable.getSpanStart(zVar);
            int spanEnd = editable.getSpanEnd(zVar);
            selectionStart = Math.min(spanStart, selectionStart);
            iMin = Math.max(spanEnd, iMin);
        }
        int iMax3 = Math.max(selectionStart, 0);
        int iMin2 = Math.min(iMin, editable.length());
        inputConnection.beginBatchEdit();
        editable.delete(iMax3, iMin2);
        inputConnection.endBatchEdit();
        return true;
    }

    public boolean D(Spannable spannable) {
        return false;
    }

    public InputConnection G(InputConnection inputConnection, EditorInfo editorInfo) {
        return inputConnection;
    }

    public List K(PackageManager packageManager, Intent intent) {
        return Collections.emptyList();
    }

    public void L(boolean z4) {
    }

    public void M(boolean z4) {
    }

    public void N(boolean z4) {
    }

    public void O(boolean z4) {
    }

    public void P() {
    }

    public void Q() {
    }

    @Override // m.b
    public ArrayList a(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
        ArrayList arrayList = new ArrayList(packageInfo.signatures.length);
        for (Signature signature : packageInfo.signatures) {
            byte[] bArrF = r3.q.f(signature);
            if (bArrF == null) {
                return null;
            }
            arrayList.add(bArrF);
        }
        return arrayList;
    }

    @Override // h.b0
    public void b(h.o oVar, boolean z4) {
    }

    @Override // h.b0
    public boolean k(h.o oVar) {
        return false;
    }

    public synchronized t3.g m(String str) {
        t3.g gVar;
        String strConcat;
        try {
            c3.h.b0(str, "javaName");
            LinkedHashMap linkedHashMap = t3.g.f4357d;
            gVar = (t3.g) linkedHashMap.get(str);
            if (gVar == null) {
                if (q3.l.o3(str, "TLS_", false)) {
                    String strSubstring = str.substring(4);
                    c3.h.a0(strSubstring, "this as java.lang.String).substring(startIndex)");
                    strConcat = "SSL_".concat(strSubstring);
                } else if (q3.l.o3(str, "SSL_", false)) {
                    String strSubstring2 = str.substring(4);
                    c3.h.a0(strSubstring2, "this as java.lang.String).substring(startIndex)");
                    strConcat = "TLS_".concat(strSubstring2);
                } else {
                    strConcat = str;
                }
                gVar = (t3.g) linkedHashMap.get(strConcat);
                if (gVar == null) {
                    gVar = new t3.g(str);
                }
                linkedHashMap.put(str, gVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return gVar;
    }

    @Override // w0.d
    public void n() {
        switch (this.f2033b) {
            case 26:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // w0.d
    public void t(int i4, Object obj) {
        String str;
        switch (this.f2033b) {
            case 26:
                break;
            default:
                switch (i4) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i4 == 6 || i4 == 7 || i4 == 8) {
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                } else {
                    Log.d("ProfileInstaller", str);
                }
                break;
        }
    }

    public InputFilter[] u(InputFilter[] inputFilterArr) {
        return inputFilterArr;
    }

    public KeyListener v(KeyListener keyListener) {
        return keyListener;
    }

    public Logger w() {
        switch (this.f2033b) {
            case 16:
                return w3.f.f4915j;
            default:
                return a4.w.f224g;
        }
    }

    public ProviderInfo x(ResolveInfo resolveInfo) {
        throw new IllegalStateException("Unable to get provider info prior to API 19");
    }

    public Signature[] y(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public /* synthetic */ e(int i4) {
        this.f2033b = i4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i4, int i5) {
        this(0);
        this.f2033b = i4;
        switch (i4) {
            case 1:
                this(1);
                break;
            case 2:
                this(2);
                break;
            case 3:
                this(3);
                break;
            case 4:
                this(4);
                break;
            case 5:
                this(5);
                break;
            case 6:
                this(6);
                break;
            case 7:
                this(7);
                break;
            case 8:
                this(8);
                break;
            case 9:
                this(9);
                break;
            case 10:
                this(10);
                break;
            case 11:
                this(11);
                break;
            case 12:
                this(12);
                break;
            case 13:
                this(13);
                break;
            case 14:
                this(14);
                break;
            case 15:
                this(15);
                break;
            case 16:
                this(16);
                break;
            case 17:
                this(17);
                break;
            case 18:
                this(18);
                break;
            case 19:
                this(19);
                break;
            case 20:
                this(20);
                break;
            case 21:
                this(21);
                break;
            case 22:
                this(22);
                break;
            case 23:
                this(23);
                break;
            case 24:
                this(24);
                break;
            case 25:
                this(25);
                break;
            case 26:
                this(26);
                break;
            case 27:
                this(27);
                break;
            case 28:
                this(28);
                break;
            case 29:
                this(29);
                break;
            default:
                break;
        }
    }
}
