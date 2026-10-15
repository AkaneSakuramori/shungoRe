package androidx.activity;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import i.z1;
import i0.e0;
import i0.v0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f265c;

    public /* synthetic */ j(int i4, Object obj) {
        this.f264b = i4;
        this.f265c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i.m mVar;
        switch (this.f264b) {
            case 0:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e5) {
                    if (!TextUtils.equals(e5.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e5;
                    }
                    return;
                } catch (NullPointerException e6) {
                    if (!TextUtils.equals(e6.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e6;
                    }
                    return;
                }
            case 1:
                f.b bVar = (f.b) this.f265c;
                bVar.a(true);
                bVar.invalidateSelf();
                return;
            case 2:
                z1 z1Var = (z1) this.f265c;
                z1Var.f2880m = null;
                z1Var.drawableStateChanged();
                return;
            case 3:
                ActionMenuView actionMenuView = ((Toolbar) this.f265c).f476b;
                if (actionMenuView == null || (mVar = actionMenuView.f434u) == null) {
                    return;
                }
                mVar.l();
                return;
            case 4:
                m0.g gVar = (m0.g) this.f265c;
                if (gVar.f3434p) {
                    if (gVar.f3432n) {
                        gVar.f3432n = false;
                        m0.a aVar = gVar.f3420b;
                        aVar.getClass();
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f3414e = jCurrentAnimationTimeMillis;
                        aVar.f3416g = -1L;
                        aVar.f3415f = jCurrentAnimationTimeMillis;
                        aVar.f3417h = 0.5f;
                    }
                    m0.a aVar2 = gVar.f3420b;
                    if ((aVar2.f3416g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar2.f3416g + ((long) aVar2.f3418i)) || !gVar.f()) {
                        gVar.f3434p = false;
                        return;
                    }
                    if (gVar.f3433o) {
                        gVar.f3433o = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        gVar.f3422d.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (aVar2.f3415f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = aVar2.a(jCurrentAnimationTimeMillis2);
                    long j4 = jCurrentAnimationTimeMillis2 - aVar2.f3415f;
                    aVar2.f3415f = jCurrentAnimationTimeMillis2;
                    m0.h.b(gVar.f3436r, (int) (j4 * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * aVar2.f3413d));
                    View view = gVar.f3422d;
                    WeakHashMap weakHashMap = v0.f2983a;
                    e0.m(view, this);
                    return;
                }
                return;
            case 5:
                ((p0.e) this.f265c).n(0);
                return;
            case 6:
            default:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f265c).f1551d.f3041h;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 7:
                r1.d dVar = (r1.d) this.f265c;
                dVar.f4062c = false;
                p0.e eVar = ((BottomSheetBehavior) dVar.f4064e).M;
                if (eVar != null && eVar.f()) {
                    dVar.a(dVar.f4061b);
                    return;
                }
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) dVar.f4064e;
                if (bottomSheetBehavior.L == 2) {
                    bottomSheetBehavior.C(dVar.f4061b);
                    return;
                }
                return;
        }
    }
}
