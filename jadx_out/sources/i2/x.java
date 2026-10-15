package i2;

import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import i.h1;

/* JADX INFO: loaded from: classes.dex */
public final class x extends i0.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextInputLayout f3118d;

    public x(TextInputLayout textInputLayout) {
        this.f3118d = textInputLayout;
    }

    @Override // i0.c
    public final void d(View view, j0.o oVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f2895a;
        AccessibilityNodeInfo accessibilityNodeInfo = oVar.f3144a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f3118d;
        EditText editText = textInputLayout.getEditText();
        Editable text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean z4 = !zIsEmpty;
        boolean z5 = true;
        boolean z6 = !TextUtils.isEmpty(hint);
        boolean z7 = !textInputLayout.f1586u0;
        boolean z8 = !TextUtils.isEmpty(error);
        if (!z8 && TextUtils.isEmpty(counterOverflowDescription)) {
            z5 = false;
        }
        String string = z6 ? hint.toString() : "";
        v vVar = textInputLayout.f1549c;
        h1 h1Var = vVar.f3108c;
        if (h1Var.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(h1Var);
            accessibilityNodeInfo.setTraversalAfter(h1Var);
        } else {
            accessibilityNodeInfo.setTraversalAfter(vVar.f3110e);
        }
        if (z4) {
            accessibilityNodeInfo.setText(text);
        } else if (!TextUtils.isEmpty(string)) {
            accessibilityNodeInfo.setText(string);
            if (z7 && placeholderText != null) {
                accessibilityNodeInfo.setText(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            accessibilityNodeInfo.setText(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            accessibilityNodeInfo.setHintText(string);
            accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z5) {
            if (!z8) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        h1 h1Var2 = textInputLayout.f1565k.f3091y;
        if (h1Var2 != null) {
            accessibilityNodeInfo.setLabelFor(h1Var2);
        }
        textInputLayout.f1551d.b().n(oVar);
    }

    @Override // i0.c
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f3118d.f1551d.b().o(accessibilityEvent);
    }
}
