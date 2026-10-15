package y0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f5059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5060d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        int i4 = this.f5057a;
        if (i4 != aVar.f5057a) {
            return false;
        }
        if (i4 == 8 && Math.abs(this.f5060d - this.f5058b) == 1 && this.f5060d == aVar.f5058b && this.f5058b == aVar.f5060d) {
            return true;
        }
        if (this.f5060d != aVar.f5060d || this.f5058b != aVar.f5058b) {
            return false;
        }
        Object obj2 = this.f5059c;
        if (obj2 != null) {
            if (!obj2.equals(aVar.f5059c)) {
                return false;
            }
        } else if (aVar.f5059c != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f5057a * 31) + this.f5058b) * 31) + this.f5060d;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i4 = this.f5057a;
        if (i4 == 1) {
            str = "add";
        } else if (i4 == 2) {
            str = "rm";
        } else if (i4 != 4) {
            str = i4 != 8 ? "??" : "mv";
        } else {
            str = "up";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.f5058b);
        sb.append("c:");
        sb.append(this.f5060d);
        sb.append(",p:");
        sb.append(this.f5059c);
        sb.append("]");
        return sb.toString();
    }
}
