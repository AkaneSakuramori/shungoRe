package n;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b extends k implements Map {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f3483i;

    public b(b bVar) {
        if (bVar != null) {
            int i4 = bVar.f3524d;
            b(i4);
            if (this.f3524d != 0) {
                for (int i5 = 0; i5 < i4; i5++) {
                    put(bVar.h(i5), bVar.j(i5));
                }
            } else if (i4 > 0) {
                System.arraycopy(bVar.f3522b, 0, this.f3522b, 0, i4);
                System.arraycopy(bVar.f3523c, 0, this.f3523c, 0, i4 << 1);
                this.f3524d = i4;
            }
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        int i4 = 0;
        if (this.f3483i == null) {
            this.f3483i = new a(0, this);
        }
        a aVar = this.f3483i;
        if (((h) aVar.f2350a) == null) {
            aVar.f2350a = new h(aVar, i4);
        }
        return (h) aVar.f2350a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f3483i == null) {
            this.f3483i = new a(0, this);
        }
        a aVar = this.f3483i;
        if (((h) aVar.f2351b) == null) {
            aVar.f2351b = new h(aVar, 1);
        }
        return (h) aVar.f2351b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f3524d);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f3483i == null) {
            this.f3483i = new a(0, this);
        }
        a aVar = this.f3483i;
        if (aVar.f2352c == null) {
            aVar.f2352c = new j(aVar);
        }
        return aVar.f2352c;
    }
}
