package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public interface p0 {
    default n0 a(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    default n0 b(Class cls, u0.d dVar) {
        return a(cls);
    }
}
