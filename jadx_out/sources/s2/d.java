package s2;

import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class d extends p2.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4231c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Class cls, int i4) {
        super(cls);
        this.f4231c = i4;
    }

    @Override // p2.e
    public final Date a(Date date) {
        switch (this.f4231c) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
