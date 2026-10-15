package b4;

import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static boolean a() {
        Conscrypt.Version version = Conscrypt.version();
        if (version.major() != 2) {
            return version.major() > 2;
        }
        if (version.minor() != 1) {
            return version.minor() > 1;
        }
        return version.patch() >= 0;
    }

    public static boolean b() {
        return g.f1120d;
    }
}
