package q3;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a3.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f3899b;

    public d(e eVar) {
        this.f3899b = eVar;
    }

    @Override // a3.b
    public final int a() {
        return this.f3899b.f3900a.groupCount() + 1;
    }

    @Override // a3.b, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        String strGroup = this.f3899b.f3900a.group(i4);
        return strGroup == null ? "" : strGroup;
    }

    @Override // a3.f, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // a3.f, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
