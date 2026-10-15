package f0;

import android.content.Context;
import i.r;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f2006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f2007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2008f;

    public /* synthetic */ d(String str, Context context, r rVar, int i4, int i5) {
        this.f2004b = i5;
        this.f2005c = str;
        this.f2006d = context;
        this.f2007e = rVar;
        this.f2008f = i4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str = this.f2005c;
        Context context = this.f2006d;
        r rVar = this.f2007e;
        int i4 = this.f2008f;
        int i5 = this.f2004b;
        switch (i5) {
            case 0:
                switch (i5) {
                    case 0:
                        return g.a(str, context, rVar, i4);
                    default:
                        try {
                            return g.a(str, context, rVar, i4);
                        } catch (Throwable unused) {
                            return new f(-3);
                        }
                }
            default:
                switch (i5) {
                    case 0:
                        return g.a(str, context, rVar, i4);
                    default:
                        try {
                            return g.a(str, context, rVar, i4);
                        } catch (Throwable unused2) {
                            return new f(-3);
                        }
                }
        }
    }
}
