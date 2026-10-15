package i0;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.shungo.app.R;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f2884a;

    public a(c cVar) {
        this.f2884a = cVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2884a.a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        c.a aVarB = this.f2884a.b(view);
        if (aVarB != null) {
            return (AccessibilityNodeProvider) aVarB.f1137a;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f2884a.c(view, accessibilityEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        j0.o oVar = new j0.o(accessibilityNodeInfo);
        WeakHashMap weakHashMap = v0.f2983a;
        Boolean bool = (Boolean) new a0(R.id.tag_screen_reader_focusable, 0).a(view);
        boolean z4 = (bool == null || !bool.booleanValue()) ? 0 : 1;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z4);
        } else {
            Bundle bundleC = j0.j.c(accessibilityNodeInfo);
            if (bundleC != null) {
                bundleC.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", z4 | (bundleC.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-2)));
            }
        }
        Boolean bool2 = (Boolean) new a0(R.id.tag_accessibility_heading, 3).a(view);
        boolean z5 = bool2 != null && bool2.booleanValue();
        int i5 = 2;
        if (i4 >= 28) {
            accessibilityNodeInfo.setHeading(z5);
        } else {
            Bundle bundleC2 = j0.j.c(accessibilityNodeInfo);
            if (bundleC2 != null) {
                bundleC2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (z5 ? 2 : 0) | (bundleC2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-3)));
            }
        }
        CharSequence charSequenceD = v0.d(view);
        if (i4 >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequenceD);
        } else {
            j0.j.c(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequenceD);
        }
        CharSequence charSequence = (CharSequence) new a0(R.id.tag_state_description, 64, 30, i5).a(view);
        if (i4 >= 30) {
            j0.k.c(accessibilityNodeInfo, charSequence);
        } else {
            j0.j.c(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f2884a.d(view, oVar);
        accessibilityNodeInfo.getText();
        List listEmptyList = (List) view.getTag(R.id.tag_accessibility_actions);
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        for (int i6 = 0; i6 < listEmptyList.size(); i6++) {
            oVar.b((j0.i) listEmptyList.get(i6));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f2884a.e(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2884a.f(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i4, Bundle bundle) {
        return this.f2884a.g(view, i4, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i4) {
        this.f2884a.h(view, i4);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f2884a.i(view, accessibilityEvent);
    }
}
