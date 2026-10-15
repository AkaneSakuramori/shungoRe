package i2;

import android.text.Editable;

/* JADX INFO: loaded from: classes.dex */
public final class l extends z1.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f3032b;

    public l(n nVar) {
        this.f3032b = nVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f3032b.b().a();
    }

    @Override // z1.j, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        this.f3032b.b().b();
    }
}
