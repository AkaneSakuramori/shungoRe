package p2;

import com.google.gson.reflect.TypeToken;
import m2.b0;
import m2.c0;

/* JADX INFO: loaded from: classes.dex */
public final class r implements c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypeToken f3820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class f3822d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m2.p f3823e;

    public r(m2.p pVar, TypeToken typeToken, boolean z4) {
        this.f3823e = pVar;
        this.f3820b = typeToken;
        this.f3821c = z4;
    }

    @Override // m2.c0
    public final b0 a(m2.m mVar, TypeToken typeToken) {
        TypeToken typeToken2 = this.f3820b;
        if (typeToken2 == null ? !this.f3822d.isAssignableFrom(typeToken.getRawType()) : !(typeToken2.equals(typeToken) || (this.f3821c && typeToken2.getType() == typeToken.getRawType()))) {
            return null;
        }
        return new s(this.f3823e, mVar, typeToken, this);
    }
}
