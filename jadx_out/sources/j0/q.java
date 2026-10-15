package j0;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class q extends p {
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i4) {
        o oVarC = this.f3147a.c(i4);
        if (oVarC == null) {
            return null;
        }
        return oVarC.f3144a;
    }
}
