package i;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class i1 {
    public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i4, TextView textView, TextPaint textPaint) {
        return new StaticLayout(charSequence, textPaint, i4, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
    }

    public static int b(TextView textView) {
        return textView.getMaxLines();
    }
}
