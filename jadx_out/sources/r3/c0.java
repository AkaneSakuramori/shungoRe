package r3;

/* JADX INFO: loaded from: classes.dex */
public abstract class c0 extends k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r0.b f4080f;

    public final void F() {
        long j4 = this.f4078d - 4294967296L;
        this.f4078d = j4;
        if (j4 <= 0 && this.f4079e) {
            shutdown();
        }
    }

    public final void G(w wVar) {
        r0.b bVar = this.f4080f;
        if (bVar == null) {
            bVar = new r0.b(1);
            this.f4080f = bVar;
        }
        Object[] objArr = (Object[]) bVar.f4030c;
        int i4 = bVar.f4029b;
        objArr[i4] = wVar;
        int length = (objArr.length - 1) & (i4 + 1);
        bVar.f4029b = length;
        int i5 = bVar.f4028a;
        if (length == i5) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[length2 << 1];
            a3.j.U2(objArr, objArr2, 0, i5, 0, 10);
            Object[] objArr3 = (Object[]) bVar.f4030c;
            int length3 = objArr3.length;
            int i6 = bVar.f4028a;
            a3.j.U2(objArr3, objArr2, length3 - i6, 0, i6, 4);
            bVar.f4030c = objArr2;
            bVar.f4028a = 0;
            bVar.f4029b = length2;
        }
    }

    public abstract Thread H();

    public final boolean I() {
        r0.b bVar = this.f4080f;
        if (bVar == null) {
            return false;
        }
        int i4 = bVar.f4028a;
        Object obj = null;
        if (i4 != bVar.f4029b) {
            Object[] objArr = (Object[]) bVar.f4030c;
            Object obj2 = objArr[i4];
            objArr[i4] = null;
            bVar.f4028a = (i4 + 1) & (objArr.length - 1);
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
            }
            obj = obj2;
        }
        w wVar = (w) obj;
        if (wVar == null) {
            return false;
        }
        wVar.run();
        return true;
    }

    public abstract void shutdown();
}
