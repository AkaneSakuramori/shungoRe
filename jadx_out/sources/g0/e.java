package g0;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f2290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f2291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2293d;

    public e(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 29) {
            androidx.emoji2.text.b.j(textPaint).setBreakStrategy(i4).setHyphenationFrequency(i5).setTextDirection(textDirectionHeuristic).build();
        }
        this.f2290a = textPaint;
        this.f2291b = textDirectionHeuristic;
        this.f2292c = i4;
        this.f2293d = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f2292c == eVar.f2292c && this.f2293d == eVar.f2293d) {
            TextPaint textPaint = this.f2290a;
            float textSize = textPaint.getTextSize();
            TextPaint textPaint2 = eVar.f2290a;
            return textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && textPaint.getTextLocales().equals(textPaint2.getTextLocales()) && (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null) && this.f2291b == eVar.f2291b;
        }
        return false;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f2290a;
        return h0.b.b(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f2291b, Integer.valueOf(this.f2292c), Integer.valueOf(this.f2293d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f2290a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        sb.append(", textDir=" + this.f2291b);
        sb.append(", breakStrategy=" + this.f2292c);
        sb.append(", hyphenationFrequency=" + this.f2293d);
        sb.append("}");
        return sb.toString();
    }

    public e(PrecomputedText.Params params) {
        this.f2290a = params.getTextPaint();
        this.f2291b = params.getTextDirection();
        this.f2292c = params.getBreakStrategy();
        this.f2293d = params.getHyphenationFrequency();
    }
}
