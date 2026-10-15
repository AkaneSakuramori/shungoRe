package d1;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b0.f[] f1721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f1722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1724d;

    public k() {
        this.f1721a = null;
        this.f1723c = 0;
    }

    public b0.f[] getPathData() {
        return this.f1721a;
    }

    public String getPathName() {
        return this.f1722b;
    }

    public void setPathData(b0.f[] fVarArr) {
        if (!c3.h.Q(this.f1721a, fVarArr)) {
            this.f1721a = c3.h.E0(fVarArr);
            return;
        }
        b0.f[] fVarArr2 = this.f1721a;
        for (int i4 = 0; i4 < fVarArr.length; i4++) {
            fVarArr2[i4].f1086a = fVarArr[i4].f1086a;
            int i5 = 0;
            while (true) {
                float[] fArr = fVarArr[i4].f1087b;
                if (i5 < fArr.length) {
                    fVarArr2[i4].f1087b[i5] = fArr[i5];
                    i5++;
                }
            }
        }
    }

    public k(k kVar) {
        this.f1721a = null;
        this.f1723c = 0;
        this.f1722b = kVar.f1722b;
        this.f1724d = kVar.f1724d;
        this.f1721a = c3.h.E0(kVar.f1721a);
    }
}
