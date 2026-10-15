package j1;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends l0 {
    public i0(String str) {
        super("Could not find a public key for kid \"" + str + '\"');
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return i0.class.getSuperclass().getName() + ": " + getMessage();
    }
}
