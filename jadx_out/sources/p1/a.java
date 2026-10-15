package p1;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import j0.n;
import j0.o;

/* JADX INFO: loaded from: classes.dex */
public final class a extends i0.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3754e;

    public /* synthetic */ a(int i4, Object obj) {
        this.f3753d = i4;
        this.f3754e = obj;
    }

    @Override // i0.c
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f3753d) {
            case 2:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f3754e).isChecked());
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // i0.c
    public final void d(View view, o oVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = oVar.f3144a;
        int i4 = this.f3753d;
        Object obj = this.f3754e;
        View.AccessibilityDelegate accessibilityDelegate = this.f2895a;
        switch (i4) {
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i5 = MaterialButtonToggleGroup.f1401l;
                materialButtonToggleGroup.getClass();
                int i6 = -1;
                if (view instanceof MaterialButton) {
                    int i7 = 0;
                    for (int i8 = 0; i8 < materialButtonToggleGroup.getChildCount(); i8++) {
                        if (materialButtonToggleGroup.getChildAt(i8) == view) {
                            i6 = i7;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i8) instanceof MaterialButton) && materialButtonToggleGroup.c(i8)) {
                                i7++;
                            }
                        }
                    }
                }
                oVar.i(n.a(0, 1, i6, 1, ((MaterialButton) view).isChecked()));
                break;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f1511f);
                accessibilityNodeInfo.setChecked(checkableImageButton.isChecked());
                break;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCheckable(((NavigationMenuItemView) obj).f1515y);
                break;
        }
    }
}
