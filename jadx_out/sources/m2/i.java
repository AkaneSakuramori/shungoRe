package m2;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class i extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3447a;

    @Override // m2.b0
    public final Object b(t2.b bVar) {
        switch (this.f3447a) {
            case 0:
                if (bVar.T() != 9) {
                    return Double.valueOf(bVar.K());
                }
                bVar.P();
                return null;
            default:
                if (bVar.T() != 9) {
                    return Float.valueOf((float) bVar.K());
                }
                bVar.P();
                return null;
        }
    }

    @Override // m2.b0
    public final /* bridge */ /* synthetic */ void c(t2.c cVar, Object obj) throws IOException {
        switch (this.f3447a) {
            case 0:
                d(cVar, (Number) obj);
                break;
            default:
                d(cVar, (Number) obj);
                break;
        }
    }

    public final void d(t2.c cVar, Number number) throws IOException {
        switch (this.f3447a) {
            case 0:
                if (number != null) {
                    m.a(number.doubleValue());
                    cVar.L(number);
                } else {
                    cVar.G();
                }
                break;
            default:
                if (number != null) {
                    m.a(number.floatValue());
                    cVar.L(number);
                } else {
                    cVar.G();
                }
                break;
        }
    }
}
