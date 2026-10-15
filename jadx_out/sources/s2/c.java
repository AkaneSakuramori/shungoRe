package s2;

import com.auth0.android.request.internal.i;
import java.sql.Timestamp;
import java.util.Date;
import m2.b0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f4229b = new i(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f4230a;

    public c(b0 b0Var) {
        this.f4230a = b0Var;
    }

    @Override // m2.b0
    public final Object b(t2.b bVar) {
        Date date = (Date) this.f4230a.b(bVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // m2.b0
    public final void c(t2.c cVar, Object obj) {
        this.f4230a.c(cVar, (Timestamp) obj);
    }
}
