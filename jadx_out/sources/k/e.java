package k;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends f implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f3239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f3240b;

    @Override // k.f
    public final void a(c cVar) {
        c cVar2;
        c cVar3;
        c cVar4 = null;
        if (this.f3239a == cVar && cVar == this.f3240b) {
            this.f3240b = null;
            this.f3239a = null;
        }
        c cVar5 = this.f3239a;
        if (cVar5 == cVar) {
            switch (((b) this).f3231c) {
                case 0:
                    cVar3 = cVar5.f3235d;
                    break;
                default:
                    cVar3 = cVar5.f3234c;
                    break;
            }
            this.f3239a = cVar3;
        }
        c cVar6 = this.f3240b;
        if (cVar6 == cVar) {
            c cVar7 = this.f3239a;
            if (cVar6 != cVar7 && cVar7 != null) {
                switch (((b) this).f3231c) {
                    case 0:
                        cVar2 = cVar6.f3234c;
                        break;
                    default:
                        cVar2 = cVar6.f3235d;
                        break;
                }
                cVar4 = cVar2;
            }
            this.f3240b = cVar4;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3240b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar;
        c cVar2 = this.f3240b;
        c cVar3 = this.f3239a;
        if (cVar2 != cVar3 && cVar3 != null) {
            switch (((b) this).f3231c) {
                case 0:
                    cVar = cVar2.f3234c;
                    break;
                default:
                    cVar = cVar2.f3235d;
                    break;
            }
        } else {
            cVar = null;
        }
        this.f3240b = cVar;
        return cVar2;
    }
}
