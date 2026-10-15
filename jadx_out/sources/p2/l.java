package p2;

import com.google.gson.reflect.TypeToken;
import m2.a0;
import m2.b0;
import m2.c0;

/* JADX INFO: loaded from: classes.dex */
public final class l implements c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3798c;

    public /* synthetic */ l(int i4, Object obj) {
        this.f3797b = i4;
        this.f3798c = obj;
    }

    @Override // m2.c0
    public final b0 a(m2.m mVar, TypeToken typeToken) {
        int i4 = this.f3797b;
        Object obj = this.f3798c;
        switch (i4) {
            case 0:
                if (typeToken.getRawType() == Number.class) {
                    return (m) obj;
                }
                return null;
            default:
                if (typeToken.getRawType() == Object.class) {
                    return new n(mVar, (a0) obj);
                }
                return null;
        }
    }
}
