package j0;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static n a(int i4, int i5, int i6, int i7, boolean z4) {
        return new n(AccessibilityNodeInfo.CollectionItemInfo.obtain(i4, i5, i6, i7, z4));
    }

    public static Object b(int i4, float f5, float f6, float f7) {
        return AccessibilityNodeInfo.RangeInfo.obtain(i4, f5, f6, f7);
    }

    public static Bundle c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtras();
    }
}
