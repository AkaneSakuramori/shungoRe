package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.fragment.app.k f991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f993d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x f994e;

    public w(x xVar, androidx.fragment.app.k kVar) {
        this.f994e = xVar;
        this.f991b = kVar;
    }

    public final void c(boolean z4) {
        if (z4 == this.f992c) {
            return;
        }
        this.f992c = z4;
        int i4 = z4 ? 1 : -1;
        x xVar = this.f994e;
        int i5 = xVar.f998c;
        xVar.f998c = i4 + i5;
        if (!xVar.f999d) {
            xVar.f999d = true;
            while (true) {
                try {
                    int i6 = xVar.f998c;
                    if (i5 == i6) {
                        break;
                    } else {
                        i5 = i6;
                    }
                } catch (Throwable th) {
                    xVar.f999d = false;
                    throw th;
                }
            }
            xVar.f999d = false;
        }
        if (this.f992c) {
            xVar.c(this);
        }
    }

    public void d() {
    }

    public abstract boolean e();
}
