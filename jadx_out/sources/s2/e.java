package s2;

import com.auth0.android.request.internal.i;
import java.sql.Date;
import java.sql.Timestamp;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f4232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f4233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f4234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f4235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f4236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f4237f;

    static {
        boolean z4;
        try {
            Class.forName("java.sql.Date");
            z4 = true;
        } catch (ClassNotFoundException unused) {
            z4 = false;
        }
        f4232a = z4;
        if (z4) {
            f4233b = new d(Date.class, 0);
            f4234c = new d(Timestamp.class, 1);
            f4235d = a.f4225b;
            f4236e = b.f4227b;
            f4237f = c.f4229b;
            return;
        }
        f4233b = null;
        f4234c = null;
        f4235d = null;
        f4236e = null;
        f4237f = null;
    }
}
