package z1;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f5497c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f5499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c2.d f5500f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f5495a = new TextPaint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v1.b f5496b = new v1.b(1, this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5498d = true;

    public i(h hVar) {
        this.f5499e = new WeakReference(null);
        this.f5499e = new WeakReference(hVar);
    }

    public final float a(String str) {
        if (!this.f5498d) {
            return this.f5497c;
        }
        TextPaint textPaint = this.f5495a;
        this.f5497c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f5498d = false;
        return this.f5497c;
    }
}
