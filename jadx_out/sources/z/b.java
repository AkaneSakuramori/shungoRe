package z;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static File a(Context context) {
        return context.getCodeCacheDir();
    }

    public static Drawable b(Context context, int i4) {
        return context.getDrawable(i4);
    }

    public static File c(Context context) {
        return context.getNoBackupFilesDir();
    }
}
