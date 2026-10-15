package v1;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import com.shungo.app.R;
import j0.i;
import j0.o;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d extends p0.b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f4778q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Chip chip, Chip chip2) {
        super(chip2);
        this.f4778q = chip;
    }

    @Override // p0.b
    public final void l(ArrayList arrayList) {
        boolean z4 = false;
        arrayList.add(0);
        Rect rect = Chip.f1414x;
        Chip chip = this.f4778q;
        if (chip.c()) {
            f fVar = chip.f1417f;
            if (fVar != null && fVar.L) {
                z4 = true;
            }
            if (!z4 || chip.f1420i == null) {
                return;
            }
            arrayList.add(1);
        }
    }

    @Override // p0.b
    public final void o(int i4, o oVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = oVar.f3144a;
        if (i4 != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f1414x);
            return;
        }
        Chip chip = this.f4778q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            Context context = chip.getContext();
            Object[] objArr = new Object[1];
            objArr[0] = TextUtils.isEmpty(text) ? "" : text;
            accessibilityNodeInfo.setContentDescription(context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        oVar.b(i.f3131e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }
}
