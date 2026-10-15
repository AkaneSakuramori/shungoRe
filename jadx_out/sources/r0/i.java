package r0;

import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.m;

/* JADX INFO: loaded from: classes.dex */
public final class i extends f2.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f4045d;

    public i(TextView textView) {
        super(20);
        this.f4045d = new h(textView);
    }

    @Override // f2.e
    public final void L(boolean z4) {
        if (!(m.f609j != null)) {
            return;
        }
        this.f4045d.L(z4);
    }

    @Override // f2.e
    public final void O(boolean z4) {
        boolean z5 = !(m.f609j != null);
        h hVar = this.f4045d;
        if (z5) {
            hVar.f4044f = z4;
        } else {
            hVar.O(z4);
        }
    }

    @Override // f2.e
    public final InputFilter[] u(InputFilter[] inputFilterArr) {
        return (m.f609j != null) ^ true ? inputFilterArr : this.f4045d.u(inputFilterArr);
    }
}
