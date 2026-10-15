package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.p;
import r3.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f3340a = q.v("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f3341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f3342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f3343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f3344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f2.e f3345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f2.e f3346g;

    static {
        int i4 = p.f3306a;
        if (i4 < 2) {
            i4 = 2;
        }
        f3341b = q.w("kotlinx.coroutines.scheduler.core.pool.size", i4, 1, 0, 8);
        f3342c = q.w("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f3343d = TimeUnit.SECONDS.toNanos(q.v("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f3344e = f.f3335j;
        f3345f = new f2.e(0);
        f3346g = new f2.e(1);
    }
}
