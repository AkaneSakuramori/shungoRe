package p2;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import m2.b0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.auth0.android.request.internal.i f3776b = new com.auth0.android.request.internal.i(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3777a;

    public c() {
        ArrayList arrayList = new ArrayList();
        this.f3777a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (o2.g.f3622a >= 9) {
            arrayList.add(c3.h.d1(2, 2));
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x002a */
    @Override // m2.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(t2.b r3) throws t2.d {
        /*
            r2 = this;
            int r0 = r3.T()
            r1 = 9
            if (r0 != r1) goto Ld
            r3.P()
            r3 = 0
            goto L37
        Ld:
            java.lang.String r3 = r3.R()
            monitor-enter(r2)
            java.util.ArrayList r0 = r2.f3777a     // Catch: java.lang.Throwable -> L2a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2a
        L18:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L2a
            java.text.DateFormat r1 = (java.text.DateFormat) r1     // Catch: java.lang.Throwable -> L2a
            java.util.Date r3 = r1.parse(r3)     // Catch: java.text.ParseException -> L18 java.lang.Throwable -> L2a
            monitor-exit(r2)
            goto L37
        L2a:
            r3 = move-exception
            goto L3f
        L2c:
            java.text.ParsePosition r0 = new java.text.ParsePosition     // Catch: java.lang.Throwable -> L2a java.text.ParseException -> L38
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2a java.text.ParseException -> L38
            java.util.Date r3 = q2.a.b(r3, r0)     // Catch: java.lang.Throwable -> L2a java.text.ParseException -> L38
            monitor-exit(r2)
        L37:
            return r3
        L38:
            r0 = move-exception
            m2.r r1 = new m2.r     // Catch: java.lang.Throwable -> L2a
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L2a
            throw r1     // Catch: java.lang.Throwable -> L2a
        L3f:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.c.b(t2.b):java.lang.Object");
    }

    @Override // m2.b0
    public final void c(t2.c cVar, Object obj) {
        Date date = (Date) obj;
        synchronized (this) {
            try {
                if (date == null) {
                    cVar.G();
                } else {
                    cVar.M(((DateFormat) this.f3777a.get(0)).format(date));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
