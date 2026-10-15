package r0;

import android.text.Editable;
import androidx.emoji2.text.y;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f4031a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile c f4032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class f4033c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f4033c;
        return cls != null ? new y(cls, charSequence) : super.newEditable(charSequence);
    }
}
