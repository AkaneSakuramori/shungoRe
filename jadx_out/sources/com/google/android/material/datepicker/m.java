package com.google.android.material.datepicker;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1467c;

    public /* synthetic */ m(int i4, Object obj) {
        this.f1466b = i4;
        this.f1467c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i4 = this.f1466b;
        Object obj = this.f1467c;
        switch (i4) {
            case 0:
                int i5 = n.G0;
                ((n) obj).I();
                throw null;
            case 1:
                i2.d dVar = (i2.d) obj;
                EditText editText = dVar.f3007i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                dVar.q();
                return;
            case 2:
                ((i2.k) obj).u();
                return;
            default:
                i2.u uVar = (i2.u) obj;
                EditText editText2 = uVar.f3105f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = uVar.f3105f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    uVar.f3105f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    uVar.f3105f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    uVar.f3105f.setSelection(selectionEnd);
                }
                uVar.q();
                return;
        }
    }
}
