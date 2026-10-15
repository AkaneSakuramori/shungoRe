package j0;

import android.view.accessibility.AccessibilityRecord;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static int a(AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollX();
    }

    public static int b(AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollY();
    }

    public static void c(AccessibilityRecord accessibilityRecord, int i4) {
        accessibilityRecord.setMaxScrollX(i4);
    }

    public static void d(AccessibilityRecord accessibilityRecord, int i4) {
        accessibilityRecord.setMaxScrollY(i4);
    }
}
