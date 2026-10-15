package j0;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3143a;

    public n(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f3143a = collectionItemInfo;
    }

    public static n a(int i4, int i5, int i6, int i7, boolean z4) {
        return new n(AccessibilityNodeInfo.CollectionItemInfo.obtain(i4, i5, i6, i7, false, z4));
    }
}
