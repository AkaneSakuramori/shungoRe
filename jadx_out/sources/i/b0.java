package i;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f2523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e.n0 f2524b;

    public b0(TextView textView) {
        this.f2523a = textView;
        this.f2524b = new e.n0(textView);
    }

    public final void a(AttributeSet attributeSet, int i4) {
        TypedArray typedArrayObtainStyledAttributes = this.f2523a.getContext().obtainStyledAttributes(attributeSet, d.a.f1662i, i4, 0);
        try {
            boolean z4 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            c(z4);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z4) {
        ((f2.e) this.f2524b.f1896c).L(z4);
    }

    public final void c(boolean z4) {
        ((f2.e) this.f2524b.f1896c).O(z4);
    }
}
