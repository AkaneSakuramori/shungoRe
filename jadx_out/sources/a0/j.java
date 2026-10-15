package a0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static Drawable a(Resources resources, int i4, Resources.Theme theme) {
        return resources.getDrawable(i4, theme);
    }

    public static Drawable b(Resources resources, int i4, int i5, Resources.Theme theme) {
        return resources.getDrawableForDensity(i4, i5, theme);
    }
}
