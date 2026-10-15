package u;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {
    public int A;
    public int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public String G;
    public float H;
    public float I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public float R;
    public float S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public String Y;
    public int Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4513a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f4514a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4515b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f4516b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f4517c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f4518c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4519d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f4520d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4521e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f4522e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4523f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f4524f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4525g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f4526g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4527h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f4528h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4529i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f4530i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4531j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f4532j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4533k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f4534k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4535l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public float f4536l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4537m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f4538m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4539n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f4540n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4541o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public float f4542o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4543p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public r.d f4544p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f4545q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f4546r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4547s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4548t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f4549u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f4550v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f4551w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f4552x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f4553y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f4554z;

    public final void a() {
        this.f4520d0 = false;
        this.f4514a0 = true;
        this.f4516b0 = true;
        int i4 = ((ViewGroup.MarginLayoutParams) this).width;
        if (i4 == -2 && this.W) {
            this.f4514a0 = false;
            if (this.L == 0) {
                this.L = 1;
            }
        }
        int i5 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i5 == -2 && this.X) {
            this.f4516b0 = false;
            if (this.M == 0) {
                this.M = 1;
            }
        }
        if (i4 == 0 || i4 == -1) {
            this.f4514a0 = false;
            if (i4 == 0 && this.L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.W = true;
            }
        }
        if (i5 == 0 || i5 == -1) {
            this.f4516b0 = false;
            if (i5 == 0 && this.M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.X = true;
            }
        }
        if (this.f4517c == -1.0f && this.f4513a == -1 && this.f4515b == -1) {
            return;
        }
        this.f4520d0 = true;
        this.f4514a0 = true;
        this.f4516b0 = true;
        if (!(this.f4544p0 instanceof r.h)) {
            this.f4544p0 = new r.h();
        }
        ((r.h) this.f4544p0).T(this.V);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x007a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:41:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    public final void resolveLayoutDirection(int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i10 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i4);
        boolean z4 = false;
        boolean z5 = 1 == getLayoutDirection();
        this.f4528h0 = -1;
        this.f4530i0 = -1;
        this.f4524f0 = -1;
        this.f4526g0 = -1;
        this.f4532j0 = this.f4551w;
        this.f4534k0 = this.f4553y;
        float f5 = this.E;
        this.f4536l0 = f5;
        int i11 = this.f4513a;
        this.f4538m0 = i11;
        int i12 = this.f4515b;
        this.f4540n0 = i12;
        float f6 = this.f4517c;
        this.f4542o0 = f6;
        if (z5) {
            int i13 = this.f4547s;
            if (i13 != -1) {
                this.f4528h0 = i13;
            } else {
                int i14 = this.f4548t;
                if (i14 != -1) {
                    this.f4530i0 = i14;
                } else {
                    i5 = this.f4549u;
                    if (i5 != -1) {
                        this.f4526g0 = i5;
                        z4 = true;
                    }
                    i6 = this.f4550v;
                    if (i6 != -1) {
                        this.f4524f0 = i6;
                        z4 = true;
                    }
                    i7 = this.A;
                    if (i7 != Integer.MIN_VALUE) {
                        this.f4534k0 = i7;
                    }
                    i8 = this.B;
                    if (i8 != Integer.MIN_VALUE) {
                        this.f4532j0 = i8;
                    }
                    if (z4) {
                        this.f4536l0 = 1.0f - f5;
                    }
                    if (this.f4520d0 && this.V == 1 && this.f4519d) {
                        if (f6 != -1.0f) {
                            this.f4542o0 = 1.0f - f6;
                            this.f4538m0 = -1;
                            this.f4540n0 = -1;
                        } else if (i11 != -1) {
                            this.f4540n0 = i11;
                            this.f4538m0 = -1;
                            this.f4542o0 = -1.0f;
                        } else if (i12 != -1) {
                            this.f4538m0 = i12;
                            this.f4540n0 = -1;
                            this.f4542o0 = -1.0f;
                        }
                    }
                }
            }
            z4 = true;
            i5 = this.f4549u;
            if (i5 != -1) {
                this.f4526g0 = i5;
                z4 = true;
            }
            i6 = this.f4550v;
            if (i6 != -1) {
                this.f4524f0 = i6;
                z4 = true;
            }
            i7 = this.A;
            if (i7 != Integer.MIN_VALUE) {
                this.f4534k0 = i7;
            }
            i8 = this.B;
            if (i8 != Integer.MIN_VALUE) {
                this.f4532j0 = i8;
            }
            if (z4) {
                this.f4536l0 = 1.0f - f5;
            }
            if (this.f4520d0) {
                if (f6 != -1.0f) {
                    this.f4542o0 = 1.0f - f6;
                    this.f4538m0 = -1;
                    this.f4540n0 = -1;
                } else if (i11 != -1) {
                    this.f4540n0 = i11;
                    this.f4538m0 = -1;
                    this.f4542o0 = -1.0f;
                } else if (i12 != -1) {
                    this.f4538m0 = i12;
                    this.f4540n0 = -1;
                    this.f4542o0 = -1.0f;
                }
            }
        } else {
            int i15 = this.f4547s;
            if (i15 != -1) {
                this.f4526g0 = i15;
            }
            int i16 = this.f4548t;
            if (i16 != -1) {
                this.f4524f0 = i16;
            }
            int i17 = this.f4549u;
            if (i17 != -1) {
                this.f4528h0 = i17;
            }
            int i18 = this.f4550v;
            if (i18 != -1) {
                this.f4530i0 = i18;
            }
            int i19 = this.A;
            if (i19 != Integer.MIN_VALUE) {
                this.f4532j0 = i19;
            }
            int i20 = this.B;
            if (i20 != Integer.MIN_VALUE) {
                this.f4534k0 = i20;
            }
        }
        if (this.f4549u == -1 && this.f4550v == -1 && this.f4548t == -1 && this.f4547s == -1) {
            int i21 = this.f4525g;
            if (i21 != -1) {
                this.f4528h0 = i21;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i10 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i10;
                }
            } else {
                int i22 = this.f4527h;
                if (i22 != -1) {
                    this.f4530i0 = i22;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i10 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i10;
                    }
                }
            }
            int i23 = this.f4521e;
            if (i23 != -1) {
                this.f4524f0 = i23;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i9 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i9;
                return;
            }
            int i24 = this.f4523f;
            if (i24 != -1) {
                this.f4526g0 = i24;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i9 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i9;
            }
        }
    }
}
