package g0;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2295a;

    public i(g gVar) {
        this.f2295a = gVar;
    }

    public abstract boolean a();

    public final boolean b(CharSequence charSequence, int i4) {
        if (charSequence == null || i4 < 0 || charSequence.length() - i4 < 0) {
            throw new IllegalArgumentException();
        }
        h hVar = (h) this.f2295a;
        if (hVar == null) {
            return a();
        }
        int iA = hVar.a(charSequence, i4);
        if (iA == 0) {
            return true;
        }
        if (iA != 1) {
            return a();
        }
        return false;
    }
}
