package y3;

import f4.p;
import i.w;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.ProtocolException;
import t3.a0;
import t3.b0;
import t3.c0;
import t3.d0;
import t3.n;
import t3.q;
import t3.t;
import t3.z;
import x3.j;
import x3.l;

/* JADX INFO: loaded from: classes.dex */
public final class b implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5413a;

    public b(boolean z4) {
        this.f5413a = z4;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x019f A[Catch: IOException -> 0x019c, TryCatch #13 {IOException -> 0x019c, blocks: (B:93:0x0187, B:97:0x018f, B:101:0x01ad, B:103:0x01bd, B:110:0x01d6, B:112:0x01da, B:116:0x01e7, B:118:0x01fc, B:120:0x0206, B:121:0x0210, B:105:0x01c7, B:100:0x019f), top: B:154:0x0187 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x01bd A[Catch: IOException -> 0x019c, TryCatch #13 {IOException -> 0x019c, blocks: (B:93:0x0187, B:97:0x018f, B:101:0x01ad, B:103:0x01bd, B:110:0x01d6, B:112:0x01da, B:116:0x01e7, B:118:0x01fc, B:120:0x0206, B:121:0x0210, B:105:0x01c7, B:100:0x019f), top: B:154:0x0187 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x01c7 A[Catch: IOException -> 0x019c, TryCatch #13 {IOException -> 0x019c, blocks: (B:93:0x0187, B:97:0x018f, B:101:0x01ad, B:103:0x01bd, B:110:0x01d6, B:112:0x01da, B:116:0x01e7, B:118:0x01fc, B:120:0x0206, B:121:0x0210, B:105:0x01c7, B:100:0x019f), top: B:154:0x0187 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d6 A[Catch: IOException -> 0x019c, TryCatch #13 {IOException -> 0x019c, blocks: (B:93:0x0187, B:97:0x018f, B:101:0x01ad, B:103:0x01bd, B:110:0x01d6, B:112:0x01da, B:116:0x01e7, B:118:0x01fc, B:120:0x0206, B:121:0x0210, B:105:0x01c7, B:100:0x019f), top: B:154:0x0187 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x01da A[Catch: IOException -> 0x019c, TryCatch #13 {IOException -> 0x019c, blocks: (B:93:0x0187, B:97:0x018f, B:101:0x01ad, B:103:0x01bd, B:110:0x01d6, B:112:0x01da, B:116:0x01e7, B:118:0x01fc, B:120:0x0206, B:121:0x0210, B:105:0x01c7, B:100:0x019f), top: B:154:0x0187 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x01df  */
    /* JADX WARN: Code duplicated, block: B:116:0x01e7 A[Catch: IOException -> 0x019c, TryCatch #13 {IOException -> 0x019c, blocks: (B:93:0x0187, B:97:0x018f, B:101:0x01ad, B:103:0x01bd, B:110:0x01d6, B:112:0x01da, B:116:0x01e7, B:118:0x01fc, B:120:0x0206, B:121:0x0210, B:105:0x01c7, B:100:0x019f), top: B:154:0x0187 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x01fc A[Catch: IOException -> 0x019c, TryCatch #13 {IOException -> 0x019c, blocks: (B:93:0x0187, B:97:0x018f, B:101:0x01ad, B:103:0x01bd, B:110:0x01d6, B:112:0x01da, B:116:0x01e7, B:118:0x01fc, B:120:0x0206, B:121:0x0210, B:105:0x01c7, B:100:0x019f), top: B:154:0x0187 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0205  */
    /* JADX WARN: Code duplicated, block: B:124:0x0214  */
    /* JADX WARN: Code duplicated, block: B:126:0x0218  */
    /* JADX WARN: Code duplicated, block: B:127:0x0219  */
    /* JADX WARN: Code duplicated, block: B:129:0x021c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0113  */
    /* JADX WARN: Code duplicated, block: B:69:0x0117  */
    /* JADX WARN: Code duplicated, block: B:71:0x011b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0125 A[Catch: IOException -> 0x0136, TryCatch #4 {IOException -> 0x0136, blocks: (B:72:0x011c, B:74:0x0125, B:79:0x0138, B:87:0x015c, B:89:0x0165, B:90:0x016b, B:91:0x017f), top: B:138:0x011c }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0133 A[PHI: r16
      0x0133: PHI (r16v3 t3.a0) = (r16v2 t3.a0), (r16v4 t3.a0) binds: [B:70:0x0119, B:73:0x0123] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x0151  */
    /* JADX WARN: Code duplicated, block: B:82:0x0153  */
    /* JADX WARN: Code duplicated, block: B:89:0x0165 A[Catch: IOException -> 0x0136, TryCatch #4 {IOException -> 0x0136, blocks: (B:72:0x011c, B:74:0x0125, B:79:0x0138, B:87:0x015c, B:89:0x0165, B:90:0x016b, B:91:0x017f), top: B:138:0x011c }] */
    /* JADX WARN: Code duplicated, block: B:95:0x018b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // t3.t
    public final b0 a(f fVar) throws IllegalAccessException, IOException, InvocationTargetException {
        ?? r13;
        a0 a0VarC;
        String str;
        ?? r15;
        IOException iOException;
        a0 a0Var;
        ?? r16;
        ?? r4;
        b0 b0VarA;
        int i4;
        b0 b0VarA2;
        d0 d0Var;
        long j4;
        d0 d0Var2;
        Long lValueOf;
        IOException iOException2;
        a0 a0VarC2;
        boolean z4;
        boolean z5;
        ?? r5 = "HTTP ";
        x3.e eVar = fVar.f5418d;
        c3.h.X(eVar);
        d dVar = eVar.f4951d;
        n nVar = eVar.f4949b;
        j jVar = eVar.f4948a;
        l lVar = eVar.f4954g;
        w wVar = fVar.f5419e;
        z zVar = (z) wVar.f2811e;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                nVar.getClass();
                c3.h.b0(jVar, "call");
                dVar.g(wVar);
                try {
                    if (!c3.h.T1((String) wVar.f2809c) || zVar == null) {
                        str = "HTTP ";
                        iOException2 = null;
                        jVar.h(eVar, true, false, null);
                        r13 = 1;
                        a0VarC = null;
                    } else {
                        try {
                            try {
                                if (q3.l.U2("100-continue", ((q) wVar.f2810d).a("Expect"))) {
                                    try {
                                        dVar.b();
                                        a0VarC2 = eVar.c(true);
                                        try {
                                            nVar.getClass();
                                            c3.h.b0(jVar, "call");
                                            z4 = false;
                                        } catch (IOException e5) {
                                            e = e5;
                                            str = "HTTP ";
                                            a0VarC = a0VarC2;
                                            r13 = 1;
                                            if (e instanceof a4.a) {
                                                throw e;
                                            }
                                            if (!eVar.f4953f) {
                                                throw e;
                                            }
                                            r15 = r13;
                                            iOException = e;
                                            if (a0VarC != null) {
                                                a0Var = a0VarC;
                                                r16 = r15;
                                                a0Var.f4293a = wVar;
                                                a0Var.f4297e = lVar.f4992e;
                                                a0Var.f4303k = jCurrentTimeMillis;
                                                r4 = r16;
                                                a0Var.f4304l = System.currentTimeMillis();
                                                b0VarA = a0Var.a();
                                                i4 = b0VarA.f4310e;
                                                if (i4 != 100) {
                                                    a0 a0VarC3 = eVar.c(false);
                                                    c3.h.X(a0VarC3);
                                                    if (r4 != 0) {
                                                        nVar.getClass();
                                                        c3.h.b0(jVar, "call");
                                                    }
                                                    a0VarC3.f4293a = wVar;
                                                    a0VarC3.f4297e = lVar.f4992e;
                                                    a0VarC3.f4303k = jCurrentTimeMillis;
                                                    a0VarC3.f4304l = System.currentTimeMillis();
                                                    b0VarA = a0VarC3.a();
                                                    i4 = b0VarA.f4310e;
                                                } else {
                                                    a0 a0VarC4 = eVar.c(false);
                                                    c3.h.X(a0VarC4);
                                                    if (r4 != 0) {
                                                        nVar.getClass();
                                                        c3.h.b0(jVar, "call");
                                                    }
                                                    a0VarC4.f4293a = wVar;
                                                    a0VarC4.f4297e = lVar.f4992e;
                                                    a0VarC4.f4303k = jCurrentTimeMillis;
                                                    a0VarC4.f4304l = System.currentTimeMillis();
                                                    b0VarA = a0VarC4.a();
                                                    i4 = b0VarA.f4310e;
                                                }
                                                nVar.getClass();
                                                c3.h.b0(jVar, "call");
                                                if (this.f5413a) {
                                                    a0 a0VarE = b0VarA.e();
                                                    a0VarE.f4299g = eVar.b(b0VarA);
                                                    b0VarA2 = a0VarE.a();
                                                } else {
                                                    a0 a0VarE2 = b0VarA.e();
                                                    a0VarE2.f4299g = eVar.b(b0VarA);
                                                    b0VarA2 = a0VarE2.a();
                                                }
                                                if (q3.l.U2("close", ((q) b0VarA2.f4307b.f2810d).a("Connection"))) {
                                                    dVar.h().k();
                                                } else {
                                                    dVar.h().k();
                                                }
                                                if (i4 != 204) {
                                                    d0Var = b0VarA2.f4313h;
                                                    if (d0Var != null) {
                                                        j4 = ((c0) d0Var).f4335c;
                                                    } else {
                                                        j4 = -1;
                                                    }
                                                    if (j4 > 0) {
                                                        StringBuilder sb = new StringBuilder(str);
                                                        sb.append(i4);
                                                        sb.append(" had non-zero Content-Length: ");
                                                        d0Var2 = b0VarA2.f4313h;
                                                        if (d0Var2 != null) {
                                                            lValueOf = Long.valueOf(((c0) d0Var2).f4335c);
                                                        } else {
                                                            lValueOf = null;
                                                        }
                                                        sb.append(lValueOf);
                                                        throw new ProtocolException(sb.toString());
                                                    }
                                                } else {
                                                    d0Var = b0VarA2.f4313h;
                                                    if (d0Var != null) {
                                                        j4 = ((c0) d0Var).f4335c;
                                                    } else {
                                                        j4 = -1;
                                                    }
                                                    if (j4 > 0) {
                                                        StringBuilder sb2 = new StringBuilder(str);
                                                        sb2.append(i4);
                                                        sb2.append(" had non-zero Content-Length: ");
                                                        d0Var2 = b0VarA2.f4313h;
                                                        if (d0Var2 != null) {
                                                            lValueOf = Long.valueOf(((c0) d0Var2).f4335c);
                                                        } else {
                                                            lValueOf = null;
                                                        }
                                                        sb2.append(lValueOf);
                                                        throw new ProtocolException(sb2.toString());
                                                    }
                                                }
                                                return b0VarA2;
                                            }
                                            try {
                                                a0VarC = eVar.c(false);
                                                c3.h.X(a0VarC);
                                                if (r15 != 0) {
                                                    nVar.getClass();
                                                    c3.h.b0(jVar, "call");
                                                    a0Var = a0VarC;
                                                    r16 = 0;
                                                } else {
                                                    a0Var = a0VarC;
                                                    r16 = r15;
                                                }
                                                a0Var.f4293a = wVar;
                                                a0Var.f4297e = lVar.f4992e;
                                                a0Var.f4303k = jCurrentTimeMillis;
                                                r4 = r16;
                                                a0Var.f4304l = System.currentTimeMillis();
                                                b0VarA = a0Var.a();
                                                i4 = b0VarA.f4310e;
                                                if (i4 != 100) {
                                                    a0 a0VarC5 = eVar.c(false);
                                                    c3.h.X(a0VarC5);
                                                    if (r4 != 0) {
                                                        nVar.getClass();
                                                        c3.h.b0(jVar, "call");
                                                    }
                                                    a0VarC5.f4293a = wVar;
                                                    a0VarC5.f4297e = lVar.f4992e;
                                                    a0VarC5.f4303k = jCurrentTimeMillis;
                                                    a0VarC5.f4304l = System.currentTimeMillis();
                                                    b0VarA = a0VarC5.a();
                                                    i4 = b0VarA.f4310e;
                                                } else {
                                                    a0 a0VarC6 = eVar.c(false);
                                                    c3.h.X(a0VarC6);
                                                    if (r4 != 0) {
                                                        nVar.getClass();
                                                        c3.h.b0(jVar, "call");
                                                    }
                                                    a0VarC6.f4293a = wVar;
                                                    a0VarC6.f4297e = lVar.f4992e;
                                                    a0VarC6.f4303k = jCurrentTimeMillis;
                                                    a0VarC6.f4304l = System.currentTimeMillis();
                                                    b0VarA = a0VarC6.a();
                                                    i4 = b0VarA.f4310e;
                                                }
                                                nVar.getClass();
                                                c3.h.b0(jVar, "call");
                                                try {
                                                    if (this.f5413a) {
                                                        a0 a0VarE3 = b0VarA.e();
                                                        a0VarE3.f4299g = eVar.b(b0VarA);
                                                        b0VarA2 = a0VarE3.a();
                                                    } else {
                                                        a0 a0VarE4 = b0VarA.e();
                                                        a0VarE4.f4299g = eVar.b(b0VarA);
                                                        b0VarA2 = a0VarE4.a();
                                                    }
                                                    if (q3.l.U2("close", ((q) b0VarA2.f4307b.f2810d).a("Connection"))) {
                                                        dVar.h().k();
                                                    } else {
                                                        dVar.h().k();
                                                    }
                                                    if (i4 != 204) {
                                                        d0Var = b0VarA2.f4313h;
                                                        if (d0Var != null) {
                                                            j4 = ((c0) d0Var).f4335c;
                                                        } else {
                                                            j4 = -1;
                                                        }
                                                        if (j4 > 0) {
                                                            StringBuilder sb3 = new StringBuilder(str);
                                                            sb3.append(i4);
                                                            sb3.append(" had non-zero Content-Length: ");
                                                            d0Var2 = b0VarA2.f4313h;
                                                            if (d0Var2 != null) {
                                                                lValueOf = Long.valueOf(((c0) d0Var2).f4335c);
                                                            } else {
                                                                lValueOf = null;
                                                            }
                                                            sb3.append(lValueOf);
                                                            throw new ProtocolException(sb3.toString());
                                                        }
                                                    } else {
                                                        d0Var = b0VarA2.f4313h;
                                                        if (d0Var != null) {
                                                            j4 = ((c0) d0Var).f4335c;
                                                        } else {
                                                            j4 = -1;
                                                        }
                                                        if (j4 > 0) {
                                                            StringBuilder sb4 = new StringBuilder(str);
                                                            sb4.append(i4);
                                                            sb4.append(" had non-zero Content-Length: ");
                                                            d0Var2 = b0VarA2.f4313h;
                                                            if (d0Var2 != null) {
                                                                lValueOf = Long.valueOf(((c0) d0Var2).f4335c);
                                                            } else {
                                                                lValueOf = null;
                                                            }
                                                            sb4.append(lValueOf);
                                                            throw new ProtocolException(sb4.toString());
                                                        }
                                                    }
                                                    return b0VarA2;
                                                } catch (IOException e6) {
                                                    e = e6;
                                                }
                                            } catch (IOException e7) {
                                                e = e7;
                                            }
                                            if (iOException != null) {
                                                throw e;
                                            }
                                            c3.h.F(iOException, e);
                                            throw iOException;
                                        }
                                    } catch (IOException e8) {
                                        nVar.getClass();
                                        c3.h.b0(jVar, "call");
                                        eVar.d(e8);
                                        throw e8;
                                    }
                                } else {
                                    z4 = true;
                                    a0VarC2 = null;
                                }
                                try {
                                    if (a0VarC2 == null) {
                                        try {
                                            eVar.f4952e = false;
                                            z zVar2 = (z) wVar.f2811e;
                                            c3.h.X(zVar2);
                                            z5 = z4;
                                            a0VarC = a0VarC2;
                                            long j5 = zVar2.f4492b;
                                            try {
                                                nVar.getClass();
                                                c3.h.b0(jVar, "call");
                                                str = "HTTP ";
                                                p pVar = new p(new x3.c(eVar, dVar.c(wVar, j5), j5));
                                                pVar.e(zVar.f4493c, zVar.f4494d, zVar.f4492b);
                                                pVar.close();
                                            } catch (IOException e9) {
                                                e = e9;
                                                str = "HTTP ";
                                                r13 = z5;
                                                if (e instanceof a4.a) {
                                                    throw e;
                                                }
                                                if (!eVar.f4953f) {
                                                    throw e;
                                                }
                                                r15 = r13;
                                                iOException = e;
                                                if (a0VarC != null) {
                                                    a0Var = a0VarC;
                                                    r16 = r15;
                                                    a0Var.f4293a = wVar;
                                                    a0Var.f4297e = lVar.f4992e;
                                                    a0Var.f4303k = jCurrentTimeMillis;
                                                    r4 = r16;
                                                    a0Var.f4304l = System.currentTimeMillis();
                                                    b0VarA = a0Var.a();
                                                    i4 = b0VarA.f4310e;
                                                    if (i4 != 100) {
                                                        a0 a0VarC7 = eVar.c(false);
                                                        c3.h.X(a0VarC7);
                                                        if (r4 != 0) {
                                                            nVar.getClass();
                                                            c3.h.b0(jVar, "call");
                                                        }
                                                        a0VarC7.f4293a = wVar;
                                                        a0VarC7.f4297e = lVar.f4992e;
                                                        a0VarC7.f4303k = jCurrentTimeMillis;
                                                        a0VarC7.f4304l = System.currentTimeMillis();
                                                        b0VarA = a0VarC7.a();
                                                        i4 = b0VarA.f4310e;
                                                    } else {
                                                        a0 a0VarC8 = eVar.c(false);
                                                        c3.h.X(a0VarC8);
                                                        if (r4 != 0) {
                                                            nVar.getClass();
                                                            c3.h.b0(jVar, "call");
                                                        }
                                                        a0VarC8.f4293a = wVar;
                                                        a0VarC8.f4297e = lVar.f4992e;
                                                        a0VarC8.f4303k = jCurrentTimeMillis;
                                                        a0VarC8.f4304l = System.currentTimeMillis();
                                                        b0VarA = a0VarC8.a();
                                                        i4 = b0VarA.f4310e;
                                                    }
                                                    nVar.getClass();
                                                    c3.h.b0(jVar, "call");
                                                    if (this.f5413a) {
                                                        a0 a0VarE5 = b0VarA.e();
                                                        a0VarE5.f4299g = eVar.b(b0VarA);
                                                        b0VarA2 = a0VarE5.a();
                                                    } else {
                                                        a0 a0VarE6 = b0VarA.e();
                                                        a0VarE6.f4299g = eVar.b(b0VarA);
                                                        b0VarA2 = a0VarE6.a();
                                                    }
                                                    if (q3.l.U2("close", ((q) b0VarA2.f4307b.f2810d).a("Connection"))) {
                                                        dVar.h().k();
                                                    } else {
                                                        dVar.h().k();
                                                    }
                                                    if (i4 != 204) {
                                                        d0Var = b0VarA2.f4313h;
                                                        if (d0Var != null) {
                                                            j4 = ((c0) d0Var).f4335c;
                                                        } else {
                                                            j4 = -1;
                                                        }
                                                        if (j4 > 0) {
                                                            StringBuilder sb5 = new StringBuilder(str);
                                                            sb5.append(i4);
                                                            sb5.append(" had non-zero Content-Length: ");
                                                            d0Var2 = b0VarA2.f4313h;
                                                            if (d0Var2 != null) {
                                                                lValueOf = Long.valueOf(((c0) d0Var2).f4335c);
                                                            } else {
                                                                lValueOf = null;
                                                            }
                                                            sb5.append(lValueOf);
                                                            throw new ProtocolException(sb5.toString());
                                                        }
                                                    } else {
                                                        d0Var = b0VarA2.f4313h;
                                                        if (d0Var != null) {
                                                            j4 = ((c0) d0Var).f4335c;
                                                        } else {
                                                            j4 = -1;
                                                        }
                                                        if (j4 > 0) {
                                                            StringBuilder sb6 = new StringBuilder(str);
                                                            sb6.append(i4);
                                                            sb6.append(" had non-zero Content-Length: ");
                                                            d0Var2 = b0VarA2.f4313h;
                                                            if (d0Var2 != null) {
                                                                lValueOf = Long.valueOf(((c0) d0Var2).f4335c);
                                                            } else {
                                                                lValueOf = null;
                                                            }
                                                            sb6.append(lValueOf);
                                                            throw new ProtocolException(sb6.toString());
                                                        }
                                                    }
                                                    return b0VarA2;
                                                }
                                                a0VarC = eVar.c(false);
                                                c3.h.X(a0VarC);
                                                if (r15 != 0) {
                                                    nVar.getClass();
                                                    c3.h.b0(jVar, "call");
                                                    a0Var = a0VarC;
                                                    r16 = 0;
                                                } else {
                                                    a0Var = a0VarC;
                                                    r16 = r15;
                                                }
                                                a0Var.f4293a = wVar;
                                                a0Var.f4297e = lVar.f4992e;
                                                a0Var.f4303k = jCurrentTimeMillis;
                                                r4 = r16;
                                                a0Var.f4304l = System.currentTimeMillis();
                                                b0VarA = a0Var.a();
                                                i4 = b0VarA.f4310e;
                                                if (i4 != 100) {
                                                    a0 a0VarC9 = eVar.c(false);
                                                    c3.h.X(a0VarC9);
                                                    if (r4 != 0) {
                                                        nVar.getClass();
                                                        c3.h.b0(jVar, "call");
                                                    }
                                                    a0VarC9.f4293a = wVar;
                                                    a0VarC9.f4297e = lVar.f4992e;
                                                    a0VarC9.f4303k = jCurrentTimeMillis;
                                                    a0VarC9.f4304l = System.currentTimeMillis();
                                                    b0VarA = a0VarC9.a();
                                                    i4 = b0VarA.f4310e;
                                                } else {
                                                    a0 a0VarC10 = eVar.c(false);
                                                    c3.h.X(a0VarC10);
                                                    if (r4 != 0) {
                                                        nVar.getClass();
                                                        c3.h.b0(jVar, "call");
                                                    }
                                                    a0VarC10.f4293a = wVar;
                                                    a0VarC10.f4297e = lVar.f4992e;
                                                    a0VarC10.f4303k = jCurrentTimeMillis;
                                                    a0VarC10.f4304l = System.currentTimeMillis();
                                                    b0VarA = a0VarC10.a();
                                                    i4 = b0VarA.f4310e;
                                                }
                                                nVar.getClass();
                                                c3.h.b0(jVar, "call");
                                                if (this.f5413a) {
                                                    a0 a0VarE7 = b0VarA.e();
                                                    a0VarE7.f4299g = eVar.b(b0VarA);
                                                    b0VarA2 = a0VarE7.a();
                                                } else {
                                                    a0 a0VarE8 = b0VarA.e();
                                                    a0VarE8.f4299g = eVar.b(b0VarA);
                                                    b0VarA2 = a0VarE8.a();
                                                }
                                                if (q3.l.U2("close", ((q) b0VarA2.f4307b.f2810d).a("Connection"))) {
                                                    dVar.h().k();
                                                } else {
                                                    dVar.h().k();
                                                }
                                                if (i4 != 204) {
                                                    d0Var = b0VarA2.f4313h;
                                                    if (d0Var != null) {
                                                        j4 = ((c0) d0Var).f4335c;
                                                    } else {
                                                        j4 = -1;
                                                    }
                                                    if (j4 > 0) {
                                                        StringBuilder sb7 = new StringBuilder(str);
                                                        sb7.append(i4);
                                                        sb7.append(" had non-zero Content-Length: ");
                                                        d0Var2 = b0VarA2.f4313h;
                                                        if (d0Var2 != null) {
                                                            lValueOf = Long.valueOf(((c0) d0Var2).f4335c);
                                                        } else {
                                                            lValueOf = null;
                                                        }
                                                        sb7.append(lValueOf);
                                                        throw new ProtocolException(sb7.toString());
                                                    }
                                                } else {
                                                    d0Var = b0VarA2.f4313h;
                                                    if (d0Var != null) {
                                                        j4 = ((c0) d0Var).f4335c;
                                                    } else {
                                                        j4 = -1;
                                                    }
                                                    if (j4 > 0) {
                                                        StringBuilder sb8 = new StringBuilder(str);
                                                        sb8.append(i4);
                                                        sb8.append(" had non-zero Content-Length: ");
                                                        d0Var2 = b0VarA2.f4313h;
                                                        if (d0Var2 != null) {
                                                            lValueOf = Long.valueOf(((c0) d0Var2).f4335c);
                                                        } else {
                                                            lValueOf = null;
                                                        }
                                                        sb8.append(lValueOf);
                                                        throw new ProtocolException(sb8.toString());
                                                    }
                                                }
                                                return b0VarA2;
                                                if (iOException != null) {
                                                    throw e;
                                                }
                                                c3.h.F(iOException, e);
                                                throw iOException;
                                            }
                                        } catch (IOException e10) {
                                            e = e10;
                                            str = "HTTP ";
                                            z5 = z4;
                                            a0VarC = a0VarC2;
                                        }
                                    } else {
                                        str = "HTTP ";
                                        z5 = z4;
                                        a0VarC = a0VarC2;
                                        jVar.h(eVar, true, false, null);
                                        if (lVar.f4994g == null) {
                                            dVar.h().k();
                                        }
                                    }
                                    r13 = z5;
                                    iOException2 = null;
                                } catch (IOException e11) {
                                    e = e11;
                                }
                            } catch (IOException e12) {
                                e = e12;
                                str = "HTTP ";
                                r13 = 1;
                                a0VarC = null;
                                if (e instanceof a4.a) {
                                    throw e;
                                }
                                if (!eVar.f4953f) {
                                    throw e;
                                }
                                r15 = r13;
                                iOException = e;
                                if (a0VarC != null) {
                                    a0Var = a0VarC;
                                    r16 = r15;
                                    a0Var.f4293a = wVar;
                                    a0Var.f4297e = lVar.f4992e;
                                    a0Var.f4303k = jCurrentTimeMillis;
                                    r4 = r16;
                                    a0Var.f4304l = System.currentTimeMillis();
                                    b0VarA = a0Var.a();
                                    i4 = b0VarA.f4310e;
                                    if (i4 != 100) {
                                        a0 a0VarC11 = eVar.c(false);
                                        c3.h.X(a0VarC11);
                                        if (r4 != 0) {
                                            nVar.getClass();
                                            c3.h.b0(jVar, "call");
                                        }
                                        a0VarC11.f4293a = wVar;
                                        a0VarC11.f4297e = lVar.f4992e;
                                        a0VarC11.f4303k = jCurrentTimeMillis;
                                        a0VarC11.f4304l = System.currentTimeMillis();
                                        b0VarA = a0VarC11.a();
                                        i4 = b0VarA.f4310e;
                                    } else {
                                        a0 a0VarC12 = eVar.c(false);
                                        c3.h.X(a0VarC12);
                                        if (r4 != 0) {
                                            nVar.getClass();
                                            c3.h.b0(jVar, "call");
                                        }
                                        a0VarC12.f4293a = wVar;
                                        a0VarC12.f4297e = lVar.f4992e;
                                        a0VarC12.f4303k = jCurrentTimeMillis;
                                        a0VarC12.f4304l = System.currentTimeMillis();
                                        b0VarA = a0VarC12.a();
                                        i4 = b0VarA.f4310e;
                                    }
                                    nVar.getClass();
                                    c3.h.b0(jVar, "call");
                                    if (this.f5413a) {
                                        a0 a0VarE9 = b0VarA.e();
                                        a0VarE9.f4299g = eVar.b(b0VarA);
                                        b0VarA2 = a0VarE9.a();
                                    } else {
                                        a0 a0VarE10 = b0VarA.e();
                                        a0VarE10.f4299g = eVar.b(b0VarA);
                                        b0VarA2 = a0VarE10.a();
                                    }
                                    if (q3.l.U2("close", ((q) b0VarA2.f4307b.f2810d).a("Connection"))) {
                                        dVar.h().k();
                                    } else {
                                        dVar.h().k();
                                    }
                                    if (i4 != 204) {
                                        d0Var = b0VarA2.f4313h;
                                        if (d0Var != null) {
                                            j4 = ((c0) d0Var).f4335c;
                                        } else {
                                            j4 = -1;
                                        }
                                        if (j4 > 0) {
                                            StringBuilder sb9 = new StringBuilder(str);
                                            sb9.append(i4);
                                            sb9.append(" had non-zero Content-Length: ");
                                            d0Var2 = b0VarA2.f4313h;
                                            if (d0Var2 != null) {
                                                lValueOf = Long.valueOf(((c0) d0Var2).f4335c);
                                            } else {
                                                lValueOf = null;
                                            }
                                            sb9.append(lValueOf);
                                            throw new ProtocolException(sb9.toString());
                                        }
                                    } else {
                                        d0Var = b0VarA2.f4313h;
                                        if (d0Var != null) {
                                            j4 = ((c0) d0Var).f4335c;
                                        } else {
                                            j4 = -1;
                                        }
                                        if (j4 > 0) {
                                            StringBuilder sb10 = new StringBuilder(str);
                                            sb10.append(i4);
                                            sb10.append(" had non-zero Content-Length: ");
                                            d0Var2 = b0VarA2.f4313h;
                                            if (d0Var2 != null) {
                                                lValueOf = Long.valueOf(((c0) d0Var2).f4335c);
                                            } else {
                                                lValueOf = null;
                                            }
                                            sb10.append(lValueOf);
                                            throw new ProtocolException(sb10.toString());
                                        }
                                    }
                                    return b0VarA2;
                                }
                                a0VarC = eVar.c(false);
                                c3.h.X(a0VarC);
                                if (r15 != 0) {
                                    nVar.getClass();
                                    c3.h.b0(jVar, "call");
                                    a0Var = a0VarC;
                                    r16 = 0;
                                } else {
                                    a0Var = a0VarC;
                                    r16 = r15;
                                }
                                a0Var.f4293a = wVar;
                                a0Var.f4297e = lVar.f4992e;
                                a0Var.f4303k = jCurrentTimeMillis;
                                r4 = r16;
                                a0Var.f4304l = System.currentTimeMillis();
                                b0VarA = a0Var.a();
                                i4 = b0VarA.f4310e;
                                if (i4 != 100) {
                                    a0 a0VarC13 = eVar.c(false);
                                    c3.h.X(a0VarC13);
                                    if (r4 != 0) {
                                        nVar.getClass();
                                        c3.h.b0(jVar, "call");
                                    }
                                    a0VarC13.f4293a = wVar;
                                    a0VarC13.f4297e = lVar.f4992e;
                                    a0VarC13.f4303k = jCurrentTimeMillis;
                                    a0VarC13.f4304l = System.currentTimeMillis();
                                    b0VarA = a0VarC13.a();
                                    i4 = b0VarA.f4310e;
                                } else {
                                    a0 a0VarC14 = eVar.c(false);
                                    c3.h.X(a0VarC14);
                                    if (r4 != 0) {
                                        nVar.getClass();
                                        c3.h.b0(jVar, "call");
                                    }
                                    a0VarC14.f4293a = wVar;
                                    a0VarC14.f4297e = lVar.f4992e;
                                    a0VarC14.f4303k = jCurrentTimeMillis;
                                    a0VarC14.f4304l = System.currentTimeMillis();
                                    b0VarA = a0VarC14.a();
                                    i4 = b0VarA.f4310e;
                                }
                                nVar.getClass();
                                c3.h.b0(jVar, "call");
                                if (this.f5413a) {
                                    a0 a0VarE11 = b0VarA.e();
                                    a0VarE11.f4299g = eVar.b(b0VarA);
                                    b0VarA2 = a0VarE11.a();
                                } else {
                                    a0 a0VarE12 = b0VarA.e();
                                    a0VarE12.f4299g = eVar.b(b0VarA);
                                    b0VarA2 = a0VarE12.a();
                                }
                                if (q3.l.U2("close", ((q) b0VarA2.f4307b.f2810d).a("Connection"))) {
                                    dVar.h().k();
                                } else {
                                    dVar.h().k();
                                }
                                if (i4 != 204) {
                                    d0Var = b0VarA2.f4313h;
                                    if (d0Var != null) {
                                        j4 = ((c0) d0Var).f4335c;
                                    } else {
                                        j4 = -1;
                                    }
                                    if (j4 > 0) {
                                        StringBuilder sb11 = new StringBuilder(str);
                                        sb11.append(i4);
                                        sb11.append(" had non-zero Content-Length: ");
                                        d0Var2 = b0VarA2.f4313h;
                                        if (d0Var2 != null) {
                                            lValueOf = Long.valueOf(((c0) d0Var2).f4335c);
                                        } else {
                                            lValueOf = null;
                                        }
                                        sb11.append(lValueOf);
                                        throw new ProtocolException(sb11.toString());
                                    }
                                } else {
                                    d0Var = b0VarA2.f4313h;
                                    if (d0Var != null) {
                                        j4 = ((c0) d0Var).f4335c;
                                    } else {
                                        j4 = -1;
                                    }
                                    if (j4 > 0) {
                                        StringBuilder sb12 = new StringBuilder(str);
                                        sb12.append(i4);
                                        sb12.append(" had non-zero Content-Length: ");
                                        d0Var2 = b0VarA2.f4313h;
                                        if (d0Var2 != null) {
                                            lValueOf = Long.valueOf(((c0) d0Var2).f4335c);
                                        } else {
                                            lValueOf = null;
                                        }
                                        sb12.append(lValueOf);
                                        throw new ProtocolException(sb12.toString());
                                    }
                                }
                                return b0VarA2;
                                if (iOException != null) {
                                    throw e;
                                }
                                c3.h.F(iOException, e);
                                throw iOException;
                            }
                        } catch (IOException e13) {
                            e = e13;
                        }
                    }
                    try {
                        dVar.a();
                        r15 = r13 == true ? 1 : 0;
                        iOException = iOException2;
                        if (a0VarC != null) {
                            a0VarC = eVar.c(false);
                            c3.h.X(a0VarC);
                            if (r15 != 0) {
                                nVar.getClass();
                                c3.h.b0(jVar, "call");
                                a0Var = a0VarC;
                                r16 = 0;
                            } else {
                                a0Var = a0VarC;
                                r16 = r15;
                            }
                            a0Var.f4293a = wVar;
                            a0Var.f4297e = lVar.f4992e;
                            a0Var.f4303k = jCurrentTimeMillis;
                            r4 = r16;
                            a0Var.f4304l = System.currentTimeMillis();
                            b0VarA = a0Var.a();
                            i4 = b0VarA.f4310e;
                            if (i4 != 100 || (102 <= i4 && i4 < 200)) {
                                a0 a0VarC15 = eVar.c(false);
                                c3.h.X(a0VarC15);
                                if (r4 != 0) {
                                    nVar.getClass();
                                    c3.h.b0(jVar, "call");
                                }
                                a0VarC15.f4293a = wVar;
                                a0VarC15.f4297e = lVar.f4992e;
                                a0VarC15.f4303k = jCurrentTimeMillis;
                                a0VarC15.f4304l = System.currentTimeMillis();
                                b0VarA = a0VarC15.a();
                                i4 = b0VarA.f4310e;
                            }
                            nVar.getClass();
                            c3.h.b0(jVar, "call");
                            if (this.f5413a || i4 != 101) {
                                a0 a0VarE13 = b0VarA.e();
                                a0VarE13.f4299g = eVar.b(b0VarA);
                                b0VarA2 = a0VarE13.a();
                            } else {
                                a0 a0VarE14 = b0VarA.e();
                                a0VarE14.f4299g = u3.b.f4763c;
                                b0VarA2 = a0VarE14.a();
                            }
                            if (q3.l.U2("close", ((q) b0VarA2.f4307b.f2810d).a("Connection")) || q3.l.U2("close", b0.a(b0VarA2, "Connection"))) {
                                dVar.h().k();
                            }
                            if (i4 != 204 || i4 == 205) {
                                d0Var = b0VarA2.f4313h;
                                if (d0Var != null) {
                                    j4 = ((c0) d0Var).f4335c;
                                } else {
                                    j4 = -1;
                                }
                                if (j4 > 0) {
                                    StringBuilder sb13 = new StringBuilder(str);
                                    sb13.append(i4);
                                    sb13.append(" had non-zero Content-Length: ");
                                    d0Var2 = b0VarA2.f4313h;
                                    if (d0Var2 != null) {
                                        lValueOf = Long.valueOf(((c0) d0Var2).f4335c);
                                    } else {
                                        lValueOf = null;
                                    }
                                    sb13.append(lValueOf);
                                    throw new ProtocolException(sb13.toString());
                                }
                            }
                            return b0VarA2;
                        }
                        a0Var = a0VarC;
                        r16 = r15;
                        a0Var.f4293a = wVar;
                        a0Var.f4297e = lVar.f4992e;
                        a0Var.f4303k = jCurrentTimeMillis;
                        r4 = r16;
                        a0Var.f4304l = System.currentTimeMillis();
                        b0VarA = a0Var.a();
                        i4 = b0VarA.f4310e;
                        if (i4 != 100) {
                            a0 a0VarC16 = eVar.c(false);
                            c3.h.X(a0VarC16);
                            if (r4 != 0) {
                                nVar.getClass();
                                c3.h.b0(jVar, "call");
                            }
                            a0VarC16.f4293a = wVar;
                            a0VarC16.f4297e = lVar.f4992e;
                            a0VarC16.f4303k = jCurrentTimeMillis;
                            a0VarC16.f4304l = System.currentTimeMillis();
                            b0VarA = a0VarC16.a();
                            i4 = b0VarA.f4310e;
                        } else {
                            a0 a0VarC17 = eVar.c(false);
                            c3.h.X(a0VarC17);
                            if (r4 != 0) {
                                nVar.getClass();
                                c3.h.b0(jVar, "call");
                            }
                            a0VarC17.f4293a = wVar;
                            a0VarC17.f4297e = lVar.f4992e;
                            a0VarC17.f4303k = jCurrentTimeMillis;
                            a0VarC17.f4304l = System.currentTimeMillis();
                            b0VarA = a0VarC17.a();
                            i4 = b0VarA.f4310e;
                        }
                        nVar.getClass();
                        c3.h.b0(jVar, "call");
                        if (this.f5413a) {
                            a0 a0VarE15 = b0VarA.e();
                            a0VarE15.f4299g = eVar.b(b0VarA);
                            b0VarA2 = a0VarE15.a();
                        } else {
                            a0 a0VarE16 = b0VarA.e();
                            a0VarE16.f4299g = eVar.b(b0VarA);
                            b0VarA2 = a0VarE16.a();
                        }
                        if (q3.l.U2("close", ((q) b0VarA2.f4307b.f2810d).a("Connection"))) {
                            dVar.h().k();
                        } else {
                            dVar.h().k();
                        }
                        if (i4 != 204) {
                            d0Var = b0VarA2.f4313h;
                            if (d0Var != null) {
                                j4 = ((c0) d0Var).f4335c;
                            } else {
                                j4 = -1;
                            }
                            if (j4 > 0) {
                                StringBuilder sb14 = new StringBuilder(str);
                                sb14.append(i4);
                                sb14.append(" had non-zero Content-Length: ");
                                d0Var2 = b0VarA2.f4313h;
                                if (d0Var2 != null) {
                                    lValueOf = Long.valueOf(((c0) d0Var2).f4335c);
                                } else {
                                    lValueOf = null;
                                }
                                sb14.append(lValueOf);
                                throw new ProtocolException(sb14.toString());
                            }
                        } else {
                            d0Var = b0VarA2.f4313h;
                            if (d0Var != null) {
                                j4 = ((c0) d0Var).f4335c;
                            } else {
                                j4 = -1;
                            }
                            if (j4 > 0) {
                                StringBuilder sb15 = new StringBuilder(str);
                                sb15.append(i4);
                                sb15.append(" had non-zero Content-Length: ");
                                d0Var2 = b0VarA2.f4313h;
                                if (d0Var2 != null) {
                                    lValueOf = Long.valueOf(((c0) d0Var2).f4335c);
                                } else {
                                    lValueOf = null;
                                }
                                sb15.append(lValueOf);
                                throw new ProtocolException(sb15.toString());
                            }
                        }
                        return b0VarA2;
                        if (iOException != null) {
                            throw e;
                        }
                        c3.h.F(iOException, e);
                        throw iOException;
                    } catch (IOException e14) {
                        try {
                            eVar.d(e14);
                            throw e14;
                        } catch (IOException e15) {
                            e = e15;
                            if (e instanceof a4.a) {
                                throw e;
                            }
                            if (!eVar.f4953f) {
                                throw e;
                            }
                            r15 = r13;
                            iOException = e;
                            if (a0VarC != null) {
                                a0Var = a0VarC;
                                r16 = r15;
                                a0Var.f4293a = wVar;
                                a0Var.f4297e = lVar.f4992e;
                                a0Var.f4303k = jCurrentTimeMillis;
                                r4 = r16;
                                a0Var.f4304l = System.currentTimeMillis();
                                b0VarA = a0Var.a();
                                i4 = b0VarA.f4310e;
                                if (i4 != 100) {
                                    a0 a0VarC18 = eVar.c(false);
                                    c3.h.X(a0VarC18);
                                    if (r4 != 0) {
                                        nVar.getClass();
                                        c3.h.b0(jVar, "call");
                                    }
                                    a0VarC18.f4293a = wVar;
                                    a0VarC18.f4297e = lVar.f4992e;
                                    a0VarC18.f4303k = jCurrentTimeMillis;
                                    a0VarC18.f4304l = System.currentTimeMillis();
                                    b0VarA = a0VarC18.a();
                                    i4 = b0VarA.f4310e;
                                } else {
                                    a0 a0VarC19 = eVar.c(false);
                                    c3.h.X(a0VarC19);
                                    if (r4 != 0) {
                                        nVar.getClass();
                                        c3.h.b0(jVar, "call");
                                    }
                                    a0VarC19.f4293a = wVar;
                                    a0VarC19.f4297e = lVar.f4992e;
                                    a0VarC19.f4303k = jCurrentTimeMillis;
                                    a0VarC19.f4304l = System.currentTimeMillis();
                                    b0VarA = a0VarC19.a();
                                    i4 = b0VarA.f4310e;
                                }
                                nVar.getClass();
                                c3.h.b0(jVar, "call");
                                if (this.f5413a) {
                                    a0 a0VarE17 = b0VarA.e();
                                    a0VarE17.f4299g = eVar.b(b0VarA);
                                    b0VarA2 = a0VarE17.a();
                                } else {
                                    a0 a0VarE18 = b0VarA.e();
                                    a0VarE18.f4299g = eVar.b(b0VarA);
                                    b0VarA2 = a0VarE18.a();
                                }
                                if (q3.l.U2("close", ((q) b0VarA2.f4307b.f2810d).a("Connection"))) {
                                    dVar.h().k();
                                } else {
                                    dVar.h().k();
                                }
                                if (i4 != 204) {
                                    d0Var = b0VarA2.f4313h;
                                    if (d0Var != null) {
                                        j4 = ((c0) d0Var).f4335c;
                                    } else {
                                        j4 = -1;
                                    }
                                    if (j4 > 0) {
                                        StringBuilder sb16 = new StringBuilder(str);
                                        sb16.append(i4);
                                        sb16.append(" had non-zero Content-Length: ");
                                        d0Var2 = b0VarA2.f4313h;
                                        if (d0Var2 != null) {
                                            lValueOf = Long.valueOf(((c0) d0Var2).f4335c);
                                        } else {
                                            lValueOf = null;
                                        }
                                        sb16.append(lValueOf);
                                        throw new ProtocolException(sb16.toString());
                                    }
                                } else {
                                    d0Var = b0VarA2.f4313h;
                                    if (d0Var != null) {
                                        j4 = ((c0) d0Var).f4335c;
                                    } else {
                                        j4 = -1;
                                    }
                                    if (j4 > 0) {
                                        StringBuilder sb17 = new StringBuilder(str);
                                        sb17.append(i4);
                                        sb17.append(" had non-zero Content-Length: ");
                                        d0Var2 = b0VarA2.f4313h;
                                        if (d0Var2 != null) {
                                            lValueOf = Long.valueOf(((c0) d0Var2).f4335c);
                                        } else {
                                            lValueOf = null;
                                        }
                                        sb17.append(lValueOf);
                                        throw new ProtocolException(sb17.toString());
                                    }
                                }
                                return b0VarA2;
                            }
                            a0VarC = eVar.c(false);
                            c3.h.X(a0VarC);
                            if (r15 != 0) {
                                nVar.getClass();
                                c3.h.b0(jVar, "call");
                                a0Var = a0VarC;
                                r16 = 0;
                            } else {
                                a0Var = a0VarC;
                                r16 = r15;
                            }
                            a0Var.f4293a = wVar;
                            a0Var.f4297e = lVar.f4992e;
                            a0Var.f4303k = jCurrentTimeMillis;
                            r4 = r16;
                            a0Var.f4304l = System.currentTimeMillis();
                            b0VarA = a0Var.a();
                            i4 = b0VarA.f4310e;
                            if (i4 != 100) {
                                a0 a0VarC110 = eVar.c(false);
                                c3.h.X(a0VarC110);
                                if (r4 != 0) {
                                    nVar.getClass();
                                    c3.h.b0(jVar, "call");
                                }
                                a0VarC110.f4293a = wVar;
                                a0VarC110.f4297e = lVar.f4992e;
                                a0VarC110.f4303k = jCurrentTimeMillis;
                                a0VarC110.f4304l = System.currentTimeMillis();
                                b0VarA = a0VarC110.a();
                                i4 = b0VarA.f4310e;
                            } else {
                                a0 a0VarC111 = eVar.c(false);
                                c3.h.X(a0VarC111);
                                if (r4 != 0) {
                                    nVar.getClass();
                                    c3.h.b0(jVar, "call");
                                }
                                a0VarC111.f4293a = wVar;
                                a0VarC111.f4297e = lVar.f4992e;
                                a0VarC111.f4303k = jCurrentTimeMillis;
                                a0VarC111.f4304l = System.currentTimeMillis();
                                b0VarA = a0VarC111.a();
                                i4 = b0VarA.f4310e;
                            }
                            nVar.getClass();
                            c3.h.b0(jVar, "call");
                            if (this.f5413a) {
                                a0 a0VarE19 = b0VarA.e();
                                a0VarE19.f4299g = eVar.b(b0VarA);
                                b0VarA2 = a0VarE19.a();
                            } else {
                                a0 a0VarE110 = b0VarA.e();
                                a0VarE110.f4299g = eVar.b(b0VarA);
                                b0VarA2 = a0VarE110.a();
                            }
                            if (q3.l.U2("close", ((q) b0VarA2.f4307b.f2810d).a("Connection"))) {
                                dVar.h().k();
                            } else {
                                dVar.h().k();
                            }
                            if (i4 != 204) {
                                d0Var = b0VarA2.f4313h;
                                if (d0Var != null) {
                                    j4 = ((c0) d0Var).f4335c;
                                } else {
                                    j4 = -1;
                                }
                                if (j4 > 0) {
                                    StringBuilder sb18 = new StringBuilder(str);
                                    sb18.append(i4);
                                    sb18.append(" had non-zero Content-Length: ");
                                    d0Var2 = b0VarA2.f4313h;
                                    if (d0Var2 != null) {
                                        lValueOf = Long.valueOf(((c0) d0Var2).f4335c);
                                    } else {
                                        lValueOf = null;
                                    }
                                    sb18.append(lValueOf);
                                    throw new ProtocolException(sb18.toString());
                                }
                            } else {
                                d0Var = b0VarA2.f4313h;
                                if (d0Var != null) {
                                    j4 = ((c0) d0Var).f4335c;
                                } else {
                                    j4 = -1;
                                }
                                if (j4 > 0) {
                                    StringBuilder sb19 = new StringBuilder(str);
                                    sb19.append(i4);
                                    sb19.append(" had non-zero Content-Length: ");
                                    d0Var2 = b0VarA2.f4313h;
                                    if (d0Var2 != null) {
                                        lValueOf = Long.valueOf(((c0) d0Var2).f4335c);
                                    } else {
                                        lValueOf = null;
                                    }
                                    sb19.append(lValueOf);
                                    throw new ProtocolException(sb19.toString());
                                }
                            }
                            return b0VarA2;
                            if (iOException != null) {
                                throw e;
                            }
                            c3.h.F(iOException, e);
                            throw iOException;
                        }
                    }
                } catch (IOException e16) {
                    e = e16;
                    str = "HTTP ";
                    r5 = 1;
                    r13 = r5;
                    a0VarC = null;
                    if (e instanceof a4.a) {
                        throw e;
                    }
                    if (!eVar.f4953f) {
                        throw e;
                    }
                    r15 = r13;
                    iOException = e;
                    if (a0VarC != null) {
                        a0Var = a0VarC;
                        r16 = r15;
                        a0Var.f4293a = wVar;
                        a0Var.f4297e = lVar.f4992e;
                        a0Var.f4303k = jCurrentTimeMillis;
                        r4 = r16;
                        a0Var.f4304l = System.currentTimeMillis();
                        b0VarA = a0Var.a();
                        i4 = b0VarA.f4310e;
                        if (i4 != 100) {
                            a0 a0VarC112 = eVar.c(false);
                            c3.h.X(a0VarC112);
                            if (r4 != 0) {
                                nVar.getClass();
                                c3.h.b0(jVar, "call");
                            }
                            a0VarC112.f4293a = wVar;
                            a0VarC112.f4297e = lVar.f4992e;
                            a0VarC112.f4303k = jCurrentTimeMillis;
                            a0VarC112.f4304l = System.currentTimeMillis();
                            b0VarA = a0VarC112.a();
                            i4 = b0VarA.f4310e;
                        } else {
                            a0 a0VarC113 = eVar.c(false);
                            c3.h.X(a0VarC113);
                            if (r4 != 0) {
                                nVar.getClass();
                                c3.h.b0(jVar, "call");
                            }
                            a0VarC113.f4293a = wVar;
                            a0VarC113.f4297e = lVar.f4992e;
                            a0VarC113.f4303k = jCurrentTimeMillis;
                            a0VarC113.f4304l = System.currentTimeMillis();
                            b0VarA = a0VarC113.a();
                            i4 = b0VarA.f4310e;
                        }
                        nVar.getClass();
                        c3.h.b0(jVar, "call");
                        if (this.f5413a) {
                            a0 a0VarE111 = b0VarA.e();
                            a0VarE111.f4299g = eVar.b(b0VarA);
                            b0VarA2 = a0VarE111.a();
                        } else {
                            a0 a0VarE112 = b0VarA.e();
                            a0VarE112.f4299g = eVar.b(b0VarA);
                            b0VarA2 = a0VarE112.a();
                        }
                        if (q3.l.U2("close", ((q) b0VarA2.f4307b.f2810d).a("Connection"))) {
                            dVar.h().k();
                        } else {
                            dVar.h().k();
                        }
                        if (i4 != 204) {
                            d0Var = b0VarA2.f4313h;
                            if (d0Var != null) {
                                j4 = ((c0) d0Var).f4335c;
                            } else {
                                j4 = -1;
                            }
                            if (j4 > 0) {
                                StringBuilder sb110 = new StringBuilder(str);
                                sb110.append(i4);
                                sb110.append(" had non-zero Content-Length: ");
                                d0Var2 = b0VarA2.f4313h;
                                if (d0Var2 != null) {
                                    lValueOf = Long.valueOf(((c0) d0Var2).f4335c);
                                } else {
                                    lValueOf = null;
                                }
                                sb110.append(lValueOf);
                                throw new ProtocolException(sb110.toString());
                            }
                        } else {
                            d0Var = b0VarA2.f4313h;
                            if (d0Var != null) {
                                j4 = ((c0) d0Var).f4335c;
                            } else {
                                j4 = -1;
                            }
                            if (j4 > 0) {
                                StringBuilder sb111 = new StringBuilder(str);
                                sb111.append(i4);
                                sb111.append(" had non-zero Content-Length: ");
                                d0Var2 = b0VarA2.f4313h;
                                if (d0Var2 != null) {
                                    lValueOf = Long.valueOf(((c0) d0Var2).f4335c);
                                } else {
                                    lValueOf = null;
                                }
                                sb111.append(lValueOf);
                                throw new ProtocolException(sb111.toString());
                            }
                        }
                        return b0VarA2;
                    }
                    a0VarC = eVar.c(false);
                    c3.h.X(a0VarC);
                    if (r15 != 0) {
                        nVar.getClass();
                        c3.h.b0(jVar, "call");
                        a0Var = a0VarC;
                        r16 = 0;
                    } else {
                        a0Var = a0VarC;
                        r16 = r15;
                    }
                    a0Var.f4293a = wVar;
                    a0Var.f4297e = lVar.f4992e;
                    a0Var.f4303k = jCurrentTimeMillis;
                    r4 = r16;
                    a0Var.f4304l = System.currentTimeMillis();
                    b0VarA = a0Var.a();
                    i4 = b0VarA.f4310e;
                    if (i4 != 100) {
                        a0 a0VarC114 = eVar.c(false);
                        c3.h.X(a0VarC114);
                        if (r4 != 0) {
                            nVar.getClass();
                            c3.h.b0(jVar, "call");
                        }
                        a0VarC114.f4293a = wVar;
                        a0VarC114.f4297e = lVar.f4992e;
                        a0VarC114.f4303k = jCurrentTimeMillis;
                        a0VarC114.f4304l = System.currentTimeMillis();
                        b0VarA = a0VarC114.a();
                        i4 = b0VarA.f4310e;
                    } else {
                        a0 a0VarC115 = eVar.c(false);
                        c3.h.X(a0VarC115);
                        if (r4 != 0) {
                            nVar.getClass();
                            c3.h.b0(jVar, "call");
                        }
                        a0VarC115.f4293a = wVar;
                        a0VarC115.f4297e = lVar.f4992e;
                        a0VarC115.f4303k = jCurrentTimeMillis;
                        a0VarC115.f4304l = System.currentTimeMillis();
                        b0VarA = a0VarC115.a();
                        i4 = b0VarA.f4310e;
                    }
                    nVar.getClass();
                    c3.h.b0(jVar, "call");
                    if (this.f5413a) {
                        a0 a0VarE113 = b0VarA.e();
                        a0VarE113.f4299g = eVar.b(b0VarA);
                        b0VarA2 = a0VarE113.a();
                    } else {
                        a0 a0VarE114 = b0VarA.e();
                        a0VarE114.f4299g = eVar.b(b0VarA);
                        b0VarA2 = a0VarE114.a();
                    }
                    if (q3.l.U2("close", ((q) b0VarA2.f4307b.f2810d).a("Connection"))) {
                        dVar.h().k();
                    } else {
                        dVar.h().k();
                    }
                    if (i4 != 204) {
                        d0Var = b0VarA2.f4313h;
                        if (d0Var != null) {
                            j4 = ((c0) d0Var).f4335c;
                        } else {
                            j4 = -1;
                        }
                        if (j4 > 0) {
                            StringBuilder sb112 = new StringBuilder(str);
                            sb112.append(i4);
                            sb112.append(" had non-zero Content-Length: ");
                            d0Var2 = b0VarA2.f4313h;
                            if (d0Var2 != null) {
                                lValueOf = Long.valueOf(((c0) d0Var2).f4335c);
                            } else {
                                lValueOf = null;
                            }
                            sb112.append(lValueOf);
                            throw new ProtocolException(sb112.toString());
                        }
                    } else {
                        d0Var = b0VarA2.f4313h;
                        if (d0Var != null) {
                            j4 = ((c0) d0Var).f4335c;
                        } else {
                            j4 = -1;
                        }
                        if (j4 > 0) {
                            StringBuilder sb113 = new StringBuilder(str);
                            sb113.append(i4);
                            sb113.append(" had non-zero Content-Length: ");
                            d0Var2 = b0VarA2.f4313h;
                            if (d0Var2 != null) {
                                lValueOf = Long.valueOf(((c0) d0Var2).f4335c);
                            } else {
                                lValueOf = null;
                            }
                            sb113.append(lValueOf);
                            throw new ProtocolException(sb113.toString());
                        }
                    }
                    return b0VarA2;
                    if (iOException != null) {
                        throw e;
                    }
                    c3.h.F(iOException, e);
                    throw iOException;
                }
            } catch (IOException e17) {
                e = e17;
            }
        } catch (IOException e18) {
            nVar.getClass();
            c3.h.b0(jVar, "call");
            eVar.d(e18);
            throw e18;
        }
    }
}
