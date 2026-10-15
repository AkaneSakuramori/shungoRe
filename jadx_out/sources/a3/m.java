package a3;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class m implements p3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f72a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f73b;

    public /* synthetic */ m(int i4, Object obj) {
        this.f72a = i4;
        this.f73b = obj;
    }

    @Override // p3.c
    public final Iterator iterator() {
        int i4 = this.f72a;
        Object obj = this.f73b;
        switch (i4) {
            case 0:
                return ((Iterable) obj).iterator();
            default:
                return (Iterator) obj;
        }
    }
}
