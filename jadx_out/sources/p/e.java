package p;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f3692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3693c;

    public e(int i4, int i5) {
        this.f3691a = i5;
        if (i5 != 1) {
            if (i4 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f3692b = new Object[i4];
        } else {
            if (i4 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f3692b = new Object[i4];
        }
    }

    public Object a() {
        int i4 = this.f3691a;
        Object[] objArr = this.f3692b;
        switch (i4) {
            case 0:
                int i5 = this.f3693c;
                if (i5 <= 0) {
                    return null;
                }
                int i6 = i5 - 1;
                Object obj = objArr[i6];
                objArr[i6] = null;
                this.f3693c = i6;
                return obj;
            default:
                int i7 = this.f3693c;
                if (i7 <= 0) {
                    return null;
                }
                int i8 = i7 - 1;
                Object obj2 = objArr[i8];
                objArr[i8] = null;
                this.f3693c = i8;
                return obj2;
        }
    }

    public boolean b(Object obj) {
        int i4 = this.f3691a;
        Object[] objArr = this.f3692b;
        switch (i4) {
            case 0:
                int i5 = this.f3693c;
                if (i5 >= objArr.length) {
                    return false;
                }
                objArr[i5] = obj;
                this.f3693c = i5 + 1;
                return true;
            default:
                int i6 = 0;
                while (true) {
                    int i7 = this.f3693c;
                    if (i6 >= i7) {
                        if (i7 >= objArr.length) {
                            return false;
                        }
                        objArr[i7] = obj;
                        this.f3693c = i7 + 1;
                        return true;
                    }
                    if (objArr[i6] == obj) {
                        throw new IllegalStateException("Already in the pool!");
                    }
                    i6++;
                }
                break;
        }
    }
}
