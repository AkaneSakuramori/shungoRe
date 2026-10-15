package e3;

import c3.h;
import k3.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends c implements k3.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1992e;

    public g(c3.e eVar) {
        super(eVar);
        this.f1992e = 2;
    }

    @Override // k3.e
    public final int d() {
        return this.f1992e;
    }

    @Override // e3.a
    public final String toString() {
        if (this.f1986b != null) {
            return super.toString();
        }
        n.f3277a.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        h.a0(string, "renderLambdaToString(this)");
        return string;
    }
}
