package y0;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public OverScroller f5090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Interpolator f5091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5093g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f5094h;

    public c1(RecyclerView recyclerView) {
        this.f5094h = recyclerView;
        p0.d dVar = RecyclerView.f1018v0;
        this.f5091e = dVar;
        this.f5092f = false;
        this.f5093g = false;
        this.f5090d = new OverScroller(recyclerView.getContext(), dVar);
    }

    public final void a() {
        if (this.f5092f) {
            this.f5093g = true;
            return;
        }
        RecyclerView recyclerView = this.f5094h;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = i0.v0.f2983a;
        i0.e0.m(recyclerView, this);
    }

    public final void b(int i4, int i5, int i6, Interpolator interpolator) {
        int iRound;
        RecyclerView recyclerView = this.f5094h;
        if (i6 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i4);
            int iAbs2 = Math.abs(i5);
            boolean z4 = iAbs > iAbs2;
            int iSqrt = (int) Math.sqrt(0);
            int iSqrt2 = (int) Math.sqrt((i5 * i5) + (i4 * i4));
            int width = z4 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i7 = width / 2;
            float f5 = width;
            float f6 = i7;
            float fSin = (((float) Math.sin((Math.min(1.0f, (iSqrt2 * 1.0f) / f5) - 0.5f) * 0.47123894f)) * f6) + f6;
            if (iSqrt > 0) {
                iRound = Math.round(Math.abs(fSin / iSqrt) * 1000.0f) * 4;
            } else {
                if (!z4) {
                    iAbs = iAbs2;
                }
                iRound = (int) (((iAbs / f5) + 1.0f) * 300.0f);
            }
            i6 = Math.min(iRound, 2000);
        }
        int i8 = i6;
        if (interpolator == null) {
            interpolator = RecyclerView.f1018v0;
        }
        if (this.f5091e != interpolator) {
            this.f5091e = interpolator;
            this.f5090d = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f5089c = 0;
        this.f5088b = 0;
        recyclerView.setScrollState(2);
        this.f5090d.startScroll(0, 0, i4, i5, i8);
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        RecyclerView recyclerView = this.f5094h;
        if (recyclerView.f1042m == null) {
            recyclerView.removeCallbacks(this);
            this.f5090d.abortAnimation();
            return;
        }
        this.f5093g = false;
        this.f5092f = true;
        recyclerView.m();
        OverScroller overScroller = this.f5090d;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i9 = currX - this.f5088b;
            int i10 = currY - this.f5089c;
            this.f5088b = currX;
            this.f5089c = currY;
            int[] iArr = recyclerView.f1049p0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean zR = recyclerView.r(i9, i10, iArr, null, 1);
            int[] iArr2 = recyclerView.f1049p0;
            if (zR) {
                i9 -= iArr2[0];
                i10 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.l(i9, i10);
            }
            if (recyclerView.f1040l != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.Z(i9, i10, iArr2);
                int i11 = iArr2[0];
                int i12 = iArr2[1];
                int i13 = i9 - i11;
                int i14 = i10 - i12;
                z zVar = recyclerView.f1042m.f5232e;
                if (zVar != null && !zVar.f5352d && zVar.f5353e) {
                    int iB = recyclerView.f1025d0.b();
                    if (iB == 0) {
                        zVar.i();
                    } else if (zVar.f5349a >= iB) {
                        zVar.f5349a = iB - 1;
                        zVar.g(i11, i12);
                    } else {
                        zVar.g(i11, i12);
                    }
                }
                i7 = i11;
                i4 = i13;
                i5 = i14;
                i6 = i12;
            } else {
                i4 = i9;
                i5 = i10;
                i6 = 0;
                i7 = 0;
            }
            if (!recyclerView.f1044n.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f1049p0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i15 = i6;
            recyclerView.s(i7, i6, i4, i5, null, 1, iArr3);
            int i16 = i4 - iArr2[0];
            int i17 = i5 - iArr2[1];
            if (i7 != 0 || i15 != 0) {
                recyclerView.t(i7, i15);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z4 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i16 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i17 != 0));
            z zVar2 = recyclerView.f1042m.f5232e;
            if ((zVar2 == null || !zVar2.f5352d) && z4) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i16 < 0) {
                        i8 = -currVelocity;
                    } else {
                        i8 = i16 > 0 ? currVelocity : 0;
                    }
                    if (i17 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i17 <= 0) {
                        currVelocity = 0;
                    }
                    if (i8 < 0) {
                        recyclerView.v();
                        if (recyclerView.E.isFinished()) {
                            recyclerView.E.onAbsorb(-i8);
                        }
                    } else if (i8 > 0) {
                        recyclerView.w();
                        if (recyclerView.G.isFinished()) {
                            recyclerView.G.onAbsorb(i8);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.x();
                        if (recyclerView.F.isFinished()) {
                            recyclerView.F.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.u();
                        if (recyclerView.H.isFinished()) {
                            recyclerView.H.onAbsorb(currVelocity);
                        }
                    }
                    if (i8 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = i0.v0.f2983a;
                        i0.e0.k(recyclerView);
                    }
                }
                q qVar = recyclerView.f1023c0;
                int[] iArr4 = qVar.f5279c;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                qVar.f5280d = 0;
            } else {
                a();
                s sVar = recyclerView.f1021b0;
                if (sVar != null) {
                    sVar.a(recyclerView, i7, i15);
                }
            }
        }
        z zVar3 = recyclerView.f1042m.f5232e;
        if (zVar3 != null && zVar3.f5352d) {
            zVar3.g(0, 0);
        }
        this.f5092f = false;
        if (!this.f5093g) {
            recyclerView.setScrollState(0);
            recyclerView.e0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = i0.v0.f2983a;
            i0.e0.m(recyclerView, this);
        }
    }
}
