package androidx.emoji2.text;

import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class f implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f600b = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f601a;

    public f() {
        TextPaint textPaint = new TextPaint();
        this.f601a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
