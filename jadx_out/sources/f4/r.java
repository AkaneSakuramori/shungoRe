package f4;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f2190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f2194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r f2195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public r f2196g;

    public r() {
        this.f2190a = new byte[8192];
        this.f2194e = true;
        this.f2193d = false;
    }

    public final r a() {
        r rVar = this.f2195f;
        if (rVar == this) {
            rVar = null;
        }
        r rVar2 = this.f2196g;
        c3.h.X(rVar2);
        rVar2.f2195f = this.f2195f;
        r rVar3 = this.f2195f;
        c3.h.X(rVar3);
        rVar3.f2196g = this.f2196g;
        this.f2195f = null;
        this.f2196g = null;
        return rVar;
    }

    public final void b(r rVar) {
        rVar.f2196g = this;
        rVar.f2195f = this.f2195f;
        r rVar2 = this.f2195f;
        c3.h.X(rVar2);
        rVar2.f2196g = rVar;
        this.f2195f = rVar;
    }

    public final r c() {
        this.f2193d = true;
        return new r(this.f2190a, this.f2191b, this.f2192c, true);
    }

    public final void d(r rVar, int i4) {
        if (!rVar.f2194e) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i5 = rVar.f2192c;
        int i6 = i5 + i4;
        byte[] bArr = rVar.f2190a;
        if (i6 > 8192) {
            if (rVar.f2193d) {
                throw new IllegalArgumentException();
            }
            int i7 = rVar.f2191b;
            if (i6 - i7 > 8192) {
                throw new IllegalArgumentException();
            }
            a3.j.S2(0, i7, i5, bArr, bArr);
            rVar.f2192c -= rVar.f2191b;
            rVar.f2191b = 0;
        }
        int i8 = rVar.f2192c;
        int i9 = this.f2191b;
        a3.j.S2(i8, i9, i9 + i4, this.f2190a, bArr);
        rVar.f2192c += i4;
        this.f2191b += i4;
    }

    public r(byte[] bArr, int i4, int i5, boolean z4) {
        c3.h.b0(bArr, "data");
        this.f2190a = bArr;
        this.f2191b = i4;
        this.f2192c = i5;
        this.f2193d = z4;
        this.f2194e = false;
    }
}
