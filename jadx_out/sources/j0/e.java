package j0;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import i0.e0;
import i0.v0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f3130a;

    public e(d dVar) {
        this.f3130a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f3130a.equals(((e) obj).f3130a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3130a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z4) {
        i2.k kVar = (i2.k) ((l0.b) this.f3130a).f3366a;
        AutoCompleteTextView autoCompleteTextView = kVar.f3021h;
        if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
            return;
        }
        int i4 = z4 ? 2 : 1;
        WeakHashMap weakHashMap = v0.f2983a;
        e0.s(kVar.f3060d, i4);
    }
}
