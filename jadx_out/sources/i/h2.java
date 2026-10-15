package i;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public abstract class h2 {
    public static int a(PopupWindow popupWindow, View view, int i4, boolean z4) {
        return popupWindow.getMaxAvailableHeight(view, i4, z4);
    }
}
