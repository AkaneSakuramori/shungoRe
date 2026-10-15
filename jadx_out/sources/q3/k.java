package q3;

import j3.p;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class k extends k3.g implements p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f3906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3907e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, boolean z4, int i4) {
        super(2);
        this.f3905c = i4;
        this.f3907e = obj;
        this.f3906d = z4;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x009c A[LOOP:0: B:28:0x0069->B:39:0x009c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d7 A[LOOP:2: B:44:0x00a6->B:55:0x00d7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:65:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00d9 A[SYNTHETIC] */
    public final z2.a b(int i4, CharSequence charSequence) {
        Object next;
        String str;
        z2.a aVar;
        String str2;
        Object next2;
        String str3;
        String str4;
        int i5 = this.f3905c;
        Object obj = this.f3907e;
        switch (i5) {
            case 0:
                c3.h.b0(charSequence, "$this$$receiver");
                int iA3 = l.a3(i4, charSequence, this.f3906d, (char[]) obj);
                if (iA3 < 0) {
                    return null;
                }
                return new z2.a(Integer.valueOf(iA3), 1);
            default:
                c3.h.b0(charSequence, "$this$$receiver");
                List list = (List) obj;
                boolean z4 = this.f3906d;
                if (z4 || list.size() != 1) {
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    n3.c cVar = new n3.c(i4, charSequence.length(), 1);
                    boolean z5 = charSequence instanceof String;
                    int i6 = cVar.f3567d;
                    int i7 = cVar.f3566c;
                    if (z5) {
                        if ((i6 <= 0 || i4 > i7) && (i6 >= 0 || i7 > i4)) {
                            aVar = null;
                        } else {
                            while (true) {
                                Iterator it = list.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        str4 = (String) next2;
                                    } else {
                                        next2 = null;
                                    }
                                    str3 = (String) next2;
                                    if (str3 != null) {
                                        aVar = new z2.a(Integer.valueOf(i4), str3);
                                    } else if (i4 != i7) {
                                        i4 += i6;
                                    } else {
                                        aVar = null;
                                    }
                                } while (!l.f3(0, i4, str4.length(), str4, (String) charSequence, z4));
                                str3 = (String) next2;
                                if (str3 != null) {
                                    aVar = new z2.a(Integer.valueOf(i4), str3);
                                } else if (i4 != i7) {
                                    i4 += i6;
                                } else {
                                    aVar = null;
                                }
                            }
                        }
                    } else if ((i6 <= 0 || i4 > i7) && (i6 >= 0 || i7 > i4)) {
                        aVar = null;
                    } else {
                        while (true) {
                            Iterator it2 = list.iterator();
                            do {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    str2 = (String) next;
                                } else {
                                    next = null;
                                }
                                str = (String) next;
                                if (str != null) {
                                    aVar = new z2.a(Integer.valueOf(i4), str);
                                } else if (i4 != i7) {
                                    i4 += i6;
                                } else {
                                    aVar = null;
                                }
                            } while (!l.g3(str2, 0, charSequence, i4, str2.length(), z4));
                            str = (String) next;
                            if (str != null) {
                                aVar = new z2.a(Integer.valueOf(i4), str);
                            } else if (i4 != i7) {
                                i4 += i6;
                            } else {
                                aVar = null;
                            }
                        }
                    }
                } else {
                    int size = list.size();
                    if (size == 0) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    if (size != 1) {
                        throw new IllegalArgumentException("List has more than one element.");
                    }
                    String str5 = (String) list.get(0);
                    int iZ2 = l.Z2(charSequence, str5, i4, false, 4);
                    if (iZ2 < 0) {
                        aVar = null;
                    } else {
                        aVar = new z2.a(Integer.valueOf(iZ2), str5);
                    }
                }
                if (aVar == null) {
                    return null;
                }
                return new z2.a(aVar.f5504b, Integer.valueOf(((String) aVar.f5505c).length()));
        }
    }

    @Override // j3.p
    public final Object c(Object obj, Object obj2) {
        switch (this.f3905c) {
            case 0:
                return b(((Number) obj2).intValue(), (CharSequence) obj);
            case 1:
                return b(((Number) obj2).intValue(), (CharSequence) obj);
            default:
                return ((c3.k) obj).x((c3.i) obj2);
        }
    }
}
