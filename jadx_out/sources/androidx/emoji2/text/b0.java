package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements Spannable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f598b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Spannable f599c;

    public b0(Spannable spannable) {
        this.f599c = spannable;
    }

    public final void a() {
        Spannable spannable = this.f599c;
        if (!this.f598b) {
            if ((Build.VERSION.SDK_INT < 28 ? new f2.e(15) : new a0(15)).D(spannable)) {
                this.f599c = new SpannableString(spannable);
            }
        }
        this.f598b = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i4) {
        return this.f599c.charAt(i4);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f599c.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f599c.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f599c.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f599c.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f599c.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i4, int i5, Class cls) {
        return this.f599c.getSpans(i4, i5, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f599c.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i4, int i5, Class cls) {
        return this.f599c.nextSpanTransition(i4, i5, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f599c.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i4, int i5, int i6) {
        a();
        this.f599c.setSpan(obj, i4, i5, i6);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i4, int i5) {
        return this.f599c.subSequence(i4, i5);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f599c.toString();
    }

    public b0(CharSequence charSequence) {
        this.f599c = new SpannableString(charSequence);
    }
}
