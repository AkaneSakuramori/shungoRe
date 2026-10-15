package n;

/* JADX INFO: loaded from: classes.dex */
public final class a extends h.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3482e;

    public a(int i4, Object obj) {
        this.f3481d = i4;
        this.f3482e = obj;
    }

    @Override // h.d
    public final void c() {
        int i4 = this.f3481d;
        Object obj = this.f3482e;
        switch (i4) {
            case 0:
                ((b) obj).clear();
                break;
            default:
                ((c) obj).clear();
                break;
        }
    }

    @Override // h.d
    public final Object d(int i4, int i5) {
        int i6 = this.f3481d;
        Object obj = this.f3482e;
        switch (i6) {
            case 0:
                return ((b) obj).f3523c[(i4 << 1) + i5];
            default:
                return ((c) obj).f3491c[i4];
        }
    }

    @Override // h.d
    public final b e() {
        switch (this.f3481d) {
            case 0:
                return (b) this.f3482e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    @Override // h.d
    public final int f() {
        int i4 = this.f3481d;
        Object obj = this.f3482e;
        switch (i4) {
            case 0:
                return ((b) obj).f3524d;
            default:
                return ((c) obj).f3492d;
        }
    }

    @Override // h.d
    public final int g(Object obj) {
        int i4 = this.f3481d;
        Object obj2 = this.f3482e;
        switch (i4) {
            case 0:
                return ((b) obj2).e(obj);
            default:
                return ((c) obj2).indexOf(obj);
        }
    }

    @Override // h.d
    public final int h(Object obj) {
        int i4 = this.f3481d;
        Object obj2 = this.f3482e;
        switch (i4) {
            case 0:
                return ((b) obj2).g(obj);
            default:
                return ((c) obj2).indexOf(obj);
        }
    }

    @Override // h.d
    public final void i(Object obj, Object obj2) {
        int i4 = this.f3481d;
        Object obj3 = this.f3482e;
        switch (i4) {
            case 0:
                ((b) obj3).put(obj, obj2);
                break;
            default:
                ((c) obj3).add(obj);
                break;
        }
    }

    @Override // h.d
    public final void j(int i4) {
        int i5 = this.f3481d;
        Object obj = this.f3482e;
        switch (i5) {
            case 0:
                ((b) obj).i(i4);
                break;
            default:
                ((c) obj).e(i4);
                break;
        }
    }

    @Override // h.d
    public final Object k(int i4, Object obj) {
        switch (this.f3481d) {
            case 0:
                int i5 = (i4 << 1) + 1;
                Object[] objArr = ((b) this.f3482e).f3523c;
                Object obj2 = objArr[i5];
                objArr[i5] = obj;
                return obj2;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }
}
