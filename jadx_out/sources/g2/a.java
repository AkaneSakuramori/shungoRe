package g2;

import android.view.View;
import c3.h;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class a extends h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2312j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final SideSheetBehavior f2313k;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i4) {
        this.f2312j = i4;
        this.f2313k = sideSheetBehavior;
    }

    public final float Q2(int i4) {
        switch (this.f2312j) {
            case 0:
                float fS2 = S2();
                return (i4 - fS2) / (R2() - fS2);
            default:
                float fS3 = S2();
                return (fS3 - i4) / (fS3 - R2());
        }
    }

    public final int R2() {
        int i4 = this.f2312j;
        SideSheetBehavior sideSheetBehavior = this.f2313k;
        switch (i4) {
            case 0:
                return Math.max(0, sideSheetBehavior.f1531n + sideSheetBehavior.f1532o);
            default:
                return Math.max(0, (S2() - sideSheetBehavior.f1529l) - sideSheetBehavior.f1532o);
        }
    }

    public final int S2() {
        int i4 = this.f2312j;
        SideSheetBehavior sideSheetBehavior = this.f2313k;
        switch (i4) {
            case 0:
                return (-sideSheetBehavior.f1529l) - sideSheetBehavior.f1532o;
            default:
                return sideSheetBehavior.f1530m;
        }
    }

    public final boolean T2(float f5) {
        switch (this.f2312j) {
            case 0:
                return f5 > 0.0f;
            default:
                return f5 < 0.0f;
        }
    }

    public final boolean U2(View view) {
        switch (this.f2312j) {
            case 0:
                return view.getRight() < (R2() - S2()) / 2;
            default:
                return view.getLeft() > (R2() + S2()) / 2;
        }
    }

    public final boolean V2(float f5, float f6) {
        int i4 = this.f2312j;
        SideSheetBehavior sideSheetBehavior = this.f2313k;
        switch (i4) {
            case 0:
                if (Math.abs(f5) <= Math.abs(f6)) {
                    return false;
                }
                float fAbs = Math.abs(f5);
                sideSheetBehavior.getClass();
                return fAbs > ((float) 500);
            default:
                if (Math.abs(f5) <= Math.abs(f6)) {
                    return false;
                }
                float fAbs2 = Math.abs(f5);
                sideSheetBehavior.getClass();
                return fAbs2 > ((float) 500);
        }
    }

    public final boolean W2(View view, float f5) {
        int i4 = this.f2312j;
        SideSheetBehavior sideSheetBehavior = this.f2313k;
        switch (i4) {
            case 0:
                return Math.abs((f5 * sideSheetBehavior.f1528k) + ((float) view.getLeft())) > 0.5f;
            default:
                return Math.abs((f5 * sideSheetBehavior.f1528k) + ((float) view.getRight())) > 0.5f;
        }
    }
}
