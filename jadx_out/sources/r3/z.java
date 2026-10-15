package r3;

/* JADX INFO: loaded from: classes.dex */
public final class z implements f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4132b;

    public z(boolean z4) {
        this.f4132b = z4;
    }

    @Override // r3.f0
    public final boolean a() {
        return this.f4132b;
    }

    @Override // r3.f0
    public final r0 b() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f4132b ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
