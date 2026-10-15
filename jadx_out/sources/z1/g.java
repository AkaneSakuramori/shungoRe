package z1;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f5483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f5484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5486d;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5493k;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Layout.Alignment f5487e = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5488f = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f5489g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f5490h = 1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5491i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f5492j = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextUtils.TruncateAt f5494l = null;

    public g(CharSequence charSequence, TextPaint textPaint, int i4) {
        this.f5483a = charSequence;
        this.f5484b = textPaint;
        this.f5485c = i4;
        this.f5486d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f5483a == null) {
            this.f5483a = "";
        }
        int iMax = Math.max(0, this.f5485c);
        CharSequence charSequenceEllipsize = this.f5483a;
        int i4 = this.f5488f;
        TextPaint textPaint = this.f5484b;
        if (i4 == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f5494l);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f5486d);
        this.f5486d = iMin;
        if (this.f5493k && this.f5488f == 1) {
            this.f5487e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f5487e);
        builderObtain.setIncludePad(this.f5492j);
        builderObtain.setTextDirection(this.f5493k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f5494l;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f5488f);
        float f5 = this.f5489g;
        if (f5 != 0.0f || this.f5490h != 1.0f) {
            builderObtain.setLineSpacing(f5, this.f5490h);
        }
        if (this.f5488f > 1) {
            builderObtain.setHyphenationFrequency(this.f5491i);
        }
        return builderObtain.build();
    }
}
