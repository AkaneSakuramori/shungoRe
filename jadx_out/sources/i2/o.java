package i2;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f3057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f3058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f3059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f3060d;

    public o(n nVar) {
        this.f3057a = nVar.f3035b;
        this.f3058b = nVar;
        this.f3059c = nVar.getContext();
        this.f3060d = nVar.f3041h;
    }

    public void a() {
    }

    public void b() {
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public j0.d h() {
        return null;
    }

    public boolean i(int i4) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof k;
    }

    public boolean l() {
        return false;
    }

    public void m(EditText editText) {
    }

    public void n(j0.o oVar) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z4) {
    }

    public final void q() {
        this.f3058b.f(false);
    }

    public abstract void r();

    public void s() {
    }
}
