package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class x implements TextWatcher, SpanWatcher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f652c = new AtomicInteger(0);

    public x(Object obj) {
        this.f651b = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f651b).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        ((TextWatcher) this.f651b).beforeTextChanged(charSequence, i4, i5, i6);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i4, int i5) {
        if (this.f652c.get() <= 0 || !(obj instanceof z)) {
            ((SpanWatcher) this.f651b).onSpanAdded(spannable, obj, i4, i5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001c A[PHI: r11
      0x001c: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0011, B:12:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        if (this.f652c.get() <= 0 || !(obj instanceof z)) {
            if (Build.VERSION.SDK_INT >= 28) {
                i8 = i4;
                i9 = i6;
            } else {
                if (i4 > i5) {
                    i4 = 0;
                }
                if (i6 > i7) {
                    i8 = i4;
                    i9 = 0;
                } else {
                    i8 = i4;
                    i9 = i6;
                }
            }
            ((SpanWatcher) this.f651b).onSpanChanged(spannable, obj, i8, i5, i9, i7);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i4, int i5) {
        if (this.f652c.get() <= 0 || !(obj instanceof z)) {
            ((SpanWatcher) this.f651b).onSpanRemoved(spannable, obj, i4, i5);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        ((TextWatcher) this.f651b).onTextChanged(charSequence, i4, i5, i6);
    }
}
