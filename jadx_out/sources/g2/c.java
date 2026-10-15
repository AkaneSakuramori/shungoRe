package g2;

import android.view.View;
import android.view.ViewGroup;
import c3.h;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class c extends h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SideSheetBehavior f2316j;

    public c(SideSheetBehavior sideSheetBehavior) {
        this.f2316j = sideSheetBehavior;
    }

    @Override // c3.h
    public final boolean H2(View view, int i4) {
        WeakReference weakReference;
        SideSheetBehavior sideSheetBehavior = this.f2316j;
        return (sideSheetBehavior.f1525h == 1 || (weakReference = sideSheetBehavior.f1533p) == null || weakReference.get() != view) ? false : true;
    }

    @Override // c3.h
    public final void N1(int i4) {
        if (i4 == 1) {
            SideSheetBehavior sideSheetBehavior = this.f2316j;
            if (sideSheetBehavior.f1524g) {
                sideSheetBehavior.r(1);
            }
        }
    }

    @Override // c3.h
    public final void O1(View view, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        SideSheetBehavior sideSheetBehavior = this.f2316j;
        WeakReference weakReference = sideSheetBehavior.f1534q;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
            a aVar = sideSheetBehavior.f1518a;
            int left = view.getLeft();
            int right = view.getRight();
            int i6 = aVar.f2312j;
            SideSheetBehavior sideSheetBehavior2 = aVar.f2313k;
            switch (i6) {
                case 0:
                    if (left <= sideSheetBehavior2.f1530m) {
                        marginLayoutParams.leftMargin = right;
                    }
                    break;
                default:
                    int i7 = sideSheetBehavior2.f1530m;
                    if (left <= i7) {
                        marginLayoutParams.rightMargin = i7 - left;
                    }
                    break;
            }
            view2.setLayoutParams(marginLayoutParams);
        }
        LinkedHashSet linkedHashSet = sideSheetBehavior.f1538u;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        sideSheetBehavior.f1518a.Q2(i4);
        Iterator it = linkedHashSet.iterator();
        if (it.hasNext()) {
            defpackage.a.n(it.next());
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    @Override // c3.h
    public final void P1(View view, float f5, float f6) {
        SideSheetBehavior sideSheetBehavior = this.f2316j;
        int i4 = 3;
        if (!sideSheetBehavior.f1518a.T2(f5)) {
            if (sideSheetBehavior.f1518a.W2(view, f5)) {
                if (sideSheetBehavior.f1518a.V2(f5, f6) || sideSheetBehavior.f1518a.U2(view)) {
                    i4 = 5;
                }
            } else if (f5 == 0.0f || Math.abs(f5) <= Math.abs(f6)) {
                int left = view.getLeft();
                if (Math.abs(left - sideSheetBehavior.f1518a.R2()) >= Math.abs(left - sideSheetBehavior.f1518a.S2())) {
                    i4 = 5;
                }
            } else {
                i4 = 5;
            }
        }
        sideSheetBehavior.t(view, i4, true);
    }

    @Override // c3.h
    public final int e1(View view) {
        SideSheetBehavior sideSheetBehavior = this.f2316j;
        return sideSheetBehavior.f1529l + sideSheetBehavior.f1532o;
    }

    @Override // c3.h
    public final int g0(View view, int i4) {
        int iR2;
        int i5;
        SideSheetBehavior sideSheetBehavior = this.f2316j;
        a aVar = sideSheetBehavior.f1518a;
        switch (aVar.f2312j) {
            case 0:
                iR2 = -aVar.f2313k.f1529l;
                break;
            default:
                iR2 = aVar.R2();
                break;
        }
        a aVar2 = sideSheetBehavior.f1518a;
        int i6 = aVar2.f2312j;
        SideSheetBehavior sideSheetBehavior2 = aVar2.f2313k;
        switch (i6) {
            case 0:
                i5 = sideSheetBehavior2.f1532o;
                break;
            default:
                i5 = sideSheetBehavior2.f1530m;
                break;
        }
        return h.f0(i4, iR2, i5);
    }

    @Override // c3.h
    public final int h0(View view, int i4) {
        return view.getTop();
    }
}
