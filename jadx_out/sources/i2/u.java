package i2;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.shungo.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class u extends o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EditText f3105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.google.android.material.datepicker.m f3106g;

    public u(n nVar, int i4) {
        super(nVar);
        this.f3104e = R.drawable.design_password_eye;
        this.f3106g = new com.google.android.material.datepicker.m(3, this);
        if (i4 != 0) {
            this.f3104e = i4;
        }
    }

    @Override // i2.o
    public final void b() {
        q();
    }

    @Override // i2.o
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // i2.o
    public final int d() {
        return this.f3104e;
    }

    @Override // i2.o
    public final View.OnClickListener f() {
        return this.f3106g;
    }

    @Override // i2.o
    public final boolean k() {
        return true;
    }

    @Override // i2.o
    public final boolean l() {
        EditText editText = this.f3105f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // i2.o
    public final void m(EditText editText) {
        this.f3105f = editText;
        q();
    }

    @Override // i2.o
    public final void r() {
        EditText editText = this.f3105f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f3105f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // i2.o
    public final void s() {
        EditText editText = this.f3105f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
