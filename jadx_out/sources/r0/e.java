package r0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import androidx.emoji2.text.m;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class e extends androidx.emoji2.text.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f4036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f4037b;

    public e(TextView textView, f fVar) {
        this.f4036a = new WeakReference(textView);
        this.f4037b = new WeakReference(fVar);
    }

    @Override // androidx.emoji2.text.k
    public final void a() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f4036a.get();
        InputFilter inputFilter = (InputFilter) this.f4037b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    m mVarA = m.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        mVarA.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceF = mVarA.f(0, length, text);
                    if (text == charSequenceF) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceF);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceF);
                    textView.setText(charSequenceF);
                    if (charSequenceF instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceF;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
