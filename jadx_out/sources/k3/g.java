package k3;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements e, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3270b;

    public g(int i4) {
        this.f3270b = i4;
    }

    @Override // k3.e
    public final int d() {
        return this.f3270b;
    }

    public final String toString() {
        n.f3277a.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        c3.h.a0(string, "renderLambdaToString(this)");
        return string;
    }
}
