package y2;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o extends p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5406d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(k kVar, List list, int i4) {
        super(kVar, list);
        this.f5406d = i4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        int i4;
        switch (this.f5406d) {
            case 0:
                a(false);
                return null;
            default:
                String strA = a(true);
                if (strA == null) {
                    i4 = 1;
                } else {
                    try {
                        i4 = Integer.parseInt(strA);
                    } catch (NumberFormatException unused) {
                        return 1;
                    }
                }
                return Integer.valueOf(i4);
        }
    }
}
