package r3;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4122a = 0;

    static {
        String property;
        int i4 = kotlinx.coroutines.internal.p.f3306a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null || !Boolean.parseBoolean(property)) {
            r rVar = r.f4120h;
            return;
        }
        kotlinx.coroutines.scheduling.d dVar = x.f4128a;
        c3.k kVar = kotlinx.coroutines.internal.k.f3303a;
        s3.c cVar = ((s3.c) kVar).f4241g;
        if (kVar instanceof t) {
        } else {
            r rVar2 = r.f4120h;
        }
    }
}
