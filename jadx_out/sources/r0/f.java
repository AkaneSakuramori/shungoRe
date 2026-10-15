package r0;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.m;

/* JADX INFO: loaded from: classes.dex */
public final class f implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f4038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f4039b;

    public f(TextView textView) {
        this.f4038a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i4, int i5, Spanned spanned, int i6, int i7) {
        TextView textView = this.f4038a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iB = m.a().b();
        if (iB != 0) {
            if (iB == 1) {
                if ((i7 == 0 && i6 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i4 != 0 || i5 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i4, i5);
                }
                return m.a().f(0, charSequence.length(), charSequence);
            }
            if (iB != 3) {
                return charSequence;
            }
        }
        m mVarA = m.a();
        if (this.f4039b == null) {
            this.f4039b = new e(textView, this);
        }
        mVarA.g(this.f4039b);
        return charSequence;
    }
}
