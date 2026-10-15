package p2;

import com.google.gson.reflect.TypeToken;
import m2.b0;
import m2.c0;

/* JADX INFO: loaded from: classes.dex */
public final class v implements c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Class f3837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Class f3838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0 f3839e;

    public /* synthetic */ v(Class cls, Class cls2, b0 b0Var, int i4) {
        this.f3836b = i4;
        this.f3837c = cls;
        this.f3838d = cls2;
        this.f3839e = b0Var;
    }

    @Override // m2.c0
    public final b0 a(m2.m mVar, TypeToken typeToken) {
        int i4 = this.f3836b;
        b0 b0Var = this.f3839e;
        Class cls = this.f3838d;
        Class cls2 = this.f3837c;
        switch (i4) {
            case 0:
                Class rawType = typeToken.getRawType();
                if (rawType == cls2 || rawType == cls) {
                    return b0Var;
                }
                return null;
            default:
                Class rawType2 = typeToken.getRawType();
                if (rawType2 == cls2 || rawType2 == cls) {
                    return b0Var;
                }
                return null;
        }
    }

    public final String toString() {
        int i4 = this.f3836b;
        b0 b0Var = this.f3839e;
        Class cls = this.f3838d;
        Class cls2 = this.f3837c;
        switch (i4) {
            case 0:
                return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + b0Var + "]";
            default:
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + b0Var + "]";
        }
    }
}
