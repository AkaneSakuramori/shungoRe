package m2;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes.dex */
public final class j extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3448a;

    public /* synthetic */ j(int i4) {
        this.f3448a = i4;
    }

    public static q f(t2.b bVar) throws t2.d {
        if (bVar instanceof p2.g) {
            p2.g gVar = (p2.g) bVar;
            int iT = gVar.T();
            if (iT != 5 && iT != 2 && iT != 4 && iT != 10) {
                q qVar = (q) gVar.c0();
                gVar.Y();
                return qVar;
            }
            throw new IllegalStateException("Unexpected " + defpackage.a.s(iT) + " when reading a JsonElement.");
        }
        int iA = p.h.a(bVar.T());
        s sVar = s.f3475b;
        if (iA == 0) {
            o oVar = new o();
            bVar.a();
            while (bVar.G()) {
                q qVarF = f(bVar);
                if (qVarF == null) {
                    qVarF = sVar;
                }
                oVar.f3474b.add(qVarF);
            }
            bVar.x();
            return oVar;
        }
        if (iA != 2) {
            if (iA == 5) {
                return new u(bVar.R());
            }
            if (iA == 6) {
                return new u(new o2.h(bVar.R()));
            }
            if (iA == 7) {
                return new u(Boolean.valueOf(bVar.J()));
            }
            if (iA != 8) {
                throw new IllegalArgumentException();
            }
            bVar.P();
            return sVar;
        }
        t tVar = new t();
        bVar.e();
        while (bVar.G()) {
            String strN = bVar.N();
            q qVarF2 = f(bVar);
            if (qVarF2 == null) {
                qVarF2 = sVar;
            }
            tVar.f3476b.put(strN, qVarF2);
        }
        bVar.z();
        return tVar;
    }

    public static void g(q qVar, t2.c cVar) throws IOException {
        if (qVar == null || (qVar instanceof s)) {
            cVar.G();
            return;
        }
        boolean z4 = qVar instanceof u;
        if (z4) {
            if (!z4) {
                throw new IllegalStateException("Not a JSON Primitive: " + qVar);
            }
            u uVar = (u) qVar;
            Serializable serializable = uVar.f3477b;
            if (serializable instanceof Number) {
                cVar.L(uVar.c());
                return;
            } else if (serializable instanceof Boolean) {
                cVar.N(uVar.b());
                return;
            } else {
                cVar.M(uVar.d());
                return;
            }
        }
        boolean z5 = qVar instanceof o;
        if (z5) {
            cVar.e();
            if (!z5) {
                throw new IllegalStateException("Not a JSON Array: " + qVar);
            }
            Iterator it = ((o) qVar).f3474b.iterator();
            while (it.hasNext()) {
                g((q) it.next(), cVar);
            }
            cVar.x();
            return;
        }
        if (!(qVar instanceof t)) {
            throw new IllegalArgumentException("Couldn't write " + qVar.getClass());
        }
        cVar.h();
        Iterator it2 = ((o2.j) qVar.a().f3476b.entrySet()).iterator();
        while (((o2.k) it2).hasNext()) {
            Map.Entry entry = (Map.Entry) ((o2.i) it2).next();
            cVar.C((String) entry.getKey());
            g((q) entry.getValue(), cVar);
        }
        cVar.z();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0083  */
    @Override // m2.b0
    public final Object b(t2.b bVar) throws t2.d {
        int i4 = 0;
        switch (this.f3448a) {
            case 0:
                return e(bVar);
            case 1:
                ArrayList arrayList = new ArrayList();
                bVar.a();
                while (bVar.G()) {
                    try {
                        arrayList.add(Integer.valueOf(bVar.L()));
                    } catch (NumberFormatException e5) {
                        throw new r(e5);
                    }
                }
                bVar.x();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                while (i4 < size) {
                    atomicIntegerArray.set(i4, ((Integer) arrayList.get(i4)).intValue());
                    i4++;
                }
                return atomicIntegerArray;
            case 2:
                return e(bVar);
            case 3:
                return e(bVar);
            case 4:
                return e(bVar);
            case 5:
                if (bVar.T() == 9) {
                    bVar.P();
                    return null;
                }
                String strR = bVar.R();
                if (strR.length() == 1) {
                    return Character.valueOf(strR.charAt(0));
                }
                throw new r("Expecting character, got: ".concat(strR));
            case 6:
                int iT = bVar.T();
                if (iT != 9) {
                    return iT == 8 ? Boolean.toString(bVar.J()) : bVar.R();
                }
                bVar.P();
                return null;
            case 7:
                if (bVar.T() == 9) {
                    bVar.P();
                    return null;
                }
                try {
                    return new BigDecimal(bVar.R());
                } catch (NumberFormatException e6) {
                    throw new r(e6);
                }
            case 8:
                if (bVar.T() == 9) {
                    bVar.P();
                    return null;
                }
                try {
                    return new BigInteger(bVar.R());
                } catch (NumberFormatException e7) {
                    throw new r(e7);
                }
            case 9:
                if (bVar.T() != 9) {
                    return new StringBuilder(bVar.R());
                }
                bVar.P();
                return null;
            case 10:
                if (bVar.T() != 9) {
                    return new StringBuffer(bVar.R());
                }
                bVar.P();
                return null;
            case 11:
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            case 12:
                if (bVar.T() == 9) {
                    bVar.P();
                    return null;
                }
                String strR2 = bVar.R();
                if ("null".equals(strR2)) {
                    return null;
                }
                return new URL(strR2);
            case 13:
                if (bVar.T() == 9) {
                    bVar.P();
                    return null;
                }
                try {
                    String strR3 = bVar.R();
                    if ("null".equals(strR3)) {
                        return null;
                    }
                    return new URI(strR3);
                } catch (URISyntaxException e8) {
                    throw new r(e8);
                }
            case 14:
                if (bVar.T() != 9) {
                    return InetAddress.getByName(bVar.R());
                }
                bVar.P();
                return null;
            case 15:
                if (bVar.T() != 9) {
                    return UUID.fromString(bVar.R());
                }
                bVar.P();
                return null;
            case 16:
                return Currency.getInstance(bVar.R());
            case 17:
                if (bVar.T() == 9) {
                    bVar.P();
                    return null;
                }
                bVar.e();
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                while (bVar.T() != 4) {
                    String strN = bVar.N();
                    int iL = bVar.L();
                    if ("year".equals(strN)) {
                        i5 = iL;
                    } else if ("month".equals(strN)) {
                        i6 = iL;
                    } else if ("dayOfMonth".equals(strN)) {
                        i7 = iL;
                    } else if ("hourOfDay".equals(strN)) {
                        i8 = iL;
                    } else if ("minute".equals(strN)) {
                        i9 = iL;
                    } else if ("second".equals(strN)) {
                        i10 = iL;
                    }
                }
                bVar.z();
                return new GregorianCalendar(i5, i6, i7, i8, i9, i10);
            case 18:
                if (bVar.T() == 9) {
                    bVar.P();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(bVar.R(), "_");
                String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (strNextToken2 == null && strNextToken3 == null) {
                    return new Locale(strNextToken);
                }
                return strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
            case 19:
                return f(bVar);
            case 20:
                BitSet bitSet = new BitSet();
                bVar.a();
                int iT2 = bVar.T();
                while (iT2 != 2) {
                    int iA = p.h.a(iT2);
                    if (iA == 5) {
                        String strR4 = bVar.R();
                        try {
                            if (Integer.parseInt(strR4) != 0) {
                                bitSet.set(i4);
                            }
                        } catch (NumberFormatException unused) {
                            throw new r("Error: Expecting: bitset number value (1, 0), Found: " + strR4);
                        }
                    } else if (iA != 6) {
                        if (iA != 7) {
                            throw new r("Invalid bitset value type: ".concat(defpackage.a.s(iT2)));
                        }
                        if (bVar.J()) {
                            bitSet.set(i4);
                        }
                    } else if (bVar.L() != 0) {
                        bitSet.set(i4);
                    }
                    i4++;
                    iT2 = bVar.T();
                }
                bVar.x();
                return bitSet;
            case 21:
                return d(bVar);
            case 22:
                return d(bVar);
            case 23:
                return e(bVar);
            case 24:
                return e(bVar);
            case 25:
                return e(bVar);
            case 26:
                try {
                    return new AtomicInteger(bVar.L());
                } catch (NumberFormatException e9) {
                    throw new r(e9);
                }
            default:
                return new AtomicBoolean(bVar.J());
        }
    }

    @Override // m2.b0
    public final void c(t2.c cVar, Object obj) {
        int i4 = this.f3448a;
        int i5 = 0;
        switch (i4) {
            case 0:
                h(cVar, (Number) obj);
                return;
            case 1:
                AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
                cVar.e();
                int length = atomicIntegerArray.length();
                while (i5 < length) {
                    cVar.J(atomicIntegerArray.get(i5));
                    i5++;
                }
                cVar.x();
                return;
            case 2:
                h(cVar, (Number) obj);
                return;
            case 3:
                h(cVar, (Number) obj);
                return;
            case 4:
                h(cVar, (Number) obj);
                return;
            case 5:
                Character ch = (Character) obj;
                cVar.M(ch != null ? String.valueOf(ch) : null);
                return;
            case 6:
                cVar.M((String) obj);
                return;
            case 7:
                cVar.L((BigDecimal) obj);
                return;
            case 8:
                cVar.L((BigInteger) obj);
                return;
            case 9:
                StringBuilder sb = (StringBuilder) obj;
                cVar.M(sb != null ? sb.toString() : null);
                return;
            case 10:
                StringBuffer stringBuffer = (StringBuffer) obj;
                cVar.M(stringBuffer != null ? stringBuffer.toString() : null);
                return;
            case 11:
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?");
            case 12:
                URL url = (URL) obj;
                cVar.M(url != null ? url.toExternalForm() : null);
                return;
            case 13:
                URI uri = (URI) obj;
                cVar.M(uri != null ? uri.toASCIIString() : null);
                return;
            case 14:
                InetAddress inetAddress = (InetAddress) obj;
                cVar.M(inetAddress != null ? inetAddress.getHostAddress() : null);
                return;
            case 15:
                UUID uuid = (UUID) obj;
                cVar.M(uuid != null ? uuid.toString() : null);
                return;
            case 16:
                cVar.M(((Currency) obj).getCurrencyCode());
                return;
            case 17:
                Calendar calendar = (Calendar) obj;
                if (calendar == null) {
                    cVar.G();
                    return;
                }
                cVar.h();
                cVar.C("year");
                cVar.J(calendar.get(1));
                cVar.C("month");
                cVar.J(calendar.get(2));
                cVar.C("dayOfMonth");
                cVar.J(calendar.get(5));
                cVar.C("hourOfDay");
                cVar.J(calendar.get(11));
                cVar.C("minute");
                cVar.J(calendar.get(12));
                cVar.C("second");
                cVar.J(calendar.get(13));
                cVar.z();
                return;
            case 18:
                Locale locale = (Locale) obj;
                cVar.M(locale != null ? locale.toString() : null);
                return;
            case 19:
                g((q) obj, cVar);
                return;
            case 20:
                BitSet bitSet = (BitSet) obj;
                cVar.e();
                int length2 = bitSet.length();
                while (i5 < length2) {
                    cVar.J(bitSet.get(i5) ? 1L : 0L);
                    i5++;
                }
                cVar.x();
                return;
            case 21:
                Boolean bool = (Boolean) obj;
                switch (i4) {
                    case 21:
                        cVar.K(bool);
                        return;
                    default:
                        cVar.M(bool != null ? bool.toString() : "null");
                        return;
                }
            case 22:
                Boolean bool2 = (Boolean) obj;
                switch (i4) {
                    case 21:
                        cVar.K(bool2);
                        return;
                    default:
                        cVar.M(bool2 != null ? bool2.toString() : "null");
                        return;
                }
            case 23:
                h(cVar, (Number) obj);
                return;
            case 24:
                h(cVar, (Number) obj);
                return;
            case 25:
                h(cVar, (Number) obj);
                return;
            case 26:
                cVar.J(((AtomicInteger) obj).get());
                return;
            default:
                cVar.N(((AtomicBoolean) obj).get());
                return;
        }
    }

    public final Boolean d(t2.b bVar) {
        switch (this.f3448a) {
            case 21:
                int iT = bVar.T();
                if (iT != 9) {
                    return iT == 6 ? Boolean.valueOf(Boolean.parseBoolean(bVar.R())) : Boolean.valueOf(bVar.J());
                }
                bVar.P();
                return null;
            default:
                if (bVar.T() != 9) {
                    return Boolean.valueOf(bVar.R());
                }
                bVar.P();
                return null;
        }
    }

    public final Number e(t2.b bVar) {
        switch (this.f3448a) {
            case 0:
                if (bVar.T() != 9) {
                    return Long.valueOf(bVar.M());
                }
                bVar.P();
                return null;
            case 2:
                if (bVar.T() == 9) {
                    bVar.P();
                    return null;
                }
                try {
                    return Long.valueOf(bVar.M());
                } catch (NumberFormatException e5) {
                    throw new r(e5);
                }
            case 3:
                if (bVar.T() != 9) {
                    return Float.valueOf((float) bVar.K());
                }
                bVar.P();
                return null;
            case 4:
                if (bVar.T() != 9) {
                    return Double.valueOf(bVar.K());
                }
                bVar.P();
                return null;
            case 23:
                if (bVar.T() == 9) {
                    bVar.P();
                    return null;
                }
                try {
                    return Byte.valueOf((byte) bVar.L());
                } catch (NumberFormatException e6) {
                    throw new r(e6);
                }
            case 24:
                if (bVar.T() == 9) {
                    bVar.P();
                    return null;
                }
                try {
                    return Short.valueOf((short) bVar.L());
                } catch (NumberFormatException e7) {
                    throw new r(e7);
                }
            default:
                if (bVar.T() == 9) {
                    bVar.P();
                    return null;
                }
                try {
                    return Integer.valueOf(bVar.L());
                } catch (NumberFormatException e8) {
                    throw new r(e8);
                }
        }
    }

    public final void h(t2.c cVar, Number number) throws IOException {
        switch (this.f3448a) {
            case 0:
                if (number != null) {
                    cVar.M(number.toString());
                } else {
                    cVar.G();
                }
                break;
            case 2:
                cVar.L(number);
                break;
            case 3:
                cVar.L(number);
                break;
            case 4:
                cVar.L(number);
                break;
            case 23:
                cVar.L(number);
                break;
            case 24:
                cVar.L(number);
                break;
            default:
                cVar.L(number);
                break;
        }
    }
}
