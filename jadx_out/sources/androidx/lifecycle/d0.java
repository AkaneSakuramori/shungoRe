package androidx.lifecycle;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements r {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d0 f943j = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f945c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Handler f948f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f946d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f947e = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f949g = new t(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.activity.d f950h = new androidx.activity.d(6, this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c0 f951i = new c0(this);

    public final void a() {
        int i4 = this.f945c + 1;
        this.f945c = i4;
        if (i4 == 1) {
            if (this.f946d) {
                this.f949g.e(l.ON_RESUME);
                this.f946d = false;
            } else {
                Handler handler = this.f948f;
                c3.h.X(handler);
                handler.removeCallbacks(this.f950h);
            }
        }
    }

    @Override // androidx.lifecycle.r
    public final t t() {
        return this.f949g;
    }
}
