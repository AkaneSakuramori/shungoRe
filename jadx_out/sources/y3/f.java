package y3;

import i.w;
import java.util.List;
import t3.b0;
import t3.s;
import t3.t;
import x3.j;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f5415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f5416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x3.e f5418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f5419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5422h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5423i;

    public f(j jVar, List list, int i4, x3.e eVar, w wVar, int i5, int i6, int i7) {
        c3.h.b0(jVar, "call");
        c3.h.b0(list, "interceptors");
        c3.h.b0(wVar, "request");
        this.f5415a = jVar;
        this.f5416b = list;
        this.f5417c = i4;
        this.f5418d = eVar;
        this.f5419e = wVar;
        this.f5420f = i5;
        this.f5421g = i6;
        this.f5422h = i7;
    }

    public static f a(f fVar, int i4, x3.e eVar, w wVar, int i5) {
        if ((i5 & 1) != 0) {
            i4 = fVar.f5417c;
        }
        int i6 = i4;
        if ((i5 & 2) != 0) {
            eVar = fVar.f5418d;
        }
        x3.e eVar2 = eVar;
        if ((i5 & 4) != 0) {
            wVar = fVar.f5419e;
        }
        w wVar2 = wVar;
        int i7 = (i5 & 8) != 0 ? fVar.f5420f : 0;
        int i8 = (i5 & 16) != 0 ? fVar.f5421g : 0;
        int i9 = (i5 & 32) != 0 ? fVar.f5422h : 0;
        fVar.getClass();
        c3.h.b0(wVar2, "request");
        return new f(fVar.f5415a, fVar.f5416b, i6, eVar2, wVar2, i7, i8, i9);
    }

    public final b0 b(w wVar) {
        c3.h.b0(wVar, "request");
        List list = this.f5416b;
        int size = list.size();
        int i4 = this.f5417c;
        if (i4 >= size) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f5423i++;
        x3.e eVar = this.f5418d;
        if (eVar != null) {
            if (!eVar.f4950c.b((s) wVar.f2808b)) {
                throw new IllegalStateException(("network interceptor " + list.get(i4 - 1) + " must retain the same host and port").toString());
            }
            if (this.f5423i != 1) {
                throw new IllegalStateException(("network interceptor " + list.get(i4 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i5 = i4 + 1;
        f fVarA = a(this, i5, null, wVar, 58);
        t tVar = (t) list.get(i4);
        b0 b0VarA = tVar.a(fVarA);
        if (b0VarA == null) {
            throw new NullPointerException("interceptor " + tVar + " returned null");
        }
        if (eVar != null && i5 < list.size() && fVarA.f5423i != 1) {
            throw new IllegalStateException(("network interceptor " + tVar + " must call proceed() exactly once").toString());
        }
        if (b0VarA.f4313h != null) {
            return b0VarA;
        }
        throw new IllegalStateException(("interceptor " + tVar + " returned a response with no body").toString());
    }
}
