package com.google.android.material.datepicker;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.shungo.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class h extends i0.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1455e;

    public /* synthetic */ h(int i4, Object obj) {
        this.f1454d = i4;
        this.f1455e = obj;
    }

    @Override // i0.c
    public final void d(View view, j0.o oVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = oVar.f3144a;
        int i4 = this.f1454d;
        View.AccessibilityDelegate accessibilityDelegate = this.f2895a;
        switch (i4) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                oVar.h(null);
                break;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setScrollable(false);
                break;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                l lVar = (l) this.f1455e;
                accessibilityNodeInfo.setHintText(lVar.f1465e0.getVisibility() == 0 ? lVar.C().getResources().getString(R.string.mtrl_picker_toggle_to_year_selection) : lVar.C().getResources().getString(R.string.mtrl_picker_toggle_to_day_selection));
                break;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                oVar.h(null);
                break;
        }
    }
}
