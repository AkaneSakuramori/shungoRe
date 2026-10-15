package m2;

import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class z implements a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f3478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f3479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ z[] f3480d;

    static {
        v vVar = new v();
        f3478b = vVar;
        w wVar = new w();
        f3479c = wVar;
        f3480d = new z[]{vVar, wVar, new z() { // from class: m2.x
            @Override // m2.a0
            public final Number a(t2.b bVar) throws t2.d {
                String strR = bVar.R();
                try {
                    try {
                        return Long.valueOf(Long.parseLong(strR));
                    } catch (NumberFormatException unused) {
                        Double dValueOf = Double.valueOf(strR);
                        if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                            if (!bVar.f4257c) {
                                throw new t2.d("JSON forbids NaN and infinities: " + dValueOf + "; at path " + bVar.F());
                            }
                        }
                        return dValueOf;
                    }
                } catch (NumberFormatException e5) {
                    throw new androidx.fragment.app.p("Cannot parse " + strR + "; at path " + bVar.F(), e5);
                }
            }
        }, new z() { // from class: m2.y
            @Override // m2.a0
            public final Number a(t2.b bVar) throws t2.d {
                String strR = bVar.R();
                try {
                    return new BigDecimal(strR);
                } catch (NumberFormatException e5) {
                    throw new androidx.fragment.app.p("Cannot parse " + strR + "; at path " + bVar.F(), e5);
                }
            }
        }};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f3480d.clone();
    }
}
