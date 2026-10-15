package r1;

import android.view.View;
import androidx.activity.j;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import i0.e0;
import i0.v0;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Runnable f4063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w.a f4064e;

    public d(SideSheetBehavior sideSheetBehavior) {
        this.f4060a = 1;
        this.f4064e = sideSheetBehavior;
        this.f4063d = new androidx.activity.d(9, this);
    }

    public final void a(int i4) {
        int i5 = this.f4060a;
        Runnable runnable = this.f4063d;
        w.a aVar = this.f4064e;
        switch (i5) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) aVar;
                WeakReference weakReference = bottomSheetBehavior.U;
                if (weakReference != null && weakReference.get() != null) {
                    this.f4061b = i4;
                    if (!this.f4062c) {
                        View view = (View) bottomSheetBehavior.U.get();
                        WeakHashMap weakHashMap = v0.f2983a;
                        e0.m(view, runnable);
                        this.f4062c = true;
                    }
                    break;
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) aVar;
                WeakReference weakReference2 = sideSheetBehavior.f1533p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f4061b = i4;
                    if (!this.f4062c) {
                        View view2 = (View) sideSheetBehavior.f1533p.get();
                        WeakHashMap weakHashMap2 = v0.f2983a;
                        e0.m(view2, runnable);
                        this.f4062c = true;
                    }
                    break;
                }
                break;
        }
    }

    public d(BottomSheetBehavior bottomSheetBehavior) {
        this.f4060a = 0;
        this.f4064e = bottomSheetBehavior;
        this.f4063d = new j(7, this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(BottomSheetBehavior bottomSheetBehavior, int i4) {
        this(bottomSheetBehavior);
        this.f4060a = 0;
    }
}
