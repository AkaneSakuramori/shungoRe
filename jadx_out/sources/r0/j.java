package r0;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class j extends androidx.emoji2.text.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f4046a;

    public j(EditText editText) {
        this.f4046a = new WeakReference(editText);
    }

    @Override // androidx.emoji2.text.k
    public final void a() {
        k.a((EditText) this.f4046a.get(), 1);
    }
}
