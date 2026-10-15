package s2;

import com.auth0.android.request.internal.i;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import m2.b0;
import m2.r;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f4225b = new i(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f4226a = new SimpleDateFormat("MMM d, yyyy");

    @Override // m2.b0
    public final Object b(t2.b bVar) {
        synchronized (this) {
            if (bVar.T() == 9) {
                bVar.P();
                return null;
            }
            try {
                return new Date(this.f4226a.parse(bVar.R()).getTime());
            } catch (ParseException e5) {
                throw new r(e5);
            }
        }
    }

    @Override // m2.b0
    public final void c(t2.c cVar, Object obj) {
        Date date = (Date) obj;
        synchronized (this) {
            cVar.M(date == null ? null : this.f4226a.format((java.util.Date) date));
        }
    }
}
