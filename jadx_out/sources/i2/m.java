package i2;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f3033a;

    public m(n nVar) {
        this.f3033a = nVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        n nVar = this.f3033a;
        if (nVar.f3053t == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = nVar.f3053t;
        l lVar = nVar.f3056w;
        if (editText != null) {
            editText.removeTextChangedListener(lVar);
            if (nVar.f3053t.getOnFocusChangeListener() == nVar.b().e()) {
                nVar.f3053t.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        nVar.f3053t = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(lVar);
        }
        nVar.b().m(nVar.f3053t);
        nVar.j(nVar.b());
    }
}
