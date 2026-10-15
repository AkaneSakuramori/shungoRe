package r0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.m;

/* JADX INFO: loaded from: classes.dex */
public final class k implements TextWatcher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EditText f4047b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f4049d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4048c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4050e = true;

    public k(EditText editText) {
        this.f4047b = editText;
    }

    public static void a(EditText editText, int i4) {
        int length;
        if (i4 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            m mVarA = m.a();
            if (editableText == null) {
                length = 0;
            } else {
                mVarA.getClass();
                length = editableText.length();
            }
            mVarA.f(0, length, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        EditText editText = this.f4047b;
        if (editText.isInEditMode() || !this.f4050e) {
            return;
        }
        if ((this.f4048c || m.f609j != null) && i5 <= i6 && (charSequence instanceof Spannable)) {
            int iB = m.a().b();
            if (iB != 0) {
                if (iB == 1) {
                    m.a().f(i4, i6 + i4, (Spannable) charSequence);
                    return;
                } else if (iB != 3) {
                    return;
                }
            }
            m mVarA = m.a();
            if (this.f4049d == null) {
                this.f4049d = new j(editText);
            }
            mVarA.g(this.f4049d);
        }
    }
}
