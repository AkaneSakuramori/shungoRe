package y0;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a0 f5309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5313e;

    public v() {
        d();
    }

    public final void a() {
        this.f5311c = this.f5312d ? this.f5309a.e() : this.f5309a.f();
    }

    public final void b(View view, int i4) {
        if (this.f5312d) {
            this.f5311c = this.f5309a.h() + this.f5309a.b(view);
        } else {
            this.f5311c = this.f5309a.d(view);
        }
        this.f5310b = i4;
    }

    public final void c(View view, int i4) {
        int iH = this.f5309a.h();
        if (iH >= 0) {
            b(view, i4);
            return;
        }
        this.f5310b = i4;
        if (!this.f5312d) {
            int iD = this.f5309a.d(view);
            int iF = iD - this.f5309a.f();
            this.f5311c = iD;
            if (iF > 0) {
                int iE = (this.f5309a.e() - Math.min(0, (this.f5309a.e() - iH) - this.f5309a.b(view))) - (this.f5309a.c(view) + iD);
                if (iE < 0) {
                    this.f5311c -= Math.min(iF, -iE);
                    return;
                }
                return;
            }
            return;
        }
        int iE2 = (this.f5309a.e() - iH) - this.f5309a.b(view);
        this.f5311c = this.f5309a.e() - iE2;
        if (iE2 > 0) {
            int iC = this.f5311c - this.f5309a.c(view);
            int iF2 = this.f5309a.f();
            int iMin = iC - (Math.min(this.f5309a.d(view) - iF2, 0) + iF2);
            if (iMin < 0) {
                this.f5311c = Math.min(iE2, -iMin) + this.f5311c;
            }
        }
    }

    public final void d() {
        this.f5310b = -1;
        this.f5311c = Integer.MIN_VALUE;
        this.f5312d = false;
        this.f5313e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f5310b + ", mCoordinate=" + this.f5311c + ", mLayoutFromEnd=" + this.f5312d + ", mValid=" + this.f5313e + '}';
    }
}
