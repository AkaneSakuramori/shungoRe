package e3;

import c3.k;

/* JADX INFO: loaded from: classes.dex */
public final class b implements c3.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f1987b = new b();

    @Override // c3.e
    public final void b(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // c3.e
    public final k g() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
