package okhttp3.internal.publicsuffix;

import a3.m;
import a3.n;
import a3.p;
import a4.x;
import c3.h;
import f4.d;
import f4.q;
import f4.y;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import p3.b;
import p3.c;
import q3.l;

/* JADX INFO: loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f3652e = {42};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List f3653f = h.u1("*");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final PublicSuffixDatabase f3654g = new PublicSuffixDatabase();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f3655a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CountDownLatch f3656b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f3657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f3658d;

    public static List c(String str) {
        List listL3 = l.l3(str, new char[]{'.'});
        if (listL3.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        if (!h.I(listL3.get(h.W0(listL3)), "")) {
            return listL3;
        }
        int size = listL3.size() - 1;
        if (size < 0) {
            size = 0;
        }
        if (size < 0) {
            throw new IllegalArgumentException(("Requested element count " + size + " is less than zero.").toString());
        }
        p pVar = p.f75b;
        if (size == 0) {
            return pVar;
        }
        if (size >= listL3.size()) {
            return n.j3(listL3);
        }
        if (size == 1) {
            if (listL3.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            return h.u1(listL3.get(0));
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator it = listL3.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i4++;
            if (i4 == size) {
                break;
            }
        }
        int size2 = arrayList.size();
        if (size2 != 0) {
            return size2 != 1 ? arrayList : h.u1(arrayList.get(0));
        }
        return pVar;
    }

    public final String a(String str) {
        String strC;
        String strC2;
        String strC3;
        List listL3;
        int size;
        int size2;
        b bVar;
        String unicode = IDN.toUnicode(str);
        h.a0(unicode, "unicodeDomain");
        List listC = c(unicode);
        int i4 = 0;
        if (this.f3655a.get() || !this.f3655a.compareAndSet(false, true)) {
            try {
                this.f3656b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z4 = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z4 = true;
                    } catch (IOException e5) {
                        b4.l lVar = b4.l.f1135a;
                        b4.l.f1135a.getClass();
                        b4.l.i("Failed to read public suffix list", 5, e5);
                        if (z4) {
                        }
                    }
                } catch (Throwable th) {
                    if (z4) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z4) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.f3657c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        int size3 = listC.size();
        byte[][] bArr = new byte[size3][];
        for (int i5 = 0; i5 < size3; i5++) {
            String str2 = (String) listC.get(i5);
            Charset charset = StandardCharsets.UTF_8;
            h.a0(charset, "UTF_8");
            byte[] bytes = str2.getBytes(charset);
            h.a0(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i5] = bytes;
        }
        int i6 = 0;
        while (true) {
            if (i6 >= size3) {
                strC = null;
                break;
            }
            byte[] bArr2 = this.f3657c;
            if (bArr2 == null) {
                h.E2("publicSuffixListBytes");
                throw null;
            }
            strC = x.c(bArr2, bArr, i6);
            if (strC != null) {
                break;
            }
            i6++;
        }
        if (size3 <= 1) {
            strC2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                strC2 = null;
                break;
            }
            bArr3[i7] = f3652e;
            byte[] bArr4 = this.f3657c;
            if (bArr4 == null) {
                h.E2("publicSuffixListBytes");
                throw null;
            }
            strC2 = x.c(bArr4, bArr3, i7);
            if (strC2 != null) {
                break;
            }
            i7++;
        }
        if (strC2 == null) {
            strC3 = null;
            break;
        }
        int i8 = size3 - 1;
        int i9 = 0;
        while (true) {
            if (i9 >= i8) {
                strC3 = null;
                break;
            }
            byte[] bArr5 = this.f3658d;
            if (bArr5 == null) {
                h.E2("publicSuffixExceptionListBytes");
                throw null;
            }
            strC3 = x.c(bArr5, bArr, i9);
            if (strC3 != null) {
                break;
            }
            i9++;
        }
        if (strC3 != null) {
            listL3 = l.l3("!".concat(strC3), new char[]{'.'});
        } else if (strC == null && strC2 == null) {
            listL3 = f3653f;
        } else {
            List listL4 = p.f75b;
            List listL5 = strC != null ? l.l3(strC, new char[]{'.'}) : listL4;
            if (strC2 != null) {
                listL4 = l.l3(strC2, new char[]{'.'});
            }
            listL3 = listL5.size() > listL4.size() ? listL5 : listL4;
        }
        if (listC.size() == listL3.size() && ((String) listL3.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listL3.get(0)).charAt(0) == '!') {
            size = listC.size();
            size2 = listL3.size();
        } else {
            size = listC.size();
            size2 = listL3.size() + 1;
        }
        int i10 = size - size2;
        c mVar = new m(0, c(str));
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 != 0) {
            if (mVar instanceof b) {
                b bVar2 = (b) mVar;
                int i11 = bVar2.f3869b + i10;
                if (i11 < 0) {
                    bVar = new b(bVar2, i10);
                } else {
                    mVar = new b(bVar2.f3868a, i11);
                }
            } else {
                bVar = new b(mVar, i10);
            }
            mVar = bVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        for (Object obj : mVar) {
            i4++;
            if (i4 > 1) {
                sb.append((CharSequence) ".");
            }
            h.G(sb, obj, null);
        }
        sb.append((CharSequence) "");
        String string = sb.toString();
        h.a0(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    public final void b() {
        try {
            k3.m mVar = new k3.m();
            k3.m mVar2 = new k3.m();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream == null) {
                this.f3656b.countDown();
                return;
            }
            Logger logger = f4.n.f2181a;
            q qVar = new q(new f4.l(new d(resourceAsStream, new y())));
            try {
                long jE = qVar.E();
                qVar.k(jE);
                mVar.f3276b = qVar.f2188c.z(jE);
                long jE2 = qVar.E();
                qVar.k(jE2);
                mVar2.f3276b = qVar.f2188c.z(jE2);
                h.k0(qVar, null);
                synchronized (this) {
                    Object obj = mVar.f3276b;
                    h.X(obj);
                    this.f3657c = (byte[]) obj;
                    Object obj2 = mVar2.f3276b;
                    h.X(obj2);
                    this.f3658d = (byte[]) obj2;
                }
                this.f3656b.countDown();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    h.k0(qVar, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            this.f3656b.countDown();
            throw th3;
        }
    }
}
