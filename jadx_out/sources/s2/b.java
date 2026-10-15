package s2;

import com.auth0.android.request.internal.i;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import m2.b0;
import m2.r;

/* JADX INFO: loaded from: classes.dex */
public final class b extends b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f4227b = new i(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f4228a = new SimpleDateFormat("hh:mm:ss a");

    @Override // m2.b0
    public final Object b(t2.b bVar) {
        synchronized (this) {
            if (bVar.T() == 9) {
                bVar.P();
                return null;
            }
            try {
                return new Time(this.f4228a.parse(bVar.R()).getTime());
            } catch (ParseException e5) {
                throw new r(e5);
            }
        }
    }

    @Override // m2.b0
    public final void c(t2.c cVar, Object obj) {
        Time time = (Time) obj;
        synchronized (this) {
            cVar.M(time == null ? null : this.f4228a.format((Date) time));
        }
    }
}
