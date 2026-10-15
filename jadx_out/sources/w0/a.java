package w0;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4843e;

    public /* synthetic */ a(Object obj, int i4, Serializable serializable, int i5) {
        this.f4840b = i5;
        this.f4843e = obj;
        this.f4841c = i4;
        this.f4842d = serializable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f4840b;
        Object obj = this.f4842d;
        int i5 = this.f4841c;
        Object obj2 = this.f4843e;
        switch (i4) {
            case 0:
                ((b) obj2).f4845b.t(i5, obj);
                break;
            default:
                ((d) obj2).t(i5, obj);
                break;
        }
    }
}
