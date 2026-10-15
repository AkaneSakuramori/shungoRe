package r0;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;
import androidx.emoji2.text.m;

/* JADX INFO: loaded from: classes.dex */
public final class d extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f4034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f2.e f4035b;

    public d(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        f2.e eVar = new f2.e(18);
        super(inputConnection, false);
        this.f4034a = editText;
        this.f4035b = eVar;
        if (m.f609j != null) {
            m mVarA = m.a();
            if (mVarA.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            mVarA.f614e.H(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i4, int i5) {
        Editable editableText = this.f4034a.getEditableText();
        this.f4035b.getClass();
        return f2.e.z(this, editableText, i4, i5, false) || super.deleteSurroundingText(i4, i5);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i4, int i5) {
        Editable editableText = this.f4034a.getEditableText();
        this.f4035b.getClass();
        return f2.e.z(this, editableText, i4, i5, true) || super.deleteSurroundingTextInCodePoints(i4, i5);
    }
}
