package u;

import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4495i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4496j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public r.a f4497k;

    @Override // u.c
    public final void g(AttributeSet attributeSet) {
        r.a aVar = new r.a();
        aVar.f3908s0 = 0;
        aVar.f3909t0 = true;
        aVar.f3910u0 = 0;
        aVar.f3911v0 = false;
        this.f4497k = aVar;
        this.f4508e = aVar;
        i();
    }

    public boolean getAllowsGoneWidget() {
        return this.f4497k.f3909t0;
    }

    public int getMargin() {
        return this.f4497k.f3910u0;
    }

    public int getType() {
        return this.f4495i;
    }

    @Override // u.c
    public final void h(r.d dVar, boolean z4) {
        int i4 = this.f4495i;
        this.f4496j = i4;
        if (z4) {
            if (i4 == 5) {
                this.f4496j = 1;
            } else if (i4 == 6) {
                this.f4496j = 0;
            }
        } else if (i4 == 5) {
            this.f4496j = 0;
        } else if (i4 == 6) {
            this.f4496j = 1;
        }
        if (dVar instanceof r.a) {
            ((r.a) dVar).f3908s0 = this.f4496j;
        }
    }

    public void setAllowsGoneWidget(boolean z4) {
        this.f4497k.f3909t0 = z4;
    }

    public void setDpMargin(int i4) {
        this.f4497k.f3910u0 = (int) ((i4 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i4) {
        this.f4497k.f3910u0 = i4;
    }

    public void setType(int i4) {
        this.f4495i = i4;
    }
}
