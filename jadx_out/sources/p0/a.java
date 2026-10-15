package p0;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import i0.e0;
import i0.v0;
import j0.o;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f3712b;

    public a(b bVar) {
        this.f3712b = bVar;
    }

    @Override // c.a
    public final o a(int i4) {
        return new o(AccessibilityNodeInfo.obtain(this.f3712b.n(i4).f3144a));
    }

    @Override // c.a
    public final o c(int i4) {
        b bVar = this.f3712b;
        int i5 = i4 == 2 ? bVar.f3723k : bVar.f3724l;
        if (i5 == Integer.MIN_VALUE) {
            return null;
        }
        return a(i5);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    @Override // c.a
    public final boolean d(int i4, int i5, Bundle bundle) {
        int i6;
        b bVar = this.f3712b;
        View view = bVar.f3721i;
        if (i4 == -1) {
            WeakHashMap weakHashMap = v0.f2983a;
            return e0.j(view, i5, bundle);
        }
        boolean z4 = true;
        if (i5 == 1) {
            return bVar.p(i4);
        }
        if (i5 == 2) {
            return bVar.j(i4);
        }
        boolean z5 = false;
        if (i5 == 64) {
            AccessibilityManager accessibilityManager = bVar.f3720h;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i6 = bVar.f3723k) != i4) {
                if (i6 != Integer.MIN_VALUE) {
                    bVar.f3723k = Integer.MIN_VALUE;
                    bVar.f3721i.invalidate();
                    bVar.q(i6, 65536);
                }
                bVar.f3723k = i4;
                view.invalidate();
                bVar.q(i4, 32768);
            } else {
                z4 = false;
            }
        } else {
            if (i5 != 128) {
                v1.d dVar = (v1.d) bVar;
                if (i5 != 16) {
                    return false;
                }
                Chip chip = dVar.f4778q;
                if (i4 == 0) {
                    return chip.performClick();
                }
                if (i4 != 1) {
                    return false;
                }
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.f1420i;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z5 = true;
                }
                if (!chip.f1431t) {
                    return z5;
                }
                chip.f1430s.q(1, 1);
                return z5;
            }
            if (bVar.f3723k == i4) {
                bVar.f3723k = Integer.MIN_VALUE;
                view.invalidate();
                bVar.q(i4, 65536);
            } else {
                z4 = false;
            }
        }
        return z4;
    }
}
