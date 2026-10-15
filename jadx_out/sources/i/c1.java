package i;

import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class c1 {
    public static int a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static void b(TextView textView, int i4, int i5, int i6, int i7) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i6, i7);
    }

    public static void c(TextView textView, int[] iArr, int i4) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
    }

    public static boolean d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
